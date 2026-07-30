---
title: "System::Collections::Generic::IComparer 类"
linktitle: "IComparer"
second_title: "Aspose.Font 适用于 C++"
description: "System::Collections::Generic::IComparer 类。用于在大于-等于-小于意义上比较两个对象的接口。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 2000
url: /zh/cpp/system.collections.generic/icomparer/
---
## IComparer class


用于在大于-等于-小于意义上比较两个对象的接口。此类的对象应使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<typename T>class IComparer : public virtual System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Compare](./compare/)(args_type, args_type) const | [Comparison](../../system/comparison/) 函数。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [args_type](./args_type/) | RTTI 信息。 |

## 另见

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
