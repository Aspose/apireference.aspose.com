---
title: "System::Threading::Tasks::Parallel::ForEach 方法"
linktitle: "ForEach"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::Parallel::ForEach 方法。执行对 IEnumerable 的 foreach 操作，其中迭代可以并行运行（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.threading.tasks/parallel/foreach/
---
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const Action\<TSource\>\&) method


对 IEnumerable 执行 foreach 操作，其中迭代可以并行运行。

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const Action<TSource> &body)
```


| 参数 | 描述 |
| --- | --- |
| TSource | 源中数据的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 源 | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | 一个可枚举的数据源。 |
| body | const Action\<TSource\>\& | 每次迭代调用一次的委托。 |

### ReturnValue

一个 [ParallelLoopResult](../../parallelloopresult/) 结构，包含有关循环已完成部分的信息。
## 备注



使用默认的 [ParallelOptions](../../paralleloptions/)，具有无限并行度且不支持取消。
## 另见

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
## Parallel::ForEach(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const SharedPtr\<ParallelOptions\>\&, const Action\<TSource\>\&) method


对 IEnumerable 执行 foreach 操作，其中迭代可以并行运行。

```cpp
template<typename TSource> static ParallelLoopResult System::Threading::Tasks::Parallel::ForEach(const SharedPtr<Collections::Generic::IEnumerable<TSource>> &source, const SharedPtr<ParallelOptions> &parallelOptions, const Action<TSource> &body)
```


| 参数 | 描述 |
| --- | --- |
| TSource | 源中数据的类型。 |

| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 源 | const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\& | 一个可枚举的数据源。 |
| parallelOptions | const SharedPtr\<ParallelOptions\>\& | 一个配置此操作行为的对象。 |
| body | const Action\<TSource\>\& | 每次迭代调用一次的委托。 |

### ReturnValue

一个 [ParallelLoopResult](../../parallelloopresult/) 结构，包含有关循环已完成部分的信息。
## 备注



此方法将源可枚举对象分区，并在多个线程上并发执行 body 委托。
## 另见

* Class [ParallelLoopResult](../../parallelloopresult/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../../../system.collections.generic/ienumerable/)
* Class [ParallelOptions](../../paralleloptions/)
* Typedef [Action](../../../system/action/)
* Class [Parallel](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Font for C++](../../../)
