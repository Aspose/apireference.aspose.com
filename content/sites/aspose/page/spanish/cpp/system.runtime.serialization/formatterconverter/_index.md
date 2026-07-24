---
title: "Clase System::Runtime::Serialization::FormatterConverter"
linktitle: "FormatterConverter"
second_title: "Aspose.Page para C++"
description: "Clase System::Runtime::Serialization::FormatterConverter. Representa una implementación base de la interfaz System::Runtime::Serialization::IFormatterConverter en C++."
type: docs
weight: 100
url: /es/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


Representa una implementación base de la interfaz [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/).

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | Información RTTI. |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | Convierte un valor al [System::TypeCode](../../system/typecode/) dado. |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | Convierte un valor a bool. |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | Convierte un valor a uint8_t. |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | Convierte un valor a char16_t. |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | Convierte un valor a [DateTime](../../system/datetime/). |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | Convierte un valor a [Decimal](../../system/decimal/). |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | Convierte un valor a double. |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | Convierte un valor a int16_t. |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | Convierte un valor a int32_t. |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | Convierte un valor a int64_t. |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | Convierte un valor a int8_t. |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | Convierte un valor a float. |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | Convierte un valor a [String](../../system/string/). |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | Convierte un valor a uint16_t. |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | Convierte un valor a uint32_t. |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | Convierte un valor a uint64_t. |
## Ver también

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
