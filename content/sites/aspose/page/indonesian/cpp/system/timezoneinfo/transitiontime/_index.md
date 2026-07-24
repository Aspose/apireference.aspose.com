---
title: "kelas System::TimeZoneInfo::TransitionTime"
linktitle: "TransitionTime"
second_title: "Aspose.Page untuk C++"
description: "kelas System::TimeZoneInfo::TransitionTime. Informasi RTTI dalam C++."
type: docs
weight: 3400
url: /id/cpp/system/timezoneinfo/transitiontime/
---
## TransitionTime class


Informasi RTTI.

```cpp
class TransitionTime
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [CreateFixedDateRule](./createfixeddaterule/)(DateTime, int, int) | Membuat instance kelas [TransitionTime](./) yang mewakili aturan tanggal tetap (perubahan waktu yang terjadi pada hari tertentu dalam bulan tertentu). |
| static [CreateFloatingDateRule](./createfloatingdaterule/)(DateTime, int, int, DayOfWeek) | Membuat instance kelas [TransitionTime](./) yang mewakili aturan tanggal mengambang (perubahan waktu yang terjadi pada hari tertentu dalam minggu tertentu dari bulan tertentu). |
| static [CreateTransitionTime](./createtransitiontime/)(DateTime, int, int, int, DayOfWeek, bool) | Membuat instance kelas [TransitionTime](./) yang mewakili perubahan waktu yang dijelaskan dengan parameter yang ditentukan. |
| [get_Day](./get_day/)() const | Mengembalikan nomor urut hari dalam minggu ketika perubahan waktu terjadi. |
| [get_DayOfWeek](./get_dayofweek/)() const | Mengembalikan nilai yang mewakili hari dalam minggu ketika perubahan waktu terjadi. |
| [get_IsFixedDateRule](./get_isfixeddaterule/)() const | Mengembalikan nilai yang menunjukkan apakah perubahan waktu terjadi pada tanggal dan waktu tetap atau tanggal dan waktu mengambang. |
| [get_Month](./get_month/)() const | Mengembalikan nomor urut bulan dalam tahun ketika perubahan waktu terjadi. |
| [get_TimeOfDay](./get_timeofday/)() const | Mengembalikan objek [DateTime](../../datetime/) yang mewakili waktu spesifik ketika perubahan waktu terjadi. |
| [get_Week](./get_week/)() const | Mengembalikan nomor urut minggu dalam bulan ketika perubahan waktu terjadi. |
| [operator!=](./operator!=/)(const TransitionTime\&) const |  |
| [operator==](./operator==/)(const TransitionTime\&) const |  |
| [TransitionTime](./transitiontime/)() | Konstruktor default. UNTUK PENGGUNAAN INTERNAL. |
## Catatan


Memberikan informasi tentang perubahan waktu dalam zona waktu.
## Lihat Juga

* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
