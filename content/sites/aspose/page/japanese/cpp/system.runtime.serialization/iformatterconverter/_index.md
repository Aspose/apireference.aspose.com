---
title: "System::Runtime::Serialization::IFormatterConverter クラス"
linktitle: "IFormatterConverter"
second_title: "C++ 用 Aspose.Page"
description: "System::Runtime::Serialization::IFormatterConverter クラス。C++ において、System::Runtime::Serialization::SerializationInfo のインスタンスと、SerializationInfo 内のデータを解析するのに最適なフォーマッタ提供クラスとの接続を提供します。"
type: docs
weight: 200
url: /ja/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


[System::Runtime::Serialization::SerializationInfo](../serializationinfo/) のインスタンスと、SerializationInfo 内のデータを解析するのに最適なフォーマッタ提供クラスとの接続を提供します。

```cpp
class IFormatterConverter : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | RTTI 情報。 |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | 値を指定された [System::TypeCode](../../system/typecode/) に変換します。 |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | 値を bool に変換します。 |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | 値を uint8_t に変換します。 |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | 値を char16_t に変換します。 |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | 値を [DateTime](../../system/datetime/) に変換します。 |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | 値を [Decimal](../../system/decimal/) に変換します。 |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | 値を double に変換します。 |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | 値を int16_t に変換します。 |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | 値を int32_t に変換します。 |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | 値を int64_t に変換します。 |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | 値を int8_t に変換します。 |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | 値を float に変換します。 |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | 値を [String](../../system/string/) に変換します。 |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | 値を uint16_t に変換します。 |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | 値を uint32_t に変換します。 |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | 値を uint64_t に変換します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
