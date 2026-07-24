---
title: "System::Threading::Tasks::ResultTask::GetAwaiter metodo"
linktitle: "GetAwaiter"
second_title: "Aspose.Page per C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter metodo. Restituisce un awaiter per questo result task da usare con Await in C++."
type: docs
weight: 500
url: /it/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


Ottiene un awaiter per questo result task da utilizzare con Await.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## Osservazioni



Quando atteso, la coroutine riprenderà con il valore di risultato disponibile

## Vedi anche

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
