---
title: RawDataFormat
second_title: Aspose.Imaging für .NET-API-Referenz
description: Ruft das Rohdatenformat ab.
type: docs
weight: 120
url: /de/net/aspose.imaging.fileformats.png/pngimage/rawdataformat/
---
## PngImage.RawDataFormat property

Ruft das Rohdatenformat ab.

```csharp
public override PixelDataFormat RawDataFormat { get; }
```

### Beispiele

Das folgende Beispiel lädt PNG-Bilder und druckt Informationen über das Rohdatenformat und den Alphakanal.

```csharp
[C#]

// Die zu ladenden PNG-Bilder.
string[] fileNames = new string[]
{
    @"c:\temp\sample.png",
    @"c:\temp\alpha.png",
};

foreach (string fileName in fileNames)
{
    using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(fileName))
    {
        Aspose.Imaging.FileFormats.Png.PngImage pngImage = (Aspose.Imaging.FileFormats.Png.PngImage)image;
        System.Console.WriteLine("ImageFile={0}, FileFormat={1}, HasAlpha={2}", fileName, pngImage.RawDataFormat, pngImage.HasAlpha);
    }
}

// Die Ausgabe könnte so aussehen:
// ImageFile=c:\temp\sample.png, FileFormat=Rgb24Bpp, verwendete Kanäle: 8,8,8, HasAlpha=False
// ImageFile=c:\temp\alpha.png, FileFormat=RGBA32Bpp, verwendete Kanäle: 8,8,8,8, HasAlpha=True
```

### Siehe auch

* class [PixelDataFormat](../../../aspose.imaging/pixeldataformat)
* class [PngImage](../../pngimage)
* namensraum [Aspose.Imaging.FileFormats.Png](../../pngimage)
* Montage [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
