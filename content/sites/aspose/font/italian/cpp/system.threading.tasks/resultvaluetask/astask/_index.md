---
title: "System::Threading::Tasks::ResultValueTask::AsTask metodo"
linktitle: "AsTask"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::ResultValueTask::AsTask metodo. Converte questo ResultValueTask in un puntatore condiviso a ResultTask<T> in C++."
type: docs
weight: 200
url: /it/cpp/system.threading.tasks/resultvaluetask/astask/
---
## ResultValueTask::AsTask method


Converte questo [ResultValueTask](../) in un puntatore condiviso a [ResultTask<T>](../../resulttask/).

```cpp
RTaskPtr<T> System::Threading::Tasks::ResultValueTask<T>::AsTask() const
```


### ReturnValue

[RTaskPtr<T>](../../../system/rtaskptr/) A shared pointer to a [ResultTask<T>](../../resulttask/) that represents this operation.
## Osservazioni



Se il [ResultValueTask](../) contiene un risultato diretto, crea un'attività completata con quel risultato. Se contiene un'attività, restituisce un puntatore condiviso a quell'attività.

## Vedi anche

* Typedef [RTaskPtr](../../../system/rtaskptr/)
* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
