---
title: RotateFlip
second_title: Riferimento all'API di Aspose.Imaging per .NET
description: Ruota capovolge o ruota e capovolge solo il fotogramma attivo.
type: docs
weight: 310
url: /it/net/aspose.imaging.fileformats.dicom/dicomimage/rotateflip/
---
## DicomImage.RotateFlip method

Ruota, capovolge o ruota e capovolge solo il fotogramma attivo.

```csharp
public override void RotateFlip(RotateFlipType rotateFlipType)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| rotateFlipType | RotateFlipType | Il tipo di capovolgimento ruota. |

### Esempi

Questo esempio carica un'immagine DICOM, la ruota di 90 gradi in senso orario e facoltativamente capovolge l'immagine orizzontalmente e/o verticalmente.

```csharp
[C#]

string dir = "c:\\temp\\";

Aspose.Imaging.RotateFlipType[] rotateFlipTypes = new Aspose.Imaging.RotateFlipType[]
{
    Aspose.Imaging.RotateFlipType.Rotate90FlipNone,
    Aspose.Imaging.RotateFlipType.Rotate90FlipX,
    Aspose.Imaging.RotateFlipType.Rotate90FlipXY,
    Aspose.Imaging.RotateFlipType.Rotate90FlipY,
};

foreach (Aspose.Imaging.RotateFlipType rotateFlipType in rotateFlipTypes)
{
    // Ruota, capovolgi e salva nel file di output.
    using (Aspose.Imaging.FileFormats.Dicom.DicomImage image = (Aspose.Imaging.FileFormats.Dicom.DicomImage)Aspose.Imaging.Image.Load(dir + "sample.dicom"))
    {
        image.RotateFlip(rotateFlipType);
        image.Save(dir + "sample." + rotateFlipType + ".png", new Aspose.Imaging.ImageOptions.PngOptions());
    }
}
```

### Guarda anche

* enum [RotateFlipType](../../../aspose.imaging/rotatefliptype)
* class [DicomImage](../../dicomimage)
* spazio dei nomi [Aspose.Imaging.FileFormats.Dicom](../../dicomimage)
* assemblea [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
