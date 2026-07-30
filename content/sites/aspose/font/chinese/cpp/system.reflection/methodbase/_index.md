---
title: "System::Reflection::MethodBase 类"
linktitle: "MethodBase"
second_title: "Aspose.Font 适用于 C++"
description: "System::Reflection::MethodBase 类。方法的基础信息。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建该类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 800
url: /zh/cpp/system.reflection/methodbase/
---
## MethodBase class


关于方法的基本信息。此类的对象只能使用 [System::MakeObject()](../../system/makeobject/) 函数进行分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | 指示成员的类型——方法、构造函数、事件等。 |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | 此方法允许获取当前方法名。翻译器会自动将 ASPOSE_CURRENT_FUNCTION 替换为参数。 |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | 初始化 [MethodBase](./) 类的新实例。 |
## 另见

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Font for C++](../../)
