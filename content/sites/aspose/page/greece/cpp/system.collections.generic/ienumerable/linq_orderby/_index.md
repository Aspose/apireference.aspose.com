---
title: "System::Collections::Generic::IEnumerable::LINQ_OrderBy method"
linktitle: "LINQ_OrderBy"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο LINQ_OrderBy της κλάσης System::Collections::Generic::IEnumerable σε C++."
type: docs
weight: 2300
url: /el/cpp/system.collections.generic/ienumerable/linq_orderby/
---
## IEnumerable::LINQ_OrderBy(const Func\<Source, Key\>\&) method




```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<Source>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<Source, Key> &keySelector)
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_OrderBy(const Func\<T, Key\>\&) method


Ταξινομεί τα στοιχεία μιας ακολουθίας σε αύξουσα σειρά σύμφωνα με τις τιμές κλειδιών που επιλέγονται από το keySelector.

```cpp
template<typename Key> SharedPtr<Linq::IOrderedEnumerable<T>> System::Collections::Generic::IEnumerable<T>::LINQ_OrderBy(const Func<T, Key> &keySelector)
```


| Parameter | Περιγραφή |
| --- | --- |
| keySelector | Μια λειτουργία για την εξαγωγή ενός κλειδιού από ένα στοιχείο. |

### ReturnValue

Ένα IOrderedEnumerable του οποίου τα στοιχεία ταξινομούνται σύμφωνα με ένα κλειδί.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IOrderedEnumerable](../../../system.linq/iorderedenumerable/)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
