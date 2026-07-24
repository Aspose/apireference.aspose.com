---
title: "System::Threading::TimerQueue class"
linktitle: "TimerQueue"
second_title: "Aspose.Page pour C++"
description: "System::Threading::TimerQueue class. File d'attente qui gère les objets Timer. Il s'agit simplement d'une implémentation. Les objets Timer s'y enregistrent eux‑mêmes, vous n'avez pas besoin de le faire pour les utiliser - utilisez plutôt l'API de la classe Timer. Il s'agit d'un type singleton dont la gestion de la mémoire est assurée par les fonctions d'accès. Vous ne devez jamais créer d'instances de ce type directement en C++."
type: docs
weight: 1600
url: /fr/cpp/system.threading/timerqueue/
---
## TimerQueue class


File d'attente qui gère les objets [Timer](../timer/). Il s'agit simplement d'une implémentation. Les objets [Timer](../timer/) s'enregistrent eux-mêmes, vous n'avez pas besoin de le faire pour les utiliser - utilisez plutôt l'API de la classe [Timer](../timer/). Il s'agit d'un type singleton dont la gestion de la mémoire est effectuée par les fonctions d'accès. Vous ne devez jamais créer d'instances directement.

```cpp
class TimerQueue
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(Timer *) | Enregistre le minuteur dans la file d'attente. |
| [Delete](./delete/)(Timer *) | Supprime le minuteur de la file d'attente. |
| static [GetInstance](./getinstance/)() | Singleton d'implémentation. |
| static [JoinWorkerThread](./joinworkerthread/)() | Joint le thread de travail. Attend indéfiniment si nécessaire. |
| [operator=](./operator=/)(const TimerQueue\&) | Pas de copie. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Pas de copie. |
## Voir aussi

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
