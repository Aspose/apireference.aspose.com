---
title: "فئة System::Security::Cryptography::RandomNumberGenerator"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Security::Cryptography::RandomNumberGenerator. فئة مجردة لتوريث مولدات الأرقام العشوائية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


فئة مجردة لتوريث مولدات الأرقام العشوائية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Create](./create/)() | ينشئ نسخة من التنفيذ الافتراضي لمولد أرقام عشوائية تشفيرية يمكن استخدامها لتوليد بيانات عشوائية. غير مُنفّذ. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | يملأ عناصر المصفوفة الحالية ببايتات عشوائية. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | يملأ شريحة المصفوفة الحالية ببايتات عشوائية. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | يملأ عناصر عرض المصفوفة الحالية ببايتات عشوائية. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | يملأ شريحة عرض المصفوفة الحالية ببايتات عشوائية. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | يملأ عناصر مصفوفة المكدس الحالية ببايتات عشوائية. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | يملأ شريحة مصفوفة المكدس الحالية ببايتات عشوائية. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | يملأ عناصر المصفوفة الحالية ببايتات عشوائية غير صفرية. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | يملأ عناصر عرض المصفوفة الحالية ببايتات عشوائية غير صفرية. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | يملأ عناصر مصفوفة المكدس الحالية ببايتات عشوائية غير صفرية. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Font for C++](../../)
