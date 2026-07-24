---
title: "System::Globalization::HebrewCalendar class"
linktitle: "HebrewCalendar"
second_title: "Aspose.Page untuk C++"
description: "System::Globalization::HebrewCalendar class. Kalender Ibrani. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.globalization/hebrewcalendar/
---
## HebrewCalendar class


Kalendar Ibrani. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class HebrewCalendar : public System::Globalization::Calendar
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Informasi RTTI. |
| [get_AlgorithmType](./get_algorithmtype/)() const override | Mendapatkan tipe algoritma. |
| [get_Eras](./get_eras/)() const override | Mendapatkan daftar era yang ada dalam kalender. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Titik waktu maksimal yang didukung oleh kalender. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Titik waktu minimal yang didukung oleh kalender. |
| [GetDayOfWeek](./getdayofweek/)(DateTime) const override | Mendapatkan hari dalam minggu untuk titik waktu yang ditentukan. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Mendapatkan jumlah hari dalam bulan tertentu. |
| [GetEra](./getera/)(DateTime) const override | Mendapatkan era untuk titik waktu yang ditentukan. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Mendapatkan bulan kabisat untuk tahun yang ditentukan. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Informasi RTTI. |
| [GetMonth](./getmonth/)(DateTime) const override | Mendapatkan bulan untuk titik waktu yang ditentukan. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Mendapatkan jumlah bulan dalam tahun yang ditentukan. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Mendapatkan jumlah bulan dalam tahun yang ditentukan. |
| [HebrewCalendar](./hebrewcalendar/)() | Konstruktor. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Memeriksa apakah hari adalah hari kabisat. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Memeriksa apakah hari adalah hari kabisat. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Memeriksa apakah bulan adalah bulan kabisat. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Memeriksa apakah bulan adalah bulan kabisat. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Memeriksa apakah tahun kabisat. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Memeriksa apakah tahun kabisat. |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | Mengatur tahun terakhir yang dapat direpresentasikan dengan 2 digit. |
| [ToDateTime](./todatetime/)(int, int, int, int, int, int, int, int) const override | Membuat objek [DateTime](../../system/datetime/) dari komponen. |
| virtual [ToDateTime](./todatetime/)(int, int, int, int, int, int, int) const | Membuat objek [DateTime](../../system/datetime/) dari komponen. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [HebrewEra](./hebrewera/) | Era Ibrani saat ini. |
## Lihat Juga

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
