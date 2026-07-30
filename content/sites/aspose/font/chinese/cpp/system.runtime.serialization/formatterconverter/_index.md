---
title: "System::Runtime::Serialization::FormatterConverter 类"
linktitle: "FormatterConverter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Runtime::Serialization::FormatterConverter 类。表示在 C++ 中对 System::Runtime::Serialization::IFormatterConverter 接口的基本实现。"
type: docs
weight: 100
url: /zh/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


表示对 [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/) 接口的基本实现。

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | RTTI 信息。 |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | 将值转换为给定的 [System::TypeCode](../../system/typecode/)。 |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | 将值转换为布尔值。 |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | 将一个值转换为 uint8_t。 |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | 将一个值转换为 char16_t。 |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | 将一个值转换为 [DateTime](../../system/datetime/)。 |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | 将一个值转换为 [Decimal](../../system/decimal/)。 |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | 将一个值转换为 double。 |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | 将一个值转换为 int16_t。 |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | 将一个值转换为 int32_t。 |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | 将一个值转换为 int64_t。 |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | 将一个值转换为 int8_t。 |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | 将一个值转换为 float。 |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | 将一个值转换为 [String](../../system/string/)。 |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | 将一个值转换为 uint16_t。 |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | 将一个值转换为 uint32_t。 |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | 将一个值转换为 uint64_t。 |
## 另见

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
