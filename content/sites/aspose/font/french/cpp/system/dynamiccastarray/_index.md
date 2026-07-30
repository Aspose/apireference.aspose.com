---
title: "Méthode System::DynamicCastArray"
linktitle: "DynamicCastArray"
second_title: "Aspose.Font pour C++"
description: "Méthode System::DynamicCastArray. Effectue le cast des éléments du tableau spécifié vers un type différent en C++."
type: docs
weight: 18000
url: /fr/cpp/system/dynamiccastarray/
---
## System::DynamicCastArray method


Effectue le cast des éléments du tableau spécifié vers un type différent.

```cpp
template<class To,class From> SharedPtr<Array<To>> System::DynamicCastArray(const SharedPtr<Array<From>> &from)
```


| Paramètre | Description |
| --- | --- |
| To | Le type vers lequel caster les éléments du tableau spécifié |
| From | Le type des éléments du tableau dont les éléments doivent être castés |

| Paramètre | Type | Description |
| --- | --- | --- |
| de | const SharedPtr\<Array\<From\>\>\& | Pointeur partagé vers le tableau contenant les éléments à caster |

### ReturnValue

Un pointeur vers un nouveau tableau contenant des éléments de type **To** équivalents aux éléments de **from**

## Deprecated
Ajouté pour la compatibilité ascendante. Utilisez ExplicitCast à la place.

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Class [Array](../array/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
