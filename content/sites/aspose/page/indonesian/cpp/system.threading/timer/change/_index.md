---
title: "Metode System::Threading::Timer::Change"
linktitle: "Ubah"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Threading::Timer::Change. Menjadwalkan ulang atau membatalkan timer di C++."
type: docs
weight: 200
url: /id/cpp/system.threading/timer/change/
---
## Timer::Change(int64_t, int64_t) method


Menjadwalkan ulang atau membatalkan timer.

```cpp
bool System::Threading::Timer::Change(int64_t dueTime, int64_t period)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dueTime | int64_t | [Timeout](../../timeout/) sebelum pemanggilan berikutnya dari fungsi callback, dalam milidetik; nilai negatif membatalkan timer bahkan jika sudah dijadwalkan. |
| period | int64_t | [Timeout](../../timeout/) antara pemanggilan berurutan fungsi callback, dalam milidetik; nilai non-positif berarti timer hanya akan dijalankan sekali. |

## Lihat Juga

* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Change(System::TimeSpan, System::TimeSpan) method


Menjadwalkan ulang atau membatalkan timer.

```cpp
bool System::Threading::Timer::Change(System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) sebelum pemanggilan berikutnya dari fungsi callback; nilai negatif membatalkan timer bahkan jika sudah dijadwalkan. |
| period | System::TimeSpan | [Timeout](../../timeout/) antara pemanggilan berurutan fungsi callback; nilai non-positif berarti timer hanya akan dijalankan sekali. |

## Lihat Juga

* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
