---
title: "System::BoxedValueBase 类"
linktitle: "BoxedValueBase"
second_title: "Aspose.Font 适用于 C++"
description: "System::BoxedValueBase 类。一个定义接口并实现派生类（表示装箱值）的若干基础方法的基类。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 System::SmartPtr 指针中，并使用该指针在 C++ 中将其作为参数传递给函数。"
type: docs
weight: 900
url: /zh/cpp/system/boxedvaluebase/
---
## BoxedValueBase class


一个定义接口并实现表示装箱值的派生类的若干基础方法的基类。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言失败。始终将此类包装在 [System::SmartPtr](../smartptr/) 指针中，并使用该指针在函数调用时作为参数传递。

```cpp
class BoxedValueBase : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [GetTypeCode](./gettypecode/)() const | 返回表示当前对象所代表的装箱值类型的值。 |
| virtual [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const | 将当前对象表示的装箱值转换为 64 位整数。 |
| virtual [IsBoxedEnum](./isboxedenum/)() | 确定当前对象是否表示枚举类型的装箱值。 |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | 将指定枚举中具有指定名称的枚举常量的值装箱。一个参数指定在解释指定枚举常量名称的字符串时是否应忽略大小写。 |
| static [Parse](./parse/)(const TypeInfo\&, const String\&) | 将指定枚举中具有指定名称的枚举常量的值装箱。 |
| [ToString](./tostring/)(const System::String\&) const | 使用指定的格式字符串将装箱对象转换为字符串。 |
| virtual [ToString](./tostring/)() const | C# [Object.ToString()](../object/tostring/) 方法的类似实现。支持将自定义对象转换为字符串。 |
## 另见

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
