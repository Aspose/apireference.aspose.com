---
title: "System::Security::Cryptography::Pkcs::SignedCms فئة"
linktitle: "SignedCms"
second_title: "Aspose.Font لـ C++"
description: "System::Security::Cryptography::Pkcs::SignedCms فئة. يوقع المحتوى وفقًا لمعيار CMS/PKCS #7. غير مُنفّذة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


يوقع المحتوى وفقًا لمعيار CMS/PKCS #7. غير مُنفّذة. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SignedCms : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | ينشئ توقيعًا. |
| [Encode](./encode/)() | يقوم بترميز رسالة CMS/PKCS #7. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | المُنشئ. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Font for C++](../../)
