---
title: "System::Threading::Tasks::TaskScheduler Klasse"
linktitle: "TaskScheduler"
second_title: "Aspose.Page für C++"
description: "System::Threading::Tasks::TaskScheduler Klasse. Stellt ein Objekt dar, das die Low-Level-Arbeit des Einreihens von Aufgaben auf Threads in C++ übernimmt."
type: docs
weight: 400
url: /de/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


Stellt ein Objekt dar, das die Low-Level‑Arbeit des Einreihens von Aufgaben in Threads übernimmt.

```cpp
class TaskScheduler : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | Erstellt einen [TaskScheduler](./), der dem aktuellen Thread zugeordnet ist. |
| static [get_Current](./get_current/)() | Liefert den [TaskScheduler](./), der der gerade ausgeführten Aufgabe zugeordnet ist. |
| static [get_Default](./get_default/)() | Liefert die Standard-Instanz des [TaskScheduler](./), die vom Framework bereitgestellt wird. |
| [get_Id](./get_id/)() const | Liefert die eindeutige ID für diesen [TaskScheduler](./). |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | Gibt das maximale Parallelitätsniveau an, das dieser [TaskScheduler](./) unterstützen kann. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
