---
title: "Kelas System::TimeZoneInfo::AdjustmentRule"
linktitle: "AdjustmentRule"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::TimeZoneInfo::AdjustmentRule. Menyediakan informasi tentang penyesuaian zona waktu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 3300
url: /id/cpp/system/timezoneinfo/adjustmentrule/
---
## AdjustmentRule class


Menyediakan informasi tentang penyesuaian zona waktu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu balut kelas ini ke dalam pointer [System::SmartPtr](../../smartptr/) dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class AdjustmentRule : public System::IEquatable<AdjustmentRulePtr>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) | Membuat sebuah instance dari kelas [AdjustmentRule](./) yang mewakili aturan penyesuaian waktu yang dijelaskan dengan parameter yang ditentukan. |
| static [CreateAdjustmentRule](./createadjustmentrule/)(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) | Membuat sebuah instance dari kelas [AdjustmentRule](./) yang mewakili aturan penyesuaian waktu yang dijelaskan dengan parameter yang ditentukan. |
| [Equals](./equals/)(AdjustmentRulePtr) override |  |
| [get_BaseUtcOffsetDelta](./get_baseutcoffsetdelta/)() const | Mengembalikan delta dari offset UTC default. |
| [get_DateEnd](./get_dateend/)() const | Mengembalikan objek [DateTime](../../datetime/) yang mewakili tanggal dan waktu ketika aturan penyesuaian tidak lagi berlaku. |
| [get_DateStart](./get_datestart/)() const | Mengembalikan objek [DateTime](../../datetime/) yang mewakili tanggal dan waktu ketika aturan penyesuaian mulai berlaku. |
| [get_DaylightDelta](./get_daylightdelta/)() const | Mengembalikan objek [TimeSpan](../../timespan/) yang mewakili jumlah waktu yang diperlukan untuk membentuk waktu siang hari zona waktu. |
| [get_DaylightTransitionEnd](./get_daylighttransitionend/)() const | Mengembalikan informasi tentang transisi dari waktu standar ke waktu siang hari. |
| [get_DaylightTransitionStart](./get_daylighttransitionstart/)() const | Mengembalikan informasi tentang transisi dari waktu siang hari ke waktu standar. |
| [get_HasDaylightSaving](./get_hasdaylightsaving/)() const | UNTUK PENGGUNAAN INTERNAL. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../../object/gethashcode/). Memungkinkan hashing objek kustom. |
## Lihat Juga

* Class [IEquatable](../../iequatable/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
