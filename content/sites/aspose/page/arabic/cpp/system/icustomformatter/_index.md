---
title: "فئة System::ICustomFormatter"
linktitle: "ICustomFormatter"
second_title: "Aspose.Page لـ C++"
description: "فئة System::ICustomFormatter. تعرف طريقة تقوم بتنسيق مخصص لتمثيل سلسلة لقيمة ممثلة بواسطة الكائن المحدد. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3500
url: /ar/cpp/system/icustomformatter/
---
## ICustomFormatter class


تعرف طريقة تقوم بتنسيق مخصص لتمثيل سلسلة لقيمة ممثلة بواسطة الكائن المحدد. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ICustomFormatter : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | يرجع تمثيلًا نصيًا لقيمة ممثلة بواسطة الكائن الحالي باستخدام التنسيق المحدد. |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
