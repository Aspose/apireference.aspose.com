---
title: "System::Guid class"
linktitle: "Guid"
second_title: "Aspose.Font için C++"
description: "System::Guid sınıfı. Küresel olarak benzersiz bir tanımlayıcıyı temsil eder. Bu tür, yığına tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'ta bu tür nesneleri yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 3000
url: /tr/cpp/system/guid/
---
## Guid class


Küresel olarak benzersiz bir tanımlayıcıyı temsil eder. Bu tür, yığına tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tür nesneleri yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
class Guid
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CompareTo](./compareto/)(const Guid\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen GUID'lerin aritmetik karşılaştırmasını gerçekleştirir. |
| [Equals](./equals/)(const Guid\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen GUID'lerin eşit olup olmadığını belirler. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir karma kodu döndürür. |
| [Guid](./guid/)() | Tüm sıfırlardan oluşan bir GUID'i temsil eden bir nesne oluşturur. |
| [Guid](./guid/)(const ArrayPtr\<uint8_t\>\&) | İmzasız 8-bit tamsayı değerleri dizisi olarak belirtilen bir GUID'i temsil eden bir nesne oluşturur. |
| [Guid](./guid/)(const System::Details::ArrayView\<uint8_t\>\&) | İmzasız 8-bit tamsayı değerleri dizisi görünümü olarak belirtilen bir GUID'i temsil eden bir nesne oluşturur. |
| [Guid](./guid/)(const String\&) | Dize olarak belirtilen bir GUID'i temsil eden bir nesne oluşturur. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) | [Guid](./) sınıfının bir örneğini belirtilen GUID bileşenlerinden oluşturur. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) | [Guid](./) sınıfının bir örneğini belirtilen GUID bileşenlerinden oluşturur. |
| [Guid](./guid/)(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | [Guid](./) sınıfının bir örneğini belirtilen imzasız tamsayılar ve baytlardan oluşturur. |
| [Guid](./guid/)(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) | [Guid](./) sınıfının bir örneğini belirtilen imzasız tamsayılar ve baytlardan oluşturur. |
| [Guid](./guid/)(const Guid\&) | Belirtilen nesneyle aynı GUID'i temsil eden bir nesne oluşturur. |
| static [NewGuid](./newguid/)() | Yeni bir GUID üretir ve onu temsil eden bir [Guid](./) nesnesi döndürür. |
| [operator!=](./operator!=/)(const Guid\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen GUID'lerin eşit olmama durumunu belirler. |
| [operator=](./operator=/)(const Guid\&) | Geçerli nesneye, belirtilen [Guid](./) nesnesi tarafından temsil edilen GUID değerini atar. |
| [operator==](./operator==/)(const Guid\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen GUID'lerin eşit olup olmadığını belirler. |
| static [Parse](./parse/)(const String\&) | Belirtilen GUID dize temsiliğini eşdeğer bir [Guid](./) nesnesine dönüştürür. |
| [ToByteArray](./tobytearray/)() const | Geçerli nesne tarafından temsil edilen GUID'i bayt dizisine dönüştürür. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen GUID'i dize temsiline dönüştürür. |
| [ToString](./tostring/)(const String\&) const | Geçerli nesne tarafından temsil edilen GUID'i belirtilen dize biçimini kullanarak dize temsiline dönüştürür. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const | Geçerli nesne tarafından temsil edilen GUID'i belirtilen dize biçimi ve kültür kullanarak dize temsiline dönüştürür. |
| static [TryParse](./tryparse/)(const String\&, Guid\&) | Belirtilen dizeyi bir [Guid](./) nesnesine dönüştürmeye çalışır. |
| [~Guid](./~guid/)() | Yıkıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](./empty/) | Değeri 0 olan bir GUID'i temsil eder. |
## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
