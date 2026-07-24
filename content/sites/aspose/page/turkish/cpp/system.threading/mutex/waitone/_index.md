---
title: "System::Threading::Mutex::WaitOne yöntemi"
linktitle: "WaitOne"
second_title: "Aspose.Page için C++"
description: "System::Threading::Mutex::WaitOne yöntemi. Mutex'i kilitler. Gerekirse C++'ta sınırsız bekleme yapar."
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
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


Mutex'i kilitler. Gerekirse bekleme yapar.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| millisecondsTimeout | int | Milisaniye cinsinden bekleme zaman aşımı. |

### ReturnValue

Mutex kilitlendiyse true, zaman aşımı aşıldıysa false döner.

## Ayrıca Bakınız

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Mutex'i kilitler. Gerekirse bekleme yapar.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| timeout | TimeSpan | Beklenecek milisaniye sayısını temsil eden bir [System::TimeSpan](../../../system/timespan/), ya da -1 milisaniyeyi temsil ederek süresiz beklemeyi gösteren bir [System::TimeSpan](../../../system/timespan/). |

### ReturnValue

Mutex kilitlendiyse true, zaman aşımı aşıldıysa false döner.

## Ayrıca Bakınız

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
