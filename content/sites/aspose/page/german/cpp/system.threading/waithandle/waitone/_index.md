---
title: "System::Threading::WaitHandle::WaitOne method"
linktitle: "WaitOne"
second_title: "Aspose.Page für C++"
description: "System::Threading::WaitHandle::WaitOne method. Wartet darauf, dass der Handle für unbegrenzte Zeit in C++ ausgelöst wird."
type: docs
weight: 600
url: /de/cpp/system.threading/waithandle/waitone/
---
## WaitHandle::WaitOne() method


Wartet unbegrenzt, bis das Handle ausgelöst wird.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne()
```


### ReturnValue

Gibt immer true zurück, da keine Zeitüberschreitung auftritt.

## Siehe auch

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int) method


Wartet, bis das Handle ausgelöst wird.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) zum Warten, in Millisekunden; -1 bedeutet unendliches Warten, 0 bedeutet prüfen und zurückkehren, positive Werte sind Zeitüberschreitungen. |

### ReturnValue

True, wenn der Handle ausgelöst wurde, false, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


Wartet, bis das Handle ausgelöst wird.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) zum Warten, in Millisekunden; -1 bedeutet unendliches Warten, 0 bedeutet prüfen und zurückkehren, positive Werte sind Zeitüberschreitungen. |
| exitContext | bool | Wenn true, sollte das Warten die Sperre des Handles vor dem Warten freigeben. |

### ReturnValue

True, wenn der Handle ausgelöst wurde, false, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


Wartet, bis das Handle ausgelöst wird.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| timeout | TimeSpan | Ein [System::TimeSpan](../../../system/timespan/), das die Anzahl der Millisekunden zum Warten darstellt, oder ein [System::TimeSpan](../../../system/timespan/), das -1 Millisekunden für unbegrenztes Warten darstellt. |

### ReturnValue

True, wenn der Handle ausgelöst wurde, false, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
