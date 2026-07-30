---
title: "System::Collections::Generic::IEqualityComparer 类"
linktitle: "IEqualityComparer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IEqualityComparer 类。提供比较两个对象相等性的接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 2400
url: /zh/cpp/system.collections.generic/iequalitycomparer/
---
## IEqualityComparer class


提供比较两个对象相等性的接口。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言失败。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class IEqualityComparer : public virtual System::Object
```


| 参数 | 描述 |
| --- | --- |
| T | 被比较的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Equals](./equals/)(T, T) const | RTTI 信息。 |
| virtual [GetHashCode](./gethashcode/)(T) const | 获取某个对象的哈希码。 |

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
