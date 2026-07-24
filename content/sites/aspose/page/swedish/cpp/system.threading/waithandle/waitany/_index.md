---
title: "System::Threading::WaitHandle::WaitAny metod"
linktitle: "WaitAny"
second_title: "Aspose.Page för C++"
description: "System::Threading::WaitHandle::WaitAny metod. Väntar på att någon av handtagen ska triggas i C++."
type: docs
weight: 200
url: /sv/cpp/system.threading/waithandle/waitany/
---
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) method


Väntar på att någon av handtagen ska avfyras.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handtag att vänta på. |

### ReturnValue

Sant när varje element i waitHandles har mottagit en signal; annars returnerar metoden aldrig.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) method


Väntar på att någon av handtagen ska avfyras.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, int millisecondsTimeout)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handtag att vänta på. |
| millisecondsTimeout | int | [Timeout](../../timeout/) att vänta på, i millisekunder; -1 betyder oändlig väntan, 0 betyder kontroll‑och‑retur, positiva värden är tidsgränser. |

### ReturnValue

Sant om något handtag triggades, falskt om tidsgränsen överskreds.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## WaitHandle::WaitAny(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) method


Väntar på att någon av handtagen ska avfyras.

```cpp
static int System::Threading::WaitHandle::WaitAny(const System::ArrayPtr<System::SharedPtr<WaitHandle>> &waitHandles, TimeSpan timeout)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| waitHandles | const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\& | Handtag att vänta på. |
| timeout | TimeSpan | En [System::TimeSpan](../../../system/timespan/) som representerar antalet millisekunder att vänta, eller en [System::TimeSpan](../../../system/timespan/) som representerar -1 millisekunder för att vänta på obestämd tid. |

### ReturnValue

Sant om något handtag triggades, falskt om tidsgränsen överskreds.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WaitHandle](../)
* Class [TimeSpan](../../../system/timespan/)
* Class [WaitHandle](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
