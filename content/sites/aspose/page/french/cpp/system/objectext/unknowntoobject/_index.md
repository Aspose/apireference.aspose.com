---
title: "System::ObjectExt::UnknownToObject méthode"
linktitle: "UnknownToObject"
second_title: "Aspose.Page pour C++"
description: "System::ObjectExt::UnknownToObject méthode. Convertit le type inconnu en Object, en gérant à la fois les types pointeur intelligent et les types valeur en C++."
type: docs
weight: 1800
url: /fr/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Convertit le type inconnu en [Object](../../object/), en gérant à la fois les types pointeur intelligent et les types valeur.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type à convertir en [Object](../../object/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) à convertir. |

### ReturnValue

Pointeur intelligent vers [Object](../../object/) étant soit un pointeur converti, soit une valeur emballée.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Convertit le type inconnu en [Object](../../object/), en gérant à la fois les types pointeur intelligent et les types valeur.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Paramètre | Description |
| --- | --- |
| T | Type à convertir en [Object](../../object/). |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T | [Object](../../object/) à convertir. |

### ReturnValue

Pointeur intelligent vers [Object](../../object/) étant soit un pointeur converti, soit une valeur emballée.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
