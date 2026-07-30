---
title: "System::Text::Encoding فئة"
linktitle: "Encoding"
second_title: "Aspose.Font لـ C++"
description: "System::Text::Encoding فئة. خدمات الترميز في C++."
type: docs
weight: 1600
url: /ar/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| virtual [Clone](./clone/)() | ينسخ كائن الترميز. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | يحوّل البايتات بين ترميزين. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | يحوّل البايتات بين ترميزين. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | يقارن الترميزات. |
| static [get_ASCII](./get_ascii/)() | يحصل على ترميز ASCII. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | يحصل على كائن ترميز Unicode القياسي بنظام البايتات الكبير. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | يحصل على كائن ترميز UTF-32 القياسي بنظام البايتات الكبير. |
| virtual [get_BodyName](./get_bodyname/)() | يحصل على اسم الترميز المتوافق مع جسم وكيل البريد. |
| virtual [get_CodePage](./get_codepage/)() | يحصل على معرف صفحة الترميز لـ [Windows](../../system.windows/). |
| [get_DecoderFallback](./get_decoderfallback/)() const | يحصل على إرجاع احتياطي للمُفكك. |
| static [get_Default](./get_default/)() | يحصل على الترميز الافتراضي. |
| [get_EncoderFallback](./get_encoderfallback/)() const | يحصل على تعويض المشفر. |
| virtual [get_EncodingName](./get_encodingname/)() | يحصل على اسم الترميز القابل للقراءة البشرية. |
| virtual [get_HeaderName](./get_headername/)() | يحصل على اسم الترميز المتوافق مع رأس عميل البريد. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | يتحقق مما إذا كان يمكن استخدام الترميز في المتصفح لعرض المحتوى. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | يتحقق مما إذا كان يمكن استخدام الترميز في المتصفح لحفظ المحتوى. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | يتحقق مما إذا كان يمكن استخدام الترميز في عميل البريد لعرض المحتوى. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | يتحقق مما إذا كان يمكن استخدام الترميز في عميل البريد لحفظ المحتوى. |
| [get_IsReadOnly](./get_isreadonly/)() | يتحقق مما إذا كان الترميز للقراءة فقط. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | يتحقق مما إذا كان الترميز بايتًا واحدًا. |
| static [get_Latin1](./get_latin1/)() | يحصل على ترميز Latin1. للاستخدام الداخلي. |
| static [get_Unicode](./get_unicode/)() | يحصل على كائن ترميز Unicode القياسي. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | يحصل على كائن ترميز UTF-7 القياسي. |
| static [get_UTF8](./get_utf8/)() | يحصل على كائن ترميز UTF-8 القياسي. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | داخلي فقط، للاستخدام من قبل مكتبات الفئات: غير مُعلَّم وغير مُتحقق من صحة الإدخال. |
| virtual [get_WebName](./get_webname/)() | يحصل على اسم الترميز المتوافق مع IANA. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | يحصل على معرف صفحة الترميز لـ [Windows](../../system.windows/). |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | احصل على عدد الأحرف المطلوبة لترميز سلسلة. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | احصل على عدد الأحرف المطلوبة لترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(const String\&) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | احصل على البايتات الناتجة عن ترميز مخزن الأحرف. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | احصل على عدد الأحرف المطلوبة لفك ترميز مخزن البايتات. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | احصل على عدد الأحرف المطلوبة لفك ترميز مخزن البايتات. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | احصل على عدد الأحرف المطلوبة لفك ترميز مخزن البايتات. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات. |
| virtual [GetDecoder](./getdecoder/)() | احصل على مفكك ترميز يوجه الطلبات إلى هذا الكائن. |
| virtual [GetEncoder](./getencoder/)() | احصل على مشفر يوجه الطلبات إلى هذا الكائن. |
| static [GetEncoding](./getencoding/)(const String\&) | يحصل على الترميز بالاسم. |
| static [GetEncoding](./getencoding/)(int) | يحصل على الترميز بصفحة الشيفرة. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | يحصل على الترميز بصفحة الشيفرة. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | يحصل على الترميز بالاسم. |
| static [GetEncodings](./getencodings/)() | يحصل على قائمة الترميزات المعروفة. |
| [GetHashCode](./gethashcode/)() const override | يُجري تجزئة للترميز. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | احصل على الحد الأقصى لعدد البايتات المطلوبة لترميز عدد محدد من الأحرف. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | احصل على الحد الأقصى لعدد الأحرف المطلوبة لفك ترميز عدد محدد من البايتات. |
| virtual [GetPreamble](./getpreamble/)() | يرجع تسلسلًا من البايتات يحدد الترميز (مثال: BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | يفك تشفير مخزن مؤقت من البايتات إلى سلسلة. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | يضبط تعويض المفكك. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | يضبط تعويض المشفر. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | قيمة صفحة الترميز الافتراضية. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
