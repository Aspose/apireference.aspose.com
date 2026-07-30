---
title: "System::Threading::ThreadPool::QueueUserWorkItem-Methode"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font für C++"
description: "System::Threading::ThreadPool::QueueUserWorkItem-Methode. Fügt ein Arbeitselement in die Warteschlange ein, das einen Callback ohne Parameter in C++ verwendet."
type: docs
weight: 600
url: /de/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Legt ein Arbeitselement in die Warteschlange, das mit einem Callback ohne Parameter vorhanden ist.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | WaitCallback | Callback-Funktion, die als Job verwendet wird. |

### ReturnValue

Gibt immer true zurück.

## Siehe auch

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Legt ein Arbeitselement in die Warteschlange, das mit einem Callback ohne Parameter vorhanden ist.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | WaitCallback | Callback-Funktion, die als Job verwendet wird. |
| Zustand | const System::SharedPtr\<System::Object\>\& | Parameter der Job-Funktion. |

### ReturnValue

Gibt immer true zurück.

## Siehe auch

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
