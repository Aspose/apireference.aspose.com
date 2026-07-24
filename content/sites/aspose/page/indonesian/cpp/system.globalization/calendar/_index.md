---
title: "kelas System::Globalization::Calendar"
linktitle: "Kalender"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Globalization::Calendar. Kalender yang mendefinisikan bagaimana tanggal ditangani, dihitung, diformat, dll. Operasi setter hanya diaktifkan pada objek yang tidak read-only. Objek dari kelas ini harus hanya dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 100
url: /id/cpp/system.globalization/calendar/
---
## Calendar class


[Calendar](./) which defines how the dates are handled, calculated, formatted, etc. Setter operations are only enabled on non-read-only objects. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class Calendar : public System::ICloneable
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [AddDays](./adddays/)(DateTime, int) const | Menambahkan hari ke titik waktu. |
| virtual [AddHours](./addhours/)(DateTime, int) const | Menambahkan jam ke titik waktu. |
| virtual [AddMilliseconds](./addmilliseconds/)(DateTime, double) const | Menambahkan milidetik ke titik waktu. |
| virtual [AddMinutes](./addminutes/)(DateTime, int) const | Menambahkan menit ke titik waktu. |
| virtual [AddMonths](./addmonths/)(DateTime, int) const | Menambahkan bulan ke titik waktu. |
| virtual [AddSeconds](./addseconds/)(DateTime, int) const | Menambahkan detik ke titik waktu. |
| virtual [AddWeeks](./addweeks/)(DateTime, int) const | Menambahkan minggu ke titik waktu. |
| virtual [AddYears](./addyears/)(DateTime, int) const | Menambahkan tahun ke titik waktu. |
| [Calendar](./calendar/)(const Calendar\&) | Informasi RTTI. |
| virtual [get_AlgorithmType](./get_algorithmtype/)() const | Mendapatkan tipe algoritma. |
| [get_CurrentEra](./get_currentera/)() const | Mendapatkan indeks era saat ini. |
| [get_CurrentEraValue](./get_currenteravalue/)() const | Mendapatkan nilai era saat ini. |
| virtual [get_Eras](./get_eras/)() const | Mendapatkan daftar era yang ada dalam kalender. |
| virtual [get_ID](./get_id/)() const | Mendapatkan pengenal kalender. |
| [get_IsReadOnly](./get_isreadonly/)() const | Memeriksa apakah kalender hanya baca. |
| virtual [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const | Titik waktu maksimal yang didukung oleh kalender. |
| virtual [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const | Titik waktu minimal yang didukung oleh kalender. |
| virtual [get_TwoDigitYearMax](./get_twodigityearmax/)() const | Mendapatkan tahun terakhir yang dapat direpresentasikan dengan 2 digit. |
| virtual [GetDayOfMonth](./getdayofmonth/)(DateTime) const | Mendapatkan hari dalam bulan untuk titik waktu yang ditentukan. |
| virtual [GetDayOfWeek](./getdayofweek/)(DateTime) const | Mendapatkan hari dalam minggu untuk titik waktu yang ditentukan. |
| virtual [GetDayOfYear](./getdayofyear/)(DateTime) const | Mendapatkan hari dalam tahun untuk titik waktu yang ditentukan. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Mendapatkan jumlah hari dalam bulan tertentu. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const | Mendapatkan jumlah hari dalam bulan tertentu. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Mendapatkan jumlah hari dalam tahun tertentu. |
| virtual [GetDaysInYear](./getdaysinyear/)(int, int) const | Mendapatkan jumlah hari dalam tahun tertentu. |
| virtual [GetEra](./getera/)(DateTime) const | Mendapatkan era untuk titik waktu yang ditentukan. |
| virtual [GetHour](./gethour/)(DateTime) const | Mendapatkan jam untuk titik waktu yang ditentukan. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Mendapatkan bulan kabisat untuk tahun yang ditentukan. |
| virtual [GetLeapMonth](./getleapmonth/)(int, int) const | Mendapatkan bulan kabisat untuk tahun yang ditentukan. |
| virtual [GetMilliseconds](./getmilliseconds/)(DateTime) const | Mendapatkan milidetik untuk titik waktu yang ditentukan. |
| virtual [GetMinute](./getminute/)(DateTime) const | Mendapatkan menit untuk titik waktu yang ditentukan. |
| virtual [GetMonth](./getmonth/)(DateTime) const | Mendapatkan bulan untuk titik waktu yang ditentukan. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Mendapatkan jumlah bulan dalam tahun yang ditentukan. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int, int) const | Mendapatkan jumlah bulan dalam tahun yang ditentukan. |
| virtual [GetSecond](./getsecond/)(DateTime) const | Mendapatkan detik untuk titik waktu yang ditentukan. |
| virtual [GetWeekOfYear](./getweekofyear/)(DateTime, CalendarWeekRule, DayOfWeek) const | Mendapatkan minggu dalam tahun untuk titik waktu yang ditentukan. |
| virtual [GetYear](./getyear/)(DateTime) const | Mendapatkan tahun untuk titik waktu yang ditentukan. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Memeriksa apakah hari adalah hari kabisat. |
| virtual [IsLeapDay](./isleapday/)(int, int, int, int) const | Memeriksa apakah hari adalah hari kabisat. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Memeriksa apakah bulan adalah bulan kabisat. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int, int) const | Memeriksa apakah bulan adalah bulan kabisat. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Memeriksa apakah tahun kabisat. |
| virtual [IsLeapYear](./isleapyear/)(int, int) const | Memeriksa apakah tahun kabisat. |
| [IsValidDay](./isvalidday/)(int, int, int, int) const | Memeriksa nilai tahun, bulan, hari, dan era. |
| [operator=](./operator=/)(const Calendar\&) |  |
| static [ReadOnly](./readonly/)(const CalendarPtr\&) | Mendapatkan versi kalender yang hanya baca. |
| virtual [set_TwoDigitYearMax](./set_twodigityearmax/)(int) | Mengatur tahun terakhir yang dapat direpresentasikan dengan 2 digit. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Membuat objek [DateTime](../../system/datetime/) dari komponen. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const | Membuat objek [DateTime](../../system/datetime/) dari komponen. |
| virtual [ToFourDigitYear](./tofourdigityear/)(int) const | Mengonversi tahun menjadi tahun 4 digit menggunakan properti TwoDigitYearMax. |
## Lihat Juga

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
