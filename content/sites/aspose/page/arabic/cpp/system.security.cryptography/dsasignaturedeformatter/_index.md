---
title: "الفئة System::Security::Cryptography::DSASignatureDeformatter"
linktitle: "DSASignatureDeformatter"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Security::Cryptography::DSASignatureDeformatter. تُستخدم للتحقق من توقيعات DSA. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.security.cryptography/dsasignaturedeformatter/
---
## DSASignatureDeformatter class


تُستخدم للتحقق من توقيعات [DSA](../dsa/). يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class DSASignatureDeformatter : public System::Security::Cryptography::AsymmetricSignatureDeformatter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [SetHashAlgorithm](./sethashalgorithm/)(String) override | غير مُنفَّذ. |
| [SetKey](./setkey/)(SharedPtr\<AsymmetricAlgorithm\>) override | غير مُنفَّذ. |
| [VerifySignature](./verifysignature/)(ArrayPtr\<uint8_t\>, ArrayPtr\<uint8_t\>) override | غير مُنفَّذ. |
## انظر أيضًا

* Class [AsymmetricSignatureDeformatter](../asymmetricsignaturedeformatter/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
