---
title: "System::Security::Cryptography::Rfc2898DeriveBytes فئة"
linktitle: "Rfc2898DeriveBytes"
second_title: "Aspose.Page لـ C++"
description: "System::Security::Cryptography::Rfc2898DeriveBytes فئة. يُنفّذ اشتقاق المفتاح القائم على كلمة المرور، PBKDF2. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر System::SmartPtr واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2900
url: /ar/cpp/system.security.cryptography/rfc2898derivebytes/
---
## Rfc2898DeriveBytes class


يُنفّذ اشتقاق المفتاح القائم على كلمة المرور، PBKDF2. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Rfc2898DeriveBytes : public System::Security::Cryptography::DeriveBytes
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [GetBytes](./getbytes/)(int32_t) override | يملأ عناصر المصفوفة الموجودة ببايتات مفتاح عشوائية شبه. |
| [Reset](./reset/)() override |  |
| [Rfc2898DeriveBytes](./rfc2898derivebytes/)(ArrayPtr\<uint8_t\>, ArrayPtr\<uint8_t\>, int32_t) | معلومات RTTI. |
## انظر أيضًا

* Class [DeriveBytes](../derivebytes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
