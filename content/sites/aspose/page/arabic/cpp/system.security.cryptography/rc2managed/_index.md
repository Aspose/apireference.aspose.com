---
title: "System::Security::Cryptography::RC2Managed فئة"
linktitle: "RC2Managed"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::RC2Managed فئة. خوارزمية RC2 المُدارة. يتم دعم أوضاع التشفير ECB و CFB و CBC فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبب أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2800
url: /ar/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


خوارزمية [RC2](../rc2/) المُدارة. يتم دعم أوضاع التشفير ECB و CFB و CBC فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء مثيل من هذا النوع على المكدس أو باستخدام العامل new، لأن ذلك سيسبب أخطاء وقت التشغيل و/أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
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

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
