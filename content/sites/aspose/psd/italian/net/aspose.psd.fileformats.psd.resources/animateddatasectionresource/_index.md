---
title: Class AnimatedDataSectionResource
second_title: Aspose.PSD per riferimento API .NET
description: Aspose.PSD.FileFormats.Psd.Resources.AnimatedDataSectionResource classe. La risorsa plugin della sezione dati animati.
type: docs
weight: 3630
url: /it/net/aspose.psd.fileformats.psd.resources/animateddatasectionresource/
---
## AnimatedDataSectionResource class

La risorsa plug-in della sezione dati animati.

```csharp
public class AnimatedDataSectionResource : ResourceBlock
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [AnimatedDataSection](../../aspose.psd.fileformats.psd.resources/animateddatasectionresource/animateddatasection/) { get; } | Ottiene o imposta la struttura della sezione dati animata. |
| override [DataSize](../../aspose.psd.fileformats.psd.resources/animateddatasectionresource/datasize/) { get; } | Ottiene la dimensione dei dati della risorsa in byte. |
| [ID](../../aspose.psd.fileformats.psd/resourceblock/id/) { get; set; } | Ottiene o imposta l'identificatore univoco per la risorsa. |
| [KeyName](../../aspose.psd.fileformats.psd.resources/animateddatasectionresource/keyname/) { get; } | Il nome della chiave della risorsa. |
| override [MinimalVersion](../../aspose.psd.fileformats.psd.resources/animateddatasectionresource/minimalversion/) { get; } | Ottiene la versione PSD minima richiesta. |
| [Name](../../aspose.psd.fileformats.psd/resourceblock/name/) { get; set; } | Ottiene o imposta il nome della risorsa. Stringa in Pascal, riempita per uniformare la dimensione (un nome nullo consiste di due byte di 0). |
| [Signature](../../aspose.psd.fileformats.psd/resourceblock/signature/) { get; } | Ottiene la firma della risorsa. Dovrebbe essere sempre '8BIM'. |
| [Size](../../aspose.psd.fileformats.psd/resourceblock/size/) { get; } | Ottiene la dimensione del blocco di risorse in byte, inclusi i relativi dati. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Save](../../aspose.psd.fileformats.psd/resourceblock/save/)(StreamContainer) | Salva il blocco di risorse nel flusso specificato. |
| virtual [ValidateValues](../../aspose.psd.fileformats.psd/resourceblock/validatevalues/)() | Convalida i valori delle risorse. |

### Esempi

Il codice seguente mostra come impostare/aggiornare il tempo di ritardo nel frame della sequenza temporale dei dati animati.

```csharp
[C#]

string sourceFile = "3_animated.psd";
string outputPsd = "output_3_animated.psd";

T FindStructure<T>(IEnumerable<OSTypeStructure> structures, string keyName) where T : OSTypeStructure
{
    foreach (var structure in structures)
    {
        if (structure.KeyName.ClassName == keyName)
        {
            return structure as T;
        }
    }

    return null;
}

OSTypeStructure[] AddOrReplaceStructure(IEnumerable<OSTypeStructure> structures, OSTypeStructure newStructure)
{
    List<OSTypeStructure> listOfStructures = new List<OSTypeStructure>(structures);

    for (int i = 0; i < listOfStructures.Count; i++)
    {
        OSTypeStructure structure = listOfStructures[i];
        if (structure.KeyName.ClassName == newStructure.KeyName.ClassName)
        {
            listOfStructures.RemoveAt(i);
            break;
        }
    }

    listOfStructures.Add(newStructure);

    return listOfStructures.ToArray();
}

using (PsdImage image = (PsdImage)Image.Load(sourceFile))
{
    foreach (var imageResource in image.ImageResources)
    {
        if (imageResource is AnimatedDataSectionResource)
        {
            var animatedData =
                (AnimatedDataSectionStructure) (imageResource as AnimatedDataSectionResource).AnimatedDataSection;
            var framesList = FindStructure<ListStructure>(animatedData.Items, "FrIn");

            var frame1 = (DescriptorStructure)framesList.Types[1];

            // Crea il record di ritardo del fotogramma con valore 100 centisecondi che è uguale a 1 secondo.
            var frameDelay = new IntegerStructure(new ClassID("FrDl"));
            frameDelay.Value = 100; // imposta il tempo in centisecondi.

            frame1.Structures = AddOrReplaceStructure(frame1.Structures, frameDelay);

            break;
        }
    }

    image.Save(outputPsd);
}
```

### Guarda anche

* class [ResourceBlock](../../aspose.psd.fileformats.psd/resourceblock/)
* spazio dei nomi [Aspose.PSD.FileFormats.Psd.Resources](../../aspose.psd.fileformats.psd.resources/)
* assemblea [Aspose.PSD](../../)


