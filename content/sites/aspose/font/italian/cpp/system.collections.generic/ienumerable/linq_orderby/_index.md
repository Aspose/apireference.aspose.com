---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderBy method"
linktitle: "LINQ_OrderBy"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo LINQ_OrderBy della classe System::Collections::Generic::IEnumerable in C++."
type: docs
weight: 2300
url: /it/cpp/system.collections.generic/ienumerable/linq_orderby/
---
## IEnumerable::LINQ_OrderBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<Source, Key> &keySelector)
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_OrderBy(const Func\<T, Key\>\&) method


Ordina gli elementi di una sequenza in ordine crescente secondo i valori chiave selezionati da keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<T, Key> &keySelector)
```


| Parametro | Descrizione |
| --- | --- |
| keySelector | Una funzione per estrarre una chiave da un elemento. |

### ReturnValue

Un IOrderedEnumerable i cui elementi sono ordinati secondo una chiave

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
