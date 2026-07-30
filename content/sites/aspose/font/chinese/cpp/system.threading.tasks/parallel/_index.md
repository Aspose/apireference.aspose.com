---
title: "System::Threading::Tasks::Parallel 类"
linktitle: "Parallel"
second_title: "Aspose.Font 适用于 C++"
description: "System::Threading::Tasks::Parallel 类。 在 C++ 中提供对并行循环和区域的支持。"
type: docs
weight: 100
url: /zh/cpp/system.threading.tasks/parallel/
---
## Parallel class


提供对并行循环和区域的支持。

```cpp
class Parallel
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [ForEach](./foreach/)(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const SharedPtr\<ParallelOptions\>\&, const Action\<TSource\>\&) | 对 IEnumerable 执行 foreach 操作，其中迭代可以并行运行。 |
| static [ForEach](./foreach/)(const SharedPtr\<Collections::Generic::IEnumerable\<TSource\>\>\&, const Action\<TSource\>\&) | 对 IEnumerable 执行 foreach 操作，其中迭代可以并行运行。 |
## 备注


此类提供用于循环和操作并行执行的方法。
## 另见

* Namespace [System::Threading::Tasks](../)
* Library [Aspose.Font for C++](../../)
