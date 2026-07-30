---
title: "System::Security::Cryptography::RSAPKCS1SignatureFormatter class"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::RSAPKCS1SignatureFormatter class. يوقع البيانات باستخدام توقيع RSA PKCS # 1 v1.5. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3800
url: /ar/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


يوقع البيانات باستخدام توقيع [RSA](../rsa/) PKCS # 1 v1.5. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | يوقع البيانات. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | معلومات RTTI. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | المُنشئ. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | يضبط خوارزمية التجزئة للاستخدام. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | يضبط قيمة المفتاح. غير مُنفّذ. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | المدمر. |
## انظر أيضًا

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
