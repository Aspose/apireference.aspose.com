---
title: "Kelas System::TimeSpan"
linktitle: "TimeSpan"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::TimeSpan. Mewakili interval waktu. Tipe ini harus dialokasikan di stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 6100
url: /id/cpp/system/timespan/
---
## TimeSpan class


Mewakili interval waktu. Tipe ini harus dialokasikan di stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek tipe ini.

```cpp
class TimeSpan
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Mengembalikan instance baru dari kelas [TimeSpan](./) yang mewakili interval waktu yang merupakan jumlah dari interval waktu yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| static [Compare](./compare/)(TimeSpan, TimeSpan) | Membandingkan dua objek [TimeSpan](./). |
| [CompareTo](./compareto/)(TimeSpan) const | Membandingkan objek saat ini dengan objek yang ditentukan. |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Membandingkan objek saat ini dengan objek yang ditentukan. |
| [Duration](./duration/)() const | Mengembalikan instance baru dari objek [TimeSpan](./) yang nilainya adalah nilai absolut dari objek saat ini. |
| [Equals](./equals/)(TimeSpan) const | Menentukan apakah interval waktu yang diwakili oleh objek saat ini sama dengan interval waktu yang diwakili oleh objek yang ditentukan. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Menentukan apakah interval waktu yang diwakili oleh objek saat ini sama dengan interval waktu yang diwakili oleh objek yang ditentukan. |
| static [Equals](./equals/)(TimeSpan, TimeSpan) | Mengembalikan true jika objek yang ditentukan mewakili interval waktu yang sama, jika tidak - false. |
| static [FromDays](./fromdays/)(double) | Mengembalikan objek [TimeSpan](./) baru yang mewakili interval yang ditentukan. |
| static [FromHours](./fromhours/)(double) | Mengembalikan objek [TimeSpan](./) baru yang mewakili interval yang ditentukan. |
| static [FromMilliseconds](./frommilliseconds/)(double) | Mengembalikan objek [TimeSpan](./) baru yang mewakili interval yang ditentukan. |
| static [FromMinutes](./fromminutes/)(double) | Mengembalikan objek [TimeSpan](./) baru yang mewakili interval yang ditentukan. |
| static [FromSeconds](./fromseconds/)(double) | Mengembalikan objek [TimeSpan](./) baru yang mewakili interval yang ditentukan. |
| static [FromTicks](./fromticks/)(int64_t) | Mengembalikan objek [TimeSpan](./) baru yang mewakili interval yang ditentukan. |
| [get_Days](./get_days/)() const | Mengembalikan komponen hari dari interval waktu yang diwakili oleh objek [TimeSpan](./) saat ini. |
| [get_Hours](./get_hours/)() const | Mengembalikan komponen jam dari interval waktu yang diwakili oleh objek [TimeSpan](./) saat ini. |
| [get_Milliseconds](./get_milliseconds/)() const | Mengembalikan komponen milidetik dari interval waktu yang diwakili oleh objek [TimeSpan](./) saat ini. |
| [get_Minutes](./get_minutes/)() const | Mengembalikan komponen menit dari interval waktu yang diwakili oleh objek [TimeSpan](./) saat ini. |
| [get_Seconds](./get_seconds/)() const | Mengembalikan komponen detik dari interval waktu yang diwakili oleh objek [TimeSpan](./) saat ini. |
| [get_Ticks](./get_ticks/)() const | Mengembalikan jumlah interval 100-nanodetik yang membentuk interval waktu yang diwakili oleh objek [TimeSpan](./) saat ini. |
| [get_TotalDays](./get_totaldays/)() const | Mengembalikan nilai objek [TimeSpan](./) saat ini yang diekspresikan dalam hari penuh dan pecahan. |
| [get_TotalHours](./get_totalhours/)() const | Mengembalikan nilai objek [TimeSpan](./) saat ini yang diekspresikan dalam jam penuh dan pecahan. |
| [get_TotalMilliseconds](./get_totalmilliseconds/)() const | Mengembalikan nilai objek [TimeSpan](./) saat ini yang diekspresikan dalam milidetik penuh dan pecahan. |
| [get_TotalMinutes](./get_totalminutes/)() const | Mengembalikan nilai objek [TimeSpan](./) saat ini yang diekspresikan dalam menit penuh dan pecahan. |
| [get_TotalSeconds](./get_totalseconds/)() const | Mengembalikan nilai objek [TimeSpan](./) saat ini yang diekspresikan dalam detik penuh dan pecahan. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash untuk objek saat ini. |
| [IsNull](./isnull/)() const |  |
| [Negate](./negate/)() const | Mengembalikan instance baru dari objek [TimeSpan](./) yang mewakili nilai negatif yang diwakili oleh objek [TimeSpan](./) saat ini. |
| [operator!=](./operator!=/)(TimeSpan) const | Menentukan apakah interval waktu yang diwakili oleh objek saat ini tidak sama dengan interval waktu yang diwakili oleh objek yang ditentukan. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Mengembalikan instance baru dari kelas [TimeSpan](./) yang mewakili interval waktu yang merupakan jumlah dari interval waktu yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| [operator+](./operator+/)() const | Mengembalikan diri sendiri. |
| [operator+=](./operator+=/)(TimeSpan) | Menetapkan ke objek saat ini interval waktu yang merupakan jumlah dari interval waktu yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| [operator-](./operator-/)(TimeSpan) const | Mengembalikan instance baru dari kelas [TimeSpan](./) yang mewakili interval waktu yang merupakan hasil pengurangan interval waktu yang diwakili oleh objek yang ditentukan dari interval waktu yang diwakili oleh objek saat ini. |
| [operator-](./operator-/)() const | Mengembalikan instance baru dari objek [TimeSpan](./) yang mewakili nilai negatif yang diwakili oleh objek [TimeSpan](./) saat ini. |
| [operator-=](./operator-=/)(TimeSpan) | Menetapkan ke objek saat ini interval waktu yang merupakan hasil pengurangan interval waktu yang diwakili oleh objek yang ditentukan dari interval waktu yang diwakili oleh objek saat ini. |
| [operator/](./operator//)(double) const |  |
| [operator/](./operator//)(TimeSpan) const |  |
| [operator/=](./operator/=/)(double) |  |
| [operator<](./operator_/)(TimeSpan) const | Menentukan apakah interval waktu yang diwakili oleh objek saat ini lebih pendek daripada interval waktu yang diwakili oleh objek yang ditentukan. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(TimeSpan) const | Menentukan apakah interval waktu yang diwakili oleh objek saat ini lebih pendek atau sama dengan interval waktu yang diwakili oleh objek yang ditentukan. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const TimeSpan\&) | Menetapkan interval waktu yang diwakili oleh objek [TimeSpan](./) yang ditentukan ke objek [TimeSpan](./) saat ini. |
| [operator==](./operator==/)(TimeSpan) const | Menentukan apakah interval waktu yang diwakili oleh objek saat ini sama dengan interval waktu yang diwakili oleh objek yang ditentukan. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(TimeSpan) const | Menentukan apakah interval waktu yang diwakili oleh objek saat ini lebih panjang daripada interval waktu yang diwakili oleh objek yang ditentukan. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(TimeSpan) const | Menentukan apakah interval waktu yang diwakili oleh objek saat ini lebih panjang atau sama dengan interval waktu yang diwakili oleh objek yang ditentukan. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Mengonversi string menjadi objek [TimeSpan](./) yang setara. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Mengonversi string menjadi objek [TimeSpan](./) yang setara menggunakan penyedia format yang ditentukan. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Mengonversi string menjadi objek [TimeSpan](./) yang setara menggunakan format yang ditentukan, penyedia format, dan gaya. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles) | Mengonversi string menjadi objek [TimeSpan](./) yang setara menggunakan format yang ditentukan, penyedia format, dan gaya. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles) |  |
| [Subtract](./subtract/)(TimeSpan) const | Mengembalikan instance baru dari kelas [TimeSpan](./) yang mewakili interval waktu yang merupakan hasil pengurangan interval waktu yang diwakili oleh objek yang ditentukan dari interval waktu yang diwakili oleh objek saat ini. |
| [TimeSpan](./timespan/)() | Membuat objek [TimeSpan](./) yang mewakili interval waktu nol. |
| explicit [TimeSpan](./timespan/)(int64_t) | Membuat instance kelas [TimeSpan](./) yang mewakili interval waktu yang ditentukan. |
| [TimeSpan](./timespan/)(int, int, int) | Membuat instance kelas [TimeSpan](./) yang mewakili interval waktu yang sama dengan jumlah jam, menit, dan detik yang ditentukan. |
| [TimeSpan](./timespan/)(int, int, int, int, int) | Membuat instance kelas [TimeSpan](./) yang mewakili interval waktu yang sama dengan jumlah jam, menit, detik, dan milidetik yang ditentukan. |
| [TimeSpan](./timespan/)(const TimeSpan\&) | Membuat objek [TimeSpan](./) yang mewakili interval waktu yang sama dengan interval waktu yang diwakili oleh objek [TimeSpan](./) yang ditentukan. |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari interval waktu yang diwakili oleh objek saat ini. |
| [ToString](./tostring/)(const String\&) const | Mengonversi nilai objek saat ini menjadi representasi string yang setara, menggunakan format yang ditentukan. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Mengonversi nilai objek saat ini menjadi representasi string yang setara, menggunakan format dan penyedia format yang ditentukan. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| static [TryParse](./tryparse/)(const String\&, TimeSpan\&) | Mengonversi string menjadi objek [TimeSpan](./) yang setara dan mengembalikan hasil konversi. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Mengonversi string menjadi objek [TimeSpan](./) yang setara menggunakan penyedia format yang ditentukan dan mengembalikan hasil konversi. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Mengonversi string menjadi objek [TimeSpan](./) yang setara menggunakan format yang ditentukan dan penyedia format, serta mengembalikan hasil konversi. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Mengonversi string menjadi objek [TimeSpan](./) yang setara menggunakan format, penyedia format, dan gaya yang ditentukan, serta mengembalikan hasil konversi. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::TimeSpanStyles, TimeSpan\&) | Mengonversi string menjadi objek [TimeSpan](./) yang setara menggunakan format, penyedia format, dan gaya yang ditentukan, serta mengembalikan hasil konversi. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::TimeSpanStyles, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, TimeSpan\&) | Mengonversi string menjadi objek [TimeSpan](./) yang setara menggunakan format dan penyedia format yang ditentukan, serta mengembalikan hasil konversi. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, TimeSpan\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, TimeSpan\&) |  |
| static [Type](./type/)() | Mengembalikan objek [TypeInfo](../typeinfo/) yang mewakili struktur [TimeSpan](./). |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [MaxValue](./maxvalue/) | Objek [TimeSpan](./) yang mewakili interval terpanjang yang mungkin. |
| static [MinValue](./minvalue/) | /// Objek [TimeSpan](./) yang mewakili interval terpendek yang mungkin. |
| static constexpr [TicksPerDay](./ticksperday/) | Jumlah interval 100-nanodetik dalam satu hari (interval 24 jam). |
| static constexpr [TicksPerHour](./ticksperhour/) | Jumlah interval 100-nanodetik dalam satu jam. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Jumlah interval 100-nanodetik dalam satu milidetik. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Jumlah interval 100-nanodetik dalam satu menit. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Jumlah interval 100-nanodetik dalam satu detik. |
| static [Zero](./zero/) | Objek [TimeSpan](./) yang merepresentasikan interval nol. |
## Catatan



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

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
