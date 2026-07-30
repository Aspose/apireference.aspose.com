---
title: "System::Text::UTF8Encoding فئة"
linktitle: "UTF8Encoding"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::UTF8Encoding. ترميز UTF-8. يجب تخصيص كائنات هذه الفئة فقط باستخدام دالة System::MakeObject() function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2800
url: /ar/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


ترميز UTF-8. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم أبداً بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. احرص دائماً على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينسخ كائن الترميز. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن مع كائن. |
| [GetHashCode](./gethashcode/)() const override | يحصل على رمز التجزئة للترميز. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | احصل على الحد الأقصى لعدد البايتات المطلوبة لترميز عدد محدد من الأحرف. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | احصل على الحد الأقصى لعدد الأحرف المطلوبة لفك ترميز عدد محدد من البايتات. |
| [GetPreamble](./getpreamble/)() override | احصل على مقدمة صفحة الترميز. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | يقارن معلمات الترميزات. |
| [UTF8Encoding](./utf8encoding/)() | المُنشئ. |
| [UTF8Encoding](./utf8encoding/)(bool) | المُنشئ. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | المُنشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | قيمة صفحة الترميز الافتراضية. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | معلومات RTTI. |
## انظر أيضًا

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
