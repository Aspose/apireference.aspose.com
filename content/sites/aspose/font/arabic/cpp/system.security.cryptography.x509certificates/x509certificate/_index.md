---
title: "الفئة System::Security::Cryptography::X509Certificates::X509Certificate"
linktitle: "X509Certificate"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Security::Cryptography::X509Certificates::X509Certificate. شهادة X.509 الإصدار 3. لا يتم دعم الشهادات المشفرة. يتم دعم علم X509KeyStorageFlags::DefaultKeySet فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


شهادة X.509 الإصدار 3. لا يتم دعم الشهادات المشفرة. يتم دعم علم [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيدية. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | ينشئ شهادة من ملف PKCS7 المحدد. |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | ينشئ شهادة من الملف الموقع المحدد. |
| [Dispose](./dispose/)() override | لا يفعل شيئًا. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن شهادتين. |
| virtual [Export](./export/)(X509ContentType) const | يصدّر الكائن الحالي إلى مصفوفة بايت باستخدام التنسيق المحدد. غير مُنفّذ. |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | يصدّر الكائن الحالي إلى مصفوفة بايت باستخدام التنسيق المحدد. غير مُنفّذ. |
| virtual [Export](./export/)(X509ContentType, const String\&) const | يصدّر الكائن الحالي إلى مصفوفة بايت باستخدام التنسيق المحدد. غير مُنفّذ. |
| [get_Handle](./get_handle/)() const | يحصل على مقبض لسياق شهادة Microsoft Cryptographic API. |
| [get_Issuer](./get_issuer/)() const | يحصل على اسم سلطة الشهادة التي أصدرت شهادة X-509v3. |
| [get_Subject](./get_subject/)() const | يحصل على الاسم المميز للموضوع من الشهادة. |
| virtual [GetCertHash](./getcerthash/)() const | يحصل على التجزئة للكائن الحالي كمصفوفة بايت. |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | يحصل على التجزئة للكائن الحالي كمصفوفة بايت. |
| virtual [GetCertHashString](./getcerthashstring/)() const | يحصل على تجزئة [SHA1](../../system.security.cryptography/sha1/) للكائن الحالي كسلسلة سداسية عشرية. |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | يحصل على تجزئة [SHA1](../../system.security.cryptography/sha1/) للكائن الحالي كسلسلة سداسية عشرية. |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | يحصل على تاريخ السريان للشهادة الحالية. |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | يحصل على تاريخ انتهاء الصلاحية للشهادة الحالية. |
| virtual [GetFormat](./getformat/)() const | يحصل على اسم تنسيق الشهادة. |
| [GetHashCode](./gethashcode/)() const override | يحصل على رمز تجزئة الشهادة. |
| virtual [GetIssuerName](./getissuername/)() const | يحصل على اسم سلطة التصديق التي أصدرت الشهادة الحالية. |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | يحصل على معلومات المفتاح للشهادة الحالية كسلسلة نصية. |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | يحصل على معلومات المفتاح للشهادة الحالية كمصفوفة من البايتات. |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | يحصل على معلومات المفتاح للشهادة الحالية كسلسلة سداسية عشرية. |
| virtual [GetName](./getname/)() const | يحصل على اسم الكيان الذي أُصدرت له الشهادة الحالية. |
| virtual [GetPublicKey](./getpublickey/)() const | يحصل على المفتاح العام من الشهادة كمصفوفة من البايتات. |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | يحصل على المفتاح العام من الشهادة كسلسلة سداسية عشرية. |
| virtual [GetRawCertData](./getrawcertdata/)() const | يحصل على البيانات الخام من الشهادة كمصفوفة من البايتات. |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | يحصل على البيانات الخام من الشهادة كسلسلة سداسية عشرية. |
| virtual [GetSerialNumber](./getserialnumber/)() const | يحصل على الرقم التسلسلي من الشهادة كمصفوفة من البايتات. |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | يحصل على الرقم التسلسلي من الشهادة كسلسلة سداسية عشرية. |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | يستورد المعلومات من ملف الشهادة المحدد. غير مُنفذ. |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | يستورد المعلومات من ملف الشهادة المحدد. غير مُنفذ. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | يستورد المعلومات من بيانات الشهادة المحددة. غير مُنفذ. |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | يستورد المعلومات من بيانات الشهادة المحددة. غير مُنفذ. |
| virtual [Import](./import/)(const String\&) | يستورد المعلومات من ملف الشهادة المحدد. غير مُنفذ. |
| virtual [Import](./import/)(const ByteArrayPtr\&) | يستورد المعلومات من بيانات الشهادة المحددة. غير مُنفذ. |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | يعيد تعيين حالة الشهادة. |
| virtual [ToString](./tostring/)(bool) const | يرجع معلومات الشهادة بتنسيق نصي. |
| [ToString](./tostring/)() const override | يرجع معلومات الشهادة بتنسيق نصي. |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | المُنشئ. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const String\&) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | المُنشئ. |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | المُنشئ. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | نوع المؤشر. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
