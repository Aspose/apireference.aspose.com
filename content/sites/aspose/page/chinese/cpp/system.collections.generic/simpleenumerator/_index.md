---
title: "System::Collections::Generic::SimpleEnumerator class"
linktitle: "SimpleEnumerator"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::SimpleEnumerator 类。用于直接使用 rbegin() 和 rend() 函数持有元素的简单容器的迭代器类。此类的对象只能通过 System::MakeObject() 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3900
url: /zh/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


用于直接使用 rbegin() 和 rend() 函数持有元素的简单容器的迭代器类。此类的对象只能通过 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 new 运算符创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| Parameter | 描述 |
| --- | --- |
| 容器 | 用于遍历的容器类型。 |
| Element | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 克隆当前迭代器。 |
| [get_Current](./get_current/)() const override | 获取“当前”元素。 |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | 创建简单迭代器。 |

## 另见

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
