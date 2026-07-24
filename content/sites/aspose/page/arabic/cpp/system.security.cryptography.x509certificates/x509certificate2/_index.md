---
title: "فئة System::Security::Cryptography::X509Certificates::X509Certificate2"
linktitle: "X509Certificate2"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::X509Certificates::X509Certificate2. تمثّل شهادة X509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 400
url: /ar/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


تمثّل شهادة X509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم أبدًا بإنشاء مثيل لهذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Archived](./get_archived/)() const | يحصل على قيمة تشير إلى أن الشهادة مؤرشفة. |
| [get_Extensions](./get_extensions/)() const | يحصل على مجموعة كائنات الامتداد المرتبطة بالشهادة. |
| [get_FriendlyName](./get_friendlyname/)() const | يحصل على الاسم الودي للشهادة. |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | يتحقق مما إذا كانت الشهادة تحتوي على مفتاح خاص. |
| [get_IssuerName](./get_issuername/)() const | يحصل على اسم الطرف الذي أصدر الشهادة. |
| [get_NotAfter](./get_notafter/)() const | يحصل على التاريخ والوقت المحلي بعدهما تصبح الشهادة غير صالحة. |
| [get_NotBefore](./get_notbefore/)() const | يحصل على التاريخ والوقت المحلي الذي تصبح فيه الشهادة صالحة. |
| [get_PrivateKey](./get_privatekey/)() const | يحصل على المفتاح الخاص المرتبط بالشهادة. |
| [get_PublicKey](./get_publickey/)() const | يحصل على كائن شهادة [PublicKey](../publickey/). |
| [get_RawData](./get_rawdata/)() const | يحصل على البيانات الخام للشهادة. |
| [get_SerialNumber](./get_serialnumber/)() const | يحصل على الرقم التسلسلي لشهادة. |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | يحصل على الخوارزمية المستخدمة لإنشاء توقيع شهادة. |
| [get_SubjectName](./get_subjectname/)() const | يحصل على اسم الموضوع من شهادة. |
| [get_Thumbprint](./get_thumbprint/)() const | يحصل على بصمة الشهادة. |
| [get_Version](./get_version/)() const | يحصل على نسخة تنسيق الشهادة. |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | يحصل على نوع الشهادة الموجودة في مصفوفة البايت المحددة. |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | يحصل على نوع الشهادة الموجودة في الملف المحدد. |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | يحصل على المفتاح الخاص لـ [RSA](../../system.security.cryptography/rsa/);. |
| [GetDSAPublicKey](./getdsapublickey/)() const | يحصل على المفتاح العام لـ [RSA](../../system.security.cryptography/rsa/). |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | يحصل على المفتاح الخاص لـ [RSA](../../system.security.cryptography/rsa/);. |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | يحصل على المفتاح العام لـ [RSA](../../system.security.cryptography/rsa/). |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | يحصل على اسم الموضوع أو اسم المصدر من الشهادة. |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | يحصل على المفتاح الخاص لـ [RSA](../../system.security.cryptography/rsa/);. |
| [GetRSAPublicKey](./getrsapublickey/)() const | يحصل على المفتاح العام لـ [RSA](../../system.security.cryptography/rsa/). |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | يستورد المعلومات من ملف الشهادة المحدد. |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | يستورد المعلومات من ملف الشهادة المحدد. |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | يستورد المعلومات من بيانات الشهادة المحددة. |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | يستورد المعلومات من بيانات الشهادة المحددة. |
| [Import](./import/)(const String\&) override | يستورد المعلومات من ملف الشهادة المحدد. |
| [Import](./import/)(const ByteArrayPtr\&) override | يستورد المعلومات من بيانات الشهادة المحددة. |
| [Reset](./reset/)() override | يعيد ضبط حالة الشهادة. |
| [set_Archived](./set_archived/)(bool) const | يضبط قيمة تشير إلى أن الشهادة مؤرشفة. |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | يضبط الاسم الودي للشهادة. |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | يضبط أو يمسح المفتاح الخاص المرتبط بالشهادة. |
| [ToString](./tostring/)(bool) const override | يرجع معلومات الشهادة بتنسيق نصي. |
| [ToString](./tostring/)() const override | يرجع معلومات الشهادة بتنسيق نصي. |
| [Verify](./verify/)() const | يتحقق من سلسلة الشهادة. |
| [X509Certificate2](./x509certificate2/)() | ينشئ [X509Certificate2](./) فارغًا. |
| [X509Certificate2](./x509certificate2/)(const String\&) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | منشئ. |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | منشئ. |
## انظر أيضًا

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
