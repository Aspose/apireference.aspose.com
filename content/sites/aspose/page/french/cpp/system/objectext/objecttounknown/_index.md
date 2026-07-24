---
title: "System::ObjectExt::ObjectToUnknown méthode"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page pour C++"
description: "System::ObjectExt::ObjectToUnknown méthode. Convertit Object en type inconnu, en gérant à la fois le type de pointeur intelligent et les situations de valeur bpxed en C++."
type: docs
weight: 1200
url: /fr/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Convertit [Object](../../object/) en type inconnu, en gérant à la fois le type de pointeur intelligent et les situations de valeur bpxed.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type vers lequel convertir [Object](../../object/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) à convertir. |

### ReturnValue

Valeur désencapsulée ou pointeur converti.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


Convertit [Object](../../object/) en type inconnu, en gérant à la fois le type de pointeur intelligent et les situations de valeur encapsulée.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type vers lequel convertir [Object](../../object/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | [Object](../../object/) à convertir. |

### ReturnValue

Valeur désencapsulée ou pointeur converti.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
