---
title: "System::Collections::Generic::HashSet 类"
linktitle: "HashSet"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::HashSet 类。HashSet 类在 C++ 中的前向声明。"
type: docs
weight: 1700
url: /zh/cpp/system.collections.generic/hashset/
---
## HashSet class


前向声明 [HashSet](./) 类。

```cpp
template<typename T>class HashSet : public System::Collections::Generic::BaseSet<T, std::unordered_set<T, EqualityComparerHashAdapter<T>, EqualityComparerAdapter<T>, System::Details::CollectionHelpers::ContainerPointerMode<T>::allocator_type>>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [HashSet](./hashset/)() | RTTI 信息。 |
| [HashSet](./hashset/)(int) | 创建具有指定容量的空集合。 |
| [HashSet](./hashset/)(const SharedPtr\<IEqualityComparer\<T\>\>\&) | 创建使用指定相等比较器的空集合。 |
| [HashSet](./hashset/)(const SharedPtr\<IEnumerable\<T\>\>\&) | 基于可枚举值创建 hashset。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | 基类型。 |
| [ThisPtr](./thisptr/) | 指针类型。 |
| [ThisType](./thistype/) | 自身类型。 |
## 备注


基于哈希的集合实现。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

## 另见

* Class [BaseSet](../baseset/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
