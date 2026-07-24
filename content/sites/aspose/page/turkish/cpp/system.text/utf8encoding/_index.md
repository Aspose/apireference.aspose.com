---
title: "System::Text::UTF8Encoding sınıfı"
linktitle: "UTF8Encoding"
second_title: "Aspose.Page için C++"
description: "System::Text::UTF8Encoding sınıfı. UTF-8 kodlaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığına (stack) ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2800
url: /tr/cpp/system.text/utf8encoding/
---
## UTF8Encoding class


UTF-8 kodlaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tür bir örneği yığın üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirin.

```cpp
class UTF8Encoding : public System::Text::ICUEncoding
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Kodlama nesnesini kopyalar. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Nesneyle karşılaştırır. |
| [GetHashCode](./gethashcode/)() const override | Kodlamanın karma kodunu alır. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Belirtilen sayıdaki karakteri kodlamak için gereken azami bayt sayısını al. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Belirtilen sayıdaki baytı çözmek için gereken azami karakter sayısını al. |
| [GetPreamble](./getpreamble/)() override | Kod sayfası ön ekini al. |
| [operator==](./operator==/)(const UTF8Encoding\&) const | Kodlamaların parametrelerini karşılaştırır. |
| [UTF8Encoding](./utf8encoding/)() | Yapıcı. |
| [UTF8Encoding](./utf8encoding/)(bool) | Yapıcı. |
| [UTF8Encoding](./utf8encoding/)(bool, bool) | Yapıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Varsayılan kod sayfası değeri. |
| static constexpr [UTF8_CODE_PAGE](./utf8_code_page/) | RTTI bilgisi. |
## Ayrıca Bakınız

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
