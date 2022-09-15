---
title: Metafile
second_title: Aspose.Drawing لمرجع NET API
description: يحدد ملف تعريف رسومي. يحتوي ملف التعريف على سجلات تصف سلسلة من عمليات الرسومات التي يمكن تسجيلها إنشاء وتشغيلها معروضة . هذه الفئة غير قابلة للتوريث .
type: docs
weight: 800
url: /ar/net/system.drawing.imaging/metafile/
---
## Metafile class

يحدد ملف تعريف رسومي. يحتوي ملف التعريف على سجلات تصف سلسلة من عمليات الرسومات التي يمكن تسجيلها (إنشاء) وتشغيلها (معروضة) . هذه الفئة غير قابلة للتوريث .

```csharp
public sealed class Metafile : Image
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Metafile](metafile#constructor_2)(Stream) | يقوم بتهيئة مثيل جديد لملف[`Metafile`](../metafile) فئة من دفق البيانات المحدد. |
| [Metafile](metafile#constructor_6)(string) | يقوم بتهيئة مثيل جديد لملف[`Metafile`](../metafile) فئة من اسم الملف المحدد. |
| [Metafile](metafile#constructor)(IntPtr, bool) | يقوم بتهيئة مثيل جديد لملف[`Metafile`](../metafile) فئة من المقبض المحدد. |
| [Metafile](metafile#constructor_1)(IntPtr, EmfType) | يقوم بتهيئة مثيل جديد لملف[`Metafile`](../metafile) فئة من المقبض المحدد إلى سياق الجهاز وEmfTypeالتعداد الذي يحدد تنسيقMetafile . |
| [Metafile](metafile#constructor_3)(Stream, IntPtr) | يقوم بتهيئة مثيل جديد لملف[`Metafile`](../metafile) فئة من دفق البيانات المحدد ومقبض Windows إلى سياق الجهاز. /&gt;. |
| [Metafile](metafile#constructor_7)(string, IntPtr) | يقوم بتهيئة مثيل جديد لملف[`Metafile`](../metafile) فئة من اسم الملف المحدد. |
| [Metafile](metafile#constructor_4)(Stream, IntPtr, EmfType) | يقوم بتهيئة مثيل جديد لملف[`Metafile`](../metafile) فئة من دفق البيانات المحدد ، مقبض Windows لسياق الجهاز ، وEmfType enumeration الذي يحدد تنسيق ملفMetafile . |
| [Metafile](metafile#constructor_5)(Stream, IntPtr, RectangleF, MetafileFrameUnit, EmfType) | يقوم بتهيئة مثيل جديد لملف[`Metafile`](../metafile) فئة من دفق البيانات المحدد ، مقبض Windows لسياق الجهاز ، وEmfType enumeration الذي يحدد تنسيق ملفMetafile . |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Flags](../../system.drawing/image/flags) { get; } | يحصل على العدد الصحيح الذي يمثل مجموعة بت من[`ImageFlags`](../imageflags) لهذه الصورة. |
| override [FrameDimensionsList](../../system.drawing.imaging/metafile/framedimensionslist) { get; } | يحصل على مصفوفة من GUIDs التي تمثل أبعاد الإطارات ضمن هذاImage . |
| override [Height](../../system.drawing.imaging/metafile/height) { get; } | الحصول على الارتفاع بالبكسل لهذاMetafile . |
| [HorizontalResolution](../../system.drawing/image/horizontalresolution) { get; } | الحصول على الدقة الأفقية ، بالبكسل في البوصة ، لهذاImage . |
| override [Palette](../../system.drawing.imaging/metafile/palette) { get; set; } | الحصول على أو تعيين لوحة الألوان المستخدمة لهذا الغرضImage . |
| [PhysicalDimension](../../system.drawing/image/physicaldimension) { get; } | الحصول على عرض وارتفاع هذه الصورة . |
| override [PixelFormat](../../system.drawing.imaging/metafile/pixelformat) { get; } | يحصل على تنسيق البكسل لهذاImage . |
| override [PropertyIdList](../../system.drawing.imaging/metafile/propertyidlist) { get; } | يحصل على معرفات عناصر الخاصية المخزنة في هذاImage . |
| override [PropertyItems](../../system.drawing.imaging/metafile/propertyitems) { get; } | يحصل على كل عناصر الخاصية (أجزاء من البيانات الوصفية) المخزنة في هذاImage . |
| override [RawFormat](../../system.drawing.imaging/metafile/rawformat) { get; } | يحصل على تنسيق الملف الخاص بهذاImage . |
| [Size](../../system.drawing/image/size) { get; } | الحصول على عرض هذه الصورة وارتفاعها بالبكسل. |
| [Tag](../../system.drawing/image/tag) { get; set; } | الحصول على أو تعيين كائن يوفر بيانات إضافية حول الصورة. |
| [VerticalResolution](../../system.drawing/image/verticalresolution) { get; } | الحصول على الدقة الرأسية ، بالبكسل في البوصة ، لهذاImage . |
| override [Width](../../system.drawing.imaging/metafile/width) { get; } | الحصول على عرض هذا بالبكسلMetafile . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clone](../../system.drawing/image/clone)() | لإنشاء نسخة طبق الأصل من هذاImage . |
| virtual [Dispose](../../system.drawing/image/dispose)() | يصدر جميع الموارد المستخدمة في هذه الصورة . |
| [GetBounds](../../system.drawing/image/getbounds)(ref GraphicsUnit) | يحصل على حدود الصورة بالوحدة المحددة. |
| [GetFrameCount](../../system.drawing/image/getframecount)(FrameDimension) | إرجاع عدد الإطارات ذات البعد المحدد. |
| [GetHenhmetafile](../../system.drawing.imaging/metafile/gethenhmetafile)() | إرجاع مقبض Windows إلى ملفMetafile . |
| [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader)() | إرجاع ملفMetafileHeader المرتبطة بهذاMetafile . |
| override [GetPropertyItem](../../system.drawing.imaging/metafile/getpropertyitem)(int) | يحصل على عنصر الخاصية المحدد من هذاImage . |
| [GetThumbnailImage](../../system.drawing/image/getthumbnailimage)(int, int, GetThumbnailImageAbort, IntPtr) | إرجاع صورة مصغرة لهذاImage . |
| [PlayRecord](../../system.drawing.imaging/metafile/playrecord)(EmfPlusRecordType, int, int, byte[]) | تشغيل سجل ملف تعريف فردي. |
| override [RemovePropertyItem](../../system.drawing.imaging/metafile/removepropertyitem)(int) | يزيل عنصر الخاصية المحدد من هذاImage . |
| override [RotateFlip](../../system.drawing.imaging/metafile/rotateflip)(RotateFlipType) | تقوم هذه الطريقة بتدوير ملفImage . |
| [Save](../../system.drawing/image/save)(string) | يحفظ هذاImageإلى الملف أو الدفق المحدد. |
| [Save](../../system.drawing/image/save)(Stream, ImageFormat) | يحفظ هذه الصورة في التدفق المحدد بالتنسيق المحدد. |
| [Save](../../system.drawing/image/save)(string, ImageFormat) | يحفظ هذاImage إلى الملف المحدد بالتنسيق المحدد. |
| [Save](../../system.drawing/image/save)(Stream, ImageCodecInfo, EncoderParameters) | يحفظ هذه الصورة في التدفق المحدد ، باستخدام معلمات التشفير ومشفّر الصور المحدد. |
| [Save](../../system.drawing/image/save)(string, ImageCodecInfo, EncoderParameters) | يحفظ هذاImage إلى الملف المحدد ، مع المحددات المحددة للتشفير وتشفير الصور. |
| [SaveAdd](../../system.drawing/image/saveadd)(EncoderParameters) | يضيف إطارًا إلى الملف أو التدفق المحدد في استدعاء سابق إلى إحدى طرق Image.Save (...) . استخدم هذه الطريقة لحفظ الإطارات المحددة من صورة متعددة الإطارات إلى صورة أخرى متعددة الإطارات. |
| [SaveAdd](../../system.drawing/image/saveadd)(Image, EncoderParameters) | يضيف إطارًا إلى الملف أو التدفق المحدد في استدعاء سابق إلى إحدى طرق Image.Save (...) . |
| [SelectActiveFrame](../../system.drawing/image/selectactiveframe)(FrameDimension, int) | تحديد الإطار المحدد بواسطة البعد والفهرس . |
| override [SetPropertyItem](../../system.drawing.imaging/metafile/setpropertyitem)(PropertyItem) | يخزن عنصر خاصية (جزء من البيانات الوصفية) في هذاImage . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader)(Stream) | إرجاع ملفMetafileHeader المرتبطة المحددةMetafile . |
| static [GetMetafileHeader](../../system.drawing.imaging/metafile/getmetafileheader#getmetafileheader_1)(string) | إرجاع ملفMetafileHeader المرتبطة المحددةMetafile . |

### أنظر أيضا

* class [Image](../../system.drawing/image)
* مساحة الاسم [System.Drawing.Imaging](../../system.drawing.imaging)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
