---
title: "Μέθοδος System::Linq::IOrderedEnumerable::LINQ_ThenBy"
linktitle: "LINQ_ThenBy"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο LINQ_ThenBy της κλάσης System::Linq::IOrderedEnumerable σε C++."
type: docs
weight: 300
url: /el/cpp/system.linq/iorderedenumerable/linq_thenby/
---
## IOrderedEnumerable::LINQ_ThenBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<Source>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<Source, Key> &keySelector)
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
## IOrderedEnumerable::LINQ_ThenBy(const Func\<T, Key\>\&) method


Εκτελεί μια επακόλουθη ταξινόμηση των στοιχείων σε μια ακολουθία σε αύξουσα σειρά σύμφωνα με ένα κλειδί.

```cpp
template<typename Key> SharedPtr<IOrderedEnumerable<T>> System::Linq::IOrderedEnumerable<T>::LINQ_ThenBy(const Func<T, Key> &keySelector)
```


| Parameter | Περιγραφή |
| --- | --- |
| Κλειδί | Ο τύπος του κλειδιού που επιστρέφεται από το keySelector. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| keySelector | const Func\<T, Key\>\& | Μια συνάρτηση για την εξαγωγή ενός κλειδιού από κάθε στοιχείο. |

### ReturnValue

[System::Linq::IOrderedEnumerable](../) whose elements are sorted according to a key.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IOrderedEnumerable](../)
* Namespace [System::Linq](../../)
* Library [Aspose.Page for C++](../../../)
