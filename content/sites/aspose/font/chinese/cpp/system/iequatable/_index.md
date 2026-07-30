---
title: "System::IEquatable 类"
linktitle: "IEquatable"
second_title: "Aspose.Font 适用于 C++"
description: "System::IEquatable 类。定义一个用于确定两个对象相等性的成员方法。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并在 C++ 中使用该指针将其作为参数传递给函数。"
type: docs
weight: 3700
url: /zh/cpp/system/iequatable/
---
## IEquatable class


定义一个用于确定两个对象相等性的成员方法。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class IEquatable : public virtual System::Object
```


| 参数 | 描述 |
| --- | --- |
| T | 被比较对象的类型 |
## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Equals](./equals/)(T) | 确定当前对象和指定对象是否相等。 |

## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
