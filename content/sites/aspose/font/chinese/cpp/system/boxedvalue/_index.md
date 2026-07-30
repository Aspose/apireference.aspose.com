---
title: "System::BoxedValue 类"
linktitle: "BoxedValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::BoxedValue 类。表示一个装箱值。此类的对象只能使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 800
url: /zh/cpp/system/boxedvalue/
---
## BoxedValue class


表示一个装箱值。此类的对象只能使用 [System::MakeObject()](../makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装到 [System::SmartPtr](../smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
template<class T>class BoxedValue : public System::BoxedValueBase
```


| 参数 | 描述 |
| --- | --- |
| T | 该类表示的装箱值的类型 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [BoxedValue](./boxedvalue/)(const T\&) | 构造一个表示指定装箱值的对象。 |
| [Equals](./equals/)(ptr) override | 确定当前对象和指定对象所表示的装箱值是否相等。 |
| [GetHashCode](./gethashcode/)() const override | 返回当前对象的哈希码。 |
| [GetType](./gettype/)() const override | 获取对象的实际类型。 |
| [GetTypeCode](./gettypecode/)() const override | 返回表示当前对象所代表的装箱值类型的值。 |
| [GetUnsignedLongLongValue](./getunsignedlonglongvalue/)() const override | 如果装箱对象可以被转换，则返回其数值，否则返回零。 |
| [is](./is/)() const | 确定当前对象所表示的装箱值的类型是否为 **V**。 |
| [IsBoxedEnum](./isboxedenum/)() override | 确定当前对象是否表示枚举类型的装箱值。 |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&, bool) | 将指定枚举中具有指定名称的枚举常量的值装箱。一个参数指定在解释指定枚举常量名称的字符串时是否应忽略大小写。 |
| static [Parse](../boxedvaluebase/parse/)(const TypeInfo\&, const String\&) | 将指定枚举中具有指定名称的枚举常量的值装箱。 |
| [ToString](./tostring/)() const override | 将当前对象所表示的装箱值转换为字符串。 |
| [ToString](../boxedvaluebase/tostring/)(const System::String\&) const | 使用指定的格式字符串将装箱对象转换为字符串。 |
| [unbox](./unbox/)() const | 将当前对象所表示的值解箱。 |

## 另见

* Class [BoxedValueBase](../boxedvaluebase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
