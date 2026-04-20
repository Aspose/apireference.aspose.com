---
title: "System::Security::Cryptography::Rfc2898DeriveBytes class"
linktitle: "Rfc2898DeriveBytes"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Security::Cryptography::Rfc2898DeriveBytes. تنفّذ اشتقاق المفتاح القائم على كلمة المرور، PBKDF2. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2900
url: /ar/cpp/system.security.cryptography/rfc2898derivebytes/
---
## Rfc2898DeriveBytes class


تنفّذ اشتقاق المفتاح القائم على كلمة المرور، PBKDF2. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class Rfc2898DeriveBytes : public System::Security::Cryptography::DeriveBytes
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [GetBytes](./getbytes/)(int32_t) override | يملأ عناصر المصفوفة الموجودة ببايتات مفتاح عشوائية شبه عشوائية. |
| [Reset](./reset/)() override |  |
| [Rfc2898DeriveBytes](./rfc2898derivebytes/)(ArrayPtr\<uint8_t\>, ArrayPtr\<uint8_t\>, int32_t) | معلومات RTTI. |
## انظر أيضًا

* Class [DeriveBytes](../derivebytes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
