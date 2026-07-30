---
title: "System::Threading::Tasks::TaskScheduler classe"
linktitle: "TaskScheduler"
second_title: "Aspose.Font per C++"
description: "System::Threading::Tasks::TaskScheduler classe. Rappresenta un oggetto che gestisce il lavoro a basso livello di accodamento delle attività sui thread in C++."
type: docs
weight: 700
url: /it/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


Rappresenta un oggetto che gestisce il lavoro a basso livello di accodamento dei task sui thread.

```cpp
class TaskScheduler : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | Crea un [TaskScheduler](./) associato al thread corrente. |
| static [get_Current](./get_current/)() | Ottiene il [TaskScheduler](./) associato all'attività attualmente in esecuzione. |
| static [get_Default](./get_default/)() | Ottiene l'istanza predefinita di [TaskScheduler](./) fornita dal framework. |
| [get_Id](./get_id/)() const | Ottiene l'ID univoco per questo [TaskScheduler](./). |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | Indica il livello massimo di concorrenza che questo [TaskScheduler](./) è in grado di supportare. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
