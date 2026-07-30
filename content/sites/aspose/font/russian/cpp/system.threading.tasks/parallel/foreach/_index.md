---
title: "System::Threading::Tasks::Parallel::ForEach метод"
linktitle: "ForEach"
second_title: "Aspose.Font для C++"
description: "System::Threading::Tasks::Parallel::ForEach метод. Выполняет операцию foreach над IEnumerable, в которой итерации могут выполняться параллельно в C++."
type: docs
weight: 100
url: /ru/cpp/system.threading.tasks/parallel/foreach/
---
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const Action\<TSource\>\&) method


Выполняет операцию foreach над IEnumerable, при которой итерации могут выполняться параллельно.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const Action<TSource> &body)
```


| Параметр | Описание |
| --- | --- |
| TSource | Тип данных в источнике. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| источник | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Перечисляемый источник данных. |
| body | const Action\<TSource\>\& | Делегат, вызываемый один раз за итерацию. |

### ReturnValue

Структура [ParallelLoopResult](../../parallelloopresult/), содержащая информацию о том, какая часть цикла завершена.
## Примечания



Использует параметры по умолчанию [ParallelOptions](../../paralleloptions/) с неограниченным параллелизмом и без отмены.
## См. также

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const SharedPtr\<ParallelOptions\>\&, const Action\<TSource\>\&) method


Выполняет операцию foreach над IEnumerable, при которой итерации могут выполняться параллельно.

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const SharedPtr<ParallelOptions> &parallelOptions, const Action<TSource> &body)
```


| Параметр | Описание |
| --- | --- |
| TSource | Тип данных в источнике. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| источник | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | Перечисляемый источник данных. |
| parallelOptions | const SharedPtr\<ParallelOptions\>\& | Объект, который настраивает поведение этой операции. |
| body | const Action\<TSource\>\& | Делегат, вызываемый один раз за итерацию. |

### ReturnValue

Структура [ParallelLoopResult](../../parallelloopresult/), содержащая информацию о том, какая часть цикла завершена.
## Примечания



Этот метод разбивает исходный перечисляемый объект и одновременно выполняет делегат body на нескольких потоках.
## См. также

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [ParallelOptions](../../paralleloptions/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
