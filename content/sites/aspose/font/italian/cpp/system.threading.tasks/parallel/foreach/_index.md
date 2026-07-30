---
title: "Metodo System::Threading::Tasks::Parallel::ForEach"
linktitle: "ForEach"
second_title: "Aspose.Font per C++"
description: "Metodo System::Threading::Tasks::Parallel::ForEach. Esegue un'operazione foreach su un IEnumerable in cui le iterazioni possono essere eseguite in parallelo in C++."
type: docs
weight: 100
url: /it/cpp/system.threading.tasks/parallel/foreach/
---
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const Action\<TSource\>\&) method


Esegue un'operazione foreach su un IEnumerable in cui le iterazioni possono essere eseguite in parallelo.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const Action<TSource> &body)
```


| Parametro | Descrizione |
| --- | --- |
| TSource | Il tipo dei dati nella sorgente. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| origine | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Una fonte di dati enumerabile. |
| body | const Action\<TSource\>\& | Il delegato che viene invocato una volta per iterazione. |

### ReturnValue

Una struttura [ParallelLoopResult](../../parallelloopresult/) che contiene informazioni su quale parte del ciclo è stata completata.
## Osservazioni



Utilizza le [ParallelOptions](../../paralleloptions/) predefinite con parallelismo illimitato e senza cancellazione.
## Vedi anche

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const SharedPtr\<ParallelOptions\>\&, const Action\<TSource\>\&) method


Esegue un'operazione foreach su un IEnumerable in cui le iterazioni possono essere eseguite in parallelo.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const SharedPtr<ParallelOptions> &parallelOptions, const Action<TSource> &body)
```


| Parametro | Descrizione |
| --- | --- |
| TSource | Il tipo dei dati nella sorgente. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| origine | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Una fonte di dati enumerabile. |
| parallelOptions | const SharedPtr\<ParallelOptions\>\& | Un oggetto che configura il comportamento di questa operazione. |
| body | const Action\<TSource\>\& | Il delegato che viene invocato una volta per iterazione. |

### ReturnValue

Una struttura [ParallelLoopResult](../../parallelloopresult/) che contiene informazioni su quale parte del ciclo è stata completata.
## Osservazioni



Questo metodo partiziona l'enumerabile sorgente ed esegue il delegato body su più thread contemporaneamente.
## Vedi anche

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [ParallelOptions](../../paralleloptions/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
