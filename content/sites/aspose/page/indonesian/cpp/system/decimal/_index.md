---
title: "kelas System::Decimal"
linktitle: "Desimal"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Decimal. Mewakili sebuah angka desimal. Tipe ini harus dialokasikan di stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 1900
url: /id/cpp/system/decimal/
---
## Decimal class


Mewakili sebuah angka desimal. Tipe ini harus dialokasikan di stack dan diteruskan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek tipe ini.

```cpp
class Decimal
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | Menambahkan dua nilai [Decimal](./) yang ditentukan. |
| static [Ceiling](./ceiling/)(const Decimal\&) | Mengembalikan nilai integral terkecil yang lebih besar atau sama dengan nilai yang ditentukan. |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | Menentukan apakah nilai yang diwakili oleh objek [Decimal](./) pertama lebih kecil, sama, atau lebih besar daripada nilai yang diwakili oleh objek [Decimal](./) kedua. |
| [CompareTo](./compareto/)(const Decimal\&) const | Menentukan apakah nilai yang diwakili oleh objek saat ini lebih kecil, sama, atau lebih besar daripada nilai yang diwakili oleh objek yang ditentukan. |
| [Decimal](./decimal/)() | Membuat sebuah instance yang mewakili 0. |
| [Decimal](./decimal/)(std::int8_t) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| [Decimal](./decimal/)(std::int16_t) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| [Decimal](./decimal/)(std::int32_t) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| [Decimal](./decimal/)(std::int64_t) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| [Decimal](./decimal/)(std::uint8_t) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| [Decimal](./decimal/)(std::uint16_t) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| [Decimal](./decimal/)(std::uint32_t) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| [Decimal](./decimal/)(std::uint64_t) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| [Decimal](./decimal/)(float) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| [Decimal](./decimal/)(double) | Membuat sebuah instance yang mewakili nilai yang ditentukan. |
| explicit [Decimal](./decimal/)(const std::string\&) | Membuat sebuah instance yang mewakili nilai yang representasi string‑nya ditentukan sebagai sebuah instance dari kelas std::string. |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | Membuat sebuah objek [Decimal](./) dari komponen yang ditentukan. |
| [Decimal](./decimal/)(const Decimal\&) | Membuat sebuah instance dari kelas [Decimal](./) yang mewakili angka yang sama dengan objek [Decimal](./) yang ditentukan. |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | Membuat sebuah instance kelas [Decimal](./) dari array integer yang berisi representasi biner. |
| [Decimal](./decimal/)(std::nullptr_t) | Selalu melempar ArgumentNullException. |
| [Decimal](./decimal/)(const number_type\&) | Membuat sebuah instance kelas [Decimal](./) yang merepresentasikan nilai yang ditentukan. |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | Membagi dua nilai [Decimal](./) yang ditentukan. |
| [Equals](./equals/)(const Decimal\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan sama. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan sama. |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | Menentukan apakah nilai yang direpresentasikan oleh objek-objek yang ditentukan sama. |
| static [Floor](./floor/)(const Decimal\&) | Mengembalikan nilai integral terbesar yang kurang dari atau sama dengan nilai yang ditentukan. |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) nilai mata uang OLE yang ditentukan ke nilai [Decimal](./) yang setara. TIDAK DIIMPLEMENTASIKAN. |
| static [GetBits](./getbits/)(const Decimal\&) | Mengonversi objek [Decimal](./) yang ditentukan menjadi representasi biner dari nilai yang direpresentasikannya. |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) nilai [Decimal](./) yang ditentukan ke array byte. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash untuk objek saat ini. |
| [GetTypeCode](./gettypecode/)() const | Mendapatkan kode tipe objek. |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | Mengalikan dua nilai [Decimal](./) yang ditentukan. |
| static [Negate](./negate/)(const Decimal\&) | Mengembalikan sebuah instance baru kelas [Decimal](./) yang merepresentasikan nilai yang dihasilkan dari negasi nilai yang direpresentasikan oleh objek yang ditentukan. |
| explicit [operator bool](./operatorbool/)() const | Mengonversi nilai yang direpresentasikan oleh objek saat ini ke nilai boolean. |
| explicit [operator double](./operatordouble/)() const | Mengonversi nilai yang direpresentasikan oleh objek saat ini ke nilai floating-point double-precision. |
| explicit [operator float](./operatorfloat/)() const | Mengonversi nilai yang direpresentasikan oleh objek saat ini ke nilai floating-point single-precision. |
| [operator!=](./operator!=/)(const Decimal\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan tidak sama. |
| [operator!=](./operator!=/)(std::nullptr_t) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini berbeda dari 0. |
| [operator%](./operator%/)(const Decimal\&) const | Mengembalikan sebuah instance baru kelas [Decimal](./) yang merepresentasikan nilai yang merupakan hasil operasi modulo dengan nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan. |
| [operator%=](./operator%=/)(const Decimal\&) | Menetapkan ke objek saat ini nilai baru yang merupakan hasil operasi modulo dengan nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan. |
| [operator*](./operator_/)(const Decimal\&) const | Mengembalikan sebuah instance baru kelas [Decimal](./) yang merepresentasikan nilai yang merupakan hasil perkalian nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan. |
| [operator*=](./operator_=/)(const Decimal\&) | Menetapkan ke objek saat ini nilai baru yang merupakan hasil perkalian nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan. |
| [operator+](./operator+/)(const Decimal\&) const | Mengembalikan sebuah instance baru kelas [Decimal](./) yang merepresentasikan nilai yang merupakan jumlah nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan. |
| [operator++](./operator++/)() | Meningkatkan nilai yang direpresentasikan oleh objek saat ini. |
| [operator+=](./operator+=/)(const Decimal\&) | Menetapkan ke objek saat ini nilai baru yang merupakan jumlah nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan. |
| [operator-](./operator-/)(const Decimal\&) const | Mengembalikan sebuah instance baru kelas [Decimal](./) yang merepresentasikan nilai yang merupakan hasil pengurangan nilai yang direpresentasikan oleh objek yang ditentukan dari nilai yang direpresentasikan oleh objek saat ini. |
| [operator-](./operator-/)() const | Mengembalikan instance baru dari kelas [Decimal](./) yang mewakili nilai yang dihasilkan dari negasi nilai yang direpresentasikan oleh objek saat ini. |
| [operator--](./operator--/)() | Mengurangi nilai yang direpresentasikan oleh objek saat ini. |
| [operator-=](./operator-=/)(const Decimal\&) | Menetapkan ke objek saat ini nilai baru yang merupakan hasil pengurangan nilai yang direpresentasikan oleh objek yang ditentukan dari nilai yang direpresentasikan oleh objek saat ini. |
| [operator/](./operator//)(const Decimal\&) const | Mengembalikan instance baru dari kelas [Decimal](./) yang mewakili nilai yang merupakan hasil pembagian nilai yang direpresentasikan oleh objek saat ini dengan nilai yang direpresentasikan oleh objek yang ditentukan. |
| [operator/=](./operator/=/)(const Decimal\&) | Menetapkan ke objek saat ini nilai baru yang merupakan hasil pembagian nilai yang direpresentasikan oleh objek saat ini dengan nilai yang direpresentasikan oleh objek yang ditentukan. |
| [operator<](./operator_/)(const Decimal\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini kurang dari nilai yang direpresentasikan oleh objek yang ditentukan. |
| [operator<=](./operator_=/)(const Decimal\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini kurang dari atau sama dengan nilai yang direpresentasikan oleh objek yang ditentukan. |
| [operator=](./operator=/)(const Decimal\&) | Menetapkan nilai yang direpresentasikan oleh objek yang ditentukan ke objek saat ini. |
| [operator==](./operator==/)(const Decimal\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini dan objek yang ditentukan sama. |
| [operator==](./operator==/)(std::nullptr_t) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini adalah 0. |
| [operator>](./operator_/)(const Decimal\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih besar dari nilai yang direpresentasikan oleh objek yang ditentukan. |
| [operator>=](./operator_=/)(const Decimal\&) const | Menentukan apakah nilai yang direpresentasikan oleh objek saat ini lebih besar dari atau sama dengan nilai yang direpresentasikan oleh objek yang ditentukan. |
| static [Parse](./parse/)(const String\&) | Mengonversi representasi string dari angka desimal menjadi instance setara dari kelas [Decimal](./). |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | Mengonversi representasi string dari angka desimal menjadi instance setara dari kelas [Decimal](./) menggunakan gaya yang ditentukan. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | Mengonversi representasi string dari angka desimal menjadi instance setara dari kelas [Decimal](./) menggunakan penyedia format yang ditentukan. |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | Mengonversi representasi string dari angka desimal menjadi instance setara dari kelas [Decimal](./) menggunakan gaya dan penyedia format yang ditentukan. |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | Menghitung sisa setelah membagi dua nilai [Decimal](./). |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | Membulatkan nilai yang ditentukan ke bilangan bulat terdekat. Sebuah parameter menentukan perilaku fungsi jika nilai yang ditentukan sama dekatnya dengan dua bilangan terdekat. |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | Membulatkan nilai yang ditentukan ke nilai terdekat dengan jumlah digit pecahan yang ditentukan. Sebuah parameter menentukan perilaku fungsi jika nilai yang ditentukan sama dekatnya dengan dua nilai terdekat. |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | Mengurangi satu nilai [Decimal](./) yang ditentukan dari nilai lainnya. |
| static [ToByte](./tobyte/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi nilai integer tak bertanda 8-bit. |
| static [ToDouble](./todouble/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi angka floating-point presisi ganda. |
| static [ToInt16](./toint16/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi nilai integer bertanda 16-bit. |
| static [ToInt32](./toint32/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi nilai integer bertanda 32-bit. |
| static [ToInt64](./toint64/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi nilai integer bertanda 64-bit. |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) nilai [Decimal](./) yang ditentukan ke nilai mata uang OLE yang setara. TIDAK DIIMPLEMENTASIKAN. |
| static [ToSByte](./tosbyte/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi nilai bilangan bulat 8-bit bertanda. |
| static [ToSingle](./tosingle/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi bilangan floating-point presisi tunggal. |
| [ToStdString](./tostdstring/)() const | Mengembalikan sebuah instance std::string yang berisi representasi string dari nilai yang diwakili oleh objek. |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari nilai yang diwakili oleh objek. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Mengonversi objek saat ini menjadi string menggunakan informasi format spesifik budaya. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Mengonversi objek saat ini menjadi representasi string-nya menggunakan format string yang ditentukan dan informasi format spesifik budaya yang disediakan oleh objek [IFormatProvider](../iformatprovider/) yang ditentukan. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | Mengembalikan representasi string dari nilai yang diwakili oleh objek. Untuk penggunaan internal. |
| static [ToUInt16](./touint16/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi nilai bilangan bulat 16-bit tak bertanda. |
| static [ToUInt32](./touint32/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi nilai bilangan bulat 32-bit tak bertanda. |
| static [ToUInt64](./touint64/)(Decimal) | Mengonversi nilai [Decimal](./) menjadi nilai bilangan bulat 64-bit tak bertanda. |
| static [Truncate](./truncate/)(const Decimal\&) | Mengembalikan objek [Decimal](./) yang mewakili nilai yang bagian integralnya sama dengan nilai yang diwakili oleh objek [Decimal](./) yang ditentukan, dengan semua digit pecahan dibuang. |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi nilai [Decimal](./) yang setara. |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | Mengonversi string yang ditentukan yang berisi representasi string dari sebuah angka menjadi nilai [Decimal](./) yang setara menggunakan informasi pemformatan dan gaya angka yang disediakan. |
| static [Type](./type/)() | Mengembalikan referensi ke objek [TypeInfo](../typeinfo/) yang mewakili informasi tipe kelas [Decimal](./). |
| [~Decimal](./~decimal/)() | Destruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [MaxValue](./maxvalue/) | Mewakili angka terbesar yang dapat direpresentasikan oleh kelas [Decimal](./). |
| static [MinusOne](./minusone/) | Mewakili angka -1. |
| static [MinValue](./minvalue/) | Mewakili angka terkecil yang dapat direpresentasikan oleh kelas [Decimal](./). |
| static [One](./one/) | Mewakili angka 1. |
| static [Zero](./zero/) | Mewakili angka 0. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [number_type](./number_type/) | Alias untuk Detail::decimal_number_type. |
## Catatan



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

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
