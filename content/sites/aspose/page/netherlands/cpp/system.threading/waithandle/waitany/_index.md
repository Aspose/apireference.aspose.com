---
title: "System::Threading::WaitHandle::WaitAny methode"
linktitle: "WaitAny"
second_title: "Aspose.Page voor C++"
description: "System::Threading::WaitHandle::WaitAny methode. Wacht tot een van de handles wordt geactiveerd in C++."
type: docs
weight: 200
url: /nl/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Wacht tot een van de handles afgevuurd is.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles om op te wachten. |

### ReturnValue

Waar wanneer elk element in waitHandles een signaal heeft ontvangen; anders keert de methode nooit terug.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Wacht tot een van de handles afgevuurd is.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles om op te wachten. |
| millisecondsTimeout | int | [Timeout](../../timeout/) om op te wachten, in milliseconden; -1 betekent oneindig wachten, 0 betekent controleer-en-keer-terug, positieve waarden zijn time-outs. |

### ReturnValue

Waar als een handle is geactiveerd, onwaar als de time‑out is overschreden.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Wacht tot een van de handles afgevuurd is.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles om op te wachten. |
| timeout | TimeSpan | Een [System::TimeSpan](../../../system/timespan/) die het aantal milliseconden om te wachten weergeeft, of een [System::TimeSpan](../../../system/timespan/) die -1 milliseconden weergeeft om onbeperkt te wachten. |

### ReturnValue

Waar als een handle is geactiveerd, onwaar als de time‑out is overschreden.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
