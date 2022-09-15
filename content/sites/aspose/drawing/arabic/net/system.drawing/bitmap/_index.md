---
title: Bitmap
second_title: Aspose.Drawing لمرجع NET API
description: يغلف صورة نقطية تتكون من بيانات البكسل لصورة رسومية وسماتها.Bitmap./bitmap هو كائن يستخدم للعمل مع الصور المحددة ببيانات البكسل.
type: docs
weight: 40
url: /ar/net/system.drawing/bitmap/
---
## Bitmap class

يغلف صورة نقطية تتكون من بيانات البكسل لصورة رسومية وسماتها.[`Bitmap`](../bitmap) هو كائن يستخدم للعمل مع الصور المحددة ببيانات البكسل.

```csharp
public class Bitmap : Image
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Bitmap](bitmap#constructor_3)(Image) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap) فئة من الصورة الحالية المحددة. |
| [Bitmap](bitmap#constructor_6)(Stream) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap) فئة من دفق البيانات المحدد. |
| [Bitmap](bitmap#constructor_8)(string) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap) فئة من الملف المحدد. |
| [Bitmap](bitmap#constructor_5)(Image, Size) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap)فئة من الصورة الحالية المحددة ، مع تغيير حجمها إلى الحجم المحدد. |
| [Bitmap](bitmap#constructor)(int, int) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap) فئة بالحجم المحدد. |
| [Bitmap](bitmap#constructor_7)(Stream, bool) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap) فئة من دفق البيانات المحدد. |
| [Bitmap](bitmap#constructor_9)(string, bool) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap) فئة من الملف المحدد. |
| [Bitmap](bitmap#constructor_4)(Image, int, int) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap) فئة من الصورة الحالية المحددة ، تحجيمها إلى الحجم المحدد. |
| [Bitmap](bitmap#constructor_2)(int, int, PixelFormat) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap) فئة بالحجم والتنسيق المحددين. |
| [Bitmap](bitmap#constructor_1)(int, int, int, PixelFormat, int[]) | يقوم بتهيئة مثيل جديد لملف[`Bitmap`](../bitmap) فئة بالحجم المحدد وبيانات البكسل. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | يحصل على العدد الصحيح الذي يمثل مجموعة بت من[`ImageFlags`](../../system.drawing.imaging/imageflags) لهذه الصورة. |
| override [FrameDimensionsList](../../system.drawing/bitmap/framedimensionslist) { get; } | يحصل على مصفوفة من GUIDs التي تمثل أبعاد الإطارات ضمن هذاImage . |
| override [Height](../../system.drawing/bitmap/height) { get; } | الحصول على الارتفاع بالبكسل لهذه الصورة النقطية. |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | الحصول على الدقة الأفقية ، بالبكسل في البوصة ، لهذاImage . |
| override [Palette](../../system.drawing/bitmap/palette) { get; set; } | الحصول على أو تعيين لوحة الألوان المستخدمة لهذا الغرضImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | الحصول على عرض وارتفاع هذه الصورة . |
| override [PixelFormat](../../system.drawing/bitmap/pixelformat) { get; } | يحصل على تنسيق البكسل لهذاImage . |
| override [PropertyIdList](../../system.drawing/bitmap/propertyidlist) { get; } | يحصل على معرفات عناصر الخاصية المخزنة في هذاImage . |
| override [PropertyItems](../../system.drawing/bitmap/propertyitems) { get; } | يحصل على كل عناصر الخاصية (أجزاء من البيانات الوصفية) المخزنة في هذاImage . |
| override [RawFormat](../../system.drawing/bitmap/rawformat) { get; } | يحصل على تنسيق الملف الخاص بهذاImage . |
| [Size](../../system.drawing/image/size) { get; } | الحصول على عرض هذه الصورة وارتفاعها بالبكسل. |
| [Tag](../../system.drawing/image/tag) { get; set; } | الحصول على أو تعيين كائن يوفر بيانات إضافية حول الصورة. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | الحصول على الدقة الرأسية ، بالبكسل في البوصة ، لهذاImage . |
| override [Width](../../system.drawing/bitmap/width) { get; } | الحصول على عرض هذه الصورة النقطية بالبكسل. |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | لإنشاء نسخة طبق الأصل من هذاImage . |
| [Clone](../../system.drawing/bitmap/clone#clone)(Rectangle, PixelFormat) | لإنشاء نسخة من هذا القسمBitmap المعرفة من قبلRectangle هيكل ومع المحددPixelFormat التعداد . |
| [Clone](../../system.drawing/bitmap/clone#clone_1)(RectangleF, PixelFormat) | لإنشاء نسخة من هذا القسمBitmap المعرفة مع المحددPixelFormat التعداد . |
| virtual [Dispose](../../system.drawing/image/dispose)() | يصدر جميع الموارد المستخدمة في هذه الصورة . |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | يحصل على حدود الصورة بالوحدة المحددة. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | إرجاع عدد الإطارات ذات البعد المحدد. |
| [GetPixel](../../system.drawing/bitmap/getpixel)(int, int) | يحصل على لون البكسل المحدد في هذاBitmap . |
| override [GetPropertyItem](../../system.drawing/bitmap/getpropertyitem)(int) | يحصل على عنصر الخاصية المحدد من هذاImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | إرجاع صورة مصغرة لهذاImage . |
| [LockBits](../../system.drawing/bitmap/lockbits)(Rectangle, ImageLockMode, PixelFormat) | أقفال أBitmap في ذاكرة النظام. |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent)() | يجعل اللون المحدد شفافًا لهذا الغرضBitmap . |
| [MakeTransparent](../../system.drawing/bitmap/maketransparent#maketransparent_1)(Color) | يجعل اللون المحدد شفافًا لهذا الغرضBitmap . |
| [ReadArgb32Pixels](../../system.drawing/bitmap/readargb32pixels)(int[]) | لقراءة وحدات البكسل النقطية بتنسيق ARGB32 في مصفوفة معينة. |
| override [RemovePropertyItem](../../system.drawing/bitmap/removepropertyitem)(int) | يزيل عنصر الخاصية المحدد من هذاImage . |
| override [RotateFlip](../../system.drawing/bitmap/rotateflip)(RotateFlipType) | تقوم هذه الطريقة بتدوير ملفImage . |
| [Save](../../system.drawing/image/save)(string) | يحفظ هذاImageإلى الملف أو الدفق المحدد. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | يحفظ هذه الصورة في التدفق المحدد بالتنسيق المحدد. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | يحفظ هذاImage إلى الملف المحدد بالتنسيق المحدد. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | يحفظ هذه الصورة في التدفق المحدد ، باستخدام معلمات التشفير ومشفّر الصور المحدد. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | يحفظ هذاImage إلى الملف المحدد ، مع المحددات المحددة للتشفير وتشفير الصور. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | يضيف إطارًا إلى الملف أو التدفق المحدد في استدعاء سابق إلى إحدى طرق Image.Save (...) . استخدم هذه الطريقة لحفظ الإطارات المحددة من صورة متعددة الإطارات إلى صورة أخرى متعددة الإطارات. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | يضيف إطارًا إلى الملف أو التدفق المحدد في استدعاء سابق إلى إحدى طرق Image.Save (...) . |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | تحديد الإطار المحدد بواسطة البعد والفهرس . |
| [SetPixel](../../system.drawing/bitmap/setpixel)(int, int, Color) | يضبط لون البكسل المحدد في هذاBitmap . |
| override [SetPropertyItem](../../system.drawing/bitmap/setpropertyitem)(PropertyItem) | يخزن عنصر خاصية (جزء من البيانات الوصفية) في هذاImage . |
| [SetResolution](../../system.drawing/bitmap/setresolution)(float, float) | يضبط الدقة لهذا الغرضBitmap . |
| [UnlockBits](../../system.drawing/bitmap/unlockbits)(BitmapData) | يفتح هذاBitmap من ذاكرة النظام. |
| [WriteArgb32Pixels](../../system.drawing/bitmap/writeargb32pixels)(int[]) | يكتب وحدات البكسل على الصورة النقطية . |

### أنظر أيضا

* class [Image](../image)
* مساحة الاسم [System.Drawing](../../system.drawing)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
