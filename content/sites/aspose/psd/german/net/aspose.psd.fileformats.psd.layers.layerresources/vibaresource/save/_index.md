---
title: VibAResource.Save
second_title: Aspose.PSD für .NET-API-Referenz
description: VibAResource methode. Speichert die Ressource im angegebenen StreamContainer.
type: docs
weight: 70
url: /de/net/aspose.psd.fileformats.psd.layers.layerresources/vibaresource/save/
---
## VibAResource.Save method

Speichert die Ressource im angegebenen Stream-Container.

```csharp
public override void Save(StreamContainer streamContainer, int psdVersion)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| streamContainer | StreamContainer | Der Stream-Container, in dem gespeichert werden soll. |
| psdVersion | Int32 | Die PSD-Version. |

### Beispiele

Das folgende Codebeispiel demonstriert die Unterstützung der VibAResource-Ressource.

```csharp
[C#]

// Beispiel für die Unterstützung des Lesens und Schreibens von Vibrationsressourcen zur Laufzeit.
string sourceFileName = "VibranceResource.psd";
string outputFileName = "out_VibranceResource.psd";

using (PsdImage image = (PsdImage)Image.Load(sourceFileName))
{
    foreach (var layer in image.Layers)
    {
        foreach (var resource in layer.Resources)
        {
            if (resource is VibAResource)
            {
                var vibranceResource = (VibAResource)resource;

                int vibranceValue =  vibranceResource.Vibrance;
                int saturationValue = vibranceResource.Saturation;

                vibranceResource.Vibrance = vibranceValue * 2;
                vibranceResource.Saturation = saturationValue * 2;

                break;
            }
        }
    }

    image.Save(outputFileName);
}
```

### Siehe auch

* class [StreamContainer](../../../aspose.psd/streamcontainer/)
* class [VibAResource](../)
* namensraum [Aspose.PSD.FileFormats.Psd.Layers.LayerResources](../../vibaresource/)
* Montage [Aspose.PSD](../../../)


