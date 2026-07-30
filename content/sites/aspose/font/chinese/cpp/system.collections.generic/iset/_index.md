---
title: "System::Collections::Generic::ISet 类"
linktitle: "ISet"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::ISet 类。包含唯一元素集合的集合接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2700
url: /zh/cpp/system.collections.generic/iset/
---
## ISet class


集合接口，包含一组唯一元素。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | 移除一组元素。 |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | 移除在不同容器中不存在的元素。 |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | 检查当前集合是否是另一个容器的严格子集。 |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | 检查当前集合是否是另一个容器的严格超集。 |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | 检查当前集合是否是另一个容器的子集。 |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | 检查当前集合是否是另一个容器的超集。 |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | 检查集合是否与另一个容器重叠。 |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | 检查集合和容器是否包含相同的元素。 |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | 计算两个容器的对称差集。移除同时存在于两个容器中的所有元素，同时添加 **other** 中存在但当前集合中不存在的所有元素。 |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | 添加来自指定集合的、当前集合中尚未存在的元素。 |
| virtual [~ISet](./~iset/)() | 析构函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | RTTI 信息。 |

## 另见

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
