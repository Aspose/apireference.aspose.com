---
title: "System::Runtime::Serialization::IFormatterConverter::Convert metodo"
linktitle: "Convert"
second_title: "Aspose.Font per C++"
description: "System::Runtime::Serialization::IFormatterConverter::Convert metodo. Informazioni RTTI in C++."
type: docs
weight: 100
url: /it/cpp/system.runtime.serialization/iformatterconverter/convert/
---
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


Informazioni RTTI.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type)=0
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
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Converte un valore nel [System::TypeCode](../../../system/typecode/).

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode)=0
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
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
