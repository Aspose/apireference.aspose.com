---
title: "System::ObjectExt::UnknownIsNull méthode"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page pour C++"
description: "System::ObjectExt::UnknownIsNull méthode. Vérifie si l'objet de type inconnu est nullptr. Surcharge pour les types non scalaires en C++."
type: docs
weight: 1700
url: /fr/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Vérifie si l'objet de type inconnu est nullptr. Surcharge pour les types non scalaires.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Paramètre | Description |
| --- | --- |
| T | [Object](../../object/) type. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T | [Object](../../object/) à vérifier. |

### ReturnValue

Vrai si 'obj == nullptr' est vrai, sinon faux.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Vérifie si l'objet de type inconnu est nullptr. Surcharge pour les types scalaires.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Paramètre | Description |
| --- | --- |
| T | [Object](../../object/) type. |

| Paramètre | Type | Description |
| --- | --- | --- |
| obj | T | [Object](../../object/) à vérifier. |

### ReturnValue

Renvoie toujours false.

## Voir aussi

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
