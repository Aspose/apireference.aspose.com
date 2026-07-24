---
title: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule method"
linktitle: "CreateAdjustmentRule"
second_title: "Aspose.Page untuk C++"
description: "System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule method. Membuat sebuah instance dari kelas AdjustmentRule yang mewakili aturan penyesuaian waktu yang dijelaskan dengan parameter yang ditentukan dalam C++."
type: docs
weight: 1000
url: /id/cpp/system/timezoneinfo/adjustmentrule/createadjustmentrule/
---
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&) method


Membuat sebuah instance dari kelas [AdjustmentRule](../) yang mewakili aturan penyesuaian waktu yang dijelaskan dengan parameter yang ditentukan.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| date_start | DateTime | Tanggal dan waktu ketika aturan penyesuaian mulai berlaku. |
| date_end | DateTime | Tanggal dan waktu ketika aturan penyesuaian tidak lagi berlaku. |
| daylight_delta | TimeSpan | Jumlah waktu yang diperlukan untuk membentuk waktu siang hari zona waktu. |
| daylight_transition_start | const TransitionTime\& | Informasi tentang transisi dari waktu siang hari ke waktu standar. |
| daylight_transition_end | const TransitionTime\& | Informasi tentang transisi dari waktu standar ke waktu siang hari. |

### ReturnValue

Sebuah instance dari kelas [AdjustmentRule](../) yang mewakili aturan penyesuaian zona waktu yang dijelaskan.

## Lihat Juga

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
## AdjustmentRule::CreateAdjustmentRule(DateTime, DateTime, TimeSpan, const TransitionTime\&, const TransitionTime\&, TimeSpan, bool) method


Membuat sebuah instance dari kelas [AdjustmentRule](../) yang mewakili aturan penyesuaian waktu yang dijelaskan dengan parameter yang ditentukan.

```cpp
static AdjustmentRulePtr System::TimeZoneInfo::AdjustmentRule::CreateAdjustmentRule(DateTime date_start, DateTime date_end, TimeSpan daylight_delta, const TransitionTime &daylight_transition_start, const TransitionTime &daylight_transition_end, TimeSpan base_utc_offset_delta, bool no_daylight_transitions)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| date_start | DateTime | Tanggal dan waktu ketika aturan penyesuaian mulai berlaku. |
| date_end | DateTime | Tanggal dan waktu ketika aturan penyesuaian tidak lagi berlaku. |
| daylight_delta | TimeSpan | Jumlah waktu yang diperlukan untuk membentuk waktu siang hari zona waktu. |
| daylight_transition_start | const TransitionTime\& | Informasi tentang transisi dari waktu siang hari ke waktu standar. |
| daylight_transition_end | const TransitionTime\& | Informasi tentang transisi dari waktu standar ke waktu siang hari. |
| base_utc_offset_delta | TimeSpan | Delta dari offset UTC default. |
| no_daylight_transitions | bool | Menentukan apakah aturan penyesuaian mengasumsikan transisi ke waktu siang hari. |

### ReturnValue

Sebuah instance dari kelas [AdjustmentRule](../) yang mewakili aturan penyesuaian zona waktu yang dijelaskan.

## Lihat Juga

* Typedef [AdjustmentRulePtr](../../adjustmentruleptr/)
* Class [DateTime](../../../datetime/)
* Class [TimeSpan](../../../timespan/)
* Class [TransitionTime](../../transitiontime/)
* Class [AdjustmentRule](../)
* Class [TimeZoneInfo](../../)
* Namespace [System](../../../)
* Library [Aspose.Page for C++](../../../../)
