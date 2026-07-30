---
title: "System::Linq::IOrderedEnumerable::LINQ_ThenBy-Methode"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Font für C++"
description: "So verwenden Sie die LINQ_ThenBy-Methode der System::Linq::IOrderedEnumerable-Klasse in C++."
type: docs
weight: 300
url: /de/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


Führt eine nachfolgende Sortierung der Elemente einer Sequenz in aufsteigender Reihenfolge gemäß einem Schlüssel durch.

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| Parameter | Beschreibung |
| --- | --- |
| Schlüssel | Der Typ des von keySelector zurückgegebenen Schlüssels. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | Eine Funktion, um aus jedem Element einen Schlüssel zu extrahieren. |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
