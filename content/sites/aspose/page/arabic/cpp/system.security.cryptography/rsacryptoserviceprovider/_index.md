---
title: "System::Security::Cryptography::RSACryptoServiceProvider فئة"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::RSACryptoServiceProvider فئة. خوارزمية RSA في شكل CSP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبب أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3500
url: /ar/cpp/system.security.cryptography/rsacryptoserviceprovider/
---
## RSACryptoServiceProvider class


[RSA](../rsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class RSACryptoServiceProvider : public System::Security::Cryptography::RSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | يفك تشفير الرسالة. غير مُنفّذ. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | يفك تشفير البيانات المدخلة باستخدام وضع الحشو المحدد. |
| [Dispose](./dispose/)() override | يفرغ البيانات المرتبطة بالكائن. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | يشفر الرسالة. غير مُنفّذ. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | يشفر البيانات المدخلة باستخدام وضع الحشو المحدد. |
| [ExportCspBlob](./exportcspblob/)(bool) override | يصدّر كتلة بيانات تحتوي على معلومات المفتاح. غير مُنفّذ. |
| [ExportParameters](./exportparameters/)(bool) override | يصدّر معلمات CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | يحصل على كائن [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | يتحقق من خوارزمية تبادل المفتاح المرتبطة بالكائن. |
| [get_KeySize](./get_keysize/)() override | يحصل على حجم المفتاح المستخدم من قبل الخوارزمية. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | يتحقق مما إذا كان المفتاح محفوظاً في كائن CSP. |
| [get_PublicOnly](./get_publiconly/)() const | يتحقق مما إذا كان المفتاح العام فقط موجوداً في كائن CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | يحصل على خوارزمية التوقيع المرتبطة بكائن CSP. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | يتحقق مما إذا كان المفتاح محفوظاً في مخزن الجهاز بدلاً من مخزن المستخدم. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | يستورد كتلة بيانات تحتوي على معلومات المفتاح. غير مُنفّذ. |
| [ImportParameters](./importparameters/)(RSAParameters) override | يستورد معلمات CSP. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | معلومات RTTI. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | منشئ. غير مُنفّذ. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | منشئ. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | منشئ. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | منشئ. غير مُنفّذ. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | يحدد ما إذا كان المفتاح محفوظاً في كائن CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | يحدد ما إذا كان المفتاح محفوظاً في مخزن الجهاز بدلاً من مخزن المستخدم. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | يحسب التوقيع لقيمة التجزئة المحددة. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | يحسب التوقيع للقيمة المدخلة المحددة. غير مُنفّذ. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | يفحص توقيع البيانات. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | يفحص توقيع البيانات. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | يتحقق من أن توقيع التجزئة المحددة صالح. |
## انظر أيضًا

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
