---
title: "System::Runtime::Serialization::FormatterConverter::Convert méthode"
linktitle: "Convertir"
second_title: "Aspose.Page pour C++"
description: "System::Runtime::Serialization::FormatterConverter::Convert méthode. Informations RTTI en C++."
type: docs
weight: 100
url: /fr/cpp/system.runtime.serialization/formatterconverter/convert/
---
## FormatterConverter::Convert(System::SharedPtr\<Object\>, const TypeInfo\&) method


Informations RTTI.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, const TypeInfo &type) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | L'objet à convertir. |
| type | const TypeInfo\& | Le [System::TypeInfo](../../../system/typeinfo/) dans lequel la valeur doit être convertie. |

### ReturnValue

La valeur convertie.
## Remarques


Convertit une valeur vers le [System::TypeInfo](../../../system/typeinfo/) donné.
## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
## FormatterConverter::Convert(System::SharedPtr\<Object\>, TypeCode) method


Convertit une valeur vers le [System::TypeCode](../../../system/typecode/) donné.

```cpp
System::SharedPtr<Object> System::Runtime::Serialization::FormatterConverter::Convert(System::SharedPtr<Object> value, TypeCode typeCode) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| value | System::SharedPtr\<Object\> | L'objet à convertir. |
| typeCode | TypeCode | Le [System::TypeCode](../../../system/typecode/) dans lequel la valeur doit être convertie. |

### ReturnValue

La valeur convertie.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Enum [TypeCode](../../../system/typecode/)
* Class [FormatterConverter](../)
* Namespace [System::Runtime::Serialization](../../)
* Library [Aspose.Page for C++](../../../)
