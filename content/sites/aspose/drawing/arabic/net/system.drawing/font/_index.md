---
title: Font
second_title: Aspose.Drawing لمرجع NET API
description: يحدد تنسيقًا معينًا للنص  بما في ذلك سمات الخط والحجم والنمط. لا يمكن توريث هذه الفئة .
type: docs
weight: 500
url: /ar/net/system.drawing/font/
---
## Font class

يحدد تنسيقًا معينًا للنص ، بما في ذلك سمات الخط والحجم والنمط. لا يمكن توريث هذه الفئة .

```csharp
public sealed class Font : IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [Font](font#constructor)(Font, FontStyle) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة تستخدم المحدد الموجودFont وFontStyle التعداد .. |
| [Font](font#constructor_1)(FontFamily, float) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة . |
| [Font](font#constructor_7)(string, float) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام حجم محدد. |
| [Font](font#constructor_2)(FontFamily, float, FontStyle) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام حجم ونمط محددين .. |
| [Font](font#constructor_6)(FontFamily, float, GraphicsUnit) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام حجم ووحدة محددة. يضبط النمط علىRegular . |
| [Font](font#constructor_8)(string, float, FontStyle) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام حجم ونمط محددين. |
| [Font](font#constructor_12)(string, float, GraphicsUnit) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام حجم ووحدة محددة. تم تعيين النمط علىRegular . |
| [Font](font#constructor_3)(FontFamily, float, FontStyle, GraphicsUnit) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام حجم ونمط ووحدة محددة. |
| [Font](font#constructor_9)(string, float, FontStyle, GraphicsUnit) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام حجم ونمط ووحدة محددة. |
| [Font](font#constructor_4)(FontFamily, float, FontStyle, GraphicsUnit, byte) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام حجم ونمط ووحدة ومجموعة أحرف محددة .. |
| [Font](font#constructor_10)(string, float, FontStyle, GraphicsUnit, byte) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font)فئة باستخدام حجم ونمط ووحدة ومجموعة أحرف محددة. |
| [Font](font#constructor_5)(FontFamily, float, FontStyle, GraphicsUnit, byte, bool) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام حجم ونمط ووحدة ومجموعة أحرف محددة .. |
| [Font](font#constructor_11)(string, float, FontStyle, GraphicsUnit, byte, bool) | يقوم بتهيئة مثيل جديد لملف[`Font`](../font) فئة باستخدام الحجم المحدد والنمط والوحدة ومجموعة الأحرف. |

## الخصائص

| اسم | وصف |
| --- | --- |
| [Bold](../../system.drawing/font/bold) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذاFont جريئة . |
| [FontFamily](../../system.drawing/font/fontfamily) { get; } | يحصل على ملفFontFamily المرتبطة بهذاFont . |
| [GdiCharSet](../../system.drawing/font/gdicharset) { get; } | يحصل على قيمة البايت التي تحدد مجموعة أحرف GDI أن هذاFont يستخدم . |
| [GdiVerticalFont](../../system.drawing/font/gdiverticalfont) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذاFont مشتق من خط عمودي GDI .. |
| [Height](../../system.drawing/font/height) { get; } | يحصل على تباعد الأسطر لهذا الخط. |
| [IsSystemFont](../../system.drawing/font/issystemfont) { get; } | يحصل على قيمة تشير إلى ما إذا كان الخط عضوًا فيSystemFonts . |
| [Italic](../../system.drawing/font/italic) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذاFont مائل . |
| [Name](../../system.drawing/font/name) { get; } | يحصل على اسم الوجه لهذاFont . |
| [OriginalFontName](../../system.drawing/font/originalfontname) { get; } | الحصول على اسم الخط المحدد أصلاً. |
| [Size](../../system.drawing/font/size) { get; } | يحصل على حجم em لهذاFont تقاس بالوحدات المحددة بواسطة Unit الملكية . |
| [SizeInPoints](../../system.drawing/font/sizeinpoints) { get; } | الحصول على حجم em ، بالنقاط ، لهذاFont . |
| [Strikeout](../../system.drawing/font/strikeout) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذاFont يحدد خطًا أفقيًا من خلال الخط. |
| [Style](../../system.drawing/font/style) { get; } | يحصل على معلومات عن النمط لهذا الغرضFont . |
| [SystemFontName](../../system.drawing/font/systemfontname) { get; } | يحصل على اسم خط النظام إذا كانت الخاصية IsSystemFont ترجع صحيحًا. |
| [Underline](../../system.drawing/font/underline) { get; } | يحصل على قيمة تشير إلى ما إذا كان هذاFont مسطر . |
| [Unit](../../system.drawing/font/unit) { get; } | الحصول على وحدة القياس لهذاFont . |

## طُرق

| اسم | وصف |
| --- | --- |
| [Clone](../../system.drawing/font/clone)() | لإنشاء نسخة طبق الأصل من هذاFont . |
| [Dispose](../../system.drawing/font/dispose)() | يقوم بإصدار كافة الموارد التي يستخدمها هذاFont . |
| override [Equals](../../system.drawing/font/equals)(object) | يشير إلى ما إذا كان الكائن المحددFont وله نفس الشيءFontFamily ، GdiVerticalFont وGdiCharSet وStyle وSize و وUnit قيم الممتلكات على هذا النحوFont . |
| override [GetHashCode](../../system.drawing/font/gethashcode)() | يحصل على كود التجزئة لهذاFont . |
| [GetHeight](../../system.drawing/font/getheight#getheight)() | إرجاع تباعد الأسطر بالبكسل لهذا الخط. |
| [GetHeight](../../system.drawing/font/getheight#getheight_1)(float) | إرجاع الارتفاع بالبكسلFontعند الرسم على جهاز بدقة عمودية محددة. |
| [GetHeight](../../system.drawing/font/getheight#getheight_2)(Graphics) | إرجاع تباعد الأسطر ، بالوحدة الحالية من المحددGraphics ، من هذا الخط. |
| override [ToString](../../system.drawing/font/tostring)() | إرجاع تمثيل سلسلة يمكن قراءته بواسطة الإنسانFont . |

### أنظر أيضا

* مساحة الاسم [System.Drawing](../../system.drawing)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
