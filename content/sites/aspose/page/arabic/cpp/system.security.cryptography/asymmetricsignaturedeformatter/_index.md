---
title: "System::Security::Cryptography::AsymmetricSignatureDeformatter فئة"
linktitle: "AsymmetricSignatureDeformatter"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::AsymmetricSignatureDeformatter فئة. الفئة الأساسية لمُعيدي تنسيق التوقيع غير المتماثل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.security.cryptography/asymmetricsignaturedeformatter/
---
## AsymmetricSignatureDeformatter class


الفئة الأساسية لمُعيدي تنسيق التوقيع غير المتماثل. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبّب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class AsymmetricSignatureDeformatter : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [SetHashAlgorithm](./sethashalgorithm/)(System::String) | معلومات RTTI. |
| virtual [SetKey](./setkey/)(System::SharedPtr\<AsymmetricAlgorithm\>) | يضبط المفتاح للاستخدام مع الخوارزمية. |
| virtual [VerifySignature](./verifysignature/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | يتحقق من التوقيع على البيانات. |
| virtual [VerifySignature](./verifysignature/)(System::SharedPtr\<HashAlgorithm\>, System::ArrayPtr\<uint8_t\>) | يتحقق من التوقيع على البيانات. غير مُنفّذ. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
