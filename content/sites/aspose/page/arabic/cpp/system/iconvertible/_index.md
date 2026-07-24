---
title: "فئة System::IConvertible"
linktitle: "IConvertible"
second_title: "Aspose.Page لـ C++"
description: "فئة System::IConvertible. تُعرّف طرقًا تحول قيمة النوع المرجعي أو القيمي المنفّذ إلى نوع تشغيل لغة مشتركة له قيمة مكافئة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3400
url: /ar/cpp/system/iconvertible/
---
## IConvertible class


تُعرّف طرقًا تحول قيمة النوع المرجعي أو القيمي المنفّذ إلى نوع تشغيل لغة مشتركة له قيمة مكافئة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/) . لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IConvertible : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | يرجع رمز النوع لهذه الحالة. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى قيمة [Boolean](../boolean/) مكافئة باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى عدد صحيح 8‑bit uint32_teger مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى حرف Unicode مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى [System::DateTime](../datetime/) مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى عدد [System::Decimal](../decimal/) مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى عدد عائم ذو دقة مزدوجة مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة.. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى عدد صحيح موقع 16‑bit مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى عدد صحيح موقع 32‑bit مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى عدد صحيح موقع 64‑bit مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى عدد صحيح موقع 8‑bit مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى عدد عائم ذو دقة أحادية مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى [System::String](../string/) مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToString](./tostring/)() const | تمثيل مشابه لطريقة C# [Object.ToString()](../object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى [System::Object](../object/) من النوع System::Type المحدد الذي له قيمة مكافئة، باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | يحوّل قيمة هذه الحالة إلى عدد صحيح 16‑bit uint32_teger مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | يقوم بتحويل قيمة هذا الكائن إلى عدد صحيح 32‑بت uint32_teger مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | يقوم بتحويل قيمة هذا الكائن إلى عدد صحيح 64‑بت uint32_teger مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
