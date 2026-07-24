---
title: "الفئة System::Security::Cryptography::RijndaelManaged"
linktitle: "RijndaelManaged"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Security::Cryptography::RijndaelManaged. خوارزمية Rijndael مُدارة. تدعم فقط أوضاع ECB و CFB مع حشو None ووضع CBC مع حشو None و Zeros. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3100
url: /ar/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


خوارزمية Rijndael مُدارة [Rijndael](../rijndael/). تدعم فقط أوضاع ECB و CFB مع حشو None ووضع CBC مع حشو None و Zeros. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | ينشئ كائن فك التشفير مع معلمات صريحة. |
| virtual [CreateDecryptor](./createdecryptor/)() | ينشئ كائن فك التشفير مع معلمات محددة بواسطة كائن الخوارزمية. |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | ينشئ كائن التشفير مع معلمات صريحة. |
| virtual [CreateEncryptor](./createencryptor/)() | ينشئ كائن التشفير مع معلمات محددة بواسطة كائن الخوارزمية. |
| [GenerateIV](./generateiv/)() override | ينشئ قيمة أولية عشوائية ويخزنها داخل بنية الخوارزمية. |
| [GenerateKey](./generatekey/)() override | ينشئ مفتاحًا عشوائيًا ويخزنها داخل بنية الخوارزمية. |
## انظر أيضًا

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
