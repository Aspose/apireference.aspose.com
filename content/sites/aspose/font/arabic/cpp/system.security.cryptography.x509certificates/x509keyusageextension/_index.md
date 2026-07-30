---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension class"
linktitle: "X509KeyUsageExtension"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension class. كائن امتداد للاحتفاظ بمعلومات إضافية حول استخدام المفتاح. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1600
url: /ar/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


كائن امتداد للاحتفاظ بمعلومات إضافية حول استخدام المفتاح. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | ينسخ بيانات الامتداد من كائن آخر. |
| [get_KeyUsages](./get_keyusages/)() | يحصل على استخدامات المفتاح. |
| [X509KeyUsageExtension](./x509keyusageextension/)() | معلومات RTTI. |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | المُنشئ. |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | المُنشئ. |
## انظر أيضًا

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Font for C++](../../)
