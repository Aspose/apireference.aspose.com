---
title: "System::BoxedEnum فئة"
linktitle: "BoxedEnum"
second_title: "Aspose.Page لـ C++"
description: "System::BoxedEnum فئة. تمثل قيمة تعداد مغلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system/boxedenum/
---
## BoxedEnum class


تمثل قيمة تعداد مغلفة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| Parameter | الوصف |
| --- | --- |
| E | نوع قيمة التعداد |
| UT | النوع الأساسي للتعداد **E** |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | ينشئ مثيلاً يمثل قيمة التعداد المحددة. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | يحوّل قيمة ثابت التعداد المعبأ إلى قيمة عدد صحيح 64‑بت. |
| [IsBoxedEnum](./isboxedenum/)() override | يحدد ما إذا كان الكائن الحالي يمثل قيمةً معبأةً من نوع تعداد. |
| [ToString](./tostring/)() const override | يحوّل القيمة المعبأة التي يمثلها الكائن الحالي إلى سلسلة. |

## انظر أيضًا

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
