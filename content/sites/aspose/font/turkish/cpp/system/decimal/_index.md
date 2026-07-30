---
title: "System::Decimal sınıfı"
linktitle: "Decimal"
second_title: "Aspose.Font için C++"
description: "System::Decimal sınıfı. Ondalık bir sayıyı temsil eder. Bu tip yığıt (stack) üzerinde tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. C++'ta bu tipin nesnelerini yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 1900
url: /tr/cpp/system/decimal/
---
## Decimal class


Ondalık bir sayıyı temsil eder. Bu tip yığıt (stack) üzerinde tahsis edilmeli ve fonksiyonlara değer olarak ya da referansla geçirilmelidir. Bu tipin nesnelerini yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
class Decimal
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | İki belirtilen [Decimal](./) değerini ekler. |
| static [Ceiling](./ceiling/)(const Decimal\&) | Belirtilen değerden büyük veya eşit olan en küçük tam sayıyı döndürür. |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | İlk [Decimal](./) nesnesi tarafından temsil edilen değerin, ikinci [Decimal](./) nesnesi tarafından temsil edilen değerden küçük, eşit veya büyük olup olmadığını belirler. |
| [CompareTo](./compareto/)(const Decimal\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen nesne tarafından temsil edilen değerden küçük, eşit veya büyük olup olmadığını belirler. |
| [Decimal](./decimal/)() | 0'ı temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(std::int8_t) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(std::int16_t) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(std::int32_t) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(std::int64_t) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(std::uint8_t) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(std::uint16_t) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(std::uint32_t) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(std::uint64_t) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(float) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(double) | Belirtilen değeri temsil eden bir örnek oluşturur. |
| explicit [Decimal](./decimal/)(const std::string\&) | Değerinin dize temsili std::string sınıfının bir örneği olarak belirtilen bir değeri temsil eden bir örnek oluşturur. |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | Belirtilen bileşenlerden bir [Decimal](./) nesnesi oluşturur. |
| [Decimal](./decimal/)(const Decimal\&) | Belirtilen [Decimal](./) nesnesiyle aynı sayıyı temsil eden bir [Decimal](./) sınıfı örneği oluşturur. |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | İkili temsili içeren tamsayı dizisinden bir [Decimal](./) sınıfı örneği oluşturur. |
| [Decimal](./decimal/)(std::nullptr_t) | Her zaman ArgumentNullException fırlatır. |
| [Decimal](./decimal/)(const number_type\&) | Belirtilen değeri temsil eden bir [Decimal](./) sınıfı örneği oluşturur. |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | Belirtilen iki [Decimal](./) değerini böler. |
| [Equals](./equals/)(const Decimal\&) const | Geçerli nesne ve belirtilen nesne tarafından temsil edilen değerlerin eşit olup olmadığını belirler. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Geçerli nesne ve belirtilen nesne tarafından temsil edilen değerlerin eşit olup olmadığını belirler. |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | Belirtilen nesneler tarafından temsil edilen değerlerin eşit olup olmadığını belirler. |
| static [Floor](./floor/)(const Decimal\&) | Belirtilen değerden küçük veya ona eşit olan en büyük tam sayıyı döndürür. |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) belirtilen OLE para birimi değerini eşdeğer [Decimal](./) değerine dönüştürür. UYGULANMADI. |
| static [GetBits](./getbits/)(const Decimal\&) | Belirtilen [Decimal](./) nesneyi temsil ettiği değerin ikili gösterimine dönüştürür. |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) belirtilen [Decimal](./) değerini bayt dizisine dönüştürür. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir karma kodu döndürür. |
| [GetTypeCode](./gettypecode/)() const | Nesne tür kodunu alır. |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | Belirtilen iki [Decimal](./) değerini çarpar. |
| static [Negate](./negate/)(const Decimal\&) | Belirtilen nesne tarafından temsil edilen değerin negatifine dönüşen bir değeri temsil eden yeni bir [Decimal](./) sınıf örneği döndürür. |
| explicit [operator bool](./operatorbool/)() const | Geçerli nesne tarafından temsil edilen değeri bir boolean değere dönüştürür. |
| explicit [operator double](./operatordouble/)() const | Geçerli nesne tarafından temsil edilen değeri çift duyarlıklı kayan nokta değerine dönüştürür. |
| explicit [operator float](./operatorfloat/)() const | Geçerli nesne tarafından temsil edilen değeri tek duyarlıklı kayan nokta değerine dönüştürür. |
| [operator!=](./operator!=/)(const Decimal\&) const | Geçerli nesne ve belirtilen nesne tarafından temsil edilen değerlerin eşit olmama durumunu belirler. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Geçerli nesne tarafından temsil edilen değerin 0'dan farklı olup olmadığını belirler. |
| [operator%](./operator%/)(const Decimal\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen değerlerle yapılan modulo işleminin sonucu olan bir değeri temsil eden yeni bir [Decimal](./) sınıf örneği döndürür. |
| [operator%=](./operator%=/)(const Decimal\&) | Geçerli nesneye, geçerli ve belirtilen nesneler tarafından temsil edilen değerlerle yapılan modulo işleminin sonucu olan yeni bir değer atar. |
| [operator*](./operator_/)(const Decimal\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen değerlerin çarpımının sonucu olan bir değeri temsil eden yeni bir [Decimal](./) sınıf örneği döndürür. |
| [operator*=](./operator_=/)(const Decimal\&) | Geçerli nesneye, geçerli ve belirtilen nesneler tarafından temsil edilen değerlerin çarpımının sonucu olan yeni bir değer atar. |
| [operator+](./operator+/)(const Decimal\&) const | Geçerli ve belirtilen nesneler tarafından temsil edilen değerlerin toplamının sonucu olan bir değeri temsil eden yeni bir [Decimal](./) sınıf örneği döndürür. |
| [operator++](./operator++/)() | Geçerli nesne tarafından temsil edilen değeri artırır. |
| [operator+=](./operator+=/)(const Decimal\&) | Geçerli nesneye, geçerli ve belirtilen nesneler tarafından temsil edilen değerlerin toplamı olan yeni bir değer atar. |
| [operator-](./operator-/)(const Decimal\&) const | Geçerli nesne tarafından temsil edilen değerden belirtilen nesne tarafından temsil edilen değerin çıkarılmasının sonucu olan bir değeri temsil eden yeni bir [Decimal](./) sınıf örneği döndürür. |
| [operator-](./operator-/)() const | Geçerli nesne tarafından temsil edilen değerin negatifine dönüşen bir değeri temsil eden yeni bir [Decimal](./) sınıf örneği döndürür. |
| [operator--](./operator--/)() | Geçerli nesne tarafından temsil edilen değeri azaltır. |
| [operator-=](./operator-=/)(const Decimal\&) | Geçerli nesneye, belirtilen nesne tarafından temsil edilen değerin, geçerli nesne tarafından temsil edilen değerden çıkarılması sonucu elde edilen yeni bir değeri atar. |
| [operator/](./operator//)(const Decimal\&) const | [Decimal](./) sınıfının, geçerli nesne tarafından temsil edilen değerin, belirtilen nesne tarafından temsil edilen değere bölünmesi sonucu elde edilen bir değeri temsil eden yeni bir örneğini döndürür. |
| [operator/=](./operator/=/)(const Decimal\&) | Geçerli nesneye, geçerli nesne tarafından temsil edilen değerin, belirtilen nesne tarafından temsil edilen değere bölünmesi sonucu elde edilen yeni bir değeri atar. |
| [operator<](./operator_/)(const Decimal\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen nesne tarafından temsil edilen değerden küçük olup olmadığını belirler. |
| [operator<=](./operator_=/)(const Decimal\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen nesne tarafından temsil edilen değere eşit veya daha küçük olup olmadığını belirler. |
| [operator=](./operator=/)(const Decimal\&) | Belirtilen nesne tarafından temsil edilen değeri geçerli nesneye atar. |
| [operator==](./operator==/)(const Decimal\&) const | Geçerli nesne ve belirtilen nesne tarafından temsil edilen değerlerin eşit olup olmadığını belirler. |
| [operator==](./operator==/)(std::nullptr_t) const | Geçerli nesne tarafından temsil edilen değerin 0 olup olmadığını belirler. |
| [operator>](./operator_/)(const Decimal\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen nesne tarafından temsil edilen değerden büyük olup olmadığını belirler. |
| [operator>=](./operator_=/)(const Decimal\&) const | Geçerli nesne tarafından temsil edilen değerin, belirtilen nesne tarafından temsil edilen değere eşit veya daha büyük olup olmadığını belirler. |
| static [Parse](./parse/)(const String\&) | Ondalık bir sayının dize temsiliğini, eşdeğer bir [Decimal](./) sınıfı örneğine dönüştürür. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | Ondalık bir sayının dize temsiliğini, belirtilen stil kullanılarak eşdeğer bir [Decimal](./) sınıfı örneğine dönüştürür. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Ondalık bir sayının dize temsiliğini, belirtilen biçim sağlayıcısı kullanılarak eşdeğer bir [Decimal](./) sınıfı örneğine dönüştürür. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Ondalık bir sayının dize temsiliğini, belirtilen stil ve biçim sağlayıcısı kullanılarak eşdeğer bir [Decimal](./) sınıfı örneğine dönüştürür. |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | İki [Decimal](./) değerinin bölünmesinden kalan değeri hesaplar. |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | Belirtilen değeri en yakın tam sayıya yuvarlar. Bir parametre, belirtilen değer iki en yakın sayıya eşit uzaklıkta olduğunda fonksiyonun davranışını belirler. |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | Belirtilen değeri, belirtilen ondalık basamak sayısına sahip en yakın değere yuvarlar. Bir parametre, belirtilen değer iki en yakın sayıya eşit uzaklıkta olduğunda fonksiyonun davranışını belirler. |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | Bir belirtilen [Decimal](./) değerini diğerinden çıkarır. |
| static [ToByte](./tobyte/)(Decimal) | [Decimal](./) değerini işaretsiz 8-bit tam sayı değerine dönüştürür. |
| static [ToDouble](./todouble/)(Decimal) | [Decimal](./) değerini çift duyarlıklı kayan nokta sayısına dönüştürür. |
| static [ToInt16](./toint16/)(Decimal) | [Decimal](./) değerini işaretli 16-bit tam sayı değerine dönüştürür. |
| static [ToInt32](./toint32/)(Decimal) | [Decimal](./) değerini işaretli 32-bit tam sayı değerine dönüştürür. |
| static [ToInt64](./toint64/)(Decimal) | [Decimal](./) değerini işaretli 64-bit tam sayı değerine dönüştürür. |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) belirtilen [Decimal](./) değerini eşdeğer OLE para birimi değerine dönüştürür. UYGULANMADI. |
| static [ToSByte](./tosbyte/)(Decimal) | [Decimal](./) değerini işaretli 8-bit tam sayı değerine dönüştürür. |
| static [ToSingle](./tosingle/)(Decimal) | [Decimal](./) değerini tek duyarlıklı kayan nokta sayısına dönüştürür. |
| [ToStdString](./tostdstring/)() const | Nesne tarafından temsil edilen değerin dize temsili içeren bir std::string örneği döndürür. |
| [ToString](./tostring/)() const | Nesne tarafından temsil edilen değerin dize temsili döndürür. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Geçerli nesneyi, kültüre özgü biçim bilgilerini kullanarak dizeye dönüştürür. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Geçerli nesneyi, belirtilen [IFormatProvider](../iformatprovider/) nesnesi tarafından sağlanan belirtilen dize biçimi ve kültüre özgü biçim bilgilerini kullanarak dize temsiline dönüştürür. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | Nesne tarafından temsil edilen değerin dize temsili döndürür. İç kullanım için. |
| static [ToUInt16](./touint16/)(Decimal) | [Decimal](./) değerini işaretsiz 16-bit tamsayı değerine dönüştürür. |
| static [ToUInt32](./touint32/)(Decimal) | [Decimal](./) değerini işaretsiz 32-bit tamsayı değerine dönüştürür. |
| static [ToUInt64](./touint64/)(Decimal) | [Decimal](./) değerini işaretsiz 64-bit tamsayı değerine dönüştürür. |
| static [Truncate](./truncate/)(const Decimal\&) | Belirtilen [Decimal](./) nesnesi tarafından temsil edilen değerin bütün kesirli basamakları atılarak, tam kısmı aynı olan bir değeri temsil eden [Decimal](./) nesnesini döndürür. |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | Bir sayının dize temsili içeren belirtilen dizeyi eşdeğer [Decimal](./) değerine dönüştürür. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | Sağlanan biçimlendirme bilgileri ve sayı stili kullanılarak, bir sayının dize temsili içeren belirtilen dizeyi eşdeğer [Decimal](./) değerine dönüştürür. |
| static [Type](./type/)() | [Decimal](./) sınıfının tip bilgisini temsil eden [TypeInfo](../typeinfo/) nesnesine bir referans döndürür. |
| [~Decimal](./~decimal/)() | Yıkıcı. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [MaxValue](./maxvalue/) | [Decimal](./) sınıfı tarafından temsil edilebilecek en büyük sayıyı temsil eder. |
| static [MinusOne](./minusone/) | -1 sayısını temsil eder. |
| static [MinValue](./minvalue/) | [Decimal](./) sınıfı tarafından temsil edilebilecek en küçük sayıyı temsil eder. |
| static [One](./one/) | 1 sayısını temsil eder. |
| static [Zero](./zero/) | 0 sayısını temsil eder. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [number_type](./number_type/) | Detail::decimal_number_type için bir takma addır. |
## Açıklamalar



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
