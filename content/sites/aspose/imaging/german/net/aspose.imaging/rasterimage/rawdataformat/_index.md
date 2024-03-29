---
title: RawDataFormat
second_title: Aspose.Imaging für .NET-API-Referenz
description: Ruft das Rohdatenformat ab.
type: docs
weight: 80
url: /de/net/aspose.imaging/rasterimage/rawdataformat/
---
## RasterImage.RawDataFormat property

Ruft das Rohdatenformat ab.

```csharp
public virtual PixelDataFormat RawDataFormat { get; }
```

### Eigentumswert

Das Rohdatenformat.

### Beispiele

Das folgende Beispiel lädt Rasterbilder und druckt Informationen über das Rohdatenformat und den Alphakanal.

```csharp
[C#]

// Die zu ladenden Bilddateien.
string[] fileNames = new string[]
{
    @"c:\temp\sample.bmp",
    @"c:\temp\alpha.png",
};

foreach (string fileName in fileNames)
{
    using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(fileName))
    {
        Aspose.Imaging.RasterImage rasterImage = (Aspose.Imaging.RasterImage)image;
        System.Console.WriteLine("ImageFile={0}, FileFormat={1}, HasAlpha={2}", fileName, rasterImage.RawDataFormat, rasterImage.HasAlpha);
    }
}

// Die Ausgabe könnte so aussehen:
// ImageFile=c:\temp\sample.bmp, FileFormat=Rgb24Bpp, verwendete Kanäle: 8,8,8, HasAlpha=False
// ImageFile=c:\temp\alpha.png, FileFormat=RGBA32Bpp, verwendete Kanäle: 8,8,8,8, HasAlpha=True
```

Dieses Beispiel zeigt, wie ein DJVU-Bild aus einem Dateistream geladen und Informationen zu den Seiten gedruckt werden.

```csharp
[C#]

string dir = "c:\\temp\\";

// Laden Sie ein DJVU-Bild aus einem Dateistream.
using (System.IO.Stream stream = System.IO.File.OpenRead(dir + "sample.djvu"))
{
    using (Aspose.Imaging.FileFormats.Djvu.DjvuImage djvuImage = new Aspose.Imaging.FileFormats.Djvu.DjvuImage(stream))
    {
        System.Console.WriteLine("The total number of pages: {0}", djvuImage.Pages.Length);
        System.Console.WriteLine("The active page number:    {0}", djvuImage.ActivePage.PageNumber);
        System.Console.WriteLine("The first page number:     {0}", djvuImage.FirstPage.PageNumber);
        System.Console.WriteLine("The last page number:      {0}", djvuImage.LastPage.PageNumber);

        foreach (Aspose.Imaging.FileFormats.Djvu.DjvuPage djvuPage in djvuImage.Pages)
        {
            System.Console.WriteLine("--------------------------------------------------");
            System.Console.WriteLine("Page number:     {0}", djvuPage.PageNumber);
            System.Console.WriteLine("Page size:       {0}", djvuPage.Size);
            System.Console.WriteLine("Page raw format: {0}", djvuPage.RawDataFormat);
        }
    }
}

//Die Ausgabe könnte so aussehen:
//Die Gesamtzahl der Seiten: 2
//Die aktive Seitennummer: 1
//Die erste Seitenzahl: 1
//Die letzte Seitenzahl: 2
//------------------------------------------------------------- ------------- --
//Seitenzahl: 1
//Seitengröße: {Breite = 2481, Höhe = 3508}
//Rohformat der Seite: RgbIndexed1Bpp, verwendete Kanäle: 1
//------------------------------------------------------------- ------------- --
//Seitenzahl: 2
//Seitengröße: {Breite = 2481, Höhe = 3508}
//Rohformat der Seite: RgbIndexed1Bpp, verwendete Kanäle: 1
```

### Siehe auch

* class [PixelDataFormat](../../pixeldataformat)
* class [RasterImage](../../rasterimage)
* namensraum [Aspose.Imaging](../../rasterimage)
* Montage [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
