---
title: "System::Runtime::Serialization::IFormatterConverter Klasse"
linktitle: "IFormatterConverter"
second_title: "Aspose.Font für C++"
description: "System::Runtime::Serialization::IFormatterConverter Klasse. Stellt die Verbindung zwischen einer Instanz von System::Runtime::Serialization::SerializationInfo und der vom Formatter bereitgestellten Klasse her, die am besten geeignet ist, die Daten innerhalb von System::Runtime::Serialization::SerializationInfo in C++ zu analysieren."
type: docs
weight: 200
url: /de/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


Stellt die Verbindung zwischen einer Instanz von [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) und der vom Formatter bereitgestellten Klasse her, die am besten geeignet ist, die Daten innerhalb von [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) zu analysieren.

```cpp
class IFormatterConverter : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | RTTI-Informationen. |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | Konvertiert einen Wert in den angegebenen [System::TypeCode](../../system/typecode/). |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen bool. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen uint8_t. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen char16_t. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in ein [DateTime](../../system/datetime/). |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in ein [Decimal](../../system/decimal/). |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen double. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen int16_t. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen int32_t. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen int64_t. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen int8_t. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen float. |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen [String](../../system/string/). |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen uint16_t. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen uint32_t. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | Konvertiert einen Wert in einen uint64_t. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
