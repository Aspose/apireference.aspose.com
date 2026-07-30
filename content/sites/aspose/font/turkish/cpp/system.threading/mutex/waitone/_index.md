---
title: "System::Threading::Mutex::WaitOne yöntemi"
linktitle: "WaitOne"
second_title: "Aspose.Font için C++"
description: "System::Threading::Mutex::WaitOne yöntemi. Mutex'i kilitler. Gerekirse C++'da sınırsız bekleme yapar."
type: docs
weight: 500
url: /tr/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Mutex'i kilitler. Gerekirse sınırsız bekleme yapar.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Her zaman true döner çünkü mutex kilitlenene kadar dönmez.

## Ayrıca Bakınız

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(int) method


Mutex'i kilitler. Gerekirse bekleme yapar.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| millisecondsTimeout | int | Milisaniye cinsinden bekleme zaman aşımı. |

### ReturnValue

Mutex kilitlendi ise true, zaman aşımı aşıldıysa false döner.

## Ayrıca Bakınız

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Mutex'i kilitler. Gerekirse bekleme yapar.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| timeout | TimeSpan | Beklenecek milisaniye sayısını temsil eden bir [System::TimeSpan](../../../system/timespan/), ya da süresiz beklemeyi temsil eden -1 milisaniyeyi gösteren bir [System::TimeSpan](../../../system/timespan/). |

### ReturnValue

Mutex kilitlendi ise true, zaman aşımı aşıldıysa false döner.

## Ayrıca Bakınız

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
