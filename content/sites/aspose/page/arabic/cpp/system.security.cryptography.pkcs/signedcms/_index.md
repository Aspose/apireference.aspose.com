---
title: "فئة System::Security::Cryptography::Pkcs::SignedCms"
linktitle: "SignedCms"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::Pkcs::SignedCms. تقوم بتوقيع المحتوى وفقاً لمعيار CMS/PKCS #7. غير مُنفّذة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 300
url: /ar/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


يوقّع المحتوى وفقاً لمعيار CMS/PKCS #7. غير مُنفّذة. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class SignedCms : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | ينشئ توقيعاً. |
| [Encode](./encode/)() | يقوم بترميز رسالة CMS/PKCS #7. |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | منشئ. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
