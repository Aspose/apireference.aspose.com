---
title: "System::Runtime::Serialization::FormatterConverter classe"
linktitle: "FormatterConverter"
second_title: "Aspose.Font per C++"
description: "System::Runtime::Serialization::FormatterConverter classe. Rappresenta un'implementazione di base dell'interfaccia System::Runtime::Serialization::IFormatterConverter in C++."
type: docs
weight: 100
url: /it/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


Rappresenta un'implementazione di base dell'interfaccia [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/).

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | Informazioni RTTI. |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | Converte un valore al [System::TypeCode](../../system/typecode/) fornito. |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | Converte un valore in un bool. |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | Converte un valore in un uint8_t. |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | Converte un valore in un char16_t. |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | Converte un valore in un [DateTime](../../system/datetime/). |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | Converte un valore in un [Decimal](../../system/decimal/). |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | Converte un valore in un double. |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | Converte un valore in un int16_t. |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | Converte un valore in un int32_t. |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | Converte un valore in un int64_t. |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | Converte un valore in un int8_t. |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | Converte un valore in un float. |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | Converte un valore in un [String](../../system/string/). |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | Converte un valore in un uint16_t. |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | Converte un valore in un uint32_t. |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | Converte un valore in un uint64_t. |
## Vedi anche

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
