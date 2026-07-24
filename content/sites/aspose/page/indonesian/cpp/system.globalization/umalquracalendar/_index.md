---
title: "kelas System::Globalization::UmAlQuraCalendar"
linktitle: "UmAlQuraCalendar"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Globalization::UmAlQuraCalendar. Kalender Um Al Qura. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3000
url: /id/cpp/system.globalization/umalquracalendar/
---
## UmAlQuraCalendar class


Kalender Um Al Qura. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class UmAlQuraCalendar : public System::Globalization::Calendar
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
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Mendapatkan bulan kabisat untuk tahun yang ditentukan. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Informasi RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Memeriksa apakah hari adalah hari kabisat. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Memeriksa apakah hari adalah hari kabisat. |
| [IsLeapMonth](./isleapmonth/)(int, int, int) const override | Memeriksa apakah bulan adalah bulan kabisat. |
| virtual [IsLeapMonth](./isleapmonth/)(int, int) const | Memeriksa apakah bulan adalah bulan kabisat. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Memeriksa apakah tahun kabisat. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Memeriksa apakah tahun kabisat. |
| [set_TwoDigitYearMax](./set_twodigityearmax/)(int) override | Mengatur tahun terakhir yang dapat direpresentasikan dengan 2 digit. |
| [UmAlQuraCalendar](./umalquracalendar/)() | Konstruktor. |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static constexpr [UmAlQuraEra](./umalquraera/) | Era UmAlQura saat ini. |
## Lihat Juga

* Class [Calendar](../calendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
