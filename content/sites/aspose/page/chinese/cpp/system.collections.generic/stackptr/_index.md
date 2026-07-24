---
title: "System::Collections::Generic::StackPtr 类"
linktitle: "StackPtr"
second_title: "Aspose.Page 适用于 C++"
description: "System::Collections::Generic::StackPtr 类。堆栈指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并在 C++ 中以值或 const 引用方式传递给函数。"
type: docs
weight: 4700
url: /zh/cpp/system.collections.generic/stackptr/
---
## StackPtr class


[Stack](../stack/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class StackPtr : public System::SmartPtr<Stack<T>>
```


| Parameter | 描述 |
| --- | --- |
| T | 元素类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [StackPtr](./stackptr/)() | 构造空指针。 |
| [StackPtr](./stackptr/)(const SharedPtr\<Stack\<T\>\>\&) | 构造指向特定栈的指针。 |

## 另见

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
