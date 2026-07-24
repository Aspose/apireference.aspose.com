---
title: "فئة System::Security::Cryptography::X509Certificates::X509Extension"
linktitle: "X509Extension"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::X509Certificates::X509Extension. كائن امتداد للحفاظ على معلومات إضافية مرتبطة بشهادة X.509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1200
url: /ar/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


كائن امتداد للحفاظ على معلومات إضافية مرتبطة بشهادة X.509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

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
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | منشئ. |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | منشئ. |
## انظر أيضًا

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
