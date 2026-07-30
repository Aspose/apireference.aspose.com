---
title: "System::Text::Encoding sınıfı"
linktitle: "Encoding"
second_title: "Aspose.Font için C++"
description: "System::Text::Encoding sınıfı. C++'ta kodlama hizmetleri."
type: docs
weight: 1600
url: /tr/cpp/system.text/encoding/
---
## Encoding class


[Encoding](./) services.

```cpp
class Encoding : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [Clone](./clone/)() | Kodlama nesnesini kopyalar. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&) | İki kodlama arasında baytları dönüştürür. |
| static [Convert](./convert/)(const EncodingPtr\&, const EncodingPtr\&, const ArrayPtr\<uint8_t\>\&, int, int) | İki kodlama arasında baytları dönüştürür. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Kodlamaları karşılaştırır. |
| static [get_ASCII](./get_ascii/)() | ASCII kodlamasını alır. |
| static [get_BigEndianUnicode](./get_bigendianunicode/)() | Standart büyük-endian Unicode kodlama nesnesini alır. |
| static [get_BigEndianUTF32](./get_bigendianutf32/)() | Standart büyük-endian UTF-32 kodlama nesnesini alır. |
| virtual [get_BodyName](./get_bodyname/)() | Posta ajanı gövdesiyle uyumlu kodlama adını alır. |
| virtual [get_CodePage](./get_codepage/)() | [Windows](../../system.windows/) kod sayfası kimliğini alır. |
| [get_DecoderFallback](./get_decoderfallback/)() const | Kod çözücü geri dönüşünü alır. |
| static [get_Default](./get_default/)() | Varsayılan kodlamayı alır. |
| [get_EncoderFallback](./get_encoderfallback/)() const | Kodlayıcı geri dönüşünü alır. |
| virtual [get_EncodingName](./get_encodingname/)() | İnsan tarafından okunabilir kodlama adını alır. |
| virtual [get_HeaderName](./get_headername/)() | Posta ajanı başlığıyla uyumlu kodlama adını alır. |
| virtual [get_IsBrowserDisplay](./get_isbrowserdisplay/)() | Kodlamanın tarayıcıda içeriği görüntülemek için kullanılabilir olup olmadığını denetler. |
| virtual [get_IsBrowserSave](./get_isbrowsersave/)() | Kodlamanın tarayıcıda içeriği kaydetmek için kullanılabilir olup olmadığını denetler. |
| virtual [get_IsMailNewsDisplay](./get_ismailnewsdisplay/)() | Kodlamanın e-posta istemcisinde içeriği görüntülemek için kullanılabilir olup olmadığını denetler. |
| virtual [get_IsMailNewsSave](./get_ismailnewssave/)() | Kodlamanın e-posta istemcisinde içeriği kaydetmek için kullanılabilir olup olmadığını denetler. |
| [get_IsReadOnly](./get_isreadonly/)() | Kodlamanın yalnızca okunabilir olup olmadığını denetler. |
| virtual [get_IsSingleByte](./get_issinglebyte/)() | Kodlamanın tek bayt olup olmadığını denetler. |
| static [get_Latin1](./get_latin1/)() | Latin1 kodlamasını alır. DAHİLİ KULLANIM İÇİN. |
| static [get_Unicode](./get_unicode/)() | Standart Unicode kodlama nesnesini alır. |
| static [get_UTF32](./get_utf32/)() |  |
| static [get_UTF7](./get_utf7/)() | Standart UTF-7 kodlama nesnesini alır. |
| static [get_UTF8](./get_utf8/)() | Standart UTF-8 kodlama nesnesini alır. |
| static [get_UTF8Unmarked](./get_utf8unmarked/)() | Yalnızca dahili, sınıf kütüphaneleri tarafından kullanılmak üzere: İşaretsiz ve girdi doğrulaması yapılmayan. |
| virtual [get_WebName](./get_webname/)() | IANA uyumlu kodlama adını alır. |
| virtual [get_WindowsCodePage](./get_windowscodepage/)() | [Windows](../../system.windows/) kod sayfası kimliğini alır. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Bir dizeyi kodlamak için gereken karakter sayısını al. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int) | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(const String\&) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Bir bayt tamponunu çözmek için gereken karakter sayısını alın. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Bir bayt tamponunu çözmek için gereken karakter sayısını alın. |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int) | Bir bayt tamponunu çözmek için gereken karakter sayısını alın. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| virtual [GetDecoder](./getdecoder/)() | İstekleri bu nesneye yönlendiren bir çözücü alın. |
| virtual [GetEncoder](./getencoder/)() | İstekleri bu nesneye yönlendiren bir kodlayıcı alın. |
| static [GetEncoding](./getencoding/)(const String\&) | Kodlamayı ada göre alır. |
| static [GetEncoding](./getencoding/)(int) | Kodlamayı kod sayfasına göre alır. |
| static [GetEncoding](./getencoding/)(int, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Kodlamayı kod sayfasına göre alır. |
| static [GetEncoding](./getencoding/)(const String\&, const EncoderFallbackPtr\&, const DecoderFallbackPtr\&) | Kodlamayı ada göre alır. |
| static [GetEncodings](./getencodings/)() | Bilinen kodlamaların listesini alır. |
| [GetHashCode](./gethashcode/)() const override | Kodlamayı hash'ler. |
| virtual [GetMaxByteCount](./getmaxbytecount/)(int) | Belirtilen sayıda karakteri kodlamak için gereken azami bayt sayısını al. |
| virtual [GetMaxCharCount](./getmaxcharcount/)(int) | Belirtilen sayıda baytı çözmek için gereken azami karakter sayısını al. |
| virtual [GetPreamble](./getpreamble/)() | Kodlamayı gösteren bir bayt dizisi döndürür (ör. BOM). |
| virtual [GetString](./getstring/)(uint8_t *, int) | Bayt tamponunu bir dizeye çözer. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Bayt tamponunu bir dizeye çözer. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Bayt tamponunu bir dizeye çözer. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Bayt tamponunu bir dizeye çözer. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) | Bayt tamponunu bir dizeye çözer. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Bayt tamponunu bir dizeye çözer. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Bayt tamponunu bir dizeye çözer. |
| [set_DecoderFallback](./set_decoderfallback/)(const DecoderFallbackPtr\&) | Kod çözücü geri dönüşünü ayarlar. |
| [set_EncoderFallback](./set_encoderfallback/)(const EncoderFallbackPtr\&) | Kodlayıcı geri dönüşünü ayarlar. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](./default_code_page/) | Varsayılan kod sayfası değeri. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [Ptr](./ptr/) | RTTI. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
