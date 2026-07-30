---
title: "System::Threading::Tasks::Parallel::ForEach Methode"
linktitle: "ForEach"
second_title: "Aspose.Font für C++"
description: "System::Threading::Tasks::Parallel::ForEach Methode. Führt eine foreach‑Operation auf einem IEnumerable aus, bei der die Iterationen in C++ parallel ausgeführt werden können."
type: docs
weight: 100
url: /de/cpp/system.threading.tasks/parallel/foreach/
---
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const Action\<TSource\>\&) method


Führt eine foreach-Operation auf einem IEnumerable aus, bei der die Iterationen parallel ausgeführt werden können.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const Action<TSource> &body)
```


| Parameter | Beschreibung |
| --- | --- |
| TSource | Der Typ der Daten in der Quelle. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Quelle | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Eine aufzählbare Datenquelle. |
| body | const Action\<TSource\>\& | Der Delegat, der einmal pro Iteration aufgerufen wird. |

### ReturnValue

Eine [ParallelLoopResult](../../parallelloopresult/) Struktur, die Informationen darüber enthält, welcher Teil der Schleife abgeschlossen wurde.
## Hinweise



Verwendet die Standard‑[ParallelOptions](../../paralleloptions/) mit unbegrenzter Parallelität und ohne Abbruch.
## Siehe auch

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const SharedPtr\<ParallelOptions\>\&, const Action\<TSource\>\&) method


Führt eine foreach-Operation auf einem IEnumerable aus, bei der die Iterationen parallel ausgeführt werden können.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const SharedPtr<ParallelOptions> &parallelOptions, const Action<TSource> &body)
```


| Parameter | Beschreibung |
| --- | --- |
| TSource | Der Typ der Daten in der Quelle. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Quelle | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Eine aufzählbare Datenquelle. |
| parallelOptions | const SharedPtr\<ParallelOptions\>\& | Ein Objekt, das das Verhalten dieser Operation konfiguriert. |
| body | const Action\<TSource\>\& | Der Delegat, der einmal pro Iteration aufgerufen wird. |

### ReturnValue

Eine [ParallelLoopResult](../../parallelloopresult/) Struktur, die Informationen darüber enthält, welcher Teil der Schleife abgeschlossen wurde.
## Hinweise



Diese Methode partitioniert die aufzählbare Quelle und führt den Body‑Delegaten gleichzeitig auf mehreren Threads aus.
## Siehe auch

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [ParallelOptions](../../paralleloptions/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
