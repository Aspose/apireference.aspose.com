---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem metodo"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font per C++"
description: "System::Threading::ThreadPoolImpl::QueueUserWorkItem metodo. Aggiunge un'unità di lavoro alla coda in C++."
type: docs
weight: 700
url: /it/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


Aggiunge un elemento di lavoro alla coda.

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | WaitCallback | Funzione di callback da eseguire. |
| stato | const System::SharedPtr\<System::Object\>\& | Argomento della funzione di callback. |

### ReturnValue

Restituisce sempre true.

## Vedi anche

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
