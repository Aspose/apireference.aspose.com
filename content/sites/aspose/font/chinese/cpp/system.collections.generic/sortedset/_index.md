---
title: "System::Collections::Generic::SortedSet 类"
linktitle: "SortedSet"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::SortedSet 类。C++ 中 SortedSet 类的前向声明。"
type: docs
weight: 4400
url: /zh/cpp/system.collections.generic/sortedset/
---
## SortedSet class


对 [SortedSet](./) 类的前向声明。

```cpp
template<typename T>class SortedSet : public System::Collections::Generic::BaseSet<T, std::set<T, ComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_Max](./get_max/)() const | 获取 [SortedSet](./) 中的最大值。 |
| [SortedSet](./sortedset/)() | RTTI 信息。 |
| [SortedSet](./sortedset/)(int) | 创建具有指定容量的空集合。 |
| [SortedSet](./sortedset/)(const SharedPtr\<IComparer\<T\>\>\&) | 创建使用指定相等比较器的空集合。 |
| [SortedSet](./sortedset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | 基于可枚举值创建 [SortedSet](./)。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | Vase 类型。 |
| [ThisPtr](./thisptr/) | 指针类型。 |
| [ThisType](./thistype/) | 自身类型。 |
## 备注


实现有序对象集合。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
