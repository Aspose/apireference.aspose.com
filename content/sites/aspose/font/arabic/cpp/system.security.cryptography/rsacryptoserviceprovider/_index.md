---
title: "فئة System::Security::Cryptography::RSACryptoServiceProvider"
linktitle: "RSACryptoServiceProvider"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Security::Cryptography::RSACryptoServiceProvider. خوارزمية RSA في شكل CSP. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
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
| [Decrypt](./decrypt/)(const ByteArrayPtr\&, bool) | يفك تشفير الرسالة. غير مُطبق. |
| [Decrypt](./decrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | يفك تشفير البيانات المدخلة باستخدام وضع الحشو المحدد. |
| [Dispose](./dispose/)() override | تحرير البيانات المرتبطة بالكائن. |
| [Encrypt](./encrypt/)(const ByteArrayPtr\&, bool) | يشفر الرسالة. غير مُطبق. |
| [Encrypt](./encrypt/)(ByteArrayPtr, SharedPtr\<RSAEncryptionPadding\>) override | يشفر البيانات المدخلة باستخدام وضع الحشو المحدد. |
| [ExportCspBlob](./exportcspblob/)(bool) override | يصدّر كتلة بيانات تحتوي على معلومات عن المفتاح. غير مُنفّذ. |
| [ExportParameters](./exportparameters/)(bool) override | يصدّر معلمات CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | يحصل على كائن [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | يفحص خوارزمية تبادل المفاتيح المرتبطة بالكائن. |
| [get_KeySize](./get_keysize/)() override | يحصل على حجم المفتاح المستخدم من قبل الخوارزمية. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | يفحص ما إذا كان المفتاح محفوظًا في كائن CSP. |
| [get_PublicOnly](./get_publiconly/)() const | يفحص ما إذا كان المفتاح العام فقط موجودًا في كائن CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | يحصل على خوارزمية التوقيع المرتبطة بكائن CSP. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | يفحص ما إذا كان المفتاح محفوظًا في مخزن الجهاز بدلاً من مخزن المستخدم. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | يستورد كتلة بيانات تحتوي على معلومات عن المفتاح. غير مُنفّذ. |
| [ImportParameters](./importparameters/)(RSAParameters) override | يستورد معلمات CSP. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)() | معلومات RTTI. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | منشئ. غير مُنفّذ. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(const RSAParameters\&) | المُنشئ. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t) | المُنشئ. |
| [RSACryptoServiceProvider](./rsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | منشئ. غير مُنفّذ. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | يحدد ما إذا كان المفتاح محفوظًا في كائن CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | يحدد ما إذا كان المفتاح محفوظًا في مخزن الجهاز بدلاً من مخزن المستخدم. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<Object\>\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const SharedPtr\<Object\>\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [SignHash](./signhash/)(ByteArrayPtr, HashAlgorithmName, SharedPtr\<RSASignaturePadding\>) override | يحسب التوقيع لقيمة التجزئة المحددة. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | يحسب التوقيع للقيمة المدخلة المحددة. غير مُنفّذ. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const SharedPtr\<Object\>\&, const ByteArrayPtr\&) | يفحص توقيع البيانات. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | يفحص توقيع البيانات. |
| [VerifyHash](./verifyhash/)(ByteArrayPtr, ByteArrayPtr, const HashAlgorithmName\&, SharedPtr\<RSASignaturePadding\>) override | يتحقق من صحة توقيع التجزئة المحددة. |
## انظر أيضًا

* Class [RSA](../rsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
