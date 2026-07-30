---
title: "System::EnumValuesBase 类"
linktitle: "EnumValuesBase"
second_title: "Aspose.Font 适用于 C++"
description: "System::EnumValuesBase 类。一个用于表示 C++ 中枚举类型元信息的类的基类。"
type: docs
weight: 2400
url: /zh/cpp/system/enumvaluesbase/
---
## EnumValuesBase class


一个用于表示枚举类型元信息的类的基类。

```cpp
class EnumValuesBase
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [GetNames](./getnames/)(const TypeInfo\&) | 检索指定枚举中常量名称的数组。 |
| static [GetUnderlyingType](./getunderlyingtype/)(const TypeInfo\&) | 返回指定枚举的底层类型。 |
| static [GetValues](./getvalues/)(const TypeInfo\&) | 返回包含指定枚举类型所有值的数组。 |
| static [Parse](./parse/)(const TypeInfo\&, const String\&, bool) | 返回一个对象，该对象表示具有指定名称的指定枚举类型的枚举常量值。 |
| static [ToObject](./toobject/)(const TypeInfo\&, uint64_t) | 转换指定的 64 位无符号整数值为枚举成员。 |
| static [ToObject](./toobject/)(const TypeInfo\&, const SharedPtr\<Object\>\&) | 将具有整数值的指定对象转换为枚举成员。 |
## 另见

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
