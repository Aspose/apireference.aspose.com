---
title: "System::Security::Cryptography::X509Certificates::X509CertificateCollection فئة"
linktitle: "X509CertificateCollection"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::X509Certificates::X509CertificateCollection class. مجموعة من كائنات شهادة X509. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيتسبب ذلك في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 700
url: /ar/cpp/system.security.cryptography.x509certificates/x509certificatecollection/
---
## X509CertificateCollection class


Collection of X509 certificate objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class X509CertificateCollection : public System::Collections::Generic::List<SharedPtr<X509Certificate>>
```

## انظر أيضًا

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
