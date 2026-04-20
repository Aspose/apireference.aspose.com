---
title: "System::Drawing::Imaging::ImageAttributes class"
linktitle: "ImageAttributes"
second_title: "Aspose.Font لـ C++"
description: "System::Drawing::Imaging::ImageAttributes class. يمثل معلومات حول كيفية تعديل ألوان الصورة أثناء العرض. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 900
url: /ar/cpp/system.drawing.imaging/imageattributes/
---
## ImageAttributes class


يمثل معلومات حول كيفية تعديل ألوان الصورة أثناء العرض. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ImageAttributes : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ClearBrushRemapTable](./clearbrushremaptable/)() | غير مُنفّذ. |
| [ClearColorKey](./clearcolorkey/)(ColorAdjustType) | غير مُنفّذ. |
| [ClearColorMatrix](./clearcolormatrix/)(ColorAdjustType) | غير مُنفّذ. |
| [ClearGamma](./cleargamma/)(ColorAdjustType) | غير مُنفّذ. |
| [ClearNoOp](./clearnoop/)(ColorAdjustType) | غير مُنفّذ. |
| [ClearOutputChannel](./clearoutputchannel/)(ColorAdjustType) | غير مُنفّذ. |
| [ClearOutputChannelColorProfile](./clearoutputchannelcolorprofile/)(ColorAdjustType) | غير مُنفّذ. |
| [ClearRemapTable](./clearremaptable/)(ColorAdjustType) | غير مُنفّذ. |
| [ClearThreshold](./clearthreshold/)(ColorAdjustType) | غير مُنفّذ. |
| [Clone](./clone/)() | ينشئ نسخة من الكائن الحالي. |
| [Dispose](./dispose/)() | يطلق جميع موارد نظام التشغيل التي حصل عليها الكائن الحالي. |
| [GetAdjustedPalette](./getadjustedpalette/)(const SharedPtr\<ColorPalette\>\&, ColorAdjustType) | غير مُنفّذ. |
| [ImageAttributes](./imageattributes/)() | منشئ افتراضي. |
| [SetBrushRemapTable](./setbrushremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&) | غير مُنفّذ. |
| [SetColorKey](./setcolorkey/)(Color, Color, ColorAdjustType) | غير مُنفّذ. |
| [SetColorMatrices](./setcolormatrices/)(const SharedPtr\<ColorMatrix\>\&, const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | غير مُنفّذ. |
| [SetColorMatrix](./setcolormatrix/)(const SharedPtr\<ColorMatrix\>\&, ColorMatrixFlag, ColorAdjustType) | يضبط مصفوفة تعديل اللون. |
| [SetGamma](./setgamma/)(float, ColorAdjustType) | غير مُنفّذ. |
| [SetNoOp](./setnoop/)(ColorAdjustType) | غير مُنفّذ. |
| [SetOutputChannel](./setoutputchannel/)(ColorChannelFlag, ColorAdjustType) | غير مُنفّذ. |
| [SetOutputChannelColorProfile](./setoutputchannelcolorprofile/)(const String\&, ColorAdjustType) | غير مُنفّذ. |
| [SetRemapTable](./setremaptable/)(const ArrayPtr\<SharedPtr\<ColorMap\>\>\&, ColorAdjustType) | غير مُنفّذ. |
| [SetThreshold](./setthreshold/)(float, ColorAdjustType) | غير مُنفّذ. |
| [SetWrapMode](./setwrapmode/)(Drawing2D::WrapMode, Color, bool) | يضبط وضع الالتفاف واللون المستخدم لتحديد كيفية تغطية نسيج عبر شكل، أو عند حدود الشكل. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
