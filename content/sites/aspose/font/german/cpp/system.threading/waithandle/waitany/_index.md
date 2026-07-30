---
title: "System::Threading::WaitHandle::WaitAny-Methode"
linktitle: "WaitAny"
second_title: "Aspose.Font für C++"
description: "System::Threading::WaitHandle::WaitAny-Methode. Wartet darauf, dass einer der Handles in C++ ausgelöst wird."
type: docs
weight: 200
url: /de/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Wartet, bis einer der Handles ausgelöst wird.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles, auf die gewartet werden soll. |

### ReturnValue

Wahr, wenn jedes Element in waitHandles ein Signal erhalten hat; andernfalls kehrt die Methode nie zurück.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Wartet, bis einer der Handles ausgelöst wird.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles, auf die gewartet werden soll. |
| millisecondsTimeout | int | [Timeout](../../timeout/) zum Warten, in Millisekunden; -1 bedeutet unendliches Warten, 0 bedeutet prüfen‑und‑zurückkehren, positive Werte sind Zeitüberschreitungen. |

### ReturnValue

Wahr, wenn irgendein Handle ausgelöst wurde, falsch, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Wartet, bis einer der Handles ausgelöst wird.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles, auf die gewartet werden soll. |
| timeout | TimeSpan | Ein [System::TimeSpan](../../../system/timespan/), das die Anzahl der Millisekunden zum Warten darstellt, oder ein [System::TimeSpan](../../../system/timespan/), das -1 Millisekunden für unbegrenztes Warten darstellt. |

### ReturnValue

Wahr, wenn irgendein Handle ausgelöst wurde, falsch, wenn die Zeitüberschreitung überschritten wurde.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
