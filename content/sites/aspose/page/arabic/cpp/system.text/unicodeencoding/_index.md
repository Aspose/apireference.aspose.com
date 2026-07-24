---
title: "فئة System::Text::UnicodeEncoding"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Text::UnicodeEncoding. ترميز Unicode. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء مثيل من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل أو أخطاء التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2500
url: /ar/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


ترميز Unicode. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) . لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، حيث سيؤدي ذلك إلى أخطاء وقت التشغيل و/أو أخطاء التأكيد. دائمًا قم بلف هذه الفئة داخل المؤشر [System::SmartPtr](../../system/smartptr/) واستخدم هذا المؤشر لتمريره إلى الدوال كمعامل.

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
| [GetPreamble](./getpreamble/)() override | يرجع تسلسلًا من البايتات يحدد الترميز (مثلاً BOM). |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | يقارن الترميزات حسب صفحات الشيفرة والعلامات. |
| [UnicodeEncoding](./unicodeencoding/)() | منشئ. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | منشئ. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | منشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | رقم صفحة الشيفرة Big endian. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | قيمة صفحة الترميز الافتراضية. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | رقم صفحة الشيفرة Little endian. |
## انظر أيضًا

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
