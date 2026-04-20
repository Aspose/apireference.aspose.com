---
title: "System::BoxedEnum class"
linktitle: "BoxedEnum"
second_title: "Aspose.Font لـ C++"
description: "System::BoxedEnum class. تمثّل قيمة تعداد مغلفة. يجب إنشاء كائنات من هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system/boxedenum/
---
## BoxedEnum class


تمثّل قيمة تعداد مغلفة. يجب إنشاء كائنات من هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
template<typename E,typename UT>class BoxedEnum : public System::BoxedValue<typename std::underlying_type<E>::type>
```


| معامل | الوصف |
| --- | --- |
| E | نوع قيمة التعداد |
| UT | النوع الأساسي للتعداد **E** |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [BoxedEnum](./boxedenum/)(E) | ينشئ كائنًا يمثل قيمة التعداد المحددة. |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | يحوّل قيمة ثابت التعداد المعبأ إلى قيمة عدد صحيح 64‑بت. |
| [IsBoxedEnum](./isboxedenum/)() override | يحدد ما إذا كان الكائن الحالي يمثل قيمةً معبأةً من نوع التعداد. |
| [ToString](./tostring/)() const override | يحوّل القيمة المعبأة التي يمثلها الكائن الحالي إلى سلسلة نصية. |

## انظر أيضًا

* Class [BoxedValue](../boxedvalue/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
