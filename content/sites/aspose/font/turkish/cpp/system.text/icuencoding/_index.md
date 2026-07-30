---
title: "System::Text::ICUEncoding sınıfı"
linktitle: "ICUEncoding"
second_title: "Aspose.Font için C++"
description: "System::Text::ICUEncoding sınıfı. ICU tabanlı kodlama uygulaması. YALNIZCA DAHİLİ KULLANIM İÇİN. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2200
url: /tr/cpp/system.text/icuencoding/
---
## ICUEncoding class


ICU tabanlı kodlama uygulaması. DAHİLİ KULLANIM İÇİN. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class ICUEncoding : public System::Text::Encoding
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | RTTI. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | RTTI. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | RTTI. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(const String\&) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Bir bayt tamponunu çözmek için gereken karakter sayısını alın. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | Bir bayt tamponunu çözmek için gereken karakter sayısını alın. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Bir bayt tamponunu çözmek için gereken karakter sayısını alın. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| [GetDecoder](./getdecoder/)() override | İstekleri bu nesneye yönlendiren bir çözücü alın. |
| [GetEncoder](./getencoder/)() override | İstekleri bu nesneye yönlendiren bir kodlayıcı alın. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Belirtilen sayıda karakteri kodlamak için gereken azami bayt sayısını al. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Belirtilen sayıda baytı çözmek için gereken azami karakter sayısını al. |
| [GetPreamble](./getpreamble/)() override | Kodlamayı gösteren bir bayt dizisi döndürür (ör. BOM). |
| [ICUEncoding](./icuencoding/)(const Details::EncodingInfoInternal *) | Yapıcı. |
| [operator==](./operator==/)(const ICUEncoding\&) const | Kodlamaları kod sayfalarını kullanarak karşılaştırır. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Varsayılan kod sayfası değeri. |
## Ayrıca Bakınız

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
