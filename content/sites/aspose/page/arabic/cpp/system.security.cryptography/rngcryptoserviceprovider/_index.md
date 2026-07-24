---
title: "فئة System::Security::Cryptography::RNGCryptoServiceProvider"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::RNGCryptoServiceProvider. مولد أرقام عشوائية يتبع مفهوم CSP. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. يجب دائماً تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3300
url: /ar/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


مولد أرقام عشوائية يتبع مفهوم CSP. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أعطال تأكيد. يجب دائماً تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | يملأ عناصر المصفوفة الحالية بالبايتات العشوائية. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | يملأ عناصر عرض المصفوفة الحالية بالبايتات العشوائية. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | يملأ عناصر المصفوفة الحالية بالبايتات العشوائية غير الصفرية. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | يملأ عناصر عرض المصفوفة الحالية بالبايتات العشوائية غير الصفرية. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | منشئ. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | المدمر. |
## انظر أيضًا

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
