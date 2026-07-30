---
title: "Classe System::Threading::TimerQueue"
linktitle: "TimerQueue"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::TimerQueue. File d'attente qui gère les objets Timer. Il ne s'agit que d'une implémentation. Les objets Timer s'y enregistrent eux-mêmes, vous n'avez pas besoin de le faire pour les utiliser - utilisez plutôt l'API de la classe Timer. Il s'agit d'un type singleton dont la gestion de la mémoire est assurée par les fonctions d'accès. Vous ne devez jamais créer d'instances de ce type directement en C++."
type: docs
weight: 1600
url: /fr/cpp/system.threading/timerqueue/
---
## TimerQueue class


File d'attente qui gère les objets [Timer](../timer/). Il ne s'agit que d'une implémentation. Les objets [Timer](../timer/) s'y enregistrent eux-mêmes, vous n'avez pas besoin de le faire pour les utiliser - utilisez plutôt l'API de la classe [Timer](../timer/). Il s'agit d'un type singleton dont la gestion de la mémoire est assurée par les fonctions d'accès. Vous ne devez jamais créer d'instances de ce type directement.

```cpp
class TimerQueue
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Add](./add/)(Timer *) | Enregistre la minuterie dans la file d'attente. |
| [Delete](./delete/)(Timer *) | Supprime la minuterie de la file d'attente. |
| static [GetInstance](./getinstance/)() | Singleton d'implémentation. |
| static [JoinWorkerThread](./joinworkerthread/)() | Joint le thread de travail. Attend indéfiniment si nécessaire. |
| [operator=](./operator=/)(const TimerQueue\&) | Pas de copie. |
| [TimerQueue](./timerqueue/)(const TimerQueue\&) | Pas de copie. |
## Voir aussi

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
