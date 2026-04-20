---
title: "فئة System::Security::Cryptography::RNGCryptoServiceProvider"
linktitle: "RNGCryptoServiceProvider"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Security::Cryptography::RNGCryptoServiceProvider. مولد أرقام عشوائية يتبع مفهوم CSP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3300
url: /ar/cpp/system.security.cryptography/rngcryptoserviceprovider/
---
## RNGCryptoServiceProvider class


مولد أرقام عشوائية يتبع مفهوم CSP. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RNGCryptoServiceProvider : public System::Security::Cryptography::RandomNumberGenerator
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) override | يملأ عناصر المصفوفة الحالية ببايتات عشوائية. |
| [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) override | يملأ عناصر عرض المصفوفة الحالية ببايتات عشوائية. |
| [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) override | يملأ عناصر المصفوفة الحالية ببايتات عشوائية غير صفرية. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) override | يملأ عناصر عرض المصفوفة الحالية ببايتات عشوائية غير صفرية. |
| [RNGCryptoServiceProvider](./rngcryptoserviceprovider/)() | المُنشئ. |
| virtual [~RNGCryptoServiceProvider](./~rngcryptoserviceprovider/)() | المدمر. |
## انظر أيضًا

* Class [RandomNumberGenerator](../randomnumbergenerator/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
