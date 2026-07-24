---
title: "Metodo System::Threading::ThreadPoolImpl::QueueUserWorkItem"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page per C++"
description: "Metodo System::Threading::ThreadPoolImpl::QueueUserWorkItem. Aggiunge un elemento di lavoro alla coda in C++."
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
| state | const System::SharedPtr\<System::Object\>\& | Argomento della funzione di callback. |

### ReturnValue

Restituisce sempre true.

## Vedi anche

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
