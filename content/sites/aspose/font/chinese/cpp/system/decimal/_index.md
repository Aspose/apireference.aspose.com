---
title: "System::Decimal 类"
linktitle: "Decimal"
second_title: "Aspose.Font 适用于 C++"
description: "System::Decimal 类。表示十进制数字。此类型应在栈上分配，并通过值或引用传递给函数。切勿在 C++ 中使用 System::SmartPtr 类来管理此类型的对象。"
type: docs
weight: 1900
url: /zh/cpp/system/decimal/
---
## Decimal class


表示十进制数字。此类型应在栈上分配，并通过值或引用传递给函数。切勿使用 [System::SmartPtr](../smartptr/) 类来管理此类型的对象。

```cpp
class Decimal
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [Add](./add/)(const Decimal\&, const Decimal\&) | 添加两个指定的 [Decimal](./) 值。 |
| static [Ceiling](./ceiling/)(const Decimal\&) | 返回大于或等于指定值的最小整数值。 |
| static [Compare](./compare/)(const Decimal\&, const Decimal\&) | 确定由第一个 [Decimal](./) 对象表示的值是小于、等于还是大于由第二个 [Decimal](./) 对象表示的值。 |
| [CompareTo](./compareto/)(const Decimal\&) const | 确定当前对象表示的值是小于、等于还是大于指定对象表示的值。 |
| [Decimal](./decimal/)() | 构造一个表示 0 的实例。 |
| [Decimal](./decimal/)(std::int8_t) | 构造一个表示指定值的实例。 |
| [Decimal](./decimal/)(std::int16_t) | 构造一个表示指定值的实例。 |
| [Decimal](./decimal/)(std::int32_t) | 构造一个表示指定值的实例。 |
| [Decimal](./decimal/)(std::int64_t) | 构造一个表示指定值的实例。 |
| [Decimal](./decimal/)(std::uint8_t) | 构造一个表示指定值的实例。 |
| [Decimal](./decimal/)(std::uint16_t) | 构造一个表示指定值的实例。 |
| [Decimal](./decimal/)(std::uint32_t) | 构造一个表示指定值的实例。 |
| [Decimal](./decimal/)(std::uint64_t) | 构造一个表示指定值的实例。 |
| [Decimal](./decimal/)(float) | 构造一个表示指定值的实例。 |
| [Decimal](./decimal/)(double) | 构造一个表示指定值的实例。 |
| explicit [Decimal](./decimal/)(const std::string\&) | 构造一个实例，该实例表示的值的字符串表示形式是作为 std::string 类实例指定的。 |
| [Decimal](./decimal/)(int32_t, int32_t, int32_t, bool, uint8_t) | 从指定的组件构造一个 [Decimal](./) 对象。 |
| [Decimal](./decimal/)(const Decimal\&) | 构造一个 [Decimal](./) 类的实例，该实例表示与指定的 [Decimal](./) 对象相同的数字。 |
| [Decimal](./decimal/)(const ArrayPtr\<int32_t\>\&) | 从包含二进制表示的整数数组构造一个 [Decimal](./) 类的实例。 |
| [Decimal](./decimal/)(std::nullptr_t) | 始终抛出 ArgumentNullException。 |
| [Decimal](./decimal/)(const number_type\&) | 构造一个表示指定值的 [Decimal](./) 类实例。 |
| static [Divide](./divide/)(const Decimal\&, const Decimal\&) | 对两个指定的 [Decimal](./) 值进行除法。 |
| [Equals](./equals/)(const Decimal\&) const | 确定当前对象和指定对象所表示的值是否相等。 |
| [Equals](./equals/)(const SharedPtr\<Object\>\&) const | 确定当前对象和指定对象所表示的值是否相等。 |
| static [Equals](./equals/)(const Decimal\&, const Decimal\&) | 确定指定对象所表示的值是否相等。 |
| static [Floor](./floor/)(const Decimal\&) | 返回小于或等于指定值的最大整数值。 |
| static [FromOACurrency](./fromoacurrency/)(int64_t) | [Convert](../convert/) 将指定的 OLE 货币值转换为等效的 [Decimal](./) 值。未实现。 |
| static [GetBits](./getbits/)(const Decimal\&) | 将指定的 [Decimal](./) 对象转换为其所表示值的二进制表示形式。 |
| static [GetBytes](./getbytes/)(const Decimal\&, const System::ArrayPtr\<uint8_t\>\&) | [Convert](../convert/) 将指定的 [Decimal](./) 值转换为字节数组。 |
| [GetHashCode](./gethashcode/)() const | 返回当前对象的哈希码。 |
| [GetTypeCode](./gettypecode/)() const | 获取对象类型代码。 |
| static [Multiply](./multiply/)(const Decimal\&, const Decimal\&) | 将两个指定的 [Decimal](./) 值相乘。 |
| static [Negate](./negate/)(const Decimal\&) | 返回一个新的 [Decimal](./) 类实例，表示由指定对象所表示的值取负后得到的值。 |
| explicit [operator bool](./operatorbool/)() const | 将当前对象所表示的值转换为布尔值。 |
| explicit [operator double](./operatordouble/)() const | 将当前对象所表示的值转换为双精度浮点数。 |
| explicit [operator float](./operatorfloat/)() const | 将当前对象所表示的值转换为单精度浮点数。 |
| [operator!=](./operator!=/)(const Decimal\&) const | 确定当前对象和指定对象所表示的值是否不相等。 |
| [operator!=](./operator!=/)(std::nullptr_t) const | 确定当前对象所表示的值是否不同于 0。 |
| [operator%](./operator%/)(const Decimal\&) const | 返回一个新的 [Decimal](./) 类实例，表示对当前对象和指定对象所表示的值进行取模运算后的结果。 |
| [operator%=](./operator%=/)(const Decimal\&) | 为当前对象分配一个新值，该值是对当前对象和指定对象所表示的值进行取模运算的结果。 |
| [operator*](./operator_/)(const Decimal\&) const | 返回一个新的 [Decimal](./) 类实例，表示对当前对象和指定对象所表示的值进行乘法运算后的结果。 |
| [operator*=](./operator_=/)(const Decimal\&) | 为当前对象分配一个新值，该值是对当前对象和指定对象所表示的值进行乘法运算的结果。 |
| [operator+](./operator+/)(const Decimal\&) const | 返回一个新的 [Decimal](./) 类实例，表示当前对象和指定对象所表示的值的和。 |
| [operator++](./operator++/)() | 递增当前对象所表示的值。 |
| [operator+=](./operator+=/)(const Decimal\&) | 为当前对象分配一个新值，该值是当前对象和指定对象所表示的值的和。 |
| [operator-](./operator-/)(const Decimal\&) const | 返回一个新的 [Decimal](./) 类实例，表示从当前对象所表示的值中减去指定对象所表示的值后的结果。 |
| [operator-](./operator-/)() const | 返回一个新的 [Decimal](./) 类实例，表示对当前对象所表示的值取负后的结果。 |
| [operator--](./operator--/)() | 递减当前对象所表示的值。 |
| [operator-=](./operator-=/)(const Decimal\&) | 为当前对象分配一个新值，该值是从当前对象所表示的值中减去指定对象所表示的值的结果。 |
| [operator/](./operator//)(const Decimal\&) const | 返回一个新的 [Decimal](./) 类实例，该实例表示当前对象所表示的值除以指定对象所表示的值的结果。 |
| [operator/=](./operator/=/)(const Decimal\&) | 为当前对象分配一个新值，该值是当前对象所表示的值除以指定对象所表示的值的结果。 |
| [operator<](./operator_/)(const Decimal\&) const | 确定当前对象所表示的值是否小于指定对象所表示的值。 |
| [operator<=](./operator_=/)(const Decimal\&) const | 确定当前对象所表示的值是否小于或等于指定对象所表示的值。 |
| [operator=](./operator=/)(const Decimal\&) | 将指定对象所表示的值赋给当前对象。 |
| [operator==](./operator==/)(const Decimal\&) const | 确定当前对象和指定对象所表示的值是否相等。 |
| [operator==](./operator==/)(std::nullptr_t) const | 确定当前对象所表示的值是否为 0。 |
| [operator>](./operator_/)(const Decimal\&) const | 确定当前对象所表示的值是否大于指定对象所表示的值。 |
| [operator>=](./operator_=/)(const Decimal\&) const | 确定当前对象所表示的值是否大于或等于指定对象所表示的值。 |
| static [Parse](./parse/)(const String\&) | 将十进制数字的字符串表示转换为等效的 [Decimal](./) 类实例。 |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles) | 使用指定的样式，将十进制数字的字符串表示转换为等效的 [Decimal](./) 类实例。 |
| static [Parse](./parse/)(const String\&, const SharedPtr\<IFormatProvider\>\&) | 使用指定的格式提供程序，将十进制数字的字符串表示转换为等效的 [Decimal](./) 类实例。 |
| static [Parse](./parse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&) | 使用指定的样式和格式提供程序，将十进制数字的字符串表示转换为等效的 [Decimal](./) 类实例。 |
| static [Remainder](./remainder/)(const Decimal\&, const Decimal\&) | 计算两个 [Decimal](./) 值相除后的余数。 |
| static [Round](./round/)(const Decimal\&, MidpointRounding) | 将指定值四舍五入到最近的整数。若指定值同等接近两个最近的整数，则通过参数指定函数的行为。 |
| static [Round](./round/)(const Decimal\&, int, MidpointRounding) | 将指定值四舍五入到具有指定小数位数的最近值。若指定值同等接近两个最近的数，则通过参数指定函数的行为。 |
| static [Subtract](./subtract/)(const Decimal\&, const Decimal\&) | 从另一个指定的 [Decimal](./) 值中减去一个指定的值。 |
| static [ToByte](./tobyte/)(Decimal) | 将 [Decimal](./) 值转换为无符号 8 位整数值。 |
| static [ToDouble](./todouble/)(Decimal) | 将 [Decimal](./) 值转换为双精度浮点数。 |
| static [ToInt16](./toint16/)(Decimal) | 将 [Decimal](./) 值转换为有符号 16 位整数值。 |
| static [ToInt32](./toint32/)(Decimal) | 将 [Decimal](./) 值转换为有符号 32 位整数值。 |
| static [ToInt64](./toint64/)(Decimal) | 将 [Decimal](./) 值转换为有符号 64 位整数值。 |
| static [ToOACurrency](./tooacurrency/)(const Decimal\&) | [Convert](../convert/) 将指定的 [Decimal](./) 值转换为等效的 OLE 货币值。未实现。 |
| static [ToSByte](./tosbyte/)(Decimal) | 将 [Decimal](./) 值转换为有符号 8 位整数值。 |
| static [ToSingle](./tosingle/)(Decimal) | 将 [Decimal](./) 值转换为单精度浮点数。 |
| [ToStdString](./tostdstring/)() const | 返回一个 std::string 实例，其中包含对象所表示的值的字符串表示。 |
| [ToString](./tostring/)() const | 返回由对象表示的值的字符串表示形式。 |
| [ToString](./tostring/)(const SharedPtr\<IFormatProvider\>\&) const | 使用特定于区域性的格式信息将当前对象转换为字符串。 |
| [ToString](./tostring/)(const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const Decimal\&, std::nullptr_t) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<IFormatProvider\>\&) const | 使用指定的字符串格式以及由指定的[IFormatProvider](../iformatprovider/)对象提供的特定于区域性的格式信息，将当前对象转换为其字符串表示形式。 |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, const SharedPtr\<Globalization::NumberFormatInfo\>\&) const |  |
| [ToString](./tostring/)(const String\&, std::nullptr_t) const |  |
| [ToStringInternal](./tostringinternal/)() const | 返回由对象表示的值的字符串表示形式。供内部使用。 |
| static [ToUInt16](./touint16/)(Decimal) | 将[Decimal](./)值转换为无符号 16 位整数值。 |
| static [ToUInt32](./touint32/)(Decimal) | 将[Decimal](./)值转换为无符号 32 位整数值。 |
| static [ToUInt64](./touint64/)(Decimal) | 将[Decimal](./)值转换为无符号 64 位整数值。 |
| static [Truncate](./truncate/)(const Decimal\&) | 返回一个[Decimal](./)对象，该对象表示一个值，其整数部分等于由指定的[Decimal](./)对象所表示的值的整数部分，且所有小数位均被舍弃。 |
| static [TryParse](./tryparse/)(const String\&, Decimal\&) | 将包含数字字符串表示的指定字符串转换为等价的[Decimal](./)值。 |
| static [TryParse](./tryparse/)(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) | 使用提供的格式信息和数字样式，将包含数字字符串表示的指定字符串转换为等价的[Decimal](./)值。 |
| static [Type](./type/)() | 返回一个引用，指向表示[Decimal](./)类类型信息的[TypeInfo](../typeinfo/)对象。 |
| [~Decimal](./~decimal/)() | 析构函数。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [MaxValue](./maxvalue/) | 表示[Decimal](./)类能够表示的最大数值。 |
| static [MinusOne](./minusone/) | 表示数字 -1。 |
| static [MinValue](./minvalue/) | 表示[Decimal](./)类能够表示的最小数值。 |
| static [One](./one/) | 表示数字 1。 |
| static [Zero](./zero/) | 表示数字 0。 |
## Typedefs

| 类型定义 | 描述 |
| --- | --- |
| [number_type](./number_type/) | Detail::decimal_number_type 的别名。 |
## 备注



```cpp
#include "system/console.h"
#include "system/decimal.h"

int main()
{
  using namespace System;

  Console::WriteLine(Decimal::MinValue);
  Console::WriteLine(Decimal::MaxValue);

  auto dividend = Decimal::One;
  auto divisor = 6;
  Console::WriteLine(dividend/divisor);

  return 0;
}
/*
This code example produces the following output:
-79228162514264337593543950335
79228162514264337593543950335
0,1666666666666666666666666667
*/
```

## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
