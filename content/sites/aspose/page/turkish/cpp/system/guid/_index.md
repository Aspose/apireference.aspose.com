---
title: "System::Guid class"
linktitle: "Guid"
second_title: "Aspose.Page için C++"
description: "System::Guid sınıfı. Küresel olarak benzersiz bir tanımlayıcıyı (GUID) temsil eder. Bu tip yığına (stack) ayrılmalı ve fonksiyonlara değer ya da referans olarak geçirilmelidir. C++'da bu tipin nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 3000
url: /tr/cpp/system/guid/
---
## Guid class


Küresel olarak benzersiz bir tanımlayıcıyı (GUID) temsil eder. Bu tip yığına (stack) ayrılmalı ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tipin nesnelerini yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
class Guid
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen GUID'lerin aritmetik karşılaştırmasını gerçekleştirir. |
| [Equals](./equals/)(const Guid\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen GUID'lerin eşit olup olmadığını belirler. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir hash kodu döndürür. |
| [Guid](./guid/)() | Tüm sıfırlardan oluşan bir GUID'i temsil eden bir nesne oluşturur. |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | İşaretsiz 8-bit tamsayı değerlerinden oluşan bir dizi olarak belirtilen GUID'i temsil eden bir nesne oluşturur. |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | İşaretsiz 8-bit tamsayı değerlerinin dizi görünümü olarak belirtilen GUID'i temsil eden bir nesne oluşturur. |
| [Guid](./guid/)(const String\&) | Bir dize olarak belirtilen GUID'i temsil eden bir nesne oluşturur. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | Belirtilen GUID bileşenlerinden [Guid](./) sınıfının bir örneğini oluşturur. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | Belirtilen GUID bileşenlerinden [Guid](./) sınıfının bir örneğini oluşturur. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Belirtilen işaretsiz tamsayılar ve baytlardan [Guid](./) sınıfının bir örneğini oluşturur. |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | Belirtilen işaretsiz tamsayılar ve baytlardan [Guid](./) sınıfının bir örneğini oluşturur. |
| [Guid](./guid/)(const Guid\&) | Belirtilen nesneyle aynı GUID'i temsil eden bir nesne oluşturur. |
| static [NewGuid](./newguid/)() | Yeni bir GUID oluşturur ve onu temsil eden bir [Guid](./) nesnesi döndürür. |
| [operator!=](./operator!=/)(const Guid\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen GUID'lerin eşit olmama durumunu belirler. |
| [operator=](./operator=/)(const Guid\&) | Geçerli nesneye, belirtilen [Guid](./) nesnesi tarafından temsil edilen GUID değerini atar. |
| [operator==](./operator==/)(const Guid\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen GUID'lerin eşit olup olmadığını belirler. |
| static [Parse](./parse/)(const String\&) | Belirtilen GUID dize temsilini eşdeğer bir [Guid](./) nesnesine dönüştürür. |
| [ToByteArray](./tobytearray/)() const | Geçerli nesne tarafından temsil edilen GUID'i bayt dizisine dönüştürür. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen GUID'i dize temsiline dönüştürür. |
| [ToString](./tostring/)(const String\&) const | Geçerli nesne tarafından temsil edilen GUID'i belirtilen dize biçimini kullanarak dize temsiline dönüştürür. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | Geçerli nesne tarafından temsil edilen GUID'i belirtilen dize biçimi ve Kültür kullanarak dize temsiline dönüştürür. |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | Belirtilen dizeyi bir [Guid](./) nesnesine dönüştürmeye çalışır. |
| [~Guid](./~guid/)() | Yıkıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Değeri 0 olan bir GUID'i temsil eder. |
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
