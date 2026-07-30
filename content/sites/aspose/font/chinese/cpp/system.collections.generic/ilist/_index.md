---
title: "System::Collections::Generic::IList 类"
linktitle: "IList"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IList 类。元素的索引容器接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2600
url: /zh/cpp/system.collections.generic/ilist/
---
## IList class


元素的索引容器接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class IList : public System::Collections::Generic::ICollection<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [get_IsFixedSize](./get_isfixedsize/)() | 检查集合是否具有固定大小。 |
| virtual [idx_get](./idx_get/)(int) const | 获取指定索引处的元素。 |
| virtual [idx_set](./idx_set/)(int, T) | 设置指定索引处的元素。 |
| virtual [IndexOf](./indexof/)(const T\&) const | 获取项在容器中首次出现的索引。 |
| virtual [Insert](./insert/)(int, const T\&) | 在指定位置插入元素，后续元素向后移动。 |
| virtual [RemoveAt](./removeat/)(int) | 移除指定索引处的元素。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | RTTI 信息。 |
| [ThisType](./thistype/) | 此类型。 |
| [ValueType](./valuetype/) | 值类型。 |

## 另见

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
