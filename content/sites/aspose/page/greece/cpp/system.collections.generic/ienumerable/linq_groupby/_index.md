---
title: "System::Collections::Generic::IEnumerable::LINQ_GroupBy μέθοδος"
linktitle: "LINQ_GroupBy"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο LINQ_GroupBy της κλάσης System::Collections::Generic::IEnumerable σε C++."
type: docs
weight: 1700
url: /el/cpp/system.collections.generic/ienumerable/linq_groupby/
---
## IEnumerable::LINQ_GroupBy(System::Func\<Source, Key\>) method




```cpp
template<typename Key> SharedPtr<IEnumerable<SharedPtr<System::Linq::IGrouping<Key, Source>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<Source, Key> keyPredicate)
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_GroupBy(System::Func\<T, Key\>) method


Ομαδοποιεί τα στοιχεία μιας ακολουθίας.

```cpp
template<typename Key> System::SharedPtr<IEnumerable<System::SharedPtr<System::Linq::IGrouping<Key, T>>>> System::Collections::Generic::IEnumerable<T>::LINQ_GroupBy(System::Func<T, Key> keyPredicate)
```


| Parameter | Περιγραφή |
| --- | --- |
| Κλειδί | Ο τύπος του κλειδιού που επιστρέφεται από το keyPredicate |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| keyPredicate | System::Func\<T, Key\> | Μια συνάρτηση για την εξαγωγή του κλειδιού για κάθε στοιχείο. |

### ReturnValue

Ένα [IEnumerable](../) που περιέχει μια ακολουθία αντικειμένων και ένα κλειδί

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [IGrouping](../../../system.linq/igrouping/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
