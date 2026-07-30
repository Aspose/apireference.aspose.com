---
title: "System::Runtime::Serialization::IFormatterConverter classe"
linktitle: "IFormatterConverter"
second_title: "Aspose.Font per C++"
description: "System::Runtime::Serialization::IFormatterConverter classe. Fornisce la connessione tra un'istanza di System::Runtime::Serialization::SerializationInfo e la classe fornita dal formatter più adatta a interpretare i dati all'interno di System::Runtime::Serialization::SerializationInfo in C++."
type: docs
weight: 200
url: /it/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


Fornisce la connessione tra un'istanza di [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) e la classe fornita dal formatter più adatta a interpretare i dati all'interno di [System::Runtime::Serialization::SerializationInfo](../serializationinfo/).

```cpp
class IFormatterConverter : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | Informazioni RTTI. |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | Converte un valore al [System::TypeCode](../../system/typecode/) fornito. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | Converte un valore in un bool. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | Converte un valore in un uint8_t. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | Converte un valore in un char16_t. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | Converte un valore in un [DateTime](../../system/datetime/). |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | Converte un valore in un [Decimal](../../system/decimal/). |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | Converte un valore in un double. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | Converte un valore in un int16_t. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | Converte un valore in un int32_t. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | Converte un valore in un int64_t. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | Converte un valore in un int8_t. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | Converte un valore in un float. |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | Converte un valore in un [String](../../system/string/). |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | Converte un valore in un uint16_t. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | Converte un valore in un uint32_t. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | Converte un valore in un uint64_t. |
## Vedi anche

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
