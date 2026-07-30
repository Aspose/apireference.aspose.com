---
title: "System::Runtime::Serialization::FormatterConverter classe"
linktitle: "FormatterConverter"
second_title: "Aspose.Font pour C++"
description: "classe System::Runtime::Serialization::FormatterConverter. Représente une implémentation de base de l'interface System::Runtime::Serialization::IFormatterConverter en C++."
type: docs
weight: 100
url: /fr/cpp/system.runtime.serialization/formatterconverter/
---
## FormatterConverter class


Représente une implémentation de base de l'interface [System::Runtime::Serialization::IFormatterConverter](../iformatterconverter/).

```cpp
class FormatterConverter : public System::Runtime::Serialization::IFormatterConverter
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Convert](./convert/)(System::SharedPtr\<Object\>, const TypeInfo\&) override | Informations RTTI. |
| [Convert](./convert/)(System::SharedPtr\<Object\>, TypeCode) override | Convertit une valeur en le [System::TypeCode](../../system/typecode/) donné. |
| [ToBoolean](./toboolean/)(System::SharedPtr\<Object\>) override | Convertit une valeur en booléen. |
| [ToByte](./tobyte/)(System::SharedPtr\<Object\>) override | Convertit une valeur en uint8_t. |
| [ToChar](./tochar/)(System::SharedPtr\<Object\>) override | Convertit une valeur en char16_t. |
| [ToDateTime](./todatetime/)(System::SharedPtr\<Object\>) override | Convertit une valeur en [DateTime](../../system/datetime/). |
| [ToDecimal](./todecimal/)(System::SharedPtr\<Object\>) override | Convertit une valeur en [Decimal](../../system/decimal/). |
| [ToDouble](./todouble/)(System::SharedPtr\<Object\>) override | Convertit une valeur en double. |
| [ToInt16](./toint16/)(System::SharedPtr\<Object\>) override | Convertit une valeur en int16_t. |
| [ToInt32](./toint32/)(System::SharedPtr\<Object\>) override | Convertit une valeur en int32_t. |
| [ToInt64](./toint64/)(System::SharedPtr\<Object\>) override | Convertit une valeur en int64_t. |
| [ToSByte](./tosbyte/)(System::SharedPtr\<Object\>) override | Convertit une valeur en int8_t. |
| [ToSingle](./tosingle/)(System::SharedPtr\<Object\>) override | Convertit une valeur en float. |
| [ToString](./tostring/)(System::SharedPtr\<Object\>) override | Convertit une valeur en [String](../../system/string/). |
| [ToUInt16](./touint16/)(System::SharedPtr\<Object\>) override | Convertit une valeur en uint16_t. |
| [ToUInt32](./touint32/)(System::SharedPtr\<Object\>) override | Convertit une valeur en uint32_t. |
| [ToUInt64](./touint64/)(System::SharedPtr\<Object\>) override | Convertit une valeur en uint64_t. |
## Voir aussi

* Class [IFormatterConverter](../iformatterconverter/)
* Namespace [System::Runtime::Serialization](../)
* Library [Aspose.Font for C++](../../)
