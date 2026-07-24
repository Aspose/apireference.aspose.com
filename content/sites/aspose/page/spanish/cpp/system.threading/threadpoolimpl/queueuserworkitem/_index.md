---
title: "System::Threading::ThreadPoolImpl::QueueUserWorkItem método"
linktitle: "QueueUserWorkItem"
second_title: "Aspose.Page para C++"
description: "System::Threading::ThreadPoolImpl::QueueUserWorkItem método. Añade una tarea a la cola en C++."
type: docs
weight: 700
url: /es/cpp/system.threading/threadpoolimpl/queueuserworkitem/
---
## ThreadPoolImpl::QueueUserWorkItem method


Agrega un elemento de trabajo a la cola.

```cpp
bool System::Threading::ThreadPoolImpl::QueueUserWorkItem(WaitCallback callback, const System::SharedPtr<System::Object> &state)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| callback | WaitCallback | Función de devolución de llamada para ejecutar. |
| estado | const System::SharedPtr\<System::Object\>\& | Argumento de la función de devolución de llamada. |

### ReturnValue

Siempre devuelve true.

## Ver también

* Typedef [WaitCallback](../../waitcallback/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [ThreadPoolImpl](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
