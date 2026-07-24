---
title: "System::Runtime::Serialization::IFormatterConverter 类"
linktitle: "IFormatterConverter"
second_title: "Aspose.Page 适用于 C++"
description: "System::Runtime::Serialization::IFormatterConverter 类。提供实例 System::Runtime::Serialization::SerializationInfo 与最适合在 C++ 中解析 System::Runtime::Serialization::SerializationInfo 内部数据的格式化程序提供的类之间的连接。"
type: docs
weight: 200
url: /zh/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


提供实例 [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) 与最适合解析 [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) 内部数据的格式化程序提供的类之间的连接。

```cpp
class IFormatterConverter : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | RTTI 信息。 |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | 将值转换为给定的 [System::TypeCode](../../system/typecode/)。 |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | 将值转换为 bool。 |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | 将值转换为 uint8_t。 |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | 将值转换为 char16_t。 |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | 将值转换为 [DateTime](../../system/datetime/)。 |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | 将值转换为 [Decimal](../../system/decimal/)。 |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | 将值转换为 double。 |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | 将值转换为 int16_t。 |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | 将值转换为 int32_t。 |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | 将值转换为 int64_t。 |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | 将值转换为 int8_t。 |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | 将值转换为 float。 |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | 将值转换为 [String](../../system/string/)。 |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | 将值转换为 uint16_t。 |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | 将值转换为 uint32_t。 |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | 将值转换为 uint64_t。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
