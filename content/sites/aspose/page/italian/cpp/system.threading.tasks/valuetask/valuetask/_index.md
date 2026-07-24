---
title: "Costruttore System::Threading::Tasks::ValueTask::ValueTask"
linktitle: "ValueTask"
second_title: "Aspose.Page per C++"
description: "Costruttore System::Threading::Tasks::ValueTask::ValueTask. Costruisce un ValueTask vuoto e non inizializzato in C++."
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



Il task non è completato e non contiene alcun risultato. Tentare di ottenere il risultato genererà un'eccezione.

## Vedi anche

* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
## ValueTask::ValueTask(const TaskPtr\&) constructor


Costruisce un [ValueTask](../) da un puntatore condiviso a un [Task](../../task/).

```cpp
System::Threading::Tasks::ValueTask::ValueTask(const TaskPtr &task)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| task | const TaskPtr\\& | Il task da avvolgere. Può essere nullo per un task vuoto. |
## Osservazioni



Il [ValueTask](../) rappresenterà lo stato dell'operazione fornita.

## Vedi anche

* Typedef [TaskPtr](../../../system/taskptr/)
* Class [ValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
