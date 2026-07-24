---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy metodo"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page per C++"
description: "Come utilizzare il metodo LINQ_GroupBy della classe System::Collections::Generic::IEnumerable in C++."
type: docs
weight: 1700
url: /it/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Raggruppa gli elementi di una sequenza.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Parametro | Descrizione |
| --- | --- |
| Chiave | Il tipo della chiave restituita da keyPredicate |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Una funzione per estrarre la chiave per ogni elemento. |

### ReturnValue

Un [IEnumerable](../) che contiene una sequenza di oggetti e una chiave

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
