---
title: RawDataFormat
second_title: Aspose.Imaging لمرجع NET API
description: يحصل على تنسيق البيانات الأولية.
type: docs
weight: 120
url: /ar/net/aspose.imaging.fileformats.png/pngimage/rawdataformat/
---
## PngImage.RawDataFormat property

يحصل على تنسيق البيانات الأولية.

```csharp
public override PixelDataFormat RawDataFormat { get; }
```

### أمثلة

يقوم المثال التالي بتحميل صور PNG ويطبع معلومات حول تنسيق البيانات الأولية وقناة ألفا.

```csharp
[C#]

// صور PNG للتحميل.
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

// قد يبدو الإخراج كالتالي:
// ImageFile = c: \ temp \ sample.png، FileFormat = Rgb24Bpp، القنوات المستخدمة: 8،8،8، HasAlpha = False
// ImageFile = c: \ temp \ alpha.png، FileFormat = RGBA32Bpp، القنوات المستخدمة: 8،8،8،8، HasAlpha = True
```

### أنظر أيضا

* class [PixelDataFormat](../../../aspose.imaging/pixeldataformat)
* class [PngImage](../../pngimage)
* مساحة الاسم [Aspose.Imaging.FileFormats.Png](../../pngimage)
* المجسم [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
