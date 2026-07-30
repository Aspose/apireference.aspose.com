---
title: "الفئة System::IFormatProvider"
linktitle: "IFormatProvider"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::IFormatProvider. تعرف طريقة توفر معلومات التنسيق. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3800
url: /ar/cpp/system/iformatprovider/
---
## IFormatProvider class


تعرف طريقة توفر معلومات التنسيق. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/) function. لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IFormatProvider : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | يرجع كائنًا يوفر خدمات التنسيق للنوع المحدد. |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
