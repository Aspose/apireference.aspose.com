---
title: "System::Text::UTF32Encoding sınıfı"
linktitle: "UTF32Encoding"
second_title: "Aspose.Font için C++"
description: "System::Text::UTF32Encoding sınıfı. UTF-32 kodlaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2600
url: /tr/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


UTF-32 kodlaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya new operatörüyle oluşturmaktan kaçının, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class UTF32Encoding : public System::Text::ICUEncoding
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Kodlama nesnesini kopyalar. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Nesneyle karşılaştırır. |
| [GetHashCode](./gethashcode/)() const override | Kodlamanın karma kodunu alır. |
| [GetPreamble](./getpreamble/)() override | Kod sayfası ön ekini al. |
| [operator==](./operator==/)(const UTF32Encoding\&) const | Kodlamaların parametrelerini karşılaştırır. |
| [UTF32Encoding](./utf32encoding/)() | Yapıcı. |
| [UTF32Encoding](./utf32encoding/)(bool, bool) | Yapıcı. |
| [UTF32Encoding](./utf32encoding/)(bool, bool, bool) | Yapıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | Büyük endian UTF-32 kod sayfası kimliği için [Windows](../../system.windows/) tarafından kullanılan sihirli sayı. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Varsayılan kod sayfası değeri. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | Küçük endian UTF-32 kod sayfası kimliği için [Windows](../../system.windows/) tarafından kullanılan sihirli sayı. |
## Ayrıca Bakınız

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
