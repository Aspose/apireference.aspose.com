---
title: "System::Threading::Tasks::ValueTask::ValueTask costruttore"
linktitle: "ValueTask"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::ValueTask::ValueTask costruttore. Costruisce un ValueTask vuoto e non inizializzato in C++."
type: docs
weight: 100
url: /it/cpp/system.threading.tasks/valuetask/valuetask/
---
## ValueTask::ValueTask() constructor


Costruisce un [ValueTask](../) vuoto e non inizializzato.

```cpp
System::Threading::Tasks::ValueTask::ValueTask()
```

## Osservazioni



L'attività non è completata e non contiene alcun risultato. Tentare di ottenere il risultato genererà un'eccezione.

## Vedi anche

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Costruisce un [ValueTask](../) da un puntatore condiviso a un [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const TaskPtr\& | L'attività da avvolgere. Può essere null per un'attività vuota. |
## Osservazioni



Il [ValueTask](../) rappresenterà lo stato dell'attività fornita.

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
