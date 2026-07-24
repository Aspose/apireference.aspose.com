---
title: "System::Text::UTF32Encoding sınıfı"
linktitle: "UTF32Encoding"
second_title: "Aspose.Page için C++"
description: "System::Text::UTF32Encoding sınıfı. UTF-32 kodlaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirin."
type: docs
weight: 2600
url: /tr/cpp/system.text/utf32encoding/
---
## UTF32Encoding class


UTF-32 kodlaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığıt üzerinde veya operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirin.

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
| static constexpr [BIG_UTF32_CODE_PAGE](./big_utf32_code_page/) | [Windows](../../system.windows/) tarafından büyük endian UTF-32 kod sayfası kimliği için kullanılan sihirli sayı. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Varsayılan kod sayfası değeri. |
| static constexpr [UTF32_CODE_PAGE](./utf32_code_page/) | [Windows](../../system.windows/) tarafından küçük endian UTF-32 kod sayfası kimliği için kullanılan sihirli sayı. |
## Ayrıca Bakınız

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
