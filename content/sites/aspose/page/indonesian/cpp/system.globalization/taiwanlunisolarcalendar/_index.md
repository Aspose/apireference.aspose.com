---
title: "Kelas System::Globalization::TaiwanLunisolarCalendar"
linktitle: "TaiwanLunisolarCalendar"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Globalization::TaiwanLunisolarCalendar. Kalender lunisolar Taiwan. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam penunjuk System::SmartPtr dan gunakan penunjuk ini untuk melewatkannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 2600
url: /id/cpp/system.globalization/taiwanlunisolarcalendar/
---
## TaiwanLunisolarCalendar class


Kalender lunisolar Taiwan. Tidak diimplementasikan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam penunjuk [System::SmartPtr](../../system/smartptr/) dan gunakan penunjuk ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class TaiwanLunisolarCalendar : public System::Globalization::EastAsianLunisolarCalendar
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clone](./clone/)() override | Informasi RTTI. |
| [get_Eras](./get_eras/)() const override | Mendapatkan daftar era yang ada dalam kalender. |
| [get_MaxSupportedDateTime](./get_maxsupporteddatetime/)() const override | Titik waktu maksimal yang didukung oleh kalender. |
| [get_MinSupportedDateTime](./get_minsupporteddatetime/)() const override | Titik waktu minimal yang didukung oleh kalender. |
| [GetDaysInMonth](./getdaysinmonth/)(int, int, int) const override | Mendapatkan jumlah hari dalam bulan tertentu. |
| virtual [GetDaysInMonth](./getdaysinmonth/)(int, int) const | Mendapatkan jumlah hari dalam bulan tertentu. |
| [GetEra](./getera/)(DateTime) const override | Mendapatkan era untuk titik waktu yang ditentukan. |
| [GetLeapMonth](./getleapmonth/)(int, int) const override | Mendapatkan bulan kabisat untuk tahun yang ditentukan. |
| virtual [GetLeapMonth](./getleapmonth/)(int) const | Mendapatkan bulan kabisat untuk tahun yang ditentukan. |
| [GetMonthsInYear](./getmonthsinyear/)(int, int) const override | Mendapatkan jumlah bulan dalam tahun yang ditentukan. |
| virtual [GetMonthsInYear](./getmonthsinyear/)(int) const | Informasi RTTI. |
| [IsLeapDay](./isleapday/)(int, int, int, int) const override | Memeriksa apakah hari adalah hari kabisat. |
| virtual [IsLeapDay](./isleapday/)(int, int, int) const | Memeriksa apakah hari adalah hari kabisat. |
| [IsLeapYear](./isleapyear/)(int, int) const override | Memeriksa apakah tahun kabisat. |
| virtual [IsLeapYear](./isleapyear/)(int) const | Memeriksa apakah tahun kabisat. |
| [TaiwanLunisolarCalendar](./taiwanlunisolarcalendar/)() | Konstruktor. |
## Lihat Juga

* Class [EastAsianLunisolarCalendar](../eastasianlunisolarcalendar/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
