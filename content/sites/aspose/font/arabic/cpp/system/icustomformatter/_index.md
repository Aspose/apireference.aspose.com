---
title: "الفئة System::ICustomFormatter"
linktitle: "ICustomFormatter"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::ICustomFormatter. تُعرّف طريقة تقوم بتنسيق مخصص لتمثيل سلسلة لقيمة ممثلة بواسطة الكائن المحدد. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3500
url: /ar/cpp/system/icustomformatter/
---
## ICustomFormatter class


تُعرّف طريقة تقوم بتنسيق مخصص لتمثيل سلسلة لقيمة ممثلة بواسطة الكائن المحدد. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ICustomFormatter : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | يعيد تمثيلًا نصيًا لقيمة ممثلة بواسطة الكائن الحالي باستخدام التنسيق المحدد. |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
