---
title: Image
second_title: Aspose.Drawing لمرجع NET API
description: فئة أساسية مجردة توفر وظائف للفئات النقطية وملف التعريف التنازلي.
type: docs
weight: 580
url: /ar/net/system.drawing/image/
---
## Image class

فئة أساسية مجردة توفر وظائف للفئات النقطية وملف التعريف التنازلي.

```csharp
public abstract class Image : IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Image](image)() | يقوم بتهيئة مثيل جديد لملف[`Image`](../image) فئة . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | يحصل على العدد الصحيح الذي يمثل مجموعة بت من[`ImageFlags`](../../system.drawing.imaging/imageflags) لهذه الصورة. |
| abstract [FrameDimensionsList](../../system.drawing/image/framedimensionslist) { get; } | يحصل على مصفوفة من GUIDs التي تمثل أبعاد الإطارات ضمن هذاImage . |
| abstract [Height](../../system.drawing/image/height) { get; } | الحصول على الارتفاع بالبكسل لهذاImage . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | الحصول على الدقة الأفقية ، بالبكسل في البوصة ، لهذاImage . |
| abstract [Palette](../../system.drawing/image/palette) { get; set; } | الحصول على أو تعيين لوحة الألوان المستخدمة لهذا الغرضImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | الحصول على عرض وارتفاع هذه الصورة . |
| abstract [PixelFormat](../../system.drawing/image/pixelformat) { get; } | يحصل على تنسيق البكسل لهذاImage . |
| abstract [PropertyIdList](../../system.drawing/image/propertyidlist) { get; } | يحصل على معرفات عناصر الخاصية المخزنة في هذاImage . |
| abstract [PropertyItems](../../system.drawing/image/propertyitems) { get; } | يحصل على كل عناصر الخاصية (أجزاء من البيانات الوصفية) المخزنة في هذاImage . |
| abstract [RawFormat](../../system.drawing/image/rawformat) { get; } | يحصل على تنسيق الملف الخاص بهذاImage . |
| [Size](../../system.drawing/image/size) { get; } | الحصول على عرض هذه الصورة وارتفاعها بالبكسل. |
| [Tag](../../system.drawing/image/tag) { get; set; } | الحصول على أو تعيين كائن يوفر بيانات إضافية حول الصورة. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | الحصول على الدقة الرأسية ، بالبكسل في البوصة ، لهذاImage . |
| abstract [Width](../../system.drawing/image/width) { get; } | الحصول على عرض هذا بالبكسلImage . |

## طُرق

| اسم | وصف |
| --- | --- |
| static [FromFile](../../system.drawing/image/fromfile)(string) | ينشئ ملفImage من الملف المحدد. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream)(Stream) | ينشئ ملفImageمن دفق البيانات المحدد. |
| static [FromStream](../../system.drawing/image/fromstream#fromstream_1)(Stream, bool) | ينشئ ملفImage من دفق البيانات المحدد ، اختياريًا باستخدام معلومات إدارة الألوان المضمنة في هذا الدفق. |
| [Clone](../../system.drawing/image/clone)() | لإنشاء نسخة طبق الأصل من هذاImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | يصدر جميع الموارد المستخدمة في هذه الصورة . |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | يحصل على حدود الصورة بالوحدة المحددة. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | إرجاع عدد الإطارات ذات البعد المحدد. |
| abstract [GetPropertyItem](../../system.drawing/image/getpropertyitem)(int) | يحصل على عنصر الخاصية المحدد من هذاImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | إرجاع صورة مصغرة لهذاImage . |
| abstract [RemovePropertyItem](../../system.drawing/image/removepropertyitem)(int) | يزيل عنصر الخاصية المحدد من هذاImage . |
| abstract [RotateFlip](../../system.drawing/image/rotateflip)(RotateFlipType) | تقوم هذه الطريقة بتدوير ملفImage . |
| [Save](../../system.drawing/image/save#save_2)(string) | يحفظ هذاImageإلى الملف أو الدفق المحدد. |
| [Save](../../system.drawing/image/save#save_1)(Stream, ImageFormat) | يحفظ هذه الصورة في التدفق المحدد بالتنسيق المحدد. |
| [Save](../../system.drawing/image/save#save_4)(string, ImageFormat) | يحفظ هذاImage إلى الملف المحدد بالتنسيق المحدد. |
| [Save](../../system.drawing/image/save#save)(Stream, ImageCodecInfo, EncoderParameters) | يحفظ هذه الصورة في التدفق المحدد ، باستخدام معلمات التشفير ومشفّر الصور المحدد. |
| [Save](../../system.drawing/image/save#save_3)(string, ImageCodecInfo, EncoderParameters) | يحفظ هذاImage إلى الملف المحدد ، مع المحددات المحددة للتشفير وتشفير الصور. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd_1)(EncoderParameters) | يضيف إطارًا إلى الملف أو التدفق المحدد في استدعاء سابق إلى إحدى طرق Image.Save (...) . استخدم هذه الطريقة لحفظ الإطارات المحددة من صورة متعددة الإطارات إلى صورة أخرى متعددة الإطارات. |
| [SaveAdd](../../system.drawing/image/saveadd#saveadd)(Image, EncoderParameters) | يضيف إطارًا إلى الملف أو التدفق المحدد في استدعاء سابق إلى إحدى طرق Image.Save (...) . |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | تحديد الإطار المحدد بواسطة البعد والفهرس . |
| abstract [SetPropertyItem](../../system.drawing/image/setpropertyitem)(PropertyItem) | يخزن عنصر خاصية (جزء من البيانات الوصفية) في هذاImage . |
| static [FromHbitmap](../../system.drawing/image/fromhbitmap)(IntPtr) | ينشئ ملفBitmap من مقبض إلى صورة نقطية GDI. |
| static [GetPixelFormatSize](../../system.drawing/image/getpixelformatsize)(PixelFormat) | إرجاع عمق اللون ، بعدد وحدات بت لكل بكسل ، لتنسيق البكسل المحدد. |
| static [IsAlphaPixelFormat](../../system.drawing/image/isalphapixelformat)(PixelFormat) | إرجاع قيمة تشير إلى ما إذا كان تنسيق البكسل لهذا أم لاImage يحتوي على معلومات ألفا. |

## أعضاء آخرون

| اسم | وصف |
| --- | --- |
| delegate [GetThumbnailImageAbort](image.getthumbnailimageabort) | يوفر طريقة رد اتصال لتحديد متى[`GetThumbnailImage`](./getthumbnailimage) يجب أن تلغي الطريقة التنفيذ قبل الأوان. |

### أنظر أيضا

* مساحة الاسم [System.Drawing](../../system.drawing)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
