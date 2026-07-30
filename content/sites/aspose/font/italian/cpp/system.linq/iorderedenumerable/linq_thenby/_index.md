---
title: "Metodo System::Linq::IOrderedEnumerable::LINQ_ThenBy"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Font per C++"
description: "Come utilizzare il metodo LINQ_ThenBy della classe System::Linq::IOrderedEnumerable in C++."
type: docs
weight: 300
url: /it/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


Esegue un ordinamento successivo degli elementi in una sequenza in ordine crescente secondo una chiave.

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| Parametro | Descrizione |
| --- | --- |
| Chiave | Il tipo della chiave restituita da keySelector. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | Una funzione per estrarre una chiave da ogni elemento. |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Font for C++](../../../)
