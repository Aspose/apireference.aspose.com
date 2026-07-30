---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending metodo"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo LINQ_OrderByDescending della classe System::Collections::Generic::IEnumerable in C++."
type: docs
weight: 2400
url: /it/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


Ordina gli elementi di una sequenza in ordine decrescente secondo i valori chiave selezionati da keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| Parametro | Descrizione |
| --- | --- |
| keySelector | Una funzione per estrarre una chiave da un elemento. |

### ReturnValue

Un IOrderedEnumerable i cui elementi sono ordinati in ordine discendente della chiave

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
