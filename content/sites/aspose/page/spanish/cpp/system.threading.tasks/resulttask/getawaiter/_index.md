---
title: "System::Threading::Tasks::ResultTask::GetAwaiter método"
linktitle: "GetAwaiter"
second_title: "Aspose.Page para C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter método. Obtiene un awaiter para esta tarea de resultado para usar con Await en C++."
type: docs
weight: 500
url: /es/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


Obtiene un awaiter para esta tarea de resultado para usar con Await.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## Observaciones



Cuando se espera, la coroutine se reanudará con el valor de resultado disponible

## Ver también

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
