---
title: "فئة System::IFormatProvider"
linktitle: "IFormatProvider"
second_title: "Aspose.Page لـ C++"
description: "فئة System::IFormatProvider. تُعرّف طريقة توفر معلومات التنسيق. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3800
url: /ar/cpp/system/iformatprovider/
---
## IFormatProvider class


تُعرّف طريقة توفر معلومات التنسيق. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/) . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

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
* Library [Aspose.Page for C++](../../)
