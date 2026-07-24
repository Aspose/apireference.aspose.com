---
title: "فئة System::Security::Cryptography::X509Certificates::X500DistinguishedName"
linktitle: "X500DistinguishedName"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::X509Certificates::X500DistinguishedName. تمثل الاسم المميز لشهادة X509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 200
url: /ar/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


تمثل الاسم المميز لشهادة X509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | يفك تشفير الاسم باستخدام المعلمات المحددة بواسطة العلامات. |
| [Format](./format/)(bool) const override | يقوم بتنسيق الاسم للطباعة. |
| [get_Name](./get_name/)() const | يحصل على الاسم المميز للشهادة. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | معلومات RTTI. |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | منشئ. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | منشئ. |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | منشئ النسخ. |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | منشئ. |
## انظر أيضًا

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
