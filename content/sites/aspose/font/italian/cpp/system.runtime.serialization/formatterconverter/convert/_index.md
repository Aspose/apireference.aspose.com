---
title: "System::Runtime::Serialization::FormatterConverter::Convert metodo"
linktitle: "Convert"
second_title: "Aspose.Font per C++"
description: "System::Runtime::Serialization::FormatterConverter::Convert metodo. Informazioni RTTI in C++."
type: docs
weight: 100
url: /it/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


Informazioni RTTI.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | System::SharedPtr\<Object\> | L'oggetto da convertire. |
| type | const TypeInfo\& | Il [System::TypeInfo](../../../system/typeinfo/) in cui il valore deve essere convertito. |

### ReturnValue

Il valore convertito.
## Osservazioni


Converte un valore nel [System::TypeInfo](../../../system/typeinfo/).
## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Converte un valore nel [System::TypeCode](../../../system/typecode/).

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | System::SharedPtr\<Object\> | L'oggetto da convertire. |
| typeCode | TypeCode | Il [System::TypeCode](../../../system/typecode/) in cui il valore deve essere convertito. |

### ReturnValue

Il valore convertito.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
