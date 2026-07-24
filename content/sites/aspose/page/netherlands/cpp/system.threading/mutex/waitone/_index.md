---
title: "System::Threading::Mutex::WaitOne methode"
linktitle: "WaitOne"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Mutex::WaitOne methode. Vergrendelt de mutex. Voert onbeperkt wachten uit indien nodig in C++."
type: docs
weight: 500
url: /nl/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Vergrendelt mutex. Voert onbeperkt wachten uit indien nodig.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Retourneert altijd true omdat het niet terugkeert totdat de mutex vergrendeld is.

## Zie ook

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


Vergrendelt mutex. Voert wachten uit indien nodig.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| millisecondsTimeout | int | Wachttijd in milliseconden. |

### ReturnValue

Retourneert true als de mutex vergrendeld was of false als de time-out is overschreden.

## Zie ook

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Vergrendelt mutex. Voert wachten uit indien nodig.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| timeout | TimeSpan | Een [System::TimeSpan](../../../system/timespan/) die het aantal milliseconden om te wachten weergeeft, of een [System::TimeSpan](../../../system/timespan/) die -1 milliseconden weergeeft om onbeperkt te wachten. |

### ReturnValue

Retourneert true als de mutex vergrendeld was of false als de time-out is overschreden.

## Zie ook

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
