---
title: "System::Collections::Generic::LinkedListNode 类"
linktitle: "LinkedListNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::LinkedListNode 类。链表的节点。实现了对 std::list 迭代器的包装，该迭代器被封装在链表中。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3200
url: /zh/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


链表的节点。实现了对 std::list 迭代器的包装，该迭代器被封装在链表中。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| 参数 | 描述 |
| --- | --- |
| T | 存储值类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [get_List](./get_list/)() const | 获取包含的列表。 |
| [get_Next](./get_next/)() const | 获取下一个节点。 |
| [get_Previous](./get_previous/)() const | 获取上一个节点。 |
| [get_Value](./get_value/)() const | 获取存储的值。 |
| [LinkedListNode](./linkedlistnode/)(const T\&) | 构造函数。 |
| [set_Value](./set_value/)(const T\&) | 设置存储的值。 |

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
