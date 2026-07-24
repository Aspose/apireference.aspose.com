---
title: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter فئة"
linktitle: "RSAPKCS1SignatureDeformatter"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureDeformatter فئة. فئة للتحقق من توقيع RSA PKCS #1 v1.5. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبب أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3700
url: /ar/cpp/system.security.cryptography/rsapkcs1signaturedeformatter/
---
## RSAPKCS1SignatureDeformatter class


فئة للتحقق من توقيع [RSA](../rsa/) PKCS #1 v1.5. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبب أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RSAPKCS1SignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)() | معلومات RTTI. |
| [RSAPKCS1SignatureDeformatter](./rsapkcs1signaturedeformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | منشئ. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | يحدد خوارزمية التجزئة المستخدمة. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | يضبط قيمة المفتاح. غير مُنفّذ. |
| [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | يتحقق من توقيع تجزئة البيانات. |
## انظر أيضًا

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
