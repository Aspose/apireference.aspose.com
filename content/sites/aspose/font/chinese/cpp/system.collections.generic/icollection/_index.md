---
title: "System::Collections::Generic::ICollection 类"
linktitle: "ICollection"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::ICollection 类。元素集合的接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 1900
url: /zh/cpp/system.collections.generic/icollection/
---
## ICollection class


元素集合的接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Add](./add/)(const T\&) | 向集合中添加元素。 |
| virtual [Clear](./clear/)() | 删除集合中的所有元素。 |
| virtual [Contains](./contains/)(const T\&) const | 检查集合中是否存在该元素。 |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | 将所有集合元素复制到现有数组元素中。 |
| virtual [get_Count](./get_count/)() const | 获取集合中的元素数量。 |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | 检查集合是否为只读。 |
| [get_SyncRoot](./get_syncroot/)() const | 获取集合同步所通过的对象。 |
| [ICollection](./icollection/)() | 默认构造函数。 |
| [ICollection](./icollection/)(const ICollection\&) | 拷贝构造函数。 |
| [ICollection](./icollection/)(ICollection\&&) | 移动构造函数。 |
| [operator=](./operator=/)(ICollection\&&) | 移动赋值运算符。 |
| [operator=](./operator=/)(const ICollection\&) | 移动赋值运算符。 |
| virtual [Remove](./remove/)(const T\&) | 从集合中删除元素。 |
| virtual [~ICollection](./~icollection/)() | 析构函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ThisType](./thistype/) | 集合类型名称。 |
| [ValueType](./valuetype/) | RTTI 信息。 |

## 另见

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
