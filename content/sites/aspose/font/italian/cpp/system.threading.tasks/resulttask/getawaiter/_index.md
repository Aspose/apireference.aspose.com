---
title: "Metodo System::Threading::Tasks::ResultTask::GetAwaiter"
linktitle: "GetAwaiter"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::ResultTask::GetAwaiter metodo. Ottiene un awaiter per questo result task da usare con Await in C++."
type: docs
weight: 600
url: /it/cpp/system.threading.tasks/resulttask/getawaiter/
---
## ResultTask::GetAwaiter method


Ottiene un awaiter per questo task di risultato da utilizzare con Await.

```cpp
Runtime::CompilerServices::ResultTaskAwaiter<T> System::Threading::Tasks::ResultTask<T>::GetAwaiter() const
```


### ReturnValue

[Runtime::CompilerServices::ResultTaskAwaiter<T>](../../../system.runtime.compilerservices/resulttaskawaiter/) An awaiter instance that returns the result
## Osservazioni



Quando atteso, la coroutine riprenderà con il valore del risultato disponibile

## Vedi anche

* Class [ResultTaskAwaiter](../../../system.runtime.compilerservices/resulttaskawaiter/)
* Class [ResultTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
