---
title: RotateFlip
second_title: Aspose.Imaging für .NET-API-Referenz
description: Dreht kippt oder dreht und kippt das Bild.
type: docs
weight: 230
url: /de/net/aspose.imaging/image/rotateflip/
---
## Image.RotateFlip method

Dreht, kippt oder dreht und kippt das Bild.

```csharp
public abstract void RotateFlip(RotateFlipType rotateFlipType)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| rotateFlipType | RotateFlipType | Typ des Rotierens Flip. |

### Beispiele

Dieses Beispiel demonstriert die Verwendung des Rotate-Vorgangs an einem Bild. Beispiel lädt eine vorhandene Bilddatei von einem Speicherort auf der Festplatte und führt den Rotate-Vorgang für das Bild gemäß dem Wert von Enum Aspose.Imaging.RotateFlipType aus

```csharp
[C#]

//Erstellen Sie eine Instanz der Bildklasse und initialisieren Sie sie mit einer vorhandenen Bilddatei über den Dateipfad
using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(@"C:\temp\sample.bmp"))
{
    // Drehen Sie das Bild um 180 Grad um die X-Achse
    image.RotateFlip(Aspose.Imaging.RotateFlipType.Rotate180FlipX);

    // Alle Änderungen speichern.
    image.Save();
}
```

Dieses Beispiel lädt ein Bild, dreht es um 90 Grad im Uhrzeigersinn und dreht das Bild optional horizontal und/oder vertikal.

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
    // Drehen, spiegeln und in der Ausgabedatei speichern.
    using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(dir + "sample.bmp"))
    {
        image.RotateFlip(rotateFlipType);
        image.Save(dir + "sample." + rotateFlipType + ".bmp");
    }
}
```

### Siehe auch

* enum [RotateFlipType](../../rotatefliptype)
* class [Image](../../image)
* namensraum [Aspose.Imaging](../../image)
* Montage [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
