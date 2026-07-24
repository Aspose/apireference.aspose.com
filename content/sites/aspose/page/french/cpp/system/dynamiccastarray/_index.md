---
title: "méthode System::DynamicCastArray"
linktitle: "DynamicCastArray"
second_title: "Aspose.Page pour C++"
description: "méthode System::DynamicCastArray. Effectue le cast des éléments du tableau spécifié vers un type différent en C++."
type: docs
weight: 17900
url: /fr/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Effectue le cast des éléments du tableau spécifié vers un type différent.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Paramètre | Description |
| --- | --- |
| Vers | Le type vers lequel caster les éléments du tableau spécifié |
| From | Le type des éléments du tableau dont les éléments doivent être castés |

| Paramètre | Type | Description |
| --- | --- | --- |
| de | const SharedPtr\<Array\<From\>\>\& | Pointeur partagé vers le tableau contenant les éléments à caster |

### ReturnValue

Un pointeur vers un nouveau tableau contenant des éléments de type **To** équivalents aux éléments de **from**

## Deprecated
Ajouté pour la compatibilité descendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
