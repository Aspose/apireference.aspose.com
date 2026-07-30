---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem Methode"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font für C++"
description: "System::Threading::ThreadPoolImpl::QueueUserWorkItem Methode. Fügt ein Arbeitselement zur Warteschlange in C++ hinzu."
type: docs
weight: 700
url: /de/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


Fügt ein Arbeitselement zur Warteschlange hinzu.

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Rückruf | WaitCallback | Callback-Funktion zum Ausführen. |
| Zustand | const System::SharedPtr\<System::Object\>\& | Argument der Callback-Funktion. |

### ReturnValue

Gibt immer true zurück.

## Siehe auch

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
