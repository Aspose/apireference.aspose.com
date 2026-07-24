---
title: "Méthode System::Collections::Generic::IEnumerable::LINQ_GroupBy"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page pour C++"
description: "Comment utiliser la méthode LINQ_GroupBy de la classe System::Collections::Generic::IEnumerable en C++."
type: docs
weight: 1700
url: /fr/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Regroupe les éléments d'une séquence.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Paramètre | Description |
| --- | --- |
| Clé | Le type de la clé retournée par keyPredicate |

| Paramètre | Type | Description |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Une fonction pour extraire la clé de chaque élément. |

### ReturnValue

Un [IEnumerable](../) qui contient une séquence d'objets et une clé

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
