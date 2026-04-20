---
title: "فئة System::Text::ICUEncoding"
linktitle: "ICUEncoding"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Text::ICUEncoding. تنفيذ ترميز يعتمد على ICU. للاستخدام الداخلي فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject() function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 2200
url: /ar/cpp/system.text/icuencoding/
---
## ICUEncoding class


تنفيذ ترميز يعتمد على ICU. للاستخدام الداخلي فقط. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة [System::MakeObject()](../../system/makeobject/) function. لا تقم بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيسبب أخطاء وقت التشغيل أو أخطاء تأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر [System::SmartPtr](../../system/smartptr/) واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل.

```cpp
class ICUEncoding : public System::Text::Encoding
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(const String\&) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | احصل على عدد الأحرف المطلوبة لفك ترميز مخزن البايتات. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | احصل على عدد الأحرف المطلوبة لفك ترميز مخزن البايتات. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | احصل على عدد الأحرف المطلوبة لفك ترميز مخزن البايتات. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| [GetDecoder](./getdecoder/)() override | احصل على مفكك ترميز يوجه الطلبات إلى هذا الكائن. |
| [GetEncoder](./getencoder/)() override | احصل على مشفر يوجه الطلبات إلى هذا الكائن. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | احصل على الحد الأقصى لعدد البايتات المطلوبة لترميز عدد محدد من الأحرف. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | احصل على الحد الأقصى لعدد الأحرف المطلوبة لفك ترميز عدد محدد من البايتات. |
| [GetPreamble](./getpreamble/)() override | يرجع تسلسلًا من البايتات يحدد الترميز (مثال: BOM). |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | المُنشئ. |
| [operator==](./operator==/)(const ICUEncoding\&) const | يقارن الترميزات باستخدام صفحات الشيفرة. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | قيمة صفحة الترميز الافتراضية. |
## انظر أيضًا

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
