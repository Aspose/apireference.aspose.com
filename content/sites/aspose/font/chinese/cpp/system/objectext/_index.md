---
title: "System::ObjectExt 类"
linktitle: "ObjectExt"
second_title: "Aspose.Font 适用于 C++"
description: "System::ObjectExt 类。提供模拟 C# Object 方法的静态方法，这些方法用于非 Object 的 C++ 类型（字符串、数字等）。这是一个没有实例服务的静态类型。绝不应以任何方式在 C++ 中创建其实例。"
type: docs
weight: 4900
url: /zh/cpp/system/objectext/
---
## ObjectExt class


提供模拟 C# [Object](../object/) 方法的静态方法，这些方法用于非 Object 的 C++ 类型（字符串、数字等）。这是一个没有实例服务的静态类型。绝不应以任何方式创建其实例。

```cpp
class ObjectExt : public System::ObjectType
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [ArrayInitializerCast](./arrayinitializercast/)(From ...) | 转换数组基本值（C# 会隐式执行，但 C++ 显然不会）。 |
| static [Box](./box/)(const T\&) | 对值类型进行装箱，以转换为 [Object](../object/)。针对枚举类型的实现。 |
| static [Box](./box/)(const T\&) | 对值类型进行装箱，以转换为 [Object](../object/)。针对非枚举类型的实现。 |
| static [Box](./box/)(const T\&) | 对 [Nullable](../nullable/) 类型进行装箱，以转换为 [Object](../object/)。 |
| static [Box](./box/)(const String\&) | 对字符串值进行装箱。 |
| static [BoxEnum](./boxenum/)(T) | 对枚举类型进行装箱，以便作为 [Object](../object/) 传播。 |
| static [CastToIList](./casttoilist/)(const SmartPtr\<Object\>\&) |  |
| static [Coalesce](./coalesce/)(T0, T1) | 实现对非可空类型的 '??' 运算符翻译。 |
| static [Coalesce](./coalesce/)(System::Nullable\<T0\>, T1) | 实现对可空类型的 '??' 运算符翻译。 |
| static [CoalesceAssign](./coalesceassign/)(T0\&, T1) | 实现对 '??=' 运算符的翻译。 |
| static [CoalesceInternal](./coalesceinternal/)(RT1, F) | 实现对非可空类型的 '??' 运算符翻译。重载用于 RT2 可转换为 RT1 的情况。 |
| static [Equals](./equals/)(const T\&, const T2\&) |  |
| static [Equals](./equals/)(const T\&, const T2\&) | 替代 C# [Object.Equals](../object/equals/) 调用，可在 C++ 中用于任何类型。针对智能指针类型的重载。 |
| static [Equals](./equals/)(T, const T2\&) | 替代 C# [Object.Equals](../object/equals/) 调用，可在 C++ 中用于任何类型。针对结构体类型的重载。 |
| static [Equals](./equals/)(const T\&, const T2\&) | 替代 C# [Object.Equals](../object/equals/) 调用，可在 C++ 中用于任何类型。针对标量类型的重载。 |
| static [Equals](./equals/)(const char_t(&), String) | 替代 C# [Object.Equals](../object/equals/) 调用，可在 C++ 中用于任何类型。针对字符串字面量进行字符串比较的重载。 |
| static [Equals](./equals/)(const float\&, const float\&) | 模拟 C# 风格的浮点比较，其中两个 NaN 被视为相等，尽管根据 IEC 60559:1989 标准，NaN 不等于任何值，包括 NaN 本身。 |
| static [Equals](./equals/)(const double\&, const double\&) | 模拟 C# 风格的浮点比较，其中两个 NaN 被视为相等，尽管根据 IEC 60559:1989 标准，NaN 不等于任何值，包括 NaN 本身。 |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [ExplicitCastToObject](./explicitcasttoobject/)(const T\&) |  |
| static [GetHashCode](./gethashcode/)(const T\&) | 实现 [GetHashCode()](./gethashcode/) 调用；适用于 [Object](../object/) 子类和不相关的类型。 |
| static [Is](./is/)(const T\&) | 实现 'is' 运算符的翻译。针对可装箱（值）类型的特化，即它们本身。 |
| static [Is](./is/)(const U\&) | 实现 'is' 运算符的翻译。针对指针类型的特化，针对 'final' 类进行优化。 |
| static [Is](./is/)(const U\&) | 实现 'is' 运算符的翻译。针对指针类型的特化。 |
| static [Is](./is/)(const Object\&) | 实现 'is' 运算符的翻译。针对值类型的特化。 |
| static [Is](./is/)(const Object\&) | 实现 'is' 运算符的翻译。针对不可转换类型的特化。 |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 实现 'is' 运算符的翻译。针对指针类型的特化。 |
| static [Is](./is/)(const ExceptionWrapper\<U\>\&) | 实现 'is' 运算符的翻译。针对异常包装类型的特化。 |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 实现 'is' 运算符的翻译。针对可空类型的特化。 |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 实现 'is' 运算符的翻译。针对已定义 == 运算符的可装箱类型的特化。 |
| static [Is](./is/)(const SmartPtr\<Object\>\&) | 实现 'is' 运算符的翻译。针对未定义 == 运算符的可装箱类型的特化。 |
| static [Is](./is/)(const SmartPtr\<V\>\&) | 实现 'is' 运算符的翻译。针对值类型装箱为接口的特化。 |
| static [Is](./is/)(const SmartPtr\<U\>\&) | 实现 'is' 运算符的翻译。针对枚举类型的特化。 |
| static [Is](./is/)(const WeakPtr\<U\>\&) | 实现 'is' 运算符的翻译。针对枚举类型与弱指针的特化。 |
| static [Is](./is/)(const Nullable\<U\>\&) | 实现 'is' 运算符的翻译。针对 [Nullable](../nullable/) 类型的特化。 |
| static [Is](./is/)(const char16_t *) | 实现 'is' 运算符的翻译。针对字符串字面量的特化。 |
| static [Is](./is/)(int32_t) | 实现 'is' 运算符的翻译。针对整数字面量的特化。 |
| static [IsBoxedValue](./isboxedvalue/)(const SmartPtr\<Object\>\&) | 检查对象是否为装箱值。 |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | 将 [Object](../object/) 转换为未知类型，处理智能指针类型和装箱值两种情况。 |
| static [ObjectToUnknown](./objecttounknown/)(SmartPtr\<Object\>) | 将 [Object](../object/) 转换为未知类型，处理智能指针类型和装箱值两种情况。 |
| static [ToString](./tostring/)(const char_t *) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [ToString](./tostring/)(const Nullable\<T\>\&) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [ToString](./tostring/)(const T\&) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [ToString](./tostring/)(const T\&) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [ToString](./tostring/)(T\&) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [ToString](./tostring/)(T\&) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [ToString](./tostring/)(T\&&) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [ToString](./tostring/)(T\&) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [ToString](./tostring/)(const T\&) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [ToString](./tostring/)(T\&&) | 为 C# 的 ToString 方法提供替代，使其在任何 C++ 类型上工作。 |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | 在转换为 [Object](../object/) 后解箱值类型。针对枚举类型的实现。 |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | 在转换为 [Object](../object/) 后解箱值类型。针对非枚举且非可空类型的实现。 |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | 在转换为 [Object](../object/) 后解箱值类型。针对非枚举且非可空类型的实现。 |
| static [Unbox](./unbox/)(E) | 将枚举类型解箱为整数。 |
| static [Unbox](./unbox/)(E) | 转换枚举类型。 |
| static [Unbox](./unbox/)(const SmartPtr\<Object\>\&) | 解箱字符串值。 |
| static [UnboxStringSafe](./unboxstringsafe/)(const SmartPtr\<Object\>\&) | 从装箱值中解箱字符串。 |
| static [UnboxToNullable](./unboxtonullable/)(const SmartPtr\<Object\>\&, bool) | 将对象解箱为可空类型。 |
| static [UnknownIsNull](./unknownisnull/)(T) | 检查未知类型对象是否为 nullptr。针对非标量类型的重载。 |
| static [UnknownIsNull](./unknownisnull/)(T) | 检查未知类型对象是否为 nullptr。针对标量类型的重载。 |
| static [UnknownToObject](./unknowntoobject/)(T) | 将未知类型转换为 [Object](../object/)，处理智能指针类型和数值类型两种情况。 |
| static [UnknownToObject](./unknowntoobject/)(const T\&) | 将未知类型转换为 [Object](../object/)，处理智能指针类型和数值类型两种情况。 |
## 另见

* Class [ObjectType](../objecttype/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
