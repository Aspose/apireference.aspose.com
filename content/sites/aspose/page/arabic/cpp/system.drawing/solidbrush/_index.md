---
title: "System::Drawing::SolidBrush class"
linktitle: "SolidBrush"
second_title: "Aspose.Page لـ C++"
description: "System::Drawing::SolidBrush class. تمثّل فرشاة ذات لون واحد. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2400
url: /ar/cpp/system.drawing/solidbrush/
---
## SolidBrush class


تمثّل فرشاة ذات لون واحد. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SolidBrush : public System::Drawing::Brush
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينشئ نسخة من الكائن الحالي. |
| [get_Color](./get_color/)() const | يعيد لون هذه الفرشاة. |
| [set_Color](./set_color/)(Color) | يضبط لون هذه الفرشاة. |
| [SolidBrush](./solidbrush/)(const Color\&) | ينشئ كائنًا جديدًا من [SolidBrush](./) ويُهيئه باللون المحدد. |
## انظر أيضًا

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
