---
title: "System::Runtime::Serialization::FormatterConverter Klasse"
linktitle: "FormatterConverter"
second_title: "Aspose.Font für C++"
description: "System::Runtime::Serialization::FormatterConverter Klasse. Stellt eine Basisimplementierung des System::Runtime::Serialization::IFormatterConverter Interfaces in C++ dar."
type: docs
weight: 100
url: /de/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


Stellt eine Basisimplementierung des [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/) Interfaces dar.

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | RTTI-Informationen. |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | Konvertiert einen Wert in den angegebenen [System::TypeCode](../../system/typecode/). |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen bool. |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen uint8_t. |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen char16_t. |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein [DateTime](../../system/datetime/). |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein [Decimal](../../system/decimal/). |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen double. |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen int16_t. |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen int32_t. |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen int64_t. |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen int8_t. |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen float. |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen [String](../../system/string/). |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen uint16_t. |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen uint32_t. |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen uint64_t. |
## Siehe auch

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
