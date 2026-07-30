---
title: "الفئة System::Text::UTF32Encoding"
linktitle: "UTF32Encoding"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Text::UTF32Encoding. ترميز UTF-32. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


ترميز UTF-32. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينسخ كائن الترميز. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن مع كائن. |
| [GetHashCode](./gethashcode/)() const override | يحصل على رمز التجزئة للترميز. |
| [GetPreamble](./getpreamble/)() override | احصل على مقدمة صفحة الترميز. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | يقارن معلمات الترميزات. |
| [UTF32Encoding](./utf32encoding/)() | المُنشئ. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | المُنشئ. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | المُنشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | الرقم السحري المستخدم بواسطة [Windows](../../system.windows/) لتحديد معرف صفحة الشيفرة UTF-32 ذات النهاية الكبيرة. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | قيمة صفحة الترميز الافتراضية. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | الرقم السحري المستخدم بواسطة [Windows](../../system.windows/) لتحديد معرف صفحة الشيفرة UTF-32 ذات النهاية الصغيرة. |
## انظر أيضًا

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
