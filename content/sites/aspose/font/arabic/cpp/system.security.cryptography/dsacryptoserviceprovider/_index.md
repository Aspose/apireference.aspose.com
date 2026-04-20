---
title: "فئة System::Security::Cryptography::DSACryptoServiceProvider"
linktitle: "DSACryptoServiceProvider"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Security::Cryptography::DSACryptoServiceProvider. خوارزمية DSA في شكل CSP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1000
url: /ar/cpp/system.security.cryptography/dsacryptoserviceprovider/
---
## DSACryptoServiceProvider class


[DSA](../dsa/) algorithm in CSP form. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DSACryptoServiceProvider : public System::Security::Cryptography::DSA,
                                 public System::Security::Cryptography::ICspAsymmetricAlgorithm
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateSignature](./createsignature/)(ByteArrayPtr) override | إنشاء توقيع [DSA](../dsa/) للبيانات المحددة. |
| [Dispose](./dispose/)() override | تحرير البيانات المرتبطة بالكائن. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)() | منشئ. يستخدم المعلمات الافتراضية. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const DSAParameters\&) | المُنشئ. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(const SharedPtr\<CspParameters\>\&) | منشئ. غير مُنفّذ. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t) | المُنشئ. |
| [DSACryptoServiceProvider](./dsacryptoserviceprovider/)(int32_t, const SharedPtr\<CspParameters\>\&) | منشئ. غير مُنفّذ. |
| [ExportCspBlob](./exportcspblob/)(bool) override | يصدّر كتلة بيانات تحتوي على معلومات عن المفتاح. غير مُنفّذ. |
| [ExportParameters](./exportparameters/)(bool) override | يصدّر معلمات CSP. |
| [get_CspKeyContainerInfo](./get_cspkeycontainerinfo/)() override | يحصل على كائن [CspKeyContainerInfo](../cspkeycontainerinfo/). |
| [get_KeyExchangeAlgorithm](./get_keyexchangealgorithm/)() override | يفحص خوارزمية تبادل المفاتيح المرتبطة بالكائن. |
| [get_KeySize](./get_keysize/)() override | يحصل على حجم المفتاح. |
| [get_PersistKeyInCsp](./get_persistkeyincsp/)() const | يفحص ما إذا كان المفتاح محفوظًا في كائن CSP. |
| [get_PublicOnly](./get_publiconly/)() const | يفحص ما إذا كان المفتاح العام فقط موجودًا في كائن CSP. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() override | يحصل على خوارزمية التوقيع للاستخدام. |
| static [get_UseMachineKeyStore](./get_usemachinekeystore/)() | يفحص ما إذا كان المفتاح محفوظًا في مخزن الجهاز بدلاً من مخزن المستخدم. |
| [ImportCspBlob](./importcspblob/)(ByteArrayPtr) override | يستورد كتلة بيانات تحتوي على معلومات عن المفتاح. غير مُنفّذ. |
| [ImportParameters](./importparameters/)(DSAParameters) override | يستورد جميع المعلمات من بنية البيانات. |
| [set_PersistKeyInCsp](./set_persistkeyincsp/)(bool) | يحدد ما إذا كان المفتاح محفوظًا في كائن CSP. |
| static [set_UseMachineKeyStore](./set_usemachinekeystore/)(bool) | يحدد ما إذا كان المفتاح محفوظًا في مخزن الجهاز بدلاً من مخزن المستخدم. |
| [SignData](./signdata/)(const ByteArrayPtr\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [SignData](./signdata/)(const SharedPtr\<IO::Stream\>\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [SignData](./signdata/)(const ByteArrayPtr\&, const HashAlgorithmName\&) | معلومات RTTI. |
| [SignData](./signdata/)(const ByteArrayPtr\&, int32_t, int32_t, const HashAlgorithmName\&) | معلومات RTTI. |
| [SignData](./signdata/)(const StreamPtr\&, const HashAlgorithmName\&) | معلومات RTTI. |
| [SignHash](./signhash/)(const ByteArrayPtr\&, const String\&) | يحسب التوقيع للقيمة المدخلة المحددة. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&) | يفحص توقيع البيانات. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من أن توقيع البيانات المحددة صالح. |
| [VerifyData](./verifydata/)(const ByteArrayPtr\&, int32_t, int32_t, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من أن توقيع البيانات المحددة صالح. |
| [VerifyData](./verifydata/)(const StreamPtr\&, const ByteArrayPtr\&, const HashAlgorithmName\&) | يتحقق من أن توقيع تدفق البيانات الثنائية المحدد صالح. |
| [VerifyHash](./verifyhash/)(const ByteArrayPtr\&, const String\&, const ByteArrayPtr\&) | يفحص توقيع البيانات. |
| [VerifySignature](./verifysignature/)(ByteArrayPtr, ByteArrayPtr) override | تحقق من توقيع [DSA](../dsa/) للبيانات المحددة. |
## انظر أيضًا

* Class [DSA](../dsa/)
* Class [ICspAsymmetricAlgorithm](../icspasymmetricalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
