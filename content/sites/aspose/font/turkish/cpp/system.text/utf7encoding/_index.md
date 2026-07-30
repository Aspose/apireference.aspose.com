---
title: "System::Text::UTF7Encoding sınıfı"
linktitle: "UTF7Encoding"
second_title: "Aspose.Font için C++"
description: "System::Text::UTF7Encoding sınıfı. UTF-7 kodlaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak allocate edilmelidir. Bu tipin örneğini yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2700
url: /tr/cpp/system.text/utf7encoding/
---
## UTF7Encoding class


UTF-7 kodlaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin bir örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

```cpp
class UTF7Encoding : public System::Text::Encoding
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Kodlama nesnesini kopyalar. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Nesneyle karşılaştırır. |
| [GetByteCount](./getbytecount/)(const char_t *, int) override | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int) | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| virtual [GetByteCount](./getbytecount/)(System::Details::ArrayView\<char_t\>, int, int) | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| [GetByteCount](./getbytecount/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| virtual [GetByteCount](./getbytecount/)(const String\&) | Bir dizeyi kodlamak için gereken karakter sayısını al. |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>) | Bir karakter tamponunu kodlamak için gereken karakter sayısını alın. |
| [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) override | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int) override | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetBytes](./getbytes/)(const String\&, int, int, ArrayPtr\<uint8_t\>, int) override | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetBytes](./getbytes/)(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(const String\&) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(const System::Details::ArrayView\<char_t\>\&, int, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetBytes](./getbytes/)(const System::Details::StackArray\<char_t, N\>\&, int, int) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>) | Bir karakter tamponunu kodlamanın sonucunda oluşan baytları alın. |
| [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) override | Bir bayt tamponunu çözmek için gereken karakter sayısını alın. |
| [GetCharCount](./getcharcount/)(const uint8_t *, int) override | Bir bayt tamponunu çözmek için gereken karakter sayısını alın. |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>) | Bir bayt tamponunu çözmek için gereken karakter sayısını alın. |
| [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) override | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| [GetChars](./getchars/)(const uint8_t *, int, char_t *, int) override | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int) | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>) | Bir bayt tamponunu çözmenin sonucunda oluşan karakterleri alın. |
| [GetDecoder](./getdecoder/)() override | İstekleri bu nesneye yönlendiren bir çözücü alın. |
| [GetEncoder](./getencoder/)() override | İstekleri bu nesneye yönlendiren bir kodlayıcı alın. |
| [GetHashCode](./gethashcode/)() const override | Kodlamanın karma kodunu alır. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Belirtilen sayıda karakteri kodlamak için gereken azami bayt sayısını al. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Belirtilen sayıda baytı çözmek için gereken azami karakter sayısını al. |
| [GetString](./getstring/)(ArrayPtr\<uint8_t\>, int, int) override | Bayt tamponunu bir dizeye çözer. |
| virtual [GetString](./getstring/)(uint8_t *, int) | Bayt tamponunu bir dizeye çözer. |
| virtual [GetString](./getstring/)(ArrayPtr\<uint8_t\>) | Bayt tamponunu bir dizeye çözer. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&) | Bayt tamponunu bir dizeye çözer. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>\&) | Bayt tamponunu bir dizeye çözer. |
| virtual [GetString](./getstring/)(const System::Details::ArrayView\<uint8_t\>\&, int, int) | Bayt tamponunu bir dizeye çözer. |
| [GetString](./getstring/)(System::Details::StackArray\<uint8_t, N\>, int, int) | Bayt tamponunu bir dizeye çözer. |
| [operator==](./operator==/)(const UTF7Encoding\&) const | Kodlamaların parametrelerini karşılaştırır. |
| [UTF7Encoding](./utf7encoding/)() | Yapıcı. |
| [UTF7Encoding](./utf7encoding/)(bool) | Yapıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Varsayılan kod sayfası değeri. |
| static constexpr [UTF7_CODE_PAGE](./utf7_code_page/) | [Windows](../../system.windows/) tarafından UTF-7 kod sayfası kimliği için kullanılan sihirli sayı. |
## Ayrıca Bakınız

* Class [Encoding](../encoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
