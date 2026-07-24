---
title: "الفئة System::Security::Cryptography::RandomNumberGenerator"
linktitle: "RandomNumberGenerator"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Security::Cryptography::RandomNumberGenerator. فئة مجردة لمولدات الأعداد العشوائية لتورّث منها. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.security.cryptography/randomnumbergenerator/
---
## RandomNumberGenerator class


فئة مجردة لمولدات الأعداد العشوائية لتورّث منها. يجب إنشاء كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/). لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class RandomNumberGenerator : public virtual System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [Create](./create/)() | ينشئ نسخة من التنفيذ الافتراضي لمولد أعداد عشوائية تشفيرية يمكن استخدامها لتوليد بيانات عشوائية. غير مُنفَّذ. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>) | يملأ عناصر المصفوفة الحالية بالبايتات العشوائية. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<uint8_t\>, int, int) | يملأ شريحة المصفوفة الحالية بالبايتات العشوائية. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>) | يملأ عناصر عرض المصفوفة الحالية بالبايتات العشوائية. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<uint8_t\>, int, int) | يملأ شريحة عرض المصفوفة الحالية بالبايتات العشوائية. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&) | يملأ عناصر مصفوفة المكدس الحالية بالبايتات العشوائية. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<uint8_t, N\>\&, int, int) | يملأ شريحة مصفوفة المكدس الحالية بالبايتات العشوائية. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(ArrayPtr\<uint8_t\>) | يملأ عناصر المصفوفة الحالية بالبايتات العشوائية غير الصفرية. |
| virtual [GetNonZeroBytes](./getnonzerobytes/)(System::Details::ArrayView\<uint8_t\>) | يملأ عناصر عرض المصفوفة الحالية بالبايتات العشوائية غير الصفرية. |
| [GetNonZeroBytes](./getnonzerobytes/)(System::Details::StackArray\<uint8_t, N\>\&) | يملأ عناصر مصفوفة المكدس الحالية بالبايتات العشوائية غير الصفرية. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
