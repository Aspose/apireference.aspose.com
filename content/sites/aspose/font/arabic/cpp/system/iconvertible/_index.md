---
title: "الفئة System::IConvertible"
linktitle: "IConvertible"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::IConvertible. تعرف طرقًا تحول قيمة النوع المرجعي أو القيمي الذي يتم تنفيذه إلى نوع وقت تشغيل لغة مشتركة له قيمة مكافئة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3400
url: /ar/cpp/system/iconvertible/
---
## IConvertible class


تعرف طرقًا تحول قيمة النوع المرجعي أو القيمي الذي يتم تنفيذه إلى نوع وقت تشغيل لغة مشتركة له قيمة مكافئة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../makeobject/) function. لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أعطال في التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class IConvertible : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() | يرجع رمز النوع لهذا الكائن. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى قيمة [Boolean](../boolean/) مكافئة باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى عدد صحيح 8‑bit من نوع uint32_teger مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى حرف Unicode مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى قيمة [System::DateTime](../datetime/) مكافئة باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى عدد [System::Decimal](../decimal/) مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى عدد عائم بدقة مزدوجة مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى عدد صحيح موقع 16‑bit مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى عدد صحيح موقع 32‑bit مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى عدد صحيح موقع 64‑bit مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى عدد صحيح موقع 8‑bit مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى عدد عائم بدقة أحادية مكافئ باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToString](./tostring/)(System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى قيمة [System::String](../string/) مكافئة باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToString](./tostring/)() const | نظير طريقة C# [Object.ToString()](../object/tostring/). يتيح تحويل الكائنات المخصصة إلى سلسلة نصية. |
| virtual [ToType](./totype/)(const TypeInfo\&, System::SharedPtr\<System::IFormatProvider\>) | يحول قيمة هذا الكائن إلى [System::Object](../object/) من النوع المحدد System::Type الذي له قيمة مكافئة، باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<System::IFormatProvider\>) | يقوم بتحويل قيمة هذا الكائن إلى عدد صحيح 16‑بت مكافئ من نوع uint32_teger باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<System::IFormatProvider\>) | يقوم بتحويل قيمة هذا الكائن إلى عدد صحيح 32‑بت مكافئ من نوع uint32_teger باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<System::IFormatProvider\>) | يقوم بتحويل قيمة هذا الكائن إلى عدد صحيح 64‑بت مكافئ من نوع uint32_teger باستخدام معلومات التنسيق الخاصة بالثقافة المحددة. |
## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
