---
title: "System::Nullable class"
linktitle: "Nullable"
second_title: "Aspose.Font 适用于 C++"
description: "System::Nullable class。C++ 中的前向声明。"
type: docs
weight: 4600
url: /zh/cpp/system/nullable/
---
## Nullable class


前向声明。

```cpp
template<typename T>class Nullable
```


| 参数 | 描述 |
| --- | --- |
| T | 被 [Nullable](./) 类扩展的底层值类型 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [Equals](./equals/)(const T1\&) const | 确定当前对象表示的值是否等于指定的 [Nullable](./) 对象表示的值。 |
| [get_HasValue](./get_hasvalue/)() const | 确定当前对象是否表示任何值。 |
| [get_Value](./get_value/)() const | 返回当前对象表示的值的副本。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [GetValueOrDefault](./getvalueordefault/)(T) | 返回当前对象表示的值；如果当前对象表示的值为 null，则返回指定的值。 |
| [GetValueOrDefault](./getvalueordefault/)() |  |
| [IsNull](./isnull/)() const | 确定当前对象是否表示 null 值。 |
| [Nullable](./nullable/)() | 构造表示 null 值的实例。 |
| [Nullable](./nullable/)(std::nullptr_t) | 构造表示 null 的实例。 |
| [Nullable](./nullable/)(const T1\&) | 构造一个 [Nullable](./) 类的实例，该实例表示指定的值（如有必要会转换为底层类型 T 的值）。 |
| [Nullable](./nullable/)(const Nullable\<T1\>\&) | 构造一个实例，该实例表示由指定的 [Nullable](./) 对象所表示的值。指定的可空对象可能表示的值类型与构造实例的底层类型不同，在这种情况下，表示的值将转换为类型 T 的值。 |
| [NullableBoolHelper](./nullableboolhelper/)(const T1\&, const std::function\<bool()>\&, bool) const | 帮助函数，用于检查 this 和 **other** 是否均非空，并在满足条件时调用 lambda。用于实现中。 |
| [operator const T &](./operatorconstt&/)() const | 返回当前对象所表示值的常量引用。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 确定当前对象所表示的值是否为非空。 |
| [operator!=](./operator!=/)(const T1\&) const | 确定当前对象所表示的值是否不等于指定的值。 |
| [operator!=](./operator!=/)(const Nullable\<T1\>\&) const | 确定当前对象所表示的值是否不等于由指定的 [Nullable](./) 对象所表示的值。 |
| [operator&=](./operator&=/)(bool) | 对当前对象所表示的值应用 [operator&=()](./operator&=/)，使用指定的值作为右侧参数。 |
| [operator+](./operator+/)(std::nullptr_t) const | 返回 Nullable<T> 类的默认构造实例。 |
| [operator+](./operator+/)(const T1\&) const | 对可空值和非可空值进行求和。 |
| [operator+](./operator+/)(const Nullable\<T1\>\&) const | 对可空值进行求和。 |
| [operator+=](./operator+=/)(std::nullptr_t) | 重置当前对象，使其表示一个空值。 |
| [operator+=](./operator+=/)(const T1\&) | 对当前对象所表示的值应用 [operator+=()](./operator+=/)，使用指定的值作为右侧参数。 |
| [operator+=](./operator+=/)(const Nullable\<T1\>\&) | 对当前对象所表示的值应用 [operator+=()](./operator+=/)，使用指定的 [Nullable](./) 对象所表示的值作为右侧参数。 |
| [operator-](./operator-/)(T1) const | 对可空值和空值进行相减。 |
| [operator-](./operator-/)(const T1\&) const | 对可空值和非可空值进行相减。 |
| [operator-](./operator-/)(const Nullable\<T1\>\&) const | 对可空值进行相减。 |
| [operator-=](./operator-=/)(T1) | 返回表示空值的 [Nullable](./) 类实例。 |
| [operator-=](./operator-=/)(const T1\&) | 对当前对象所表示的值应用 [operator-=()](./operator-=/)，使用指定的值作为右侧参数。 |
| [operator-=](./operator-=/)(const Nullable\<T1\>\&) | 对当前对象所表示的值应用 [operator-=()](./operator-=/)，使用指定的 [Nullable](./) 对象所表示的值作为右侧参数。 |
| [operator<](./operator_/)(std::nullptr_t) const | 始终返回 false。 |
| [operator<](./operator_/)(const T1\&) const | 通过对这些值应用 [operator<()](./operator_/) 来确定当前对象所表示的值是否小于指定的值。 |
| [operator<](./operator_/)(const Nullable\<T1\>\&) const | 通过对这些值应用 [operator<()](./operator_/) 来确定当前对象所表示的值是否小于指定的 [Nullable](./) 对象所表示的值。 |
| [operator<=](./operator_=/)(std::nullptr_t) const | 始终返回 false。 |
| [operator<=](./operator_=/)(const T1\&) const | 通过对这些值应用 [operator<=()](./operator_=/) 来确定当前对象所表示的值是否小于或等于指定的值。 |
| [operator<=](./operator_=/)(const Nullable\<T1\>\&) const | 通过对这些值应用 [operator<=()](./operator_=/) 来确定当前对象所表示的值是否小于或等于指定的 [Nullable](./) 对象所表示的值。 |
| [operator=](./operator=/)(std::nullptr_t) | 将空值赋给当前对象。 |
| [operator=](./operator=/)(const T1\&) | 用指定的值替换对象当前表示的值。 |
| [operator=](./operator=/)(const Nullable\<T1\>\&) | 用指定的值替换对象当前表示的值。 |
| [operator==](./operator==/)(std::nullptr_t) const | 确定当前对象表示的值是否为 null。 |
| [operator==](./operator==/)(const T1\&) const | 确定当前对象表示的值是否等于指定的值。 |
| [operator==](./operator==/)(const Nullable\<T1\>\&) const | 确定当前对象表示的值是否等于指定的 [Nullable](./) 对象表示的值。 |
| [operator>](./operator_/)(std::nullptr_t) const | 始终返回 false。 |
| [operator>](./operator_/)(const T1\&) const | 通过对这些值应用 [operator>()](./operator_/) 来确定当前对象表示的值是否大于指定的值。 |
| [operator>](./operator_/)(const Nullable\<T1\>\&) const | 通过对这些值应用 [operator>()](./operator_/) 来确定当前对象表示的值是否大于指定的 [Nullable](./) 对象表示的值。 |
| [operator>=](./operator_=/)(std::nullptr_t) const | 始终返回 false。 |
| [operator>=](./operator_=/)(const T1\&) const | 通过对这些值应用 [operator>=()](./operator_=/) 来确定当前对象表示的值是否大于或等于指定对象表示的值。 |
| [operator>=](./operator_=/)(const Nullable\<T1\>\&) const | 通过对这些值应用 [operator>=()](./operator_=/) 来确定当前对象表示的值是否大于或等于指定的 [Nullable](./) 对象表示的值。 |
| [operator | =](./operator_=/)(bool) | 应用 [operator | =()](./operator_=/) 对当前对象表示的值使用指定的值作为右侧参数。 |
| [reset](./reset/)() | 将当前表示的值设为 null。 |
| [set_Value](./set_value/)(const T\&) | 为可空对象设置新值。 |
| [ToString](./tostring/)() const | 将当前对象表示的值转换为字符串。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [ValueType](./valuetype/) | 此类表示的值类型的别名。 |
## 备注


表示一种可以赋值为 null 的指定类型的值。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
