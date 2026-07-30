---
title: "System::EnumValues 类"
linktitle: "EnumValues"
second_title: "Aspose.Font 适用于 C++"
description: "System::EnumValues 类。提供关于 C++ 中枚举类型 E 的枚举常量的元信息。"
type: docs
weight: 2300
url: /zh/cpp/system/enumvalues/
---
## EnumValues class


提供关于枚举类型 **E** 的枚举常量的元信息。

```cpp
template<typename E,class Guard>class EnumValues : public System::EnumValuesBase
```


| 参数 | 描述 |
| --- | --- |
| E | 枚举的类型 |
## 方法

| 方法 | 描述 |
| --- | --- |
| [EnumValues](./enumvalues/)() | 构造一个实例。 |
| [GetNames](./getnames/)() const override | 返回包含枚举 **E** 所有名称的数组。 |
| static [GetNames](../enumvaluesbase/getnames/)(const TypeInfo\&) | 检索指定枚举中常量名称的数组。 |
| [GetUnderlyingType](./getunderlyingtype/)() const override | 返回指定枚举的底层类型。 |
| static [GetUnderlyingType](../enumvaluesbase/getunderlyingtype/)(const TypeInfo\&) | 返回指定枚举的底层类型。 |
| [GetValueOf](./getvalueof/)(const String\&, bool) const override | 返回具有指定名称的枚举常量的装箱值。 |
| [GetValueOf](./getvalueof/)(long) const override | 返回具有指定值的枚举常量的装箱值。 |
| [GetValues](./getvalues/)() const override | 返回包含枚举 **E** 所有值的数组。 |
| static [GetValues](../enumvaluesbase/getvalues/)(const TypeInfo\&) | 返回包含指定枚举类型所有值的数组。 |
| static [Parse](../enumvaluesbase/parse/)(const TypeInfo\&, const String\&, bool) | 返回一个对象，该对象表示具有指定名称的指定枚举类型的枚举常量值。 |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, uint64_t) | 转换指定的 64 位无符号整数值为枚举成员。 |
| static [ToObject](../enumvaluesbase/toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | 将具有整数值的指定对象转换为枚举成员。 |
| virtual [~EnumValues](./~enumvalues/)() | 析构函数。 |

## 另见

* Class [EnumValuesBase](../enumvaluesbase/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
