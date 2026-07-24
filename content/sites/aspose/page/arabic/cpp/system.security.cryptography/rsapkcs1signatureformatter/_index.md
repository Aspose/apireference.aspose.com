---
title: "فئة System::Security::Cryptography::RSAPKCS1SignatureFormatter"
linktitle: "RSAPKCS1SignatureFormatter"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::RSAPKCS1SignatureFormatter. يوقع البيانات باستخدام توقيع RSA PKCS # 1 v1.5. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. يجب دائماً تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3800
url: /ar/cpp/system.security.cryptography/rsapkcs1signatureformatter/
---
## RSAPKCS1SignatureFormatter class


يوقع البيانات باستخدام توقيع [RSA](../rsa/) PKCS # 1 v1.5. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. يجب دائماً تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RSAPKCS1SignatureFormatter : public System::Security::Cryptography::AsymmetricSignatureFormatter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateSignature](./createsignature/)(System::ArrayPtr\<uint8_t\>) override | يوقع البيانات. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)() | معلومات RTTI. |
| [RSAPKCS1SignatureFormatter](./rsapkcs1signatureformatter/)(const System::SharedPtr\<AsymmetricAlgorithm\>\&) | منشئ. |
| [SetHashAlgorithm](./sethashalgorithm/)(System::String) override | يحدد خوارزمية التجزئة المستخدمة. |
| [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) override | يضبط قيمة المفتاح. غير مُنفّذ. |
| [~RSAPKCS1SignatureFormatter](./~rsapkcs1signatureformatter/)() | المدمر. |
## انظر أيضًا

* Class [AsymmetricSignatureFormatter](../asymmetricsignatureformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
