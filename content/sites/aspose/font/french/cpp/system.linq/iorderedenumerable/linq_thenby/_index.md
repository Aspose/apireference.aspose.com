---
title: "System::Linq::IOrderedEnumerable::LINQ_ThenBy méthode"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode LINQ_ThenBy de la classe System::Linq::IOrderedEnumerable en C++."
type: docs
weight: 300
url: /fr/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


Effectue un tri supplémentaire des éléments d'une séquence par ordre croissant selon une clé.

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| Paramètre | Description |
| --- | --- |
| Clé | Le type de la clé renvoyée par keySelector. |

| Paramètre | Type | Description |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | Une fonction pour extraire une clé de chaque élément. |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
