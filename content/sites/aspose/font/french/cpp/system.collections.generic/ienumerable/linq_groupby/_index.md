---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy méthode"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Font pour C++"
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
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>, System::Func\<Source, Element\>) method




```cpp
template<typename Key,typename Element> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Element>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate, System::Func<Source, Element> elementSelector)
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
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
| keyPredicate | System::Func\<T, Key\> | Une fonction permettant d'extraire la clé pour chaque élément. |

### ReturnValue

Un [IEnumerable](../) qui contient une séquence d'objets et une clé

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>, System::Func\<T, Element\>) method


Regroupe les éléments d'une séquence.

```cpp
template<typename Key,typename Element> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, Element>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate, System::Func<T, Element> elementSelector)
```


| Paramètre | Description |
| --- | --- |
| Clé | Le type de la clé retournée par keyPredicate |
| Élément | Le type de l'élément retourné par elementSelector |

| Paramètre | Type | Description |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Une fonction permettant d'extraire la clé pour chaque élément. |
| elementSelector | System::Func\<T, Element\> | Une fonction permettant d'extraire la clé de valeur pour chaque élément. |

### ReturnValue

Un [IEnumerable](../) qui contient une séquence d'objets et une clé

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
