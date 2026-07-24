---
title: "System::IComparable class"
linktitle: "IComparable"
second_title: "Aspose.Page 适用于 C++"
description: "System::IComparable 类。定义一个比较两个对象的方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 3300
url: /zh/cpp/system/icomparable/
---
## IComparable class


定义一个比较两个对象的方法。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| Parameter | 描述 |
| --- | --- |
| T | 当前对象进行比较的对象类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | 将当前对象与指定对象进行比较。 |

## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
