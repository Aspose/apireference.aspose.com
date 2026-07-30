---
title: "System::Threading::Tasks::Parallel::ForEach yöntemi"
linktitle: "ForEach"
second_title: "Aspose.Font için C++"
description: "System::Threading::Tasks::Parallel::ForEach yöntemi. C++'da yinelemeler paralel olarak çalışabilecek bir IEnumerable üzerinde bir foreach işlemi yürütür."
type: docs
weight: 100
url: /tr/cpp/system.threading.tasks/parallel/foreach/
---
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const Action\<TSource\>\&) method


Bir IEnumerable üzerinde foreach işlemini yürütür; yinelemeler paralel olarak çalışabilir.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const Action<TSource> &body)
```


| Parametre | Açıklama |
| --- | --- |
| TSource | Kaynakta bulunan verinin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kaynak | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Bir enumerable veri kaynağı. |
| body | const Action\<TSource\>\& | Her yinelemede bir kez çağrılan temsilci. |

### ReturnValue

Tamamlanan döngünün hangi kısmını içerdiğine dair bilgi içeren bir [ParallelLoopResult](../../parallelloopresult/) yapısı.
## Açıklamalar



Sınırsız paralellik ve iptal olmadan varsayılan [ParallelOptions](../../paralleloptions/) kullanır.
## Ayrıca Bakınız

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const SharedPtr\<ParallelOptions\>\&, const Action\<TSource\>\&) method


Bir IEnumerable üzerinde foreach işlemini yürütür; yinelemeler paralel olarak çalışabilir.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const SharedPtr<ParallelOptions> &parallelOptions, const Action<TSource> &body)
```


| Parametre | Açıklama |
| --- | --- |
| TSource | Kaynakta bulunan verinin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| kaynak | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Bir enumerable veri kaynağı. |
| parallelOptions | const SharedPtr\<ParallelOptions\>\& | Bu işlemin davranışını yapılandıran bir nesne. |
| body | const Action\<TSource\>\& | Her yinelemede bir kez çağrılan temsilci. |

### ReturnValue

Tamamlanan döngünün hangi kısmını içerdiğine dair bilgi içeren bir [ParallelLoopResult](../../parallelloopresult/) yapısı.
## Açıklamalar



Bu yöntem, kaynak enumerable'ı bölerek gövde temsilcisini birden çok iş parçacığında eşzamanlı olarak yürütür.
## Ayrıca Bakınız

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [ParallelOptions](../../paralleloptions/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
