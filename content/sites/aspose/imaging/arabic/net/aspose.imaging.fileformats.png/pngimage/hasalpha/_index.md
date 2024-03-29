---
title: HasAlpha
second_title: Aspose.Imaging لمرجع NET API
description: احصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على alpha .
type: docs
weight: 50
url: /ar/net/aspose.imaging.fileformats.png/pngimage/hasalpha/
---
## PngImage.HasAlpha property

احصل على قيمة تشير إلى ما إذا كان هذا المثيل يحتوي على alpha .

```csharp
public override bool HasAlpha { get; }
```

### Property_Value

`حقيقي` إذا كان هذا المثال يحتوي على alpha ؛ خلاف ذلك،`خاطئة` .

### أمثلة

يوضح المثال التالي كيفية التحقق مما إذا كانت صورة PNG تدعم قناة ألفا.

```csharp
[C#]

// احصل على جميع أنواع ألوان PNG المدعومة.
System.Array colorTypes = System.Enum.GetValues(typeof(Aspose.Imaging.FileFormats.Png.PngColorType));

foreach (Aspose.Imaging.FileFormats.Png.PngColorType colorType in colorTypes)
{
    Aspose.Imaging.ImageOptions.PngOptions createOptions = new Aspose.Imaging.ImageOptions.PngOptions();
    createOptions.Source = new Sources.StreamSource(new System.IO.MemoryStream());
    createOptions.ColorType = colorType;

    using (Aspose.Imaging.Image image = Image.Create(createOptions, 100, 100))
    {
        Aspose.Imaging.FileFormats.Png.PngImage pngImage = (Aspose.Imaging.FileFormats.Png.PngImage)image;

        if (pngImage.HasAlpha)
        {
            System.Console.WriteLine("A {0} PNG image supports alpha channel", createOptions.ColorType);
        }
        else
        {
            System.Console.WriteLine("A {0} PNG image doesn't support alpha channel", createOptions.ColorType);
        }
    }
}

// يبدو الإخراج كالتالي:
// لا تدعم صورة PNG ذات التدرج الرمادي الرمادي قناة ألفا
// لا تدعم صورة Truecolor PNG قناة ألفا
// لا تدعم صورة IndexedColor PNG قناة ألفا
// A GrayscaleWithAlpha صورة PNG تدعم قناة ألفا
// A TruecolorWithAlpha صورة PNG تدعم قناة ألفا
```

### أنظر أيضا

* class [PngImage](../../pngimage)
* مساحة الاسم [Aspose.Imaging.FileFormats.Png](../../pngimage)
* المجسم [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
