---
title: "System::Text::UnicodeEncoding sınıfı"
linktitle: "UnicodeEncoding"
second_title: "Aspose.Page için C++"
description: "System::Text::UnicodeEncoding sınıfı. Unicode kodlaması. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına neden olur. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 2500
url: /tr/cpp/system.text/unicodeencoding/
---
## UnicodeEncoding class


Unicode kodlaması. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tür bir örnek, yığıt üzerinde veya new operatörüyle oluşturulmamalıdır, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class UnicodeEncoding : public System::Text::ICUEncoding
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Kodlama nesnesini kopyalar. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Kodlamaları karşılaştırır. |
| [GetHashCode](./gethashcode/)() const override | Kodlamayı hash'ler. |
| [GetMaxByteCount](./getmaxbytecount/)(int) override | Belirtilen sayıdaki karakteri kodlamak için gereken azami bayt sayısını al. |
| [GetMaxCharCount](./getmaxcharcount/)(int) override | Belirtilen sayıdaki baytı çözmek için gereken azami karakter sayısını al. |
| [GetPreamble](./getpreamble/)() override | Kodlamayı (ör. BOM) belirten bir bayt dizisi döndürür. |
| [operator==](./operator==/)(const UnicodeEncoding\&) const | Kodlamaları kod sayfalarına ve bayraklara göre karşılaştırır. |
| [UnicodeEncoding](./unicodeencoding/)() | Yapıcı. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool) | Yapıcı. |
| [UnicodeEncoding](./unicodeencoding/)(bool, bool, bool) | Yapıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static constexpr [BIG_UNICODE_CODE_PAGE](./big_unicode_code_page/) | Büyük uçlu kod sayfası numarası. |
| static constexpr [DEFAULT_CODE_PAGE](../encoding/default_code_page/) | Varsayılan kod sayfası değeri. |
| static constexpr [UNICODE_CODE_PAGE](./unicode_code_page/) | Küçük uçlu kod sayfası numarası. |
## Ayrıca Bakınız

* Class [ICUEncoding](../icuencoding/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
