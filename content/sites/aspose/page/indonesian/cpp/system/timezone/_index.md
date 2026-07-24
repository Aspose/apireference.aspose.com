---
title: "System::TimeZone class"
linktitle: "TimeZone"
second_title: "Aspose.Page untuk C++"
description: "System::TimeZone class. Mewakili zona waktu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 6200
url: /id/cpp/system/timezone/
---
## TimeZone class


Mewakili zona waktu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class TimeZone : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [get_CurrentTimeZone](./get_currenttimezone/)() | Mengembalikan instance baru dari kelas [TimeZone](./) yang mewakili zona waktu saat ini. |
| virtual [get_DaylightName](./get_daylightname/)() const | Mengembalikan nama untuk daylight saving time zona waktu yang diwakili oleh objek saat ini. |
| virtual [get_StandardName](./get_standardname/)() const | Mengembalikan nama untuk waktu standar zona waktu yang diwakili oleh objek saat ini. |
| virtual [GetDaylightChanges](./getdaylightchanges/)(int32_t) | Mengembalikan periode daylight saving time untuk tahun tertentu. |
| virtual [GetUtcOffset](./getutcoffset/)(DateTime) | Mengembalikan offset UTC untuk waktu lokal yang ditentukan. |
| virtual [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) | Menentukan apakah nilai tanggal dan waktu yang diwakili oleh objek [DateTime](../datetime/) yang ditentukan berada dalam rentang daylight saving time untuk zona waktu yang diwakili oleh objek [TimeZone](./) saat ini. |
## Lihat Juga

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
