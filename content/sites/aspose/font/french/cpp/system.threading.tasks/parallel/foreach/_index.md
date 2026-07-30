---
title: "méthode System::Threading::Tasks::Parallel::ForEach"
linktitle: "ForEach"
second_title: "Aspose.Font pour C++"
description: "méthode System::Threading::Tasks::Parallel::ForEach. Exécute une opération foreach sur un IEnumerable dans laquelle les itérations peuvent s'exécuter en parallèle en C++."
type: docs
weight: 100
url: /fr/cpp/system.threading.tasks/parallel/foreach/
---
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const Action\<TSource\>\&) method


Exécute une opération foreach sur un IEnumerable dans laquelle les itérations peuvent s'exécuter en parallèle.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const Action<TSource> &body)
```


| Paramètre | Description |
| --- | --- |
| TSource | Le type des données dans la source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| source | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Une source de données énumérable. |
| body | const Action\<TSource\>\& | Le délégué qui est invoqué une fois par itération. |

### ReturnValue

Une structure [ParallelLoopResult](../../parallelloopresult/) qui contient des informations sur la partie de la boucle qui a été exécutée.
## Remarques



Utilise les [ParallelOptions](../../paralleloptions/) par défaut avec un parallélisme illimité et aucune annulation.
## Voir aussi

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const SharedPtr\<ParallelOptions\>\&, const Action\<TSource\>\&) method


Exécute une opération foreach sur un IEnumerable dans laquelle les itérations peuvent s'exécuter en parallèle.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const SharedPtr<ParallelOptions> &parallelOptions, const Action<TSource> &body)
```


| Paramètre | Description |
| --- | --- |
| TSource | Le type des données dans la source. |

| Paramètre | Type | Description |
| --- | --- | --- |
| source | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Une source de données énumérable. |
| parallelOptions | const SharedPtr\<ParallelOptions\>\& | Un objet qui configure le comportement de cette opération. |
| body | const Action\<TSource\>\& | Le délégué qui est invoqué une fois par itération. |

### ReturnValue

Une structure [ParallelLoopResult](../../parallelloopresult/) qui contient des informations sur la partie de la boucle qui a été exécutée.
## Remarques



Cette méthode partitionne l'énumérable source et exécute le délégué body sur plusieurs threads simultanément.
## Voir aussi

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [ParallelOptions](../../paralleloptions/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
