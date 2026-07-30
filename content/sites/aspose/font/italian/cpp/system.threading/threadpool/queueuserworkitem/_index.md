---
title: "Metodo System::Threading::ThreadPool::QueueUserWorkItem"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::ThreadPool::QueueUserWorkItem. Inserisce un elemento di lavoro nella coda, presentato con un callback senza parametri in C++."
type: docs
weight: 600
url: /it/cpp/system.threading/threadpool/queueuserworkitem/
---
## ThreadPool::QueueUserWorkItem(WaitCallback) method


Inserisce l'elemento di lavoro nella coda, presente con un callback senza parametri.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | WaitCallback | Funzione di callback da utilizzare come lavoro. |

### ReturnValue

Restituisce sempre true.

## Vedi anche

* Typedef [WaitCallback](../../waitcallback/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
## ThreadPool::QueueUserWorkItem(WaitCallback, const System::SharedPtr\<System::Object\>\&) method


Inserisce l'elemento di lavoro nella coda, presente con un callback senza parametri.

```cpp
static bool System::Threading::ThreadPool::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | WaitCallback | Funzione di callback da utilizzare come lavoro. |
| stato | const System::SharedPtr\<System::Object\>\& | Parametro della funzione di lavoro. |

### ReturnValue

Restituisce sempre true.

## Vedi anche

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPool](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
