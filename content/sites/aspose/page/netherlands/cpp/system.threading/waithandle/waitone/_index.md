---
title: "System::Threading::WaitHandle::WaitOne method"
linktitle: "WaitOne"
second_title: "Aspose.Page voor C++"
description: "System::Threading::WaitHandle::WaitOne method. Wacht tot de handle afvuurt voor een onbeperkte periode in C++."
type: docs
weight: 600
url: /nl/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


Wacht tot de handle wordt geactiveerd voor een onbeperkte periode.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

Geeft altijd waar terug omdat er geen time-out optreedt.

## Zie ook

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


Wacht tot de handle wordt geactiveerd.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) om op te wachten, in milliseconden; -1 betekent oneindig wachten, 0 betekent controleer-en-keer-terug, positieve waarden zijn time-outs. |

### ReturnValue

Waar als handle afgevuurd is, onwaar als time-out overschreden.

## Zie ook

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


Wacht tot de handle wordt geactiveerd.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) om op te wachten, in milliseconden; -1 betekent oneindig wachten, 0 betekent controleer-en-keer-terug, positieve waarden zijn time-outs. |
| exitContext | bool | Als waar, moet wachten de lock op de handle laten vallen voordat erop gewacht wordt. |

### ReturnValue

Waar als handle afgevuurd is, onwaar als time-out overschreden.

## Zie ook

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


Wacht tot de handle wordt geactiveerd.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| timeout | TimeSpan | Een [System::TimeSpan](../../../system/timespan/) die het aantal milliseconden om te wachten weergeeft, of een [System::TimeSpan](../../../system/timespan/) die -1 milliseconden weergeeft om onbeperkt te wachten. |

### ReturnValue

Waar als handle afgevuurd is, onwaar als time-out overschreden.

## Zie ook

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
