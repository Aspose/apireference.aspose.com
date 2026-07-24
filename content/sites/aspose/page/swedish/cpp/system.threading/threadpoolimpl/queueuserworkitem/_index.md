---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem metod"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page för C++"
description: "System::Threading::ThreadPoolImpl::QueueUserWorkItem metod. Lägger till arbetsuppgift i kön i C++."
type: docs
weight: 700
url: /sv/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


Lägger till arbetsobjekt i kö.

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| återanrop | WaitCallback | Callback-funktion att köra. |
| tillstånd | const System::SharedPtr\<System::Object\>\& | Argument till callback-funktion. |

### ReturnValue

Returnerar alltid true.

## Se även

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
