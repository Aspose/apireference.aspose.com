---
title: "System::Drawing::Drawing2D::HatchBrush فئة"
linktitle: "HatchBrush"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::Drawing2D::HatchBrush فئة. تمثّل فرشاة مستطيلة الشكل بنمط تظليل، ولون أمامي، ولون خلفي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 800
url: /ar/cpp/system.drawing.drawing2d/hatchbrush/
---
## HatchBrush class


تمثّل فرشاة مستطيلة الشكل بنمط تظليل، ولون أمامي، ولون خلفي. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class HatchBrush : public System::Drawing::Brush
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينشئ نسخة مطابقة من الكائن الحالي. |
| [get_BackgroundColor](./get_backgroundcolor/)() const | يعيد قيمة تشير إلى لون الخلفية لهذه الفرشاة. |
| [get_ForegroundColor](./get_foregroundcolor/)() const | يعيد قيمة تشير إلى لون المقدمة لهذه الفرشاة. |
| [get_HatchStyle](./get_hatchstyle/)() const | يعيد قيمة تشير إلى نمط التظليل لهذه الفرشاة. |
| [HatchBrush](./hatchbrush/)(HatchStyle, Color, Color) | معلومات RTTI. |
## انظر أيضًا

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
