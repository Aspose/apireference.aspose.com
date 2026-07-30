---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderBy méthode"
linktitle: "LINQ_OrderBy"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode LINQ_OrderBy de la classe System::Collections::Generic::IEnumerable en C++."
type: docs
weight: 2300
url: /fr/cpp/system.collections.generic/ienumerable/linq_orderby/
---
## IEnumerable::LINQ_OrderBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<Source, Key> &keySelector)
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_OrderBy(const Func\<T, Key\>\&) method


Trie les éléments d'une séquence par ordre croissant selon les valeurs de clé sélectionnées par keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<T, Key> &keySelector)
```


| Paramètre | Description |
| --- | --- |
| keySelector | Une fonction permettant d'extraire une clé d'un élément. |

### ReturnValue

Un IOrderedEnumerable dont les éléments sont triés selon une clé

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
