---
title: "System::Runtime::Serialization::IFormatterConverter::Convert méthode"
linktitle: "Convert"
second_title: "Aspose.Font pour C++"
description: "System::Runtime::Serialization::IFormatterConverter::Convert méthode. Informations RTTI en C++."
type: docs
weight: 100
url: /fr/cpp/system.runtime.serialization/iformatterconverter/convert/
---
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


Informations RTTI.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | System::SharedPtr\<Object\> | L'objet à convertir. |
| type | const TypeInfo\& | Le [System::TypeInfo](../../../system/typeinfo/) dans lequel la valeur doit être convertie. |

### ReturnValue

La valeur convertie.
## Remarques


Convertit une valeur en le [System::TypeInfo](../../../system/typeinfo/) spécifié.
## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
## IFormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Convertit une valeur en le [System::TypeCode](../../../system/typecode/) spécifié.

```cpp
virtual System::SharedPtr<Object> System::Runtime::Serialization::IFormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode)=0
```


| Paramètre | Type | Description |
| --- | --- | --- |
| valeur | System::SharedPtr\<Object\> | L'objet à convertir. |
| typeCode | TypeCode | Le [System::TypeCode](../../../system/typecode/) dans lequel la valeur doit être convertie. |

### ReturnValue

La valeur convertie.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [IFormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Font for C++](../../../)
