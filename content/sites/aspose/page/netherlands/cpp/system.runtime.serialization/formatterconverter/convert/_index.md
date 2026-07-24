---
title: "System::Runtime::Serialization::FormatterConverter::Convert methode"
linktitle: "Converteren"
second_title: "Aspose.Page voor C++"
description: "System::Runtime::Serialization::FormatterConverter::Convert methode. RTTI-informatie in C++."
type: docs
weight: 100
url: /nl/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI-informatie.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
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
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Converteert een waarde naar de opgegeven [System::TypeCode](../../../system/typecode/).

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
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
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
