---
title: "System::Runtime::Serialization::IFormatterConverter::Convert Methode"
linktitle: "Convert"
second_title: "Aspose.Font für C++"
description: "System::Runtime::Serialization::IFormatterConverter::Convert Methode. RTTI-Informationen in C++."
type: docs
weight: 100
url: /de/cpp/system.runtime.serialization/iformatterconverter/convert/
---
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI-Informationen.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | System::SharedPtr\<Object\> | Das zu konvertierende Objekt. |
| type | const TypeInfo\& | Der [System::TypeInfo](../../../system/typeinfo/) in den der Wert konvertiert werden soll. |

### ReturnValue

Der konvertierte Wert.
## Hinweise


Konvertiert einen Wert zum angegebenen [System::TypeInfo](../../../system/typeinfo/).
## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Konvertiert einen Wert zum angegebenen [System::TypeCode](../../../system/typecode/).

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | System::SharedPtr\<Object\> | Das zu konvertierende Objekt. |
| typeCode | TypeCode | Der [System::TypeCode](../../../system/typecode/) in den der Wert konvertiert werden soll. |

### ReturnValue

Der konvertierte Wert.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
