---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending méthode"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode LINQ_OrderByDescending de la classe System::Collections::Generic::IEnumerable en C++."
type: docs
weight: 2400
url: /fr/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


Trie les éléments d'une séquence par ordre décroissant selon les valeurs de clé sélectionnées par keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| Paramètre | Description |
| --- | --- |
| keySelector | Une fonction permettant d'extraire une clé d'un élément. |

### ReturnValue

Un IOrderedEnumerable dont les éléments sont triés par ordre décroissant de la clé

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
