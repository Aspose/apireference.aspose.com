---
title: "System::Security::Cryptography::RSA فئة"
linktitle: "RSA"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::RSA فئة. الفئة الأساسية لتطبيقات خوارزمية RSA. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3400
url: /ar/cpp/system.security.cryptography/rsa/
---
## RSA class


الفئة الأساسية لتطبيقات خوارزمية [RSA](./). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RSA : public System::Security::Cryptography::AsymmetricAlgorithm
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Create](./create/)() | ينشئ تنفيذًا افتراضيًا لخوارزمية [RSA](./). |
| static [Create](./create/)(const String\&) | ينشئ تنفيذًا افتراضيًا لخوارزمية [RSA](./). |
| static [Create](./create/)(int32_t) | ينشئ تنفيذًا افتراضيًا لخوارزمية [RSA](./) مع حجم مفتاح محدد. |
| static [Create](./create/)(const RSAParameters\&) | ينشئ تنفيذًا افتراضيًا لخوارزمية [RSA](./) مع معلمات محددة. |
| static [CreateFromXmlString](./createfromxmlstring/)(const String\&) | ينشئ تنفيذًا افتراضيًا لخوارزمية [RSA](./) مع معلمات مشفرة بصيغة XML محددة. |
| virtual [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | يفك تشفير البيانات المدخلة باستخدام وضع الحشو المحدد. |
| virtual [DecryptValue](./decryptvalue/)(ByteArrayPtr) | يفك تشفير القيمة باستخدام المفتاح الخاص. |
| virtual [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) | يشفر البيانات المدخلة باستخدام وضع الحشو المحدد. |
| virtual [EncryptValue](./encryptvalue/)(ByteArrayPtr) | يشفر القيمة باستخدام المفتاح الخاص. |
| virtual [ExportParameters](./exportparameters/)(bool) | يصدّر جميع المعلمات. |
| [FromXmlString](./fromxmlstring/)(String) override | يُهيئ الكائن باستخدام معلمات مشفرة بصيغة XML. |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | معلومات RTTI. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | يحصل على خوارزمية التوقيع المرتبطة بكائن CSP. |
| virtual [ImportParameters](./importparameters/)(RSAParameters) | يستورد جميع المعلمات من بنية البيانات. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | يحسب قيمة التجزئة لمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة والحشو، ويوقع النتيجة. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | يحسب قيمة التجزئة لمصفوفة البيانات المحددة باستخدام خوارزمية التجزئة المحددة والحشو، ويوقع النتيجة. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | يحسب قيمة التجزئة لتدفق البيانات الثنائي المحدد باستخدام خوارزمية التجزئة المحددة والحشو، ويوقع النتيجة. |
| virtual [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) | يحسب التوقيع لقيمة التجزئة المحددة. |
| [ToXmlString](./toxmlstring/)(bool) override | يصدّر جميع المعلمات بتنسيق XML. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | يتحقق من صحة توقيع البيانات المحددة. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | يتحقق من صحة توقيع البيانات المحددة. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&, const SharedPtr\<RSASignaturePadding\>\&) | يتحقق من صحة توقيع تدفق البيانات الثنائي المحدد. |
| virtual [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) | يتحقق من أن توقيع التجزئة المحددة صالح. |
## انظر أيضًا

* Class [AsymmetricAlgorithm](../asymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
