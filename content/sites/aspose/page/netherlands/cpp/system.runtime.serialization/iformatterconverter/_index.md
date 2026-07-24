---
title: "System::Runtime::Serialization::IFormatterConverter klasse"
linktitle: "IFormatterConverter"
second_title: "Aspose.Page voor C++"
description: "System::Runtime::Serialization::IFormatterConverter klasse. Biedt de verbinding tussen een instantie van System::Runtime::Serialization::SerializationInfo en de door de formatter geleverde klasse die het meest geschikt is om de gegevens binnen de System::Runtime::Serialization::SerializationInfo te parseren in C++."
type: docs
weight: 200
url: /nl/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


Biedt de verbinding tussen een instantie van [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) en de door de formatter geleverde klasse die het meest geschikt is om de gegevens binnen de [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) te parseren.

```cpp
class IFormatterConverter : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | RTTI-informatie. |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | Converteert een waarde naar de opgegeven [System::TypeCode](../../system/typecode/). |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een bool. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een uint8_t. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een char16_t. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een [DateTime](../../system/datetime/). |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een [Decimal](../../system/decimal/). |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een double. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een int16_t. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een int32_t. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een int64_t. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een int8_t. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een float. |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een [String](../../system/string/). |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een uint16_t. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een uint32_t. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | Converteert een waarde naar een uint64_t. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
