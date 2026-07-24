---
title: "System::Threading::ThreadPool::QueueUserWorkItem Methode"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page für C++"
description: "System::Threading::ThreadPool::QueueUserWorkItem Methode. Fügt ein Arbeitselement in die Warteschlange ein, das mit einem Callback ohne Parameter in C++ vorhanden ist."
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
| Rückruf | WaitCallback | Callback-Funktion, die als Auftrag verwendet wird. |

### ReturnValue

Gibt immer true zurück.

## Siehe auch

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Legt ein Arbeitselement in die Warteschlange, das mit einem Callback ohne Parameter vorhanden ist.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | WaitCallback | Callback-Funktion, die als Auftrag verwendet wird. |
| Zustand | const System::SharedPtr\<System::Object\>\& | Auftragsfunktionsparameter. |

### ReturnValue

Gibt immer true zurück.

## Siehe auch

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
