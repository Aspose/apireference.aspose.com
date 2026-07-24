---
title: "Classe System::Threading::Tasks::TaskScheduler"
linktitle: "TaskScheduler"
second_title: "Aspose.Page per C++"
description: "Classe System::Threading::Tasks::TaskScheduler. Rappresenta un oggetto che gestisce il lavoro a basso livello di accodamento dei task sui thread in C++."
type: docs
weight: 400
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
| static [get_Current](./get_current/)() | Ottiene il [TaskScheduler](./) associato al task attualmente in esecuzione. |
| static [get_Default](./get_default/)() | Ottiene l'istanza predefinita di [TaskScheduler](./) fornita dal framework. |
| [get_Id](./get_id/)() const | Ottiene l'ID univoco per questo [TaskScheduler](./). |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | Indica il livello massimo di concorrenza che questo [TaskScheduler](./) può supportare. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
