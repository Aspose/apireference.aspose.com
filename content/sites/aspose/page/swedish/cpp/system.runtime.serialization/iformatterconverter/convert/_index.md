---
title: "System::Runtime::Serialization::IFormatterConverter::Convert-metod"
linktitle: "Konvertera"
second_title: "Aspose.Page för C++"
description: "System::Runtime::Serialization::IFormatterConverter::Convert-metod. RTTI-information i C++."
type: docs
weight: 100
url: /sv/cpp/system.runtime.serialization/iformatterconverter/convert/
---
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


RTTI-information.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | Objektet som ska konverteras. |
| type | const TypeInfo\& | Den [System::TypeInfo](../../../system/typeinfo/) till vilken värdet ska konverteras. |

### ReturnValue

Det konverterade värdet.
## Anmärkningar


Konverterar ett värde till den angivna [System::TypeInfo](../../../system/typeinfo/).
## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Konverterar ett värde till den angivna [System::TypeCode](../../../system/typecode/).

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | Objektet som ska konverteras. |
| typeCode | TypeCode | Den [System::TypeCode](../../../system/typecode/) till vilken värdet ska konverteras. |

### ReturnValue

Det konverterade värdet.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
