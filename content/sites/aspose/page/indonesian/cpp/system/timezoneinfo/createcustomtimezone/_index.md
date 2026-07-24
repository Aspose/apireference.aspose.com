---
title: "System::TimeZoneInfo::CreateCustomTimeZone method"
linktitle: "CreateCustomTimeZone"
second_title: "Aspose.Page untuk C++"
description: "System::TimeZoneInfo::CreateCustomTimeZone method. Membuat zona waktu khusus dalam C++."
type: docs
weight: 700
url: /id/cpp/system/timezoneinfo/createcustomtimezone/
---
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&) method


Membuat zona waktu khusus.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| id | const String\& | Pengidentifikasi zona waktu. |
| base_utc_offset | TimeSpan | Interval waktu antara waktu standar zona waktu saat ini dan waktu UTC. |
| display_name | const String\& | Nama tampilan. |
| standard_display_name | const String\& | Nama waktu standar. |

### ReturnValue

Zona waktu baru.

## Lihat Juga

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&) method


Membuat zona waktu khusus.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| id | const String\& | Pengidentifikasi zona waktu. |
| base_utc_offset | TimeSpan | Interval waktu antara waktu standar zona waktu saat ini dan waktu UTC. |
| display_name | const String\& | Nama tampilan. |
| standard_display_name | const String\& | Nama waktu standar. |
| daylight_display_name | const String\& | Nama waktu siang hari. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) dari aturan penyesuaian. |

### ReturnValue

Zona waktu baru.

## Lihat Juga

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## TimeZoneInfo::CreateCustomTimeZone(const String\&, TimeSpan, const String\&, const String\&, const String\&, const ArrayPtr\<AdjustmentRulePtr\>\&, bool) method


Membuat zona waktu khusus.

```cpp
static TimeZoneInfoPtr System::TimeZoneInfo::CreateCustomTimeZone(const String &id, TimeSpan base_utc_offset, const String &display_name, const String &standard_display_name, const String &daylight_display_name, const ArrayPtr<AdjustmentRulePtr> &adjustment_rules, bool disable_daylight_saving_time)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| id | const String\& | Pengidentifikasi zona waktu. |
| base_utc_offset | TimeSpan | Interval waktu antara waktu standar zona waktu saat ini dan waktu UTC. |
| display_name | const String\& | Nama tampilan. |
| standard_display_name | const String\& | Nama waktu standar. |
| daylight_display_name | const String\& | Nama waktu siang hari. |
| adjustment_rules | const ArrayPtr\<AdjustmentRulePtr\>\& | [Array](../../array/) dari aturan penyesuaian. |
| disable_daylight_saving_time | bool | True untuk membuang semua informasi daylight saving time yang ada dalam adjustment_rules. |

### ReturnValue

Zona waktu baru.

## Lihat Juga

* Typedef [TimeZoneInfoPtr](../../timezoneinfoptr/)
* Class [String](../../string/)
* Class [TimeSpan](../../timespan/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [AdjustmentRulePtr](../adjustmentruleptr/)
* Class [TimeZoneInfo](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
