---
title: "System::Collections::CollectionBase 类"
linktitle: "CollectionBase"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::CollectionBase 类。提供一个用于强类型集合的抽象基类（C++）。"
type: docs
weight: 300
url: /zh/cpp/system.collections/collectionbase/
---
## CollectionBase class


提供用于强类型集合的抽象基类。

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 集合中元素的类型 |
## Nested classes

* Class [ListImpl](./listimpl/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [Clear](./clear/)() | 从集合实例中移除所有对象。此方法不可被重写。 |
| [get_Capacity](./get_capacity/)() | 返回集合可以容纳的元素数量。 |
| [get_Count](./get_count/)() | 返回集合实例中包含的元素数量。此方法不可被重写。 |
| [GetEnumerator](./getenumerator/)() override | 返回一个遍历集合实例的枚举器。 |
| [RemoveAt](./removeat/)(int32_t) | 移除集合实例中指定索引处的元素。此方法不可被覆盖。 |
| [set_Capacity](./set_capacity/)(int32_t) | 设置集合可以容纳的元素数量。 |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 将第 n 个模板参数设置为弱指针（而不是共享指针）。允许在容器中将指针切换为弱模式。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Ptr](./ptr/) | 此类实例的共享指针别名。 |

## 另见

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
