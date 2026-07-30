---
title: "System::Security::Cryptography::Oid class"
linktitle: "Oid"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Security::Cryptography::Oid. معرف كائن تشفير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كوسيط في C++."
type: docs
weight: 2500
url: /ar/cpp/system.security.cryptography/oid/
---
## Oid class


معرف كائن تشفير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كوسيط.

```cpp
class Oid : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | إنشاء كائن OID من الاسم الودي المحدد للـ OID. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | إنشاء كائن OID من القيمة المحددة للـ OID. |
| [get_FriendlyName](./get_friendlyname/)() const | يحصل على الاسم الودي للكائن. |
| [get_Value](./get_value/)() const | يحصل على سلسلة معرف الكائن. |
| [Oid](./oid/)() | معلومات RTTI. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | منشئ النسخ. |
| [Oid](./oid/)(const String\&) | المُنشئ. |
| [Oid](./oid/)(const String\&, const String\&) | المُنشئ. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | يضبط الاسم الودي للكائن. |
| [set_Value](./set_value/)(const String\&) | يضبط سلسلة معرف الكائن. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
