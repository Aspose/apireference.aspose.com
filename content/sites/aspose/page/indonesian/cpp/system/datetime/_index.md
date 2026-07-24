---
title: "kelas System::DateTime"
linktitle: "DateTime"
second_title: "Aspose.Page untuk C++"
description: "kelas System::DateTime. Mewakili nilai tanggal dan waktu spesifik pada kontinuum waktu. Tipe ini harus dialokasikan di stack dan dilewatkan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas System::SmartPtr untuk mengelola objek tipe ini dalam C++."
type: docs
weight: 1600
url: /id/cpp/system/datetime/
---
## DateTime class


Mewakili nilai tanggal dan waktu spesifik pada kontinuum waktu. Tipe ini harus dialokasikan di stack dan dilewatkan ke fungsi dengan nilai atau referensi. Jangan pernah menggunakan kelas [System::SmartPtr](../smartptr/) untuk mengelola objek tipe ini.

```cpp
class DateTime
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(TimeSpan) const | Mengembalikan instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang dihasilkan dari penambahan rentang waktu yang ditentukan ke nilai tanggal dan waktu yang diwakili oleh objek saat ini. |
| [AddDays](./adddays/)(double) const | Mengembalikan instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dengan jumlah hari yang ditentukan. |
| [AddHours](./addhours/)(double) const | Mengembalikan instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dengan jumlah jam yang ditentukan. |
| [AddMilliseconds](./addmilliseconds/)(double) const | Mengembalikan instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dengan jumlah milidetik yang ditentukan. |
| [AddMinutes](./addminutes/)(double) const | Mengembalikan instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dengan jumlah menit yang ditentukan. |
| [AddMonths](./addmonths/)(int) const | Mengembalikan instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dengan jumlah bulan yang ditentukan. |
| [AddSeconds](./addseconds/)(double) const | Mengembalikan instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dengan jumlah detik yang ditentukan. |
| [AddTicks](./addticks/)(int64_t) const | Mengembalikan instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dengan jumlah interval 100-nanodetik yang ditentukan. |
| [AddYears](./addyears/)(int) const | Mengembalikan instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang sama dengan yang diwakili oleh objek saat ini dengan komponen tahun ditambah jumlah yang ditentukan. |
| static [Compare](./compare/)(DateTime, DateTime) | Membandingkan dua nilai yang diwakili oleh instance [DateTime](./) yang ditentukan dan mengembalikan nilai yang menunjukkan posisi relatif nilai-nilai tersebut pada garis waktu. |
| [CompareTo](./compareto/)(DateTime) const | Membandingkan dua nilai tanggal dan waktu yang diwakili oleh objek saat ini dan instance [DateTime](./) yang ditentukan, serta mengembalikan nilai yang menunjukkan posisi relatif nilai-nilai tersebut pada garis waktu. |
| [DateTime](./datetime/)() | Membuat sebuah instance yang mewakili nilai tanggal dan waktu terkecil yang mungkin, sama dengan MinValue. |
| [DateTime](./datetime/)(int, int, int) | Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, dan hari tertentu. |
| [DateTime](./datetime/)(int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, dan hari tertentu dalam kalender yang ditentukan. |
| [DateTime](./datetime/)(int, int, int, int, int, int) | Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, dan detik tertentu. |
| [DateTime](./datetime/)(int, int, int, int, int, int, DateTimeKind) | Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, dan detik tertentu. |
| [DateTime](./datetime/)(int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&) | Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, dan detik tertentu dalam kalender yang ditentukan. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, DateTimeKind) | Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, detik, dan milidetik tertentu. |
| [DateTime](./datetime/)(int, int, int, int, int, int, int, const SharedPtr\<Globalization::Calendar\>\&, DateTimeKind) | Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai tahun, bulan, hari, jam, menit, detik, dan milidetik tertentu dalam kalender yang ditentukan. |
| [DateTime](./datetime/)(int64_t, DateTimeKind) | Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai sejumlah tick. |
| [DateTime](./datetime/)(int64_t, DateTimeKind, bool) | Membuat sebuah instance yang mewakili nilai tanggal dan waktu yang ditentukan sebagai sejumlah tick. UNTUK PENGGUNAAN INTERNAL. |
| [DateTime](./datetime/)(const DateTime\&) | Membuat salinan sebuah instance. |
| static [DaysInMonth](./daysinmonth/)(int, int) | Mengembalikan jumlah hari dalam bulan yang ditentukan pada tahun yang ditentukan. |
| static [Equals](./equals/)(DateTime, DateTime) | Menentukan apakah instance [DateTime](./) yang ditentukan mewakili nilai tanggal dan waktu yang sama. |
| [Equals](./equals/)(DateTime) const | Menentukan apakah instance [DateTime](./) yang ditentukan mewakili nilai tanggal dan waktu yang sama dengan objek saat ini. |
| static [FromBinary](./frombinary/)(int64_t) | Mendeserialisasi nilai tanggal dan waktu dari integer tak bertanda 64-bit yang ditentukan dan menetapkan instance baru [DateTime](./) ke nilai tersebut. |
| static [FromFileTime](./fromfiletime/)(int64_t) | Mengonversi File time yang ditentukan menjadi instance [DateTime](./) yang mewakili nilai tanggal dan waktu yang sama dengan waktu lokal. |
| static [FromFileTimeUtc](./fromfiletimeutc/)(int64_t) | Mengonversi File time yang ditentukan menjadi instance [DateTime](./) yang mewakili nilai tanggal dan waktu yang sama dengan waktu UTC. |
| static [FromOADate](./fromoadate/)(double) | Mengembalikan sebuah instance [DateTime](./) yang mewakili nilai tanggal dan waktu yang setara dengan OLE Automation Date yang ditentukan. |
| static [FromUnixTime](./fromunixtime/)(time_t) | Mengonversi nilai waktu Unix yang ditentukan menjadi instance [DateTime](./). UNTUK PENGGUNAAN INTERNAL. |
| [get_Date](./get_date/)() const | Mengembalikan sebuah instance baru [DateTime](./) yang mewakili bagian tanggal dari tanggal dan waktu yang diwakili oleh objek saat ini dengan setiap komponen bagian waktu diatur ke 0. |
| [get_Day](./get_day/)() const | Mengembalikan nomor urut hari dalam bulan yang diwakili oleh objek saat ini. |
| [get_DayOfWeek](./get_dayofweek/)() const | Mengembalikan nilai yang mewakili hari dalam minggu yang diwakili oleh objek saat ini. |
| [get_DayOfYear](./get_dayofyear/)() const | Mengembalikan nomor urut hari dalam tahun yang diwakili oleh objek saat ini. |
| [get_Hour](./get_hour/)() const | Mengembalikan komponen jam dari nilai tanggal dan waktu yang diwakili oleh objek saat ini. |
| [get_Kind](./get_kind/)() const | Mengembalikan nilai yang menunjukkan apakah tanggal dan waktu yang diwakili oleh objek saat ini adalah tanggal dan waktu lokal, UTC, atau bukan keduanya. |
| [get_Millisecond](./get_millisecond/)() const | Mengembalikan komponen milidetik dari nilai tanggal dan waktu yang diwakili oleh objek saat ini. |
| [get_Minute](./get_minute/)() const | Mengembalikan komponen menit dari nilai tanggal dan waktu yang diwakili oleh objek saat ini. |
| [get_Month](./get_month/)() const | Mengembalikan nomor urut bulan dalam tahun yang diwakili oleh objek saat ini. |
| static [get_Now](./get_now/)() | Mengembalikan sebuah instance [DateTime](./) yang mewakili waktu saat ini sebagai waktu lokal. |
| [get_Second](./get_second/)() const | Mengembalikan komponen detik dari nilai tanggal dan waktu yang diwakili oleh objek saat ini. |
| [get_Ticks](./get_ticks/)() const | Mengembalikan jumlah interval 100-nanodetik yang telah berlalu sejak 0:00:00 UTC, 1 Januari 0001, dalam kalender Gregorian hingga tanggal dan waktu yang diwakili oleh objek saat ini. |
| [get_TimeOfDay](./get_timeofday/)() const | Mengembalikan nilai yang mewakili interval waktu dari awal hari yang diwakili oleh objek saat ini hingga nilai tanggal dan waktu yang diwakili oleh objek saat ini. |
| static [get_Today](./get_today/)() | Mengembalikan sebuah instance dari kelas [DateTime](./) yang mewakili tanggal saat ini dengan setiap komponen bagian waktu dari nilai yang diwakili oleh objek diatur ke 0. |
| static [get_UtcNow](./get_utcnow/)() | Mengembalikan sebuah instance dari kelas [DateTime](./) yang mewakili waktu saat ini sebagai UTC. |
| [get_Year](./get_year/)() const | Mengembalikan tahun yang diwakili oleh objek saat ini. |
| [GetDateComponents](./getdatecomponents/)(int\&, int\&, int\&) const | Mendapatkan bagian-bagian tanggal. UNTUK PENGGUNAAN INTERNAL. |
| [GetDateTimeFormats](./getdatetimeformats/)() const | Mengembalikan array string dimana setiap elemen adalah representasi string dari objek saat ini yang diformat dengan salah satu spesifier format tanggal dan waktu standar. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t) const | Mengembalikan array string dimana setiap elemen adalah representasi string dari objek saat ini yang diformat dengan spesifier format tanggal dan waktu standar yang ditentukan. |
| [GetDateTimeFormats](./getdatetimeformats/)(const SharedPtr\<IFormatProvider\>\&) const | Mengembalikan array string dimana setiap elemen adalah representasi string dari objek saat ini yang diformat dengan salah satu spesifier format tanggal dan waktu standar serta penyedia format yang ditentukan. |
| [GetDateTimeFormats](./getdatetimeformats/)(char_t, const SharedPtr\<IFormatProvider\>\&) const | Mengembalikan array string dimana setiap elemen adalah representasi string dari objek saat ini yang diformat dengan spesifier format tanggal dan waktu standar yang ditentukan serta penyedia format. |
| [GetHashCode](./gethashcode/)() const | Mengembalikan kode hash untuk objek saat ini. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)() const | Menentukan apakah nilai tanggal dan waktu yang diwakili oleh objek saat ini berada dalam rentang waktu daylight saving untuk zona waktu saat ini. |
| static [IsLeapYear](./isleapyear/)(int) | Menentukan apakah tahun yang ditentukan adalah tahun kabisat. |
| [IsNull](./isnull/)() const |  |
| [operator!=](./operator!=/)(DateTime) const | Menentukan apakah objek saat ini dan objek [DateTime](./) yang ditentukan mewakili nilai tanggal dan waktu yang berbeda. |
| [operator!=](./operator!=/)(std::nullptr_t) const |  |
| [operator+](./operator+/)(TimeSpan) const | Mengembalikan sebuah instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dan rentang waktu yang ditentukan. |
| [operator+=](./operator+=/)(TimeSpan) | Mengatur objek saat ini ke nilai tanggal dan waktu yang merupakan hasil penjumlahan nilai yang diwakili oleh objek saat ini dan rentang waktu yang ditentukan. |
| [operator-](./operator-/)(TimeSpan) const | Mengembalikan sebuah instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil pengurangan rentang waktu yang ditentukan dari nilai yang diwakili oleh objek saat ini. |
| [operator-](./operator-/)(DateTime) const | Mengembalikan sebuah instance dari kelas [TimeSpan](../timespan/) yang mewakili interval waktu antara nilai tanggal dan waktu yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| [operator-=](./operator-=/)(TimeSpan) | Mengatur objek saat ini ke nilai tanggal dan waktu yang merupakan hasil pengurangan rentang waktu yang ditentukan dari nilai tanggal dan waktu yang diwakili oleh objek saat ini. |
| [operator<](./operator_/)(DateTime) const | Menentukan apakah objek saat ini mewakili nilai tanggal dan waktu yang lebih awal daripada nilai yang diwakili oleh objek [DateTime](./) yang ditentukan. |
| [operator<](./operator_/)(std::nullptr_t) const |  |
| [operator<=](./operator_=/)(DateTime) const | Menentukan apakah objek saat ini mewakili nilai tanggal dan waktu yang lebih awal atau sama dengan nilai yang diwakili oleh objek [DateTime](./) yang ditentukan. |
| [operator<=](./operator_=/)(std::nullptr_t) const |  |
| [operator=](./operator=/)(const DateTime\&) | Menetapkan nilai yang diwakili oleh instance [DateTime](./) yang ditentukan ke objek saat ini. |
| [operator==](./operator==/)(DateTime) const | Menentukan apakah objek saat ini dan objek [DateTime](./) yang ditentukan mewakili nilai tanggal dan waktu yang sama. |
| [operator==](./operator==/)(std::nullptr_t) const |  |
| [operator>](./operator_/)(DateTime) const | Menentukan apakah objek saat ini mewakili nilai tanggal dan waktu yang lebih lambat daripada nilai yang diwakili oleh objek [DateTime](./) yang ditentukan. |
| [operator>](./operator_/)(std::nullptr_t) const |  |
| [operator>=](./operator_=/)(DateTime) const | Menentukan apakah objek saat ini mewakili nilai tanggal dan waktu yang lebih lambat atau sama dengan nilai yang diwakili oleh objek [DateTime](./) yang ditentukan. |
| [operator>=](./operator_=/)(std::nullptr_t) const |  |
| static [Parse](./parse/)(const String\&) | Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](./) yang setara. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](./) yang setara menggunakan informasi format spesifik budaya. |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [Parse](./parse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](./) yang setara menggunakan format yang ditentukan dan informasi format spesifik budaya. Format representasi string harus cocok persis dengan format yang ditentukan. Melemparkan pengecualian jika konversi gagal. |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) | Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](./) yang setara menggunakan format yang ditentukan, informasi format spesifik budaya, dan gaya. Format representasi string harus cocok persis dengan satu atau lebih format yang ditentukan. Melemparkan pengecualian jika konversi gagal. |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) |  |
| static [ParseExact](./parseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles) |  |
| static [SpecifyKind](./specifykind/)(DateTime, DateTimeKind) | Membuat objek [DateTime](./) baru yang mewakili jumlah tick yang sama dengan objek [DateTime](./) yang ditentukan dan mewakili waktu lokal, waktu UTC, atau tidak keduanya sebagaimana ditentukan oleh argumen **kind**. |
| [Subtract](./subtract/)(TimeSpan) const | Mengembalikan sebuah instance baru dari kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang merupakan hasil pengurangan rentang waktu yang ditentukan dari nilai yang diwakili oleh objek saat ini. |
| [Subtract](./subtract/)(DateTime) const | Mengembalikan sebuah instance kelas [TimeSpan](../timespan/) yang mewakili interval waktu antara nilai tanggal dan waktu yang diwakili oleh objek saat ini dan objek yang ditentukan. |
| [ToBinary](./tobinary/)() const | Menyerialkan objek saat ini. |
| [ToFileTime](./tofiletime/)() const | Mengembalikan nilai yang mewakili nilai tanggal dan waktu yang diwakili oleh objek saat ini sebagai File time. |
| [ToFileTimeUtc](./tofiletimeutc/)() const | Mengonversi nilai tanggal dan waktu yang diwakili oleh objek saat ini ke File time UTC. |
| [ToLocalTime](./tolocaltime/)() const | Mengembalikan sebuah instance baru kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang diwakili oleh objek saat ini sebagai waktu lokal. |
| [ToLongDateString](./tolongdatestring/)() const | Mengembalikan string yang berisi representasi string tanggal panjang dari objek saat ini. |
| [ToLongTimeString](./tolongtimestring/)() const | Mengembalikan string yang berisi representasi string waktu panjang dari objek saat ini. |
| [ToOADate](./tooadate/)() const | Mengembalikan nilai tanggal dan waktu yang diwakili oleh objek saat ini sebagai OLE Automation Date. |
| [ToShortDateString](./toshortdatestring/)() const | Mengembalikan string yang berisi representasi string tanggal pendek dari objek saat ini. |
| [ToShortTimeString](./toshorttimestring/)() const | Mengembalikan string yang berisi representasi string waktu pendek dari objek saat ini. |
| [ToString](./tostring/)() const | Mengembalikan representasi string dari nilai tanggal dan waktu yang diwakili oleh objek saat ini menggunakan konvensi pemformatan yang ditetapkan oleh budaya saat ini. |
| [ToString](./tostring/)(const String\&) const | Mengembalikan representasi string dari nilai tanggal dan waktu yang diwakili oleh objek saat ini menggunakan format yang ditentukan dan konvensi pemformatan yang ditetapkan oleh budaya saat ini. |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | Mengembalikan representasi string dari nilai tanggal dan waktu yang diwakili oleh objek saat ini menggunakan informasi format yang ditentukan. |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | Mengembalikan representasi string dari nilai tanggal dan waktu yang diwakili oleh objek saat ini menggunakan informasi format yang ditentukan. |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToUniversalTime](./touniversaltime/)() const | Mengembalikan sebuah instance baru kelas [DateTime](./) yang mewakili nilai tanggal dan waktu yang diwakili oleh objek saat ini sebagai UTC. |
| [ToUnixTime](./tounixtime/)() const | Mengembalikan nilai yang mewakili nilai tanggal dan waktu yang diwakili oleh objek saat ini sebagai Unix time. UNTUK PENGGUNAAN INTERNAL. |
| static [TryParse](./tryparse/)(const String\&, DateTime\&) | Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](./) yang setara. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](./) yang setara menggunakan informasi format spesifik budaya yang ditentukan dan gaya. |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParse](./tryparse/)(const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](./) yang setara menggunakan format yang ditentukan, informasi format spesifik budaya, dan gaya. Format representasi string harus cocok persis dengan format yang ditentukan. |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const String\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTime\&) | Mengonversi representasi string yang ditentukan dari nilai tanggal dan waktu menjadi objek [DateTime](./) yang setara menggunakan format yang ditentukan, informasi format spesifik budaya, dan gaya. Format representasi string harus cocok persis dengan satu atau lebih format yang ditentukan. |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles, DateTime\&) |  |
| static [TryParseExact](./tryparseexact/)(const String\&, const ArrayPtr\<String\>\&, std::nullptr_t, Globalization::DateTimeStyles, DateTime\&) |  |
| static [Type](./type/)() | Mengembalikan objek [TypeInfo](../typeinfo/) yang berisi informasi tentang kelas ini. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [MaxTicks](./maxticks/) | Jumlah 100-nanodetik dalam interval waktu antara nilai [DateTime](./) minimal yang mungkin dan maksimal yang mungkin. |
| static [MaxValue](./maxvalue/) | Sebuah instance kelas [DateTime](./) yang mewakili nilai tanggal dan waktu maksimal yang mungkin. |
| static constexpr [MinTicks](./minticks/) | Jumlah minimal tick yang dapat direpresentasikan oleh sebuah instance kelas [DateTime](./). |
| static [MinValue](./minvalue/) | Sebuah instance kelas [DateTime](./) yang merepresentasikan nilai tanggal dan waktu minimal yang mungkin. |
| static constexpr [TicksPerDay](./ticksperday/) | Jumlah tick dalam satu hari. |
| static constexpr [TicksPerHour](./ticksperhour/) | Jumlah tick dalam satu jam. |
| static constexpr [TicksPerMicrosecond](./tickspermicrosecond/) | Jumlah tick dalam satu mikrodetik. |
| static constexpr [TicksPerMillisecond](./tickspermillisecond/) | Jumlah tick dalam satu milidetik. |
| static constexpr [TicksPerMinute](./ticksperminute/) | Jumlah tick dalam satu menit. |
| static constexpr [TicksPerSecond](./tickspersecond/) | Jumlah tick dalam satu detik. |
| static [UnixEpoch](./unixepoch/) | Sebuah instance kelas [DateTime](./) yang merepresentasikan awal epoch Unix (1970.01.01 00:00:00). |
## Catatan



```cpp
#include "system/console.h"
#include "system/date_time.h"

int main()
{
  using namespace System;

  // Buat instance kelas 'DateTime'.
  DateTime dateTime{1990, 10, 30};

  // Cetak instance dalam berbagai format.
  Console::WriteLine(dateTime.ToShortDateString());
  Console::WriteLine(dateTime.ToShortTimeString());
  Console::WriteLine(dateTime.ToString());

  return 0;
}
/*
This code example produces the following output:
30.10.1990
0:00
30.10.1990 0:00:00
*/
```

## Lihat Juga

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
