---
title: "System::Runtime::Serialization::FormatterConverter クラス"
linktitle: "FormatterConverter"
second_title: "C++ 用 Aspose.Page"
description: "System::Runtime::Serialization::FormatterConverter クラス。C++ における System::Runtime::Serialization::IFormatterConverter インターフェイスの基本実装を表します。"
type: docs
weight: 100
url: /ja/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


[System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/) インターフェイスの基本実装を表します。

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | RTTI 情報。 |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | 値を指定された [System::TypeCode](../../system/typecode/) に変換します。 |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | 値を bool に変換します。 |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | 値を uint8_t に変換します。 |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | 値を char16_t に変換します。 |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | 値を [DateTime](../../system/datetime/) に変換します。 |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | 値を [Decimal](../../system/decimal/) に変換します。 |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | 値を double に変換します。 |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | 値を int16_t に変換します。 |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | 値を int32_t に変換します。 |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | 値を int64_t に変換します。 |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | 値を int8_t に変換します。 |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | 値を float に変換します。 |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | 値を [String](../../system/string/) に変換します。 |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | 値を uint16_t に変換します。 |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | 値を uint32_t に変換します。 |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | 値を uint64_t に変換します。 |
## 参照

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
