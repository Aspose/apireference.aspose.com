---
title: "System::TimeSpan sınıfı"
linktitle: "TimeSpan"
second_title: "Aspose.Font için C++"
description: "System::TimeSpan sınıfı. Bir zaman aralığını temsil eder. Bu tip yığıt (stack) üzerinde tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. C++'ta bu tipteki nesneleri yönetmek için System::SmartPtr sınıfını asla kullanmayın."
type: docs
weight: 6100
url: /tr/cpp/system/timespan/
---
## TimeSpan class


Bir zaman aralığını temsil eder. Bu tip yığıt üzerinde tahsis edilmeli ve fonksiyonlara değer ya da referans olarak geçirilmelidir. Bu tipteki nesneleri yönetmek için [System::SmartPtr](../smartptr/) sınıfını asla kullanmayın.

```cpp
class TimeSpan
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Geçerli ve belirtilen nesneler tarafından temsil edilen zaman aralıklarının toplamı olan bir zaman aralığını temsil eden yeni bir [TimeSpan](./) sınıf örneği döndürür. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | İki [TimeSpan](./) nesnesini karşılaştırır. |
| [CompareTo](./compareto/)(TimeSpan) const | Geçerli ve belirtilen nesneleri karşılaştırır. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Geçerli ve belirtilen nesneleri karşılaştırır. |
| [Duration](./duration/)() const | Geçerli nesnenin mutlak değeri olan bir değere sahip yeni bir [TimeSpan](./) nesnesi döndürür. |
| [Equals](./equals/)(TimeSpan) const | Geçerli nesne tarafından temsil edilen zaman aralığının, belirtilen nesne tarafından temsil edilen zaman aralığına eşit olup olmadığını belirler. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Geçerli nesne tarafından temsil edilen zaman aralığının, belirtilen nesne tarafından temsil edilen zaman aralığına eşit olup olmadığını belirler. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | Belirtilen nesneler aynı zaman aralığını temsil ediyorsa true, aksi takdirde false döndürür. |
| static [FromDays](./fromdays/)(double) | Belirtilen aralığı temsil eden yeni bir [TimeSpan](./) nesnesi döndürür. |
| static [FromHours](./fromhours/)(double) | Belirtilen aralığı temsil eden yeni bir [TimeSpan](./) nesnesi döndürür. |
| static [FromMilliseconds](./frommilliseconds/)(double) | Belirtilen aralığı temsil eden yeni bir [TimeSpan](./) nesnesi döndürür. |
| static [FromMinutes](./fromminutes/)(double) | Belirtilen aralığı temsil eden yeni bir [TimeSpan](./) nesnesi döndürür. |
| static [FromSeconds](./fromseconds/)(double) | Belirtilen aralığı temsil eden yeni bir [TimeSpan](./) nesnesi döndürür. |
| static [FromTicks](./fromticks/)(int64_t) | Belirtilen aralığı temsil eden yeni bir [TimeSpan](./) nesnesi döndürür. |
| [get_Days](./get_days/)() const | Geçerli [TimeSpan](./) nesnesi tarafından temsil edilen zaman aralığının gün bileşenini döndürür. |
| [get_Hours](./get_hours/)() const | Geçerli [TimeSpan](./) nesnesi tarafından temsil edilen zaman aralığının saat bileşenini döndürür. |
| [get_Milliseconds](./get_milliseconds/)() const | Geçerli [TimeSpan](./) nesnesi tarafından temsil edilen zaman aralığının milisaniye bileşenini döndürür. |
| [get_Minutes](./get_minutes/)() const | Geçerli [TimeSpan](./) nesnesi tarafından temsil edilen zaman aralığının dakika bileşenini döndürür. |
| [get_Seconds](./get_seconds/)() const | Geçerli [TimeSpan](./) nesnesi tarafından temsil edilen zaman aralığının saniye bileşenini döndürür. |
| [get_Ticks](./get_ticks/)() const | Geçerli [TimeSpan](./) nesnesi tarafından temsil edilen zaman aralığını oluşturan 100-nanosanlık aralık sayısını döndürür. |
| [get_TotalDays](./get_totaldays/)() const | Geçerli [TimeSpan](./) nesnesinin tam ve kesirli gün cinsinden değerini döndürür. |
| [get_TotalHours](./get_totalhours/)() const | Geçerli [TimeSpan](./) nesnesinin tam ve kesirli saat cinsinden değerini döndürür. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | Geçerli [TimeSpan](./) nesnesinin tam ve kesirli milisaniye cinsinden değerini döndürür. |
| [get_TotalMinutes](./get_totalminutes/)() const | Geçerli [TimeSpan](./) nesnesinin tam ve kesirli dakika cinsinden değerini döndürür. |
| [get_TotalSeconds](./get_totalseconds/)() const | Geçerli [TimeSpan](./) nesnesinin tam ve kesirli saniye cinsinden değerini döndürür. |
| [GetHashCode](./gethashcode/)() const | Mevcut nesne için bir karma kodu döndürür. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | Geçerli [TimeSpan](./) nesnesi tarafından temsil edilen değerin negatifini temsil eden yeni bir [TimeSpan](./) nesne örneği döndürür. |
| [operator!=](./operator!=/)(TimeSpan) const | Geçerli nesne tarafından temsil edilen zaman aralığının, belirtilen nesne tarafından temsil edilen zaman aralığına eşit olmadığını belirler. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Geçerli ve belirtilen nesneler tarafından temsil edilen zaman aralıklarının toplamı olan bir zaman aralığını temsil eden yeni bir [TimeSpan](./) sınıf örneği döndürür. |
| [operator+](./operator+/)() const | Kendisini döndürür. |
| [operator+=](./operator+=/)(TimeSpan) | Geçerli ve belirtilen nesneler tarafından temsil edilen zaman aralıklarının toplamı olan zaman aralığını geçerli nesneye atar. |
| [operator-](./operator-/)(TimeSpan) const | Geçerli nesne tarafından temsil edilen zaman aralığından belirtilen nesne tarafından temsil edilen zaman aralığının çıkarılması sonucu oluşan bir zaman aralığını temsil eden yeni bir [TimeSpan](./) sınıf örneği döndürür. |
| [operator-](./operator-/)() const | Geçerli [TimeSpan](./) nesnesi tarafından temsil edilen değerin negatifini temsil eden yeni bir [TimeSpan](./) nesne örneği döndürür. |
| [operator-=](./operator-=/)(TimeSpan) | Geçerli nesne tarafından temsil edilen zaman aralığından belirtilen nesne tarafından temsil edilen zaman aralığının çıkarılması sonucu oluşan zaman aralığını geçerli nesneye atar. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | Geçerli nesne tarafından temsil edilen zaman aralığının, belirtilen nesne tarafından temsil edilen zaman aralığından daha kısa olup olmadığını belirler. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | Geçerli nesne tarafından temsil edilen zaman aralığının, belirtilen nesne tarafından temsil edilen zaman aralığından daha kısa veya eşit olup olmadığını belirler. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | Belirtilen [TimeSpan](./) nesnesi tarafından temsil edilen zaman aralığını geçerli [TimeSpan](./) nesnesine ayarlar. |
| [operator==](./operator==/)(TimeSpan) const | Geçerli nesne tarafından temsil edilen zaman aralığının, belirtilen nesne tarafından temsil edilen zaman aralığına eşit olup olmadığını belirler. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | Geçerli nesne tarafından temsil edilen zaman aralığının, belirtilen nesne tarafından temsil edilen zaman aralığından daha uzun olup olmadığını belirler. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | Geçerli nesne tarafından temsil edilen zaman aralığının, belirtilen nesne tarafından temsil edilen zaman aralığından daha uzun veya eşit olup olmadığını belirler. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Dizeyi eşdeğer [TimeSpan](./) nesnesine dönüştürür. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Dizeyi, belirtilen biçim sağlayıcısını kullanarak eşdeğer [TimeSpan](./) nesnesine dönüştürür. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Dizeyi, belirtilen biçimler, biçim sağlayıcısı ve stiller kullanılarak eşdeğer [TimeSpan](./) nesnesine dönüştürür. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Dizeyi, belirtilen biçim, biçim sağlayıcısı ve stiller kullanılarak eşdeğer [TimeSpan](./) nesnesine dönüştürür. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | Geçerli nesne tarafından temsil edilen zaman aralığından belirtilen nesne tarafından temsil edilen zaman aralığının çıkarılması sonucu oluşan bir zaman aralığını temsil eden yeni bir [TimeSpan](./) sınıf örneği döndürür. |
| [TimeSpan](./timespan/)() | Sıfır zaman aralığını temsil eden bir [TimeSpan](./) nesnesi oluşturur. |
| explicit [TimeSpan](./timespan/)(int64_t) | Belirtilen zaman aralığını temsil eden bir [TimeSpan](./) sınıfı örneği oluşturur. |
| [TimeSpan](./timespan/)(int, int, int) | Belirtilen saat, dakika ve saniye sayısının toplamına eşit olan zaman aralığını temsil eden bir [TimeSpan](./) sınıfı örneği oluşturur. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | Belirtilen saat, dakika, saniye ve milisaniye sayısının toplamına eşit olan zaman aralığını temsil eden bir [TimeSpan](./) sınıfı örneği oluşturur. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | Belirtilen [TimeSpan](./) nesnesi tarafından temsil edilen zaman aralığına eşit olan zaman aralığını temsil eden bir [TimeSpan](./) nesnesi oluşturur. |
| [ToString](./tostring/)() const | Geçerli nesne tarafından temsil edilen zaman aralığının dize temsilini döndürür. |
| [ToString](./tostring/)(const String\&) const | Geçerli nesnenin değerini, belirtilen biçimi kullanarak eşdeğer dize temsiline dönüştürür. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Geçerli nesnenin değerini, belirtilen biçim ve biçim sağlayıcısını kullanarak eşdeğer dize temsiline dönüştürür. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | Dizeyi eşdeğer [TimeSpan](./) nesnesine dönüştürür ve dönüşüm sonucunu döndürür. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Dizeyi, belirtilen biçim sağlayıcısını kullanarak eşdeğer [TimeSpan](./) nesnesine dönüştürür ve dönüşüm sonucunu döndürür. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Dizeyi, belirtilen biçimler ve biçim sağlayıcısını kullanarak eşdeğer [TimeSpan](./) nesnesine dönüştürür ve dönüşüm sonucunu döndürür. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Dizeyi, belirtilen biçim, biçim sağlayıcısı ve stilleri kullanarak eşdeğer [TimeSpan](./) nesnesine dönüştürür ve dönüşüm sonucunu döndürür. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Dizeyi, belirtilen biçimler, biçim sağlayıcısı ve stilleri kullanarak eşdeğer [TimeSpan](./) nesnesine dönüştürür ve dönüşüm sonucunu döndürür. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Dizeyi, belirtilen biçim ve biçim sağlayıcısını kullanarak eşdeğer [TimeSpan](./) nesnesine dönüştürür ve dönüşüm sonucunu döndürür. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | [TimeSpan](./) yapısını temsil eden bir [TypeInfo](../typeinfo/) nesnesi döndürür. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [MaxValue](./maxvalue/) | En uzun olası aralığı temsil eden [TimeSpan](./) nesnesi. |
| static [MinValue](./minvalue/) | /// En kısa olası aralığı temsil eden [TimeSpan](./) nesnesi. |
| static constexpr [TicksPerDay](./ticksperday/) | Bir günde (24 saatlik aralık) 100 nanosaniyelik aralıkların sayısı. |
| static constexpr [TicksPerHour](./ticksperhour/) | Bir saatte 100 nanosaniyelik aralıkların sayısı. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Bir milisaniyede 100 nanosaniyelik aralıkların sayısı. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Bir dakikada 100 nanosaniyelik aralıkların sayısı. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Bir saniyede 100 nanosaniyelik aralıkların sayısı. |
| static [Zero](./zero/) | Sıfır aralığını temsil eden [TimeSpan](./) nesnesi. |
## Açıklamalar



```cpp
#include "system/datetime.h"
#include "system/timespan.h"
#include <iostream>

int main()
{
  const auto date1 = System::DateTime(2021, 01, 01);
  const auto date2 = System::DateTime(2021, 10, 30);

  const auto interval = date2 - date1;

  std::cout << "Number of ticks: " << interval.get_Ticks() << std::endl;
  std::cout << "Number of milliseconds: " << interval.get_Milliseconds() << std::endl;
  std::cout << "Total number of milliseconds: " << interval.get_TotalMilliseconds() << std::endl;
  std::cout << "Number of minutes: " << interval.get_Minutes() << std::endl;
  std::cout << "Total number of minutes: " << interval.get_TotalMinutes() << std::endl;
  std::cout << "Number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Total number of hours: " << interval.get_Hours() << std::endl;
  std::cout << "Number of days: " << interval.get_Days() << std::endl;
  std::cout << "Total number of days: " << interval.get_TotalDays() << std::endl;

  return 0;
}
/*
This code example produces the following output:
Number of ticks: 260928000000000
Number of milliseconds: 0
Total number of milliseconds: 2.60928e+10
Number of minutes: 0
Total number of minutes: 434880
Number of hours: 0
Total number of hours: 0
Number of days: 302
Total number of days: 302
*/
```

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
