---
title: "Clase System::Runtime::Serialization::IFormatterConverter"
linktitle: "IFormatterConverter"
second_title: "Aspose.Page para C++"
description: "Clase System::Runtime::Serialization::IFormatterConverter. Proporciona la conexión entre una instancia de System::Runtime::Serialization::SerializationInfo y la clase proporcionada por el formateador que mejor se adapta para analizar los datos dentro de System::Runtime::Serialization::SerializationInfo en C++."
type: docs
weight: 200
url: /es/cpp/system.runtime.serialization/iformatterconverter/
---
## IFormatterConverter class


Proporciona la conexión entre una instancia de [System::Runtime::Serialization::SerializationInfo](../serializationinfo/) y la clase proporcionada por el formateador que mejor se adapta para analizar los datos dentro de [System::Runtime::Serialization::SerializationInfo](../serializationinfo/).

```cpp
class IFormatterConverter : public System::Object
```

## Métodos

| Método | Descripción |
| --- | --- |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) | Información RTTI. |
| virtual [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) | Convierte un valor al [System::TypeCode](../../system/typecode/) dado. |
| virtual [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) | Convierte un valor a bool. |
| virtual [ToByte](./tobyte/)(System::SharedPtr\<Object\>) | Convierte un valor a uint8_t. |
| virtual [ToChar](./tochar/)(System::SharedPtr\<Object\>) | Convierte un valor a char16_t. |
| virtual [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) | Convierte un valor a [DateTime](../../system/datetime/). |
| virtual [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) | Convierte un valor a [Decimal](../../system/decimal/). |
| virtual [ToDouble](./todouble/)(System::SharedPtr\<Object\>) | Convierte un valor a double. |
| virtual [ToInt16](./toint16/)(System::SharedPtr\<Object\>) | Convierte un valor a int16_t. |
| virtual [ToInt32](./toint32/)(System::SharedPtr\<Object\>) | Convierte un valor a int32_t. |
| virtual [ToInt64](./toint64/)(System::SharedPtr\<Object\>) | Convierte un valor a int64_t. |
| virtual [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) | Convierte un valor a int8_t. |
| virtual [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) | Convierte un valor a float. |
| virtual [ToString](./tostring/)(System::SharedPtr\<Object\>) | Convierte un valor a [String](../../system/string/). |
| virtual [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) | Convierte un valor a uint16_t. |
| virtual [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) | Convierte un valor a uint32_t. |
| virtual [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) | Convierte un valor a uint64_t. |
## Ver también

* Class [Object](../../system/object/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
