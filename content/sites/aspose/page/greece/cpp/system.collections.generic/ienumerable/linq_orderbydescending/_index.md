---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderByDescending method"
linktitle: "LINQ_OrderByDescending"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο LINQ_OrderByDescending της κλάσης System::Collections::Generic::IEnumerable σε C++."
type: docs
weight: 2400
url: /el/cpp/system.collections.generic/ienumerable/linq_orderbydescending/
---
## IEnumerable::LINQ_OrderByDescending(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<Source, Key> &keySelector)
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderByDescending(const Func\<T, Key\>\&) method


Ταξινομεί τα στοιχεία μιας ακολουθίας σε φθίνουσα σειρά σύμφωνα με τις τιμές κλειδιών που επιλέγονται από το keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderByDescending(const Func<T, Key> &keySelector)
```


| Parameter | Περιγραφή |
| --- | --- |
| keySelector | Μια λειτουργία για την εξαγωγή ενός κλειδιού από ένα στοιχείο. |

### ReturnValue

Ένα IOrderedEnumerable του οποίου τα στοιχεία είναι ταξινομημένα σε φθίνουσα σειρά του κλειδιού

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
