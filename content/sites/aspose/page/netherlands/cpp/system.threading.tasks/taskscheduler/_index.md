---
title: "System::Threading::Tasks::TaskScheduler klasse"
linktitle: "TaskScheduler"
second_title: "Aspose.Page voor C++"
description: "System::Threading::Tasks::TaskScheduler klasse. Vertegenwoordigt een object dat het laag-niveau werk van het in de wachtrij plaatsen van taken op threads in C++ afhandelt."
type: docs
weight: 400
url: /nl/cpp/system.threading.tasks/taskscheduler/
---
## TaskScheduler class


Stelt een object voor dat het laag-niveau werk van het in de wachtrij plaatsen van taken op threads afhandelt.

```cpp
class TaskScheduler : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [FromCurrentSynchronizationContext](./fromcurrentsynchronizationcontext/)() | Maakt een [TaskScheduler](./) aan die gekoppeld is aan de huidige thread. |
| static [get_Current](./get_current/)() | Haalt de [TaskScheduler](./) op die gekoppeld is aan de momenteel uitgevoerde taak. |
| static [get_Default](./get_default/)() | Haalt de standaard [TaskScheduler](./) instantie op die door het framework wordt geleverd. |
| [get_Id](./get_id/)() const | Haalt de unieke ID op voor deze [TaskScheduler](./). |
| virtual [get_MaximumConcurrencyLevel](./get_maximumconcurrencylevel/)() const | Geeft het maximale gelijktijdigheidsniveau aan dat deze [TaskScheduler](./) kan ondersteunen. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Page for C++](../../)
