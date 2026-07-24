---
title: "System::Globalization::GregorianCalendar kelas"
linktitle: "GregorianCalendar"
second_title: "Aspose.Page untuk C++"
description: "System::Globalization::GregorianCalendar class. Kalender Gregorian. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1000
url: /id/cpp/system.globalization/gregoriancalendar/
---
## GregorianCalendar class


Kalender Gregorian. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class GregorianCalendar : public System::Globalization::Calendar
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Informasi RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Mendapatkan tipe algoritma. |
| virtual [get_CalendarType](./get_calendartype/)() const | Mendapatkan tipe kalender Gregorian. |
| [get_Eras](./get_eras/)() const override | Mendapatkan daftar era yang ada dalam kalender. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Titik waktu maksimal yang didukung oleh kalender. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Titik waktu minimal yang didukung oleh kalender. |
| [GetDayOfMonth](./getdayofmonth/)(DateTime) const override | Mendapatkan hari dalam bulan untuk titik waktu yang ditentukan. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Mendapatkan hari dalam minggu untuk titik waktu yang ditentukan. |
| [GetDayOfYear](./getdayofyear/)(DateTime) const override | Mendapatkan hari dalam tahun untuk titik waktu yang ditentukan. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Mendapatkan jumlah hari dalam bulan tertentu. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Mendapatkan jumlah hari dalam bulan tertentu. |
| [GetDaysInYear](./getdaysinyear/)(int, int) const override | Mendapatkan jumlah hari dalam tahun tertentu. |
| virtual [GetDaysInYear](./getdaysinyear/)(int) const | Mendapatkan jumlah hari dalam tahun tertentu. |
| static [GetDefaultInstance](./getdefaultinstance/)() | Mendapatkan instance kalender Gregorian default. |
| [GetEra](./getera/)(DateTime) const override | Mendapatkan era untuk titik waktu yang ditentukan. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Mendapatkan bulan kabisat untuk tahun yang ditentukan. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Mendapatkan bulan kabisat untuk tahun yang ditentukan. |
| [GetMonth](./getmonth/)(DateTime) const override | Mendapatkan bulan untuk titik waktu yang ditentukan. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Mendapatkan jumlah bulan dalam tahun yang ditentukan. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Informasi RTTI. |
| [GetYear](./getyear/)(DateTime) const override | Mendapatkan tahun untuk titik waktu yang ditentukan. |
| [GregorianCalendar](./gregoriancalendar/)(GregorianCalendarTypes) | Membuat kalender Gregorian spesifik. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Memeriksa apakah hari adalah hari kabisat. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Memeriksa apakah hari adalah hari kabisat. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Memeriksa apakah bulan adalah bulan kabisat. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Memeriksa apakah bulan adalah bulan kabisat. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Memeriksa apakah tahun kabisat. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Memeriksa apakah tahun kabisat. |
| virtual [set_CalendarType](./set_calendartype/)(GregorianCalendarTypes) | Mengatur tipe kalender Gregorian. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Membuat objek [DateTime](../../system/datetime/) dari komponen. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Membuat objek [DateTime](../../system/datetime/) dari komponen. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [ADEra](./adera/) | Era saat ini. |
## Lihat Juga

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
