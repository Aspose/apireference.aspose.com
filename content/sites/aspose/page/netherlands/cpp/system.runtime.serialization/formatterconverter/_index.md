---
title: "System::Runtime::Serialization::FormatterConverter klasse"
linktitle: "FormatterConverter"
second_title: "Aspose.Page voor C++"
description: "System::Runtime::Serialization::FormatterConverter klasse. Vertegenwoordigt een basisimplementatie van de System::Runtime::Serialization::IFormatterConverter interface in C++."
type: docs
weight: 100
url: /nl/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


Vertegenwoordigt een basisimplementatie van de [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/) interface.

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | RTTI-informatie. |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | Converteert een waarde naar de opgegeven [System::TypeCode](../../system/typecode/). |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een bool. |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een uint8_t. |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een char16_t. |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een [DateTime](../../system/datetime/). |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een [Decimal](../../system/decimal/). |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een double. |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een int16_t. |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een int32_t. |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een int64_t. |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een int8_t. |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een float. |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een [String](../../system/string/). |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een uint16_t. |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een uint32_t. |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | Converteert een waarde naar een uint64_t. |
## Zie ook

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Page for C++](../../)
