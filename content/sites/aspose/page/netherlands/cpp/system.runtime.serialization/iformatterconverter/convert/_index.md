---
title: "System::Runtime::Serialization::IFormatterConverter::Convert methode"
linktitle: "Converteren"
second_title: "Aspose.Page voor C++"
description: "System::Runtime::Serialization::IFormatterConverter::Convert methode. RTTI‑informatie in C++."
type: docs
weight: 100
url: /nl/cpp/system.runtime.serialization/iformatterconverter/convert/
---
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI-informatie.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | Het object dat moet worden geconverteerd. |
| type | const TypeInfo\& | De [System::TypeInfo](../../../system/typeinfo/) waarin de waarde moet worden geconverteerd. |

### ReturnValue

De geconverteerde waarde.
## Opmerkingen


Converteert een waarde naar de opgegeven [System::TypeInfo](../../../system/typeinfo/).
## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Converteert een waarde naar de opgegeven [System::TypeCode](../../../system/typecode/).

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | Het object dat moet worden geconverteerd. |
| typeCode | TypeCode | De [System::TypeCode](../../../system/typecode/) waarin de waarde moet worden geconverteerd. |

### ReturnValue

De geconverteerde waarde.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
