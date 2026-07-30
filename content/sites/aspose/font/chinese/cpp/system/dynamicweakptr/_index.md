---
title: "System::DynamicWeakPtr 类"
linktitle: "DynamicWeakPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::DynamicWeakPtr 类。 智能指针类，跟踪存储对象的模板参数的指针模式，并在每次赋值后更新它们。此类型是用于管理其他对象删除的指针。它应在栈上分配，并在 C++ 中通过值或 const 引用传递给函数。"
type: docs
weight: 2200
url: /zh/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


智能指针类，用于跟踪存储对象的模板参数的指针模式，并在每次赋值后更新它们。此类型是用于管理其他对象删除的指针。它应在栈上分配，并通过值或 const 引用传递给函数。

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| 参数 | 描述 |
| --- | --- |
| Pointee | 类型。 |
| trunkMode | 智能指针本身的模式，shared 或 weak。 |
| weakLeafs | 应设置为 weak 指针模式的存储类型模板参数的索引。 |
## Nested classes

* Class [Reference](./reference/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | 创建空智能指针。 |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | 创建指向给定对象的智能指针。 |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | 拷贝构造智能指针。 |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | 拷贝构造智能指针。 |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | 拷贝构造智能指针。 |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | 移动构造智能指针。 |
| [operator=](./operator=/)(SmartPtr_\&&) | 移动赋值智能指针。 |
| [operator=](./operator=/)(const SmartPtr_\&) | 拷贝赋值智能指针。 |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | 拷贝赋值智能指针。 |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | 赋值智能指针。 |
| [operator=](./operator=/)(std::nullptr_t) | 将智能指针设为 null。 |
| [operator==](./operator==/)(std::nullptr_t) const | 检查智能指针是否为 null。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | 自身类型别名。 |
| [Pointee_](./pointee_/) | 指向的类型。 |
| [SmartPtr_](./smartptr_/) | [SmartPtr](../smartptr/) 基类别名。 |

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
