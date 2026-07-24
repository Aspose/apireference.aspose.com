---
title: "System::Threading::ThreadPool::QueueUserWorkItem metod"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page för C++"
description: "System::Threading::ThreadPool::QueueUserWorkItem metod. Lägger arbetsuppgift i kön som presenteras med en återuppringning utan parametrar i C++."
type: docs
weight: 600
url: /sv/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Lägger till arbetsobjekt i kö som finns med en callback utan parametrar.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| återanrop | WaitCallback | Återuppringningsfunktion som ska användas som ett jobb. |

### ReturnValue

Returnerar alltid true.

## Se även

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Lägger till arbetsobjekt i kö som finns med en callback utan parametrar.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| återanrop | WaitCallback | Återuppringningsfunktion som ska användas som ett jobb. |
| tillstånd | const System::SharedPtr\<System::Object\>\& | Jobbfunktionens parameter. |

### ReturnValue

Returnerar alltid true.

## Se även

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
