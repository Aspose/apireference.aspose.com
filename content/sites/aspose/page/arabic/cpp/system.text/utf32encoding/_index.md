---
title: "System::Text::UTF32Encoding class"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page لـ C++"
description: "System::Text::UTF32Encoding class. ترميز UTF-32. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2600
url: /ar/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


ترميز UTF-32. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة داخل مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينسخ كائن الترميز. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن مع الكائن. |
| [GetHashCode](./gethashcode/)() const override | يحصل على رمز التجزئة للترميز. |
| [GetPreamble](./getpreamble/)() override | احصل على مقدمة صفحة الترميز. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | يقارن معلمات الترميزات. |
| [UTF32Encoding](./utf32encoding/)() | منشئ. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | منشئ. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | منشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | الرقم السحري المستخدم من قبل [Windows](../../system.windows/) لتحديد معرف صفحة الترميز UTF-32 ذات النهاية الكبيرة. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | قيمة صفحة الترميز الافتراضية. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | الرقم السحري المستخدم من قبل [Windows](../../system.windows/) لتحديد معرف صفحة الترميز UTF-32 ذات النهاية الصغيرة. |
## انظر أيضًا

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
