---
title: Figure
second_title: Aspose.Imaging لمرجع NET API
description: الشكل. حاوية للأشكال .
type: docs
weight: 1290
url: /ar/net/aspose.imaging/figure/
---
## Figure class

الشكل. حاوية للأشكال .

```csharp
public class Figure : ObjectWithBounds
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Figure](figure)() | Default_Constructor |

## الخصائص

| اسم | وصف |
| --- | --- |
| override [Bounds](../../aspose.imaging/figure/bounds) { get; } | الحصول على أو تعيين حدود الكائن. |
| [IsClosed](../../aspose.imaging/figure/isclosed) { get; set; } | الحصول على أو تحديد قيمة تشير إلى ما إذا كان هذا الرقم مغلقًا. سيحدث الشكل المغلق فرقًا فقط في حالة الشكل الأول والأخير من الأشكال المستمرة. في مثل هذه الحالة ، ستكون النقطة الأولى من الشكل الأول متصلة بخط مستقيم من آخر نقطة في الشكل الأخير. |
| [Segments](../../aspose.imaging/figure/segments) { get; } | يحصل على شرائح الشكل بالكامل. |
| [Shapes](../../aspose.imaging/figure/shapes) { get; } | الحصول على أشكال الشكل. |

## طُرق

| اسم | وصف |
| --- | --- |
| [AddShape](../../aspose.imaging/figure/addshape)(Shape) | يضيف شكلاً إلى الشكل. |
| [AddShapes](../../aspose.imaging/figure/addshapes)(Shape[]) | يضيف نطاقًا من الأشكال إلى الشكل. |
| override [GetBounds](../../aspose.imaging/figure/getbounds#getbounds)(Matrix) | يحصل على حدود الكائن . |
| override [GetBounds](../../aspose.imaging/figure/getbounds#getbounds_1)(Matrix, Pen) | يحصل على حدود الكائن . |
| [RemoveShape](../../aspose.imaging/figure/removeshape)(Shape) | يزيل شكل من الشكل. |
| [RemoveShapes](../../aspose.imaging/figure/removeshapes)(Shape[]) | يزيل مجموعة من الأشكال من الشكل. |
| [Reverse](../../aspose.imaging/figure/reverse)() | يعكس ترتيب أشكال الشكل هذا وترتيب نقاط الأشكال. |
| override [Transform](../../aspose.imaging/figure/transform)(Matrix) | يطبق التحويل المحدد على الشكل. |

### أمثلة

تستخدم هذه الأمثلة فئة GraphicsPath و Graphics لإنشاء الأشكال ومعالجتها على سطح الصورة. ينشئ المثال صورة جديدة (من النوع Tiff) ، ويمسح السطح ويرسم المسارات بمساعدة فئة GraphicsPath. في النهاية ، يتم استدعاء طريقة DrawPath المعروضة بواسطة فئة الرسومات لعرض المسارات على السطح.

```csharp
[C#]

// إنشاء مثيل لـ FileStream
using (System.IO.FileStream stream = new System.IO.FileStream(@"C:\temp\output.tiff", System.IO.FileMode.Create))
{
    // قم بإنشاء مثيل لـ TiffOptions وعيّن خصائصه المتنوعة
    Aspose.Imaging.ImageOptions.TiffOptions tiffOptions = new Aspose.Imaging.ImageOptions.TiffOptions(Imaging.FileFormats.Tiff.Enums.TiffExpectedFormat.Default);

    // تعيين المصدر لمثيل ImageOptions
    tiffOptions.Source = new Aspose.Imaging.Sources.StreamSource(stream);

    // إنشاء مثيل للصورة 
    using (Aspose.Imaging.Image image = Aspose.Imaging.Image.Create(tiffOptions, 500, 500))
    {
        // إنشاء وتهيئة مثيل لفئة الرسومات
        Aspose.Imaging.Graphics graphics = new Aspose.Imaging.Graphics(image);

        // مسح سطح الرسومات
        graphics.Clear(Color.Wheat);

        // إنشاء مثيل لفئة GraphicsPath
        Aspose.Imaging.GraphicsPath graphicspath = new Aspose.Imaging.GraphicsPath();

        // إنشاء مثيل لفئة الشكل
        Aspose.Imaging.Figure figure = new Aspose.Imaging.Figure();

        // إضافة أشكال إلى كائن الشكل
        figure.AddShape(new Aspose.Imaging.Shapes.RectangleShape(new Aspose.Imaging.RectangleF(10f, 10f, 300f, 300f)));
        figure.AddShape(new Aspose.Imaging.Shapes.EllipseShape(new Aspose.Imaging.RectangleF(50f, 50f, 300f, 300f)));
        figure.AddShape(new Aspose.Imaging.Shapes.PieShape(new Aspose.Imaging.RectangleF(new Aspose.Imaging.PointF(250f, 250f), new Aspose.Imaging.SizeF(200f, 200f)), 0f, 45f));

        // إضافة كائن الشكل إلى GraphicsPath
        graphicspath.AddFigure(figure);

        // رسم المسار باستخدام كائن القلم ذي اللون الأسود
        graphics.DrawPath(new Aspose.Imaging.Pen(Aspose.Imaging.Color.Black, 2), graphicspath);

        // احفظ جميع التغييرات.
        image.Save();
    }
}
```

### أنظر أيضا

* class [ObjectWithBounds](../objectwithbounds)
* مساحة الاسم [Aspose.Imaging](../../aspose.imaging)
* المجسم [Aspose.Imaging](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Imaging.dll -->
