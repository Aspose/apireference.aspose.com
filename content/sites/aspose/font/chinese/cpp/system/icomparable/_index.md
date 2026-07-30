---
title: "System::IComparable 类"
linktitle: "IComparable"
second_title: "Aspose.Font 适用于 C++"
description: "System::IComparable 类。定义一个比较两个对象的方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 3300
url: /zh/cpp/system/icomparable/
---
## IComparable class


定义一个比较两个对象的方法。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| 参数 | 描述 |
| --- | --- |
| T | 当前对象进行比较的对象的类型 |
## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | 将当前对象与指定对象进行比较。 |

## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
