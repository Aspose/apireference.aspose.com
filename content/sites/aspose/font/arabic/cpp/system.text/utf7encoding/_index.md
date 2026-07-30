---
title: "فئة System::Text::UTF7Encoding class"
linktitle: "UTF7Encoding"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Text::UTF7Encoding. ترميز UTF-7. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل في C++."
type: docs
weight: 2700
url: /ar/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


ترميز UTF-7. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام عامل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريرها إلى الدوال كمعامل.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [Clone](./clone/)() override | ينسخ كائن الترميز. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن مع كائن. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | احصل على عدد الأحرف المطلوبة لترميز سلسلة. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(const String\&) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | احصل على عدد الأحرف المطلوبة لفك ترميز مخزن البايتات. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | احصل على عدد الأحرف المطلوبة لفك ترميز مخزن البايتات. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | احصل على عدد الأحرف المطلوبة لفك ترميز مخزن البايتات. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| [GetDecoder](./getdecoder/)() override | احصل على مفكك ترميز يوجه الطلبات إلى هذا الكائن. |
| [GetEncoder](./getencoder/)() override | احصل على مشفر يوجه الطلبات إلى هذا الكائن. |
| [GetHashCode](./gethashcode/)() const override | يحصل على رمز التجزئة للترميز. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | احصل على الحد الأقصى لعدد البايتات المطلوبة لترميز عدد محدد من الأحرف. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | احصل على الحد الأقصى لعدد الأحرف المطلوبة لفك ترميز عدد محدد من البايتات. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| virtual [GetString](./getstring/)(uint8_t *, int) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | يقارن معلمات الترميزات. |
| [UTF7Encoding](./utf7encoding/)() | المُنشئ. |
| [UTF7Encoding](./utf7encoding/)(bool) | المُنشئ. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | قيمة صفحة الترميز الافتراضية. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | الرقم السحري المستخدم من قبل [Windows](../../system.windows/) لمعرف صفحة الترميز UTF-7. |
## انظر أيضًا

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
