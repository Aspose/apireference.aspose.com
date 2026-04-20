---
title: "فئة System::Security::Cryptography::RijndaelManaged"
linktitle: "RijndaelManaged"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Security::Cryptography::RijndaelManaged. خوارزمية Rijndael المُدارة. تدعم فقط أوضاع ECB و CFB مع حشو None ووضع CBC مع حشو None و Zeros. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 3100
url: /ar/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


خوارزمية [Rijndael](../rijndael/) المُدارة. تدعم فقط أوضاع ECB و CFB مع حشو None ووضع CBC مع حشو None و Zeros. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء تأكيد. دائمًا قم بلف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

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
| [GenerateIV](./generateiv/)() override | ينشئ قيمة أولية عشوائية ويخزنها في داخل الخوارزمية. |
| [GenerateKey](./generatekey/)() override | ينشئ مفتاحًا عشوائيًا ويخزنها في داخل الخوارزمية. |
## انظر أيضًا

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
