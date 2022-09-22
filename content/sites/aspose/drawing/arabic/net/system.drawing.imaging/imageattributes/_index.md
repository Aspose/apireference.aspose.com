---
title: ImageAttributes
second_title: Aspose.Drawing لمرجع NET API
description: يحتوي على معلومات حول كيفية معالجة ألوان الصور النقطية وملفات التعريف أثناء العرض.
type: docs
weight: 740
url: /ar/net/system.drawing.imaging/imageattributes/
---
## ImageAttributes class

يحتوي على معلومات حول كيفية معالجة ألوان الصور النقطية وملفات التعريف أثناء العرض.

```csharp
public sealed class ImageAttributes : ICloneable, IDisposable
```

## المنشئون

| اسم | وصف |
| --- | --- |
| [ImageAttributes](imageattributes)() | يقوم بتهيئة مثيل جديد لملف[`ImageAttributes`](../imageattributes) فئة . |

## طُرق

| اسم | وصف |
| --- | --- |
| [ClearBrushRemapTable](../../system.drawing.imaging/imageattributes/clearbrushremaptable)() | يمسح جدول إعادة رسم خريطة لون الفرشاة لهذاImageAttributes الكائن . |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey)() | يمسح مفتاح اللون (نطاق الشفافية) للفئة الافتراضية. |
| [ClearColorKey](../../system.drawing.imaging/imageattributes/clearcolorkey#clearcolorkey_1)(ColorAdjustType) | يمسح مفتاح اللون (نطاق الشفافية) لفئة محددة. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix)() | يمسح مصفوفة ضبط اللون للفئة الافتراضية. |
| [ClearColorMatrix](../../system.drawing.imaging/imageattributes/clearcolormatrix#clearcolormatrix_1)(ColorAdjustType) | يمسح مصفوفة ضبط اللون لفئة محددة. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma)() | تعطيل تصحيح جاما للفئة الافتراضية. |
| [ClearGamma](../../system.drawing.imaging/imageattributes/cleargamma#cleargamma_1)(ColorAdjustType) | تعطيل تصحيح جاما لفئة محددة. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop)() | يمسح إعداد NoOp للفئة الافتراضية. |
| [ClearNoOp](../../system.drawing.imaging/imageattributes/clearnoop#clearnoop_1)(ColorAdjustType) | يمسح إعداد NoOp لفئة محددة. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel)() | يمسح إعداد قناة الإخراج CMYK (سماوي-أرجواني-أصفر-أسود) للفئة الافتراضية. |
| [ClearOutputChannel](../../system.drawing.imaging/imageattributes/clearoutputchannel#clearoutputchannel_1)(ColorAdjustType) | يمسح إعداد قناة الإخراج (سماوي - أرجواني - أصفر - أسود) لفئة محددة. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile)() | يمسح إعداد ملف تعريف لون قناة الإخراج للفئة الافتراضية. |
| [ClearOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/clearoutputchannelcolorprofile#clearoutputchannelcolorprofile_1)(ColorAdjustType) | يمسح إعداد ملف تعريف لون قناة الإخراج لفئة محددة. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable)() | يمسح جدول إعادة تعيين الألوان للفئة الافتراضية. |
| [ClearRemapTable](../../system.drawing.imaging/imageattributes/clearremaptable#clearremaptable_1)(ColorAdjustType) | يمسح جدول إعادة رسم خريطة الألوان لفئة محددة. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold)() | مسح القيمة الحدية للفئة الافتراضية. |
| [ClearThreshold](../../system.drawing.imaging/imageattributes/clearthreshold#clearthreshold_1)(ColorAdjustType) | مسح القيمة الحدية لفئة محددة. |
| [Clone](../../system.drawing.imaging/imageattributes/clone)() | لإنشاء نسخة طبق الأصل من هذاImageAttributes الكائن . |
| [Dispose](../../system.drawing.imaging/imageattributes/dispose)() | يقوم بإصدار كافة الموارد التي يستخدمها هذاImageAttributes الكائن . |
| [GetAdjustedPalette](../../system.drawing.imaging/imageattributes/getadjustedpalette)(ColorPalette, ColorAdjustType) | يضبط الألوان في لوحة وفقًا لإعدادات الضبط لفئة محددة. |
| [SetBrushRemapTable](../../system.drawing.imaging/imageattributes/setbrushremaptable)(ColorMap[]) | يضبط جدول إعادة رسم خريطة الألوان لفئة الفرشاة. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey)(Color, Color) | يضبط مفتاح اللون للفئة الافتراضية. |
| [SetColorKey](../../system.drawing.imaging/imageattributes/setcolorkey#setcolorkey_1)(Color, Color, ColorAdjustType) | يضبط مفتاح اللون (نطاق الشفافية) لفئة محددة. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices)(ColorMatrix, ColorMatrix) | يضبط مصفوفة ضبط اللون ومصفوفة ضبط التدرج الرمادي للفئة الافتراضية. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_1)(ColorMatrix, ColorMatrix, ColorMatrixFlag) | يضبط مصفوفة ضبط اللون ومصفوفة ضبط التدرج الرمادي للفئة الافتراضية. |
| [SetColorMatrices](../../system.drawing.imaging/imageattributes/setcolormatrices#setcolormatrices_2)(ColorMatrix, ColorMatrix, ColorMatrixFlag, ColorAdjustType) | يضبط مصفوفة ضبط اللون ومصفوفة ضبط التدرج الرمادي لفئة محددة. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix)(ColorMatrix) | يضبط مصفوفة ضبط اللون للفئة الافتراضية. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_1)(ColorMatrix, ColorMatrixFlag) | يضبط مصفوفة ضبط اللون للفئة الافتراضية. |
| [SetColorMatrix](../../system.drawing.imaging/imageattributes/setcolormatrix#setcolormatrix_2)(ColorMatrix, ColorMatrixFlag, ColorAdjustType) | يضبط مصفوفة ضبط اللون لفئة محددة. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma)(float) | يضبط قيمة جاما للفئة الافتراضية. |
| [SetGamma](../../system.drawing.imaging/imageattributes/setgamma#setgamma_1)(float, ColorAdjustType) | يضبط قيمة جاما لفئة محددة . |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop)() | لإيقاف تشغيل ضبط اللون للفئة الافتراضية. يمكنك استدعاء[`ClearNoOp`](./clearnoop) طريقة لاستعادة إعدادات ضبط اللون التي كانت في مكانها قبل استدعاء call إلى[`SetNoOp`](./setnoop) طريقة . |
| [SetNoOp](../../system.drawing.imaging/imageattributes/setnoop#setnoop_1)(ColorAdjustType) | لإيقاف تشغيل ضبط اللون لفئة محددة. يمكنك استدعاء[`ClearNoOp`](./clearnoop) طريقة لإعادة إعدادات ضبط اللون التي كانت في مكانها قبل استدعاء call إلى[`SetNoOp`](./setnoop) طريقة . |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel)(ColorChannelFlag) | يضبط قناة الإخراج CMYK (سماوي-أرجواني-أصفر-أسود) للفئة الافتراضية. |
| [SetOutputChannel](../../system.drawing.imaging/imageattributes/setoutputchannel#setoutputchannel_1)(ColorChannelFlag, ColorAdjustType) | يضبط قناة الإخراج CMYK (سماوي-أرجواني-أصفر-أسود) لفئة محددة. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile)(string) | يضبط ملف ملف تعريف لون قناة الإخراج للفئة الافتراضية. |
| [SetOutputChannelColorProfile](../../system.drawing.imaging/imageattributes/setoutputchannelcolorprofile#setoutputchannelcolorprofile_1)(string, ColorAdjustType) | يضبط ملف ملف تعريف لون قناة الإخراج لفئة محددة. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable)(ColorMap[]) | يضبط جدول إعادة رسم خريطة الألوان للفئة الافتراضية. |
| [SetRemapTable](../../system.drawing.imaging/imageattributes/setremaptable#setremaptable_1)(ColorMap[], ColorAdjustType) | يضبط جدول إعادة رسم خريطة اللون لفئة محددة. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold)(float) | يضبط الحد الأدنى (نطاق الشفافية) للفئة الافتراضية. |
| [SetThreshold](../../system.drawing.imaging/imageattributes/setthreshold#setthreshold_1)(float, ColorAdjustType) | يضبط العتبة (نطاق الشفافية) لفئة محددة . |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode)(WrapMode) | يضبط وضع الالتفاف المستخدم لتحديد كيفية تجانب نسيج عبر شكل ما ، أو عند حدود الشكل . يتم تجانب النسيج عبر شكل لتعبئته عندما يكون النسيج أصغر من الشكل الذي يملأه . |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_1)(WrapMode, Color) | يضبط وضع الالتفاف واللون المستخدم لتحديد كيفية تجانب نسيج عبر شكل ما ، أو عند حدود الشكل . يتم تجانب النسيج عبر شكل لملئه عندما يكون النسيج أصغر من الشكل الذي يملأه. |
| [SetWrapMode](../../system.drawing.imaging/imageattributes/setwrapmode#setwrapmode_2)(WrapMode, Color, bool) | يضبط وضع الالتفاف واللون المستخدم لتحديد كيفية تجانب نسيج عبر شكل ما ، أو عند حدود الشكل . يتم تجانب النسيج عبر شكل لملئه عندما يكون النسيج أصغر من الشكل الذي يملأه. |

### أنظر أيضا

* مساحة الاسم [System.Drawing.Imaging](../../system.drawing.imaging)
* المجسم [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
