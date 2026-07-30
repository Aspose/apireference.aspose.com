---
title: "System::Collections::Generic::QueuePtr 类"
linktitle: "QueuePtr"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::QueuePtr 类。队列指针。此类型是用于管理其他对象删除的指针。它应在栈上分配，并以值传递或通过 const 引用传递给 C++ 函数。"
type: docs
weight: 3700
url: /zh/cpp/system.collections.generic/queueptr/
---
## QueuePtr class


[Queue](../queue/) pointer. This type is a pointer to manage other object's deletion. It should be allocated on stack and passed to functions either by value or by const reference.

```cpp
template<typename T>class QueuePtr : public System::SmartPtr<T0>
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [QueuePtr](./queueptr/)() | 构造空指针。 |
| [QueuePtr](./queueptr/)(const SharedPtr\<Queue\<T\>\>\&) | 构造指向特定队列的指针。 |

## 另见

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
