---
title: "classe System::Threading::ThreadPoolImpl"
linktitle: "ThreadPoolImpl"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::ThreadPoolImpl. Données internes du pool de threads. Il s'agit d'un type singleton dont la gestion de la mémoire est effectuée par les fonctions d'accès. Vous ne devez jamais créer d'instances directement en C++."
type: docs
weight: 1400
url: /fr/cpp/system.threading/threadpoolimpl/
---
## ThreadPoolImpl class


[Thread](../thread/) pool internal data. This is a singleton type with memory management done by access function(s). You should never create instances of it directly.

```cpp
class ThreadPoolImpl
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [GetAvailableThreads](./getavailablethreads/)(int\&, int\&) | Obtient le nombre de threads disponibles. |
| static [GetInitialized](./getinitialized/)() | Obtient le singleton d'état d'initialisation. |
| [GetMaxThreads](./getmaxthreads/)(int\&, int\&) | Obtient le nombre maximal de threads concurrents. |
| [GetMinThreads](./getminthreads/)(int\&, int\&) | Obtient le nombre minimal de threads créés par le pool. |
| [JoinAll](./joinall/)() | Joint tous les threads possédés. Attend indéfiniment. |
| [QueueUserWorkItem](./queueuserworkitem/)(WaitCallback, const System::SharedPtr\<System::Object\>\&) | Ajoute un élément de travail à la file d'attente. |
| [SetMaxThreads](./setmaxthreads/)(int, int) | Définit le nombre de threads possédés par le pool. |
| [SetMinThreads](./setminthreads/)(int, int) | Définit le nombre minimal de threads possédés par le pool. |
| [ThreadPoolImpl](./threadpoolimpl/)() | Constructeur. |
| [~ThreadPoolImpl](./~threadpoolimpl/)() | Destructeur. Joint tous les threads s'ils n'ont pas encore été terminés. |
## Voir aussi

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
