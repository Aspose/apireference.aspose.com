---
title: "System::WeakPtr 类"
linktitle: "WeakPtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::WeakPtr 类。是 System::SmartPtr 的子类，在构造时将自身设置为弱模式。请注意，由于 set_Mode() 仍然可访问，此类不能保证其实例始终保持在弱模式。此类型是用于管理其他对象删除的指针。它应当在栈上分配，并以值传递或 const 引用方式传递给函数（C++）。"
type: docs
weight: 7500
url: /zh/cpp/system/weakptr/
---
## WeakPtr class


是 [System::SmartPtr](../smartptr/) 的子类，在构造时将自身设置为弱模式。请注意，由于 [set_Mode()](../smartptr/set_mode/) 仍然可访问，此类不能保证其实例始终保持在弱模式。此类型是用于管理其他对象删除的指针。它应当在栈上分配，并以值传递或 const 引用方式传递给函数。

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 被指向的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [expired](./expired/)() const | 检查被引用的对象是否已被删除。 |
| [get_weak](./get_weak/)() const | 获取被引用的对象。断言指针处于弱模式。 |
| [operator=](./operator=/)(Q\&&) | 为弱指针赋值。调用 [SmartPtr_](./smartptr_/ ) 的特定赋值运算符。 |
| [operator==](./operator==/)(std::nullptr_t) const | 检查弱指针是否为 null。 |
| [WeakPtr](./weakptr/)(std::nullptr_t) | 创建 null 指针。 |
| [WeakPtr](./weakptr/)(Pointee_ *) | 创建指向给定对象的弱指针。 |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | 创建引用与 ptr 指向的相同指针的弱指针。 |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | 创建引用与 x 指向的相同指针的弱指针。 |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | 复制构造弱指针。 |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | 复制构造弱指针。 |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | 移动构造弱指针。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [Pointee_](./pointee_/) | 指向的类型。 |
| [SmartPtr_](./smartptr_/) | 对应的 [SmartPtr](../smartptr/) 类的别名。 |
| [WeakPtr_](./weakptr_/) | 自身类型的别名。 |

## 另见

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
