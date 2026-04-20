---
title: "الفئة System::Net::Http::StringContent"
linktitle: "StringContent"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Net::Http::StringContent. تمثل محتوى HTTP كسلسلة نصية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 1100
url: /ar/cpp/system.net.http/stringcontent/
---
## StringContent class


تمثل محتوى HTTP كسلسلة نصية. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيتسبب في أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class StringContent : public System::Net::Http::ByteArrayContent
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [StringContent](./stringcontent/)(String) | معلومات RTTI. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>) | ينشئ نسخة جديدة. |
| [StringContent](./stringcontent/)(String, System::SharedPtr\<Text::Encoding\>, String) | ينشئ نسخة جديدة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | الترميز الافتراضي. |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | الحد الأقصى لعدد البايتات. |
## انظر أيضًا

* Class [ByteArrayContent](../bytearraycontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Font for C++](../../)
