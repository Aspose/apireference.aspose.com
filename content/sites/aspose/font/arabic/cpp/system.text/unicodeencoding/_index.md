---
title: "فئة System::Text::UnicodeEncoding"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::UnicodeEncoding. ترميز Unicode. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 2500
url: /ar/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


ترميز Unicode. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينسخ كائن الترميز. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن الترميزات. |
| [GetHashCode](./gethashcode/)() const override | يُجري تجزئة للترميز. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | احصل على الحد الأقصى لعدد البايتات المطلوبة لترميز عدد محدد من الأحرف. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | احصل على الحد الأقصى لعدد الأحرف المطلوبة لفك ترميز عدد محدد من البايتات. |
| [GetPreamble](./getpreamble/)() override | يرجع تسلسلًا من البايتات يحدد الترميز (مثال: BOM). |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | يقارن الترميزات حسب صفحات الرموز والعلامات. |
| [UnicodeEncoding](./unicodeencoding/)() | المُنشئ. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | المُنشئ. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | المُنشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | رقم صفحة الرموز ذات النهاية الكبيرة. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | قيمة صفحة الترميز الافتراضية. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | رقم صفحة الرموز ذات النهاية الصغيرة. |
## انظر أيضًا

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
