---
title: "فئة System::Security::Cryptography::TripleDESManaged"
linktitle: "TripleDESManaged"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Security::Cryptography::TripleDESManaged. تنفيذ TripleDES مُدار. يدعم فقط أوضاع ECB و CFB مع حشو None ووضع CBC مع حشو None و Zeros و PKCS7. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 5200
url: /ar/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


تنفيذ [TripleDES](../tripledes/) مُدار. يدعم فقط أوضاع ECB و CFB مع حشو None ووضع CBC مع حشو None و Zeros و PKCS7. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثال من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء تشغيلية و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
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

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
