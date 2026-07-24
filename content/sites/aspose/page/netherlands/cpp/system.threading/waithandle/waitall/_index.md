---
title: "System::Threading::WaitHandle::WaitAll method"
linktitle: "WaitAll"
second_title: "Aspose.Page voor C++"
description: "System::Threading::WaitHandle::WaitAll method. Wacht tot alle handles afgevuurd zijn in C++."
type: docs
weight: 100
url: /nl/cpp/system.threading/waithandle/waitall/
---
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Wacht tot alle handles afgevuurd zijn.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
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
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


RTTI-informatie.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles om op te wachten. |
| millisecondsTimeout | int | [Timeout](../../timeout/) om op te wachten, in milliseconden; -1 betekent oneindig wachten, 0 betekent controleer-en-keer-terug, positieve waarden zijn time-outs. |

### ReturnValue

Waar als alle handles afgevuurd zijn, onwaar als time-out overschreden.
## Opmerkingen


Wacht tot alle handles afgevuurd zijn.
## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAll(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Wacht tot alle handles afgevuurd zijn.

```cpp
static bool System::Threading::WaitHandle::WaitAll(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handles om op te wachten. |
| timeout | TimeSpan | Een [System::TimeSpan](../../../system/timespan/) die het aantal milliseconden om te wachten weergeeft, of een [System::TimeSpan](../../../system/timespan/) die -1 milliseconden weergeeft om onbeperkt te wachten. |

### ReturnValue

Waar als alle handles afgevuurd zijn, onwaar als time-out overschreden.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
