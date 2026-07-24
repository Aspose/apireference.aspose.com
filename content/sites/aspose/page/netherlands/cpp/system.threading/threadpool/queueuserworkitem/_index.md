---
title: "System::Threading::ThreadPool::QueueUserWorkItem methode"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page voor C++"
description: "System::Threading::ThreadPool::QueueUserWorkItem methode. Plaatst een werkitem in de wachtrij die wordt gepresenteerd met een callback zonder parameters in C++."
type: docs
weight: 600
url: /nl/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Plaatst een werkitem in de wachtrij die aanwezig is met een callback zonder parameters.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callback | WaitCallback | Callback-functie die als taak moet worden gebruikt. |

### ReturnValue

Geeft altijd true terug.

## Zie ook

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Plaatst een werkitem in de wachtrij die aanwezig is met een callback zonder parameters.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| callback | WaitCallback | Callback-functie die als taak moet worden gebruikt. |
| state | const System::SharedPtr\<System::Object\>\& | Taakfunctieparameter. |

### ReturnValue

Geeft altijd true terug.

## Zie ook

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
