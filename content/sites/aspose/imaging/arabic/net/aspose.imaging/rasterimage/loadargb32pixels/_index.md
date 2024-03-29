---
title: LoadArgb32Pixels
second_title: Aspose.Imaging لمرجع NET API
description: تحميل 32 بت ARGB بكسل .
type: docs
weight: 360
url: /ar/net/aspose.imaging/rasterimage/loadargb32pixels/
---
## RasterImage.LoadArgb32Pixels method

تحميل 32 بت ARGB بكسل .

```csharp
public int[] LoadArgb32Pixels(Rectangle rectangle)
```

| معامل | يكتب | وصف |
| --- | --- | --- |
| rectangle | Rectangle | المستطيل المراد تحميل البكسل منه. |

### قيمة الإرجاع

مصفوفة وحدات البكسل ARGB 32 بت التي تم تحميلها .

### أمثلة

يوضح المثال التالي كيفية تحميل ومعالجة وحدات البكسل لصورة نقطية. يتم تمثيل وحدات البكسل كقيم عدد صحيح 32 بت. على سبيل المثال ، ضع في اعتبارك مشكلة حساب وحدات البكسل الشفافة بالكامل للصورة.

```csharp
[C#]

using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Load(@"c:\temp\alpha.png"))
{
    Aspose.Imaging.RasterImage rasterImage = (Aspose.Imaging.RasterImage)image;

    // تحميل بكسل للصورة بأكملها. يمكن تحديد أي جزء مستطيل من الصورة كمعامل لطريقة Aspose.Imaging.RasterImage.LoadArgb32Pixels.
    int[] pixels = rasterImage.LoadArgb32Pixels(rasterImage.Bounds);

    int count = 0;
    foreach (int pixel in pixels)
    {
        int alpha = (pixel >> 24) & 0xff;
        if (alpha == 0)
        {
            count++;
        }
    }

    System.Console.WriteLine("The number of fully transparent pixels is {0}", count);
    System.Console.WriteLine("The total number of pixels is {0}", image.Width * image.Height);
}
```

### أنظر أيضا

* struct [Rectangle](../../rectangle)
* class [RasterImage](../../rasterimage)
* مساحة الاسم [Aspose.Imaging](../../rasterimage)
* المجسم [Aspose.Imaging](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
