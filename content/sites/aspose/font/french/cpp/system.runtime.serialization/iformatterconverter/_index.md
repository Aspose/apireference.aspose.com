---
title: "System::Runtime::Serialization::IFormatterConverter classe"
linktitle: "IFormatterConverter"
second_title: "Aspose.Font pour C++"
description: "System::Runtime::Serialization::IFormatterConverter classe. Fournit la connexion entre une instance de System::Runtime::Serialization::SerializationInfo et la classe fournie par le formateur la mieux adaptée pour analyser les données à l'intérieur de System::Runtime::Serialization::SerializationInfo en C++."
type: docs
weight: 200
url: /fr/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


Fournit la connexion entre une instance de [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) et la classe fournie par le formateur la mieux adaptée pour analyser les données à l'intérieur de [System::Runtime::Serialization::SerializationInfo](../serializationinfo/).

```cpp
class IFormatterConverter : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | Informations RTTI. |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | Convertit une valeur en le [System::TypeCode](../../system/typecode/) donné. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | Convertit une valeur en booléen. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | Convertit une valeur en uint8_t. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | Convertit une valeur en char16_t. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | Convertit une valeur en [DateTime](../../system/datetime/). |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | Convertit une valeur en [Decimal](../../system/decimal/). |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | Convertit une valeur en double. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | Convertit une valeur en int16_t. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | Convertit une valeur en int32_t. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | Convertit une valeur en int64_t. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | Convertit une valeur en int8_t. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | Convertit une valeur en float. |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | Convertit une valeur en [String](../../system/string/). |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | Convertit une valeur en uint16_t. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | Convertit une valeur en uint32_t. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | Convertit une valeur en uint64_t. |
## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
