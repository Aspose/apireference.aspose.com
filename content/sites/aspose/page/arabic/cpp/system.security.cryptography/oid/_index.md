---
title: "System::Security::Cryptography::Oid فئة"
linktitle: "Oid"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::Oid فئة. معرف كائن تشفير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2500
url: /ar/cpp/system.security.cryptography/oid/
---
## Oid class


معرف كائن تشفير. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Oid : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | إنشاء كائن OID من الاسم الودي المحدد لـ OID. |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | إنشاء كائن OID من القيمة المحددة لـ OID. |
| [get_FriendlyName](./get_friendlyname/)() const | يحصل على الاسم الودي للكائن. |
| [get_Value](./get_value/)() const | يحصل على سلسلة معرف الكائن. |
| [Oid](./oid/)() | معلومات RTTI. |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | منشئ النسخ. |
| [Oid](./oid/)(const String\&) | منشئ. |
| [Oid](./oid/)(const String\&, const String\&) | منشئ. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | يضبط الاسم الودي للكائن. |
| [set_Value](./set_value/)(const String\&) | يضبط سلسلة معرف الكائن. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
