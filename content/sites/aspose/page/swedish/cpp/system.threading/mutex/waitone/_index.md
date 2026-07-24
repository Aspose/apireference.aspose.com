---
title: "System::Threading::Mutex::WaitOne metod"
linktitle: "WaitOne"
second_title: "Aspose.Page för C++"
description: "System::Threading::Mutex::WaitOne metod. Låser mutexen. Utför obegränsad väntan om nödvändigt i C++."
type: docs
weight: 500
url: /sv/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Låser mutex. Utför obegränsad väntan om nödvändigt.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Returnerar alltid true eftersom den inte återvänder förrän mutexen är låst.

## Se även

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(int) method


Låser mutex. Utför väntan om nödvändigt.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| millisecondsTimeout | int | Väntetidsgräns i millisekunder. |

### ReturnValue

Returnerar true om mutexen var låst eller false om tidsgränsen överskreds.

## Se även

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Låser mutex. Utför väntan om nödvändigt.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| timeout | TimeSpan | En [System::TimeSpan](../../../system/timespan/) som representerar antalet millisekunder att vänta, eller en [System::TimeSpan](../../../system/timespan/) som representerar -1 millisekunder för att vänta på obestämd tid. |

### ReturnValue

Returnerar true om mutexen var låst eller false om tidsgränsen överskreds.

## Se även

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
