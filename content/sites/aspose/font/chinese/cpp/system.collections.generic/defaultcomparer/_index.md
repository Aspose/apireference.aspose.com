---
title: "System::Collections::Generic::DefaultComparer 类"
linktitle: "DefaultComparer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::DefaultComparer 类。默认比较器类。使用 operator < 和 operator == 来比较值。此类的对象只能使用 System::MakeObject() 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 中的函数。"
type: docs
weight: 1000
url: /zh/cpp/system.collections.generic/defaultcomparer/
---
## DefaultComparer class


默认比较器类。使用 operator < 和 operator == 来比较值。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<class T>class DefaultComparer : public System::Collections::Generic::IComparer<T>
```


| 参数 | 描述 |
| --- | --- |
| T | 被比较的类型。 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Compare](./compare/)(typename ThisType::args_type, typename ThisType::args_type) const override | RTTI 信息。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [BaseType](./basetype/) | 已实现的接口。 |
| [ThisType](./thistype/) | 当前类型。 |

## 另见

* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
