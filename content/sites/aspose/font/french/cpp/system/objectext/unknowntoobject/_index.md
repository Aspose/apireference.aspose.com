---
title: "Méthode System::ObjectExt::UnknownToObject"
linktitle: "UnknownToObject"
second_title: "Aspose.Font pour C++"
description: "Méthode System::ObjectExt::UnknownToObject. Convertit un type inconnu en Object, en gérant les cas de pointeur intelligent et de type valeur en C++."
type: docs
weight: 1900
url: /fr/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Convertit un type inconnu en [Object](../../object/), en gérant les cas de pointeur intelligent et de type valeur.

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

Pointeur intelligent vers [Object](../../object/) étant soit le pointeur converti, soit la valeur emballée.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Convertit un type inconnu en [Object](../../object/), en gérant les cas de pointeur intelligent et de type valeur.

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

Pointeur intelligent vers [Object](../../object/) étant soit le pointeur converti, soit la valeur emballée.

## Voir aussi

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
