---
title: "System::DateTimeOffset class"
linktitle: "DateTimeOffset"
second_title: "Aspose.Page untuk C++"
description: "System::DateTimeOffset class. Berisi tanggal dan waktu hari relatif terhadap Coordinated Universal Time. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1700
url: /id/cpp/system/datetimeoffset/
---
## DateTimeOffset class


Berisi tanggal dan waktu hari relatif terhadap Coordinated Universal Time. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class DateTimeOffset
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Menambahkan interval waktu tertentu ke objek [DateTimeOffset](./). |
| [AddDays](./adddays/)(double) const | Menambahkan sejumlah hari tertentu ke objek [DateTimeOffset](./). |
| [AddHours](./addhours/)(double) const | Menambahkan sejumlah jam tertentu ke objek [DateTimeOffset](./). |
| [AddMilliseconds](./addmilliseconds/)(double) const | Menambahkan sejumlah milidetik tertentu ke objek [DateTimeOffset](./). |
| [AddMinutes](./addminutes/)(double) const | Menambahkan sejumlah menit tertentu ke objek [DateTimeOffset](./). |
| [AddMonths](./addmonths/)(int) const | Menambahkan sejumlah bulan tertentu ke objek [DateTimeOffset](./). |
| [AddSeconds](./addseconds/)(double) const | Menambahkan sejumlah detik tertentu ke objek [DateTimeOffset](./). |
| [AddTicks](./addticks/)(int64_t) const | Menambahkan sejumlah tick tertentu ke objek [DateTimeOffset](./). |
| [AddYears](./addyears/)(int) const | Menambahkan sejumlah tahun tertentu ke objek [DateTimeOffset](./). |
| static [Compare](./compare/)(const DateTimeOffset\&, const DateTimeOffset\&) | Membandingkan dua objek [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const DateTimeOffset\&) const | Membandingkan dua objek [DateTimeOffset](./). |
| [CompareTo](./compareto/)(const SharedPtr\<Object\>\&) const | Membandingkan dua objek [DateTimeOffset](./). |
| [DateTimeOffset](./datetimeoffset/)() | Konstruktor default. |
| [DateTimeOffset](./datetimeoffset/)(DateTime) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(int64_t, TimeSpan) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(DateTime, TimeSpan) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, TimeSpan) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, TimeSpan) | Konstruktor. |
| [DateTimeOffset](./datetimeoffset/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, TimeSpan) | Konstruktor. |
| static [Equals](./equals/)(const DateTimeOffset\&, const DateTimeOffset\&) | Memeriksa apakah dua objek [DateTimeOffset](./) mewakili titik waktu yang sama. |
| [Equals](./equals/)(const DateTimeOffset\&) const | Memeriksa apakah dua objek [DateTimeOffset](./) mewakili titik waktu yang sama. |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | Memeriksa apakah dua objek [DateTimeOffset](./) mewakili titik waktu yang sama. |
| [EqualsExact](./equalsexact/)(const DateTimeOffset\&) const | Memeriksa apakah dua objek [DateTimeOffset](./) mewakili titik waktu yang sama dan memiliki offset yang sama. |
| [EqualsExact](./equalsexact/)(const SharedPtr\<Object\>\&) const | Memeriksa apakah dua objek [DateTimeOffset](./) mewakili titik waktu yang sama dan memiliki offset yang sama. |
| static [FromFileTime](./fromfiletime/)(int64_t) | [Convert](../convert/)[Windows](../../system.windows/) file time ke tanggal dan waktu dengan offset waktu lokal. |
| static [FromUnixTimeMilliseconds](./fromunixtimemilliseconds/)(int64_t) | [Convert](../convert/) Unix-time ke objek [DateTimeOffset](./). |
| static [FromUnixTimeSeconds](./fromunixtimeseconds/)(int64_t) | [Convert](../convert/) Unix-time ke objek [DateTimeOffset](./). |
| [get_Date](./get_date/)() const | Mendapatkan komponen tanggal dari objek saat ini. |
| [get_DateTime](./get_datetime/)() const | Mendapatkan nilai [DateTime](../datetime/). |
| [get_Day](./get_day/)() const | Mendapatkan hari dalam bulan dari objek saat ini. |
| [get_DayOfWeek](./get_dayofweek/)() const | Mendapatkan hari dalam minggu dari objek saat ini. |
| [get_DayOfYear](./get_dayofyear/)() const | Mendapatkan hari dalam tahun dari objek saat ini. |
| [get_Hour](./get_hour/)() const | Mendapatkan komponen jam dari objek saat ini. |
| [get_LocalDateTime](./get_localdatetime/)() const | Mendapatkan nilai [DateTime](../datetime/) yang mewakili tanggal dan waktu lokal. |
| [get_Millisecond](./get_millisecond/)() const | Mendapatkan komponen milidetik dari objek saat ini. |
| [get_Minute](./get_minute/)() const | Mendapatkan komponen menit dari objek saat ini. |
| [get_Month](./get_month/)() const | Mendapatkan komponen bulan dari objek saat ini. |
| static [get_Now](./get_now/)() | Mendapatkan [DateTimeOffset](./) yang tanggal dan waktunya diatur ke waktu lokal saat ini dan offset-nya diatur ke offset waktu lokal. |
| [get_Offset](./get_offset/)() const | Mendapatkan offset dari UTC. |
| [get_Second](./get_second/)() const | Mendapatkan komponen detik dari objek saat ini. |
| [get_Ticks](./get_ticks/)() const | Mendapatkan jumlah tick dari objek saat ini. |
| [get_TimeOfDay](./get_timeofday/)() const | Mendapatkan waktu hari dari objek saat ini. |
| [get_UtcDateTime](./get_utcdatetime/)() const | Mendapatkan nilai [DateTime](../datetime/) yang mewakili tanggal dan waktu UTC. |
| static [get_UtcNow](./get_utcnow/)() | Mendapatkan [DateTimeOffset](./) yang tanggal dan waktunya diatur ke waktu UTC saat ini dan offset-nya adalah [TimeSpan::Zero](../timespan/zero/). |
| [get_UtcTicks](./get_utcticks/)() const | Mendapatkan jumlah tick dari objek saat ini dalam waktu UTC. |
| [get_Year](./get_year/)() const | Mendapatkan komponen tahun dari objek saat ini. |
| [GetHashCode](./gethashcode/)() const | Mendapatkan kode hash untuk objek [DateTimeOffset](./) saat ini. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(const DateTimeOffset\&) const | Menentukan apakah objek saat ini dan objek [DateTimeOffset](./) yang ditentukan mewakili nilai tanggal dan waktu yang berbeda. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Mengembalikan instance baru dari kelas [DateTimeOffset](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dan rentang waktu yang ditentukan. |
| [operator-](./operator-/)(TimeSpan) const | Mengembalikan instance baru dari kelas [DateTimeOffset](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil pengurangan rentang waktu yang ditentukan dari nilai yang diwakili oleh objek saat ini. |
| [operator-](./operator-/)(const DateTimeOffset\&) const | Mengembalikan sebuah instance dari kelas [TimeSpan](../timespan/) yang mewakili interval waktu antara nilai tanggal dan waktu yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| [operator<](./operator_/)(const DateTimeOffset\&) const | Menentukan apakah objek saat ini mewakili nilai tanggal dan waktu yang lebih awal daripada nilai yang diwakili oleh objek [DateTimeOffset](./) yang ditentukan. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(const DateTimeOffset\&) const | Menentukan apakah objek saat ini mewakili nilai tanggal dan waktu yang lebih awal atau sama dengan nilai yang diwakili oleh objek [DateTimeOffset](./) yang ditentukan. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator==](./operator==/)(const DateTimeOffset\&) const | Menentukan apakah objek saat ini dan objek [DateTimeOffset](./) yang ditentukan mewakili nilai tanggal dan waktu yang sama. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(const DateTimeOffset\&) const | Menentukan apakah objek saat ini mewakili nilai tanggal dan waktu yang lebih akhir daripada nilai yang diwakili oleh objek [DateTimeOffset](./) yang ditentukan. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(const DateTimeOffset\&) const | Menentukan apakah objek saat ini mewakili nilai tanggal dan waktu yang lebih akhir atau sama dengan nilai yang diwakili oleh objek [DateTimeOffset](./) yang ditentukan. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Mengonversi string yang ditentukan menjadi setara [DateTimeOffset](./). |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Mengonversi string yang ditentukan menjadi objek [DateTimeOffset](./) menggunakan penyedia format dan gaya pemformatan yang ditentukan. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Mengonversi string yang ditentukan menjadi objek [DateTimeOffset](./) menggunakan format, penyedia format, dan gaya pemformatan yang ditentukan. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Mengonversi string yang ditentukan menjadi objek [DateTimeOffset](./) menggunakan format-format yang ditentukan, penyedia format, dan gaya pemformatan. |
| [Subtract](./subtract/)(TimeSpan) const | Mengurangi interval waktu yang ditentukan dari objek saat ini. |
| [Subtract](./subtract/)(const DateTimeOffset\&) const | Mengurangi nilai [DateTimeOffset](./) yang ditentukan dari objek saat ini. |
| [ToFileTime](./tofiletime/)() const | Mengonversi objek saat ini ke waktu file [Windows](../../system.windows/). |
| [ToLocalTime](./tolocaltime/)() const | Mengonversi objek saat ini menjadi sebuah objek yang mewakili waktu lokal,. |
| [ToOffset](./tooffset/)(TimeSpan) const | Mengganti offset objek saat ini dengan offset yang ditentukan. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Mengonversi objek saat ini menjadi string menggunakan format dan penyedia format yang ditentukan. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Mengonversi objek saat ini menjadi string menggunakan penyedia format yang ditentukan. |
| [ToString](./tostring/)(const String\&) const | Mengonversi objek saat ini menjadi string menggunakan format yang ditentukan. |
| [ToString](./tostring/)() const | Mengonversi objek saat ini menjadi string. |
| [ToUniversalTime](./touniversaltime/)() const | Mengonversi objek saat ini menjadi sebuah objek yang mewakili waktu UTC,. |
| [ToUnixTimeMilliseconds](./tounixtimemilliseconds/)() const | Mendapatkan milidetik yang berlalu sejak awal epoch Unix. |
| [ToUnixTimeSeconds](./tounixtimeseconds/)() const | Mendapatkan detik yang telah berlalu sejak awal epoch Unix. |
| static [TryParse](./tryparse/)(const String\&, DateTimeOffset\&) | Mencoba mengonversi string yang ditentukan menjadi objek [DateTimeOffset](./). |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Mencoba mengonversi string yang ditentukan menjadi objek [DateTimeOffset](./) menggunakan penyedia format dan gaya pemformatan yang ditentukan. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Mencoba mengonversi string yang ditentukan menjadi objek [DateTimeOffset](./) menggunakan format, penyedia format, dan gaya pemformatan yang ditentukan. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) | Mencoba mengonversi string yang ditentukan menjadi objek [DateTimeOffset](./) menggunakan format, penyedia format, dan gaya pemformatan yang ditentukan. |
| static [Type](./type/)() | Mengembalikan objek [TypeInfo](../typeinfo/) yang merepresentasikan struktur [TimeSpan](../timespan/). |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [MaxOffset](./maxoffset/) | Mendapatkan offset maksimum dalam tick. |
| static [MaxValue](./maxvalue/) | Mendapatkan nilai [DateTimeOffset](./) terbesar. |
| static constexpr [MinOffset](./minoffset/) | Mendapatkan offset minimum dalam tick. |
| static [MinValue](./minvalue/) | Mendapatkan nilai [DateTimeOffset](./) terawal. |
| static [UnixEpoch](./unixepoch/) | Mendapatkan awal epoch Unix. |
## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
