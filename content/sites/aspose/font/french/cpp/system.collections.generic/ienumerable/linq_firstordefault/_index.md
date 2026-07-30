---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault méthode"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Font pour C++"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault méthode. Retourne le premier élément d'une séquence, ou une valeur par défaut si la séquence est vide en C++."
type: docs
weight: 1600
url: /fr/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


Renvoie le premier élément d'une séquence, ou une valeur par défaut si la séquence est vide.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

Premier élément de la séquence ou valeur construite par défaut si la séquence est vide.

## Voir aussi

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


Renvoie le premier élément de la séquence qui satisfait une condition ou une valeur par défaut si aucun élément de ce type n'est trouvé.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| prédicat | std::function\<bool(T)> | Une fonction pour tester chaque élément selon une condition. |

### ReturnValue

default(T) si la source est vide ou si aucun élément ne satisfait le test spécifié par le prédicat ; sinon, le premier élément de la source qui satisfait le test spécifié par le prédicat.

## Voir aussi

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
