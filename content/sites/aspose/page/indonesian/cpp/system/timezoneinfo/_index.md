---
title: "kelas System::TimeZoneInfo"
linktitle: "TimeZoneInfo"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::TimeZoneInfo. Mewakili informasi yang menggambarkan zona waktu tertentu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 6300
url: /id/cpp/system/timezoneinfo/
---
## TimeZoneInfo class


Mewakili informasi yang menggambarkan zona waktu tertentu. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class TimeZoneInfo : public System::IEquatable<TimeZoneInfoPtr>
```

## Nested classes

* Class [AdjustmentRule](./adjustmentrule/)
* Class [TransitionTime](./transitiontime/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| static [ClearCachedData](./clearcacheddata/)() | Bersihkan data zona waktu yang di-cache. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) waktu dari satu zona waktu ke zona waktu lain. |
| static [ConvertTime](./converttime/)(const DateTimeOffset\&, const TimeZoneInfoPtr\&) | [Convert](../convert/) waktu ke waktu dalam zona waktu yang ditentukan. |
| static [ConvertTime](./converttime/)(DateTime, const TimeZoneInfoPtr\&) | [Convert](../convert/) waktu ke waktu dalam zona waktu yang ditentukan. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&) | [Convert](../convert/) waktu ke waktu dalam zona waktu yang ditentukan. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(const DateTimeOffset\&, const String\&) | [Convert](../convert/) waktu ke waktu dalam zona waktu yang ditentukan. |
| static [ConvertTimeBySystemTimeZoneId](./converttimebysystemtimezoneid/)(DateTime, const String\&, const String\&) | [Convert](../convert/) waktu ke waktu dalam zona waktu yang ditentukan. |
| static [ConvertTimeFromUtc](./converttimefromutc/)(DateTime, const TimeZoneInfoPtr\&) | Mengonversi waktu UTC ke waktu dalam zona waktu yang ditentukan. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime, const TimeZoneInfoPtr\&) | Mengonversi waktu ke waktu UTC. |
| static [ConvertTimeToUtc](./converttimetoutc/)(DateTime) | Mengonversi waktu ke waktu UTC. |
| static [ConvertTimeToUtcNoThrow](./converttimetoutcnothrow/)(DateTime) | Mengonversi waktu ke waktu UTC. UNTUK PENGGUNAAN INTERNAL. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) | Membuat zona waktu khusus. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) | Membuat zona waktu khusus. |
| static [CreateCustomTimeZone](./createcustomtimezone/)(const String\&, TimeSpan, const String\&, const String\&) | Membuat zona waktu khusus. |
| [Equals](./equals/)(SharedPtr\<Object\>) override |  |
| [Equals](./equals/)(TimeZoneInfoPtr) override | Menentukan apakah objek saat ini dan objek yang ditentukan sama. |
| static [FindSystemTimeZoneById](./findsystemtimezonebyid/)(const String\&) | Mendapatkan zona waktu dengan identifier yang ditentukan. |
| [get_BaseUtcOffset](./get_baseutcoffset/)() const | Mengembalikan sebuah instance dari [TimeSpan](../timespan/) yang mewakili interval waktu antara waktu standar zona waktu saat ini dan waktu UTC. |
| [get_DaylightName](./get_daylightname/)() const | Mendapatkan nama untuk daylight saving time zona waktu saat ini. |
| [get_DisplayName](./get_displayname/)() const | Mendapatkan nama untuk zona waktu saat ini. |
| [get_Id](./get_id/)() const | Mengembalikan identifier zona waktu yang diwakili oleh objek saat ini. |
| static [get_Local](./get_local/)() | Mengembalikan sebuah instance dari [TimeZoneInfo](./) yang mewakili zona waktu lokal. |
| [get_StandardName](./get_standardname/)() const | Mendapatkan nama untuk waktu standar zona waktu saat ini. |
| [get_SupportsDaylightSavingTime](./get_supportsdaylightsavingtime/)() const | Mendapatkan flag yang menunjukkan apakah zona waktu memiliki aturan daylight saving time. |
| static [get_Utc](./get_utc/)() | Mengembalikan sebuah instance dari [TimeZoneInfo](./) yang mewakili zona waktu UTC. |
| [GetAdjustmentRules](./getadjustmentrules/)() const | Mengembalikan sebuah array yang terdiri dari objek [AdjustmentRule](./adjustmentrule/) yang mewakili aturan penyesuaian yang berlaku pada objek [TimeZoneInfo](./) saat ini. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(DateTime) const | Mendapatkan tanggal dan waktu UTC yang dapat dipetakan dari tanggal dan waktu yang ditentukan. |
| [GetAmbiguousTimeOffsets](./getambiguoustimeoffsets/)(const DateTimeOffset\&) const | Mendapatkan tanggal dan waktu UTC yang dapat dipetakan dari tanggal dan waktu yang ditentukan. |
| [GetHashCode](./gethashcode/)() const override | Analog dari metode C# [Object.GetHashCode()](../object/gethashcode/). Memungkinkan hashing objek khusus. |
| static [GetSystemTimeZones](./getsystemtimezones/)() | Mendapatkan koleksi terurut dari semua zona waktu yang tersedia pada sistem lokal. |
| [GetUtcOffset](./getutcoffset/)(DateTime) const | Menghitung selisih antara waktu di zona waktu ini dengan zona waktu UTC untuk tanggal dan waktu yang ditentukan. |
| [GetUtcOffset](./getutcoffset/)(const DateTimeOffset\&) const | Menghitung selisih antara waktu di zona waktu ini dengan zona waktu UTC untuk tanggal dan waktu yang ditentukan. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&) | Fungsi pembantu internal yang mengembalikan offset UTC untuk datetime UTC dalam zona waktu yang ditentukan. UNTUK PENGGUNAAN INTERNAL. |
| static [GetUtcOffsetFromUtc](./getutcoffsetfromutc/)(DateTime, const TimeZoneInfoPtr\&, bool\&, bool\&) | Fungsi pembantu internal yang mengembalikan offset UTC untuk datetime UTC dalam zona waktu yang ditentukan. UNTUK PENGGUNAAN INTERNAL. |
| [GetUtcOffsetNoThrow](./getutcoffsetnothrow/)(DateTime) const | Menghitung selisih antara waktu di zona waktu ini dengan zona waktu UTC untuk tanggal dan waktu yang ditentukan. UNTUK PENGGUNAAN INTERNAL. |
| [HasSameRules](./hassamerules/)(const TimeZoneInfoPtr\&) const | Memeriksa apakah zona waktu saat ini dan zona waktu lain memiliki aturan penyesuaian yang sama. |
| [IsAmbiguousTime](./isambiguoustime/)(DateTime) const | Memeriksa apakah tanggal dan waktu yang ditentukan ambigu dan dapat dipetakan ke banyak waktu UTC. |
| [IsAmbiguousTime](./isambiguoustime/)(const DateTimeOffset\&) const | Memeriksa apakah tanggal dan waktu yang ditentukan ambigu dan dapat dipetakan ke banyak waktu UTC. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(DateTime) const | Memeriksa apakah tanggal dan waktu yang ditentukan berada dalam rentang waktu daylight saving. |
| [IsDaylightSavingTime](./isdaylightsavingtime/)(const DateTimeOffset\&) const | Memeriksa apakah tanggal dan waktu yang ditentukan berada dalam rentang waktu daylight saving. |
| [IsDaylightSavingTimeNoThrow](./isdaylightsavingtimenothrow/)(DateTime) const | Memeriksa apakah tanggal dan waktu yang ditentukan berada dalam rentang waktu daylight saving. |
| [IsInvalidTime](./isinvalidtime/)(DateTime) const | Memeriksa apakah tanggal dan waktu yang ditentukan tidak valid. |
| [ToString](./tostring/)() const override | Analog dari metode C# [Object.ToString()](../object/tostring/). Memungkinkan konversi objek khusus menjadi string. |
| static [TransitionTimeToDateTime](./transitiontimetodatetime/)(int32_t, const TransitionTime\&) | Fungsi pembantu yang mengonversi tahun dan [TransitionTime](./transitiontime/) menjadi [DateTime](../datetime/). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [AdjustmentRulePtr](./adjustmentruleptr/) | Alias untuk pointer bersama ke sebuah instance kelas [AdjustmentRule](./adjustmentrule/). |
## Lihat Juga

* Class [IEquatable](../iequatable/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
