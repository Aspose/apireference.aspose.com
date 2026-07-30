---
title: "System::Threading::WaitHandle::WaitOne-Methode"
linktitle: "WaitOne"
second_title: "Aspose.Font für C++"
description: "System::Threading::WaitHandle::WaitOne-Methode. Wartet darauf, dass das Handle für unbegrenzte Zeit in C++ ausgelöst wird."
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

Gibt immer wahr zurück, da keine Zeitüberschreitung auftritt.

## Siehe auch

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int) method


Wartet, bis das Handle ausgelöst wird.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) zum Warten, in Millisekunden; -1 bedeutet unendliches Warten, 0 bedeutet prüfen‑und‑zurückkehren, positive Werte sind Zeitüberschreitungen. |

### ReturnValue

Wahr, wenn das Handle ausgelöst wurde, falsch, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(int, bool) method


Wartet, bis das Handle ausgelöst wird.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(int millisecondsTimeout, bool exitContext)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| millisecondsTimeout | int | [Timeout](../../timeout/) zum Warten, in Millisekunden; -1 bedeutet unendliches Warten, 0 bedeutet prüfen‑und‑zurückkehren, positive Werte sind Zeitüberschreitungen. |
| exitContext | bool | Wenn wahr, sollte das Warten die Sperre des Handles vor dem Warten freigeben. |

### ReturnValue

Wahr, wenn das Handle ausgelöst wurde, falsch, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitOne(TimeSpan) method


Wartet, bis das Handle ausgelöst wird.

```cpp
virtual bool System::Threading::WaitHandle::WaitOne(TimeSpan timeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| timeout | TimeSpan | Ein [System::TimeSpan](../../../system/timespan/), das die Anzahl der Millisekunden zum Warten darstellt, oder ein [System::TimeSpan](../../../system/timespan/), das -1 Millisekunden für unbegrenztes Warten darstellt. |

### ReturnValue

Wahr, wenn das Handle ausgelöst wurde, falsch, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
