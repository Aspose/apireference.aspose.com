---
title: "System::Security::Cryptography::X509Certificates::PublicKey class"
linktitle: "PublicKey"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::X509Certificates::PublicKey class. يمثل معلومات المفتاح العام لشهادة X509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


يمثل معلومات المفتاح العام لشهادة X509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class PublicKey : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | يحصل على قيمة المفتاح العام المشفر بـ ASN.1. |
| [get_EncodedParameters](./get_encodedparameters/)() const | يحصل على معلمات المفتاح العام المشفر بـ ASN.1. |
| [get_Key](./get_key/)() const | يحصل على [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) أو [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/). |
| [get_Oid](./get_oid/)() const | يحصل على معرف (OID) المفتاح العام. |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | المُنشئ. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
