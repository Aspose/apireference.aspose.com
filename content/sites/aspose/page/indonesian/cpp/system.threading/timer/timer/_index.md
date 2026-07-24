---
title: "Konstruktor System::Threading::Timer::Timer"
linktitle: "Timer"
second_title: "Aspose.Page untuk C++"
description: "Konstruktor System::Threading::Timer::Timer. Konstruktor di C++."
type: docs
weight: 100
url: /id/cpp/system.threading/timer/timer/
---
## Timer::Timer(TimerCallback) constructor


Konstruktor.

```cpp
System::Threading::Timer::Timer(TimerCallback callback)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| callback | TimerCallback | Fungsi yang akan dipanggil oleh timer. |

## Lihat Juga

* Typedef [TimerCallback](../../timercallback/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, int64_t, int64_t) constructor


Konstruktor.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, int64_t dueTime, int64_t period)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| callback | TimerCallback | Fungsi yang akan dipanggil oleh timer. |
| state | const System::SharedPtr\<System::Object\>\& | Argumen fungsi callback. |
| dueTime | int64_t | [Timeout](../../timeout/) sebelum pemanggilan pertama fungsi callback, dalam milidetik; nilai negatif tidak menjadwalkan timer setelah pembuatan sehingga dapat dijadwalkan ulang nanti. |
| period | int64_t | [Timeout](../../timeout/) antara pemanggilan berurutan fungsi callback, dalam milidetik; nilai non-positif berarti timer hanya akan dijalankan sekali. |

## Lihat Juga

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Timer::Timer(TimerCallback, const System::SharedPtr\<System::Object\>\&, System::TimeSpan, System::TimeSpan) constructor


Konstruktor.

```cpp
System::Threading::Timer::Timer(TimerCallback callback, const System::SharedPtr<System::Object> &state, System::TimeSpan dueTime, System::TimeSpan period)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| callback | TimerCallback | Fungsi yang akan dipanggil oleh timer. |
| state | const System::SharedPtr\<System::Object\>\& | Argumen fungsi callback. |
| dueTime | System::TimeSpan | [Timeout](../../timeout/) sebelum pemanggilan pertama fungsi callback; nilai negatif tidak menjadwalkan timer setelah pembuatan sehingga dapat dijadwalkan ulang nanti. |
| period | System::TimeSpan | [Timeout](../../timeout/) antara pemanggilan berurutan fungsi callback; nilai non-positif berarti timer hanya akan dijalankan sekali. |

## Lihat Juga

* Typedef [TimerCallback](../../timercallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TimeSpan](../../../system/timespan/)
* Class [Timer](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
