---
title: "System::Runtime::Serialization::FormatterConverter Klasse"
linktitle: "FormatterConverter"
second_title: "Aspose.Page für C++"
description: "System::Runtime::Serialization::FormatterConverter Klasse. Stellt eine Basisimplementierung der System::Runtime::Serialization::IFormatterConverter Schnittstelle in C++ dar."
type: docs
weight: 100
url: /de/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


Stellt eine Basisimplementierung der [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/) Schnittstelle dar.

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | RTTI-Informationen. |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | Konvertiert einen Wert in den angegebenen [System::TypeCode](../../system/typecode/). |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in einen bool. |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein uint8_t. |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein char16_t. |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein [DateTime](../../system/datetime/). |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein [Decimal](../../system/decimal/). |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein double. |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein int16_t. |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein int32_t. |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein int64_t. |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein int8_t. |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein float. |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein [String](../../system/string/). |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein uint16_t. |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein uint32_t. |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | Konvertiert einen Wert in ein uint64_t. |
## Siehe auch

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
