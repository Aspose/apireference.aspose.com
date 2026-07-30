---
title: "System::Linq::IOrderedEnumerable 类"
linktitle: "IOrderedEnumerable"
second_title: "Aspose.Font 适用于 C++"
description: "System::Linq::IOrderedEnumerable 类。表示 C++ 中的已排序序列。"
type: docs
weight: 300
url: /zh/cpp/system.linq/iorderedenumerable/
---
## IOrderedEnumerable class


表示已排序的序列。

```cpp
template<typename T>class IOrderedEnumerable : public System::Collections::Generic::IEnumerable<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 序列中元素的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [GetEnumerator](./getenumerator/)() override | 获取枚举器。 |
| [IOrderedEnumerable](./iorderedenumerable/)(const System::SharedPtr\<System::Collections::Generic::IEnumerable\<T\>\>\&, const Comparator\&) |  |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<T, Key\>\&) | 根据键对序列中的元素执行后续的升序排序。 |
| [LINQ_ThenBy](./linq_thenby/)(const Func\<Source, Key\>\&) |  |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Comparator](./comparator/) | RTTI 信息。 |

## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Linq](../)
* Library [Aspose.Font for C++](../../)
