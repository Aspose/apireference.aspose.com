---
title: "System::Threading::Mutex::WaitOne-Methode"
linktitle: "WaitOne"
second_title: "Aspose.Font für C++"
description: "System::Threading::Mutex::WaitOne-Methode. Sperrt das Mutex. Führt bei Bedarf unbegrenztes Warten in C++ aus."
type: docs
weight: 500
url: /de/cpp/system.threading/mutex/waitone/
---
## Mutex::WaitOne() method


Sperrt das Mutex. Führt bei Bedarf unbegrenztes Warten durch.

```cpp
virtual bool System::Threading::Mutex::WaitOne() override
```


### ReturnValue

Gibt immer true zurück, da es nicht zurückkehrt, bis das Mutex gesperrt ist.

## Siehe auch

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(int) method


Sperrt das Mutex. Führt bei Bedarf Warten durch.

```cpp
virtual bool System::Threading::Mutex::WaitOne(int millisecondsTimeout) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| millisecondsTimeout | int | Wartezeit-Timeout in Millisekunden. |

### ReturnValue

Gibt true zurück, wenn das Mutex gesperrt war, oder false, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## Mutex::WaitOne(TimeSpan) method


Sperrt das Mutex. Führt bei Bedarf Warten durch.

```cpp
virtual bool System::Threading::Mutex::WaitOne(TimeSpan timeout) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| timeout | TimeSpan | Ein [System::TimeSpan](../../../system/timespan/), das die Anzahl der Millisekunden zum Warten darstellt, oder ein [System::TimeSpan](../../../system/timespan/), das -1 Millisekunden für unbegrenztes Warten darstellt. |

### ReturnValue

Gibt true zurück, wenn das Mutex gesperrt war, oder false, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Class [TimeSpan](../../../system/timespan/)
* Class [Mutex](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
