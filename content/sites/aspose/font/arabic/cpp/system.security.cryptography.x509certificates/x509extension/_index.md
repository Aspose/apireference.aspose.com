---
title: "System::Security::Cryptography::X509Certificates::X509Extension class"
linktitle: "X509Extension"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::X509Certificates::X509Extension class. كائن امتداد للاحتفاظ بمعلومات إضافية مرتبطة بشهادة X.509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


كائن امتداد للاحتفاظ بمعلومات إضافية مرتبطة بشهادة X.509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | ينسخ بيانات الامتداد من كائن آخر. |
| [get_Critical](./get_critical/)() const | يتحقق مما إذا كان الامتداد حرجًا. |
| [set_Critical](./set_critical/)(bool) | يحدد ما إذا كان الامتداد حرجًا. |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | معلومات RTTI. |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | المُنشئ. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | المُنشئ. |
## انظر أيضًا

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
