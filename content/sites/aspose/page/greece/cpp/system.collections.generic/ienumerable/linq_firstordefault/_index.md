---
title: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault μέθοδος"
linktitle: "LINQ_FirstOrDefault"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::IEnumerable::LINQ_FirstOrDefault μέθοδος. Επιστρέφει το πρώτο στοιχείο μιας ακολουθίας, ή μια προεπιλεγμένη τιμή εάν η ακολουθία είναι κενή σε C++."
type: docs
weight: 1600
url: /el/cpp/system.collections.generic/ienumerable/linq_firstordefault/
---
## IEnumerable::LINQ_FirstOrDefault() method


Επιστρέφει το πρώτο στοιχείο μιας ακολουθίας, ή μια προεπιλεγμένη τιμή εάν η ακολουθία είναι κενή.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault()
```


### ReturnValue

Πρώτο στοιχείο στην ακολουθία ή τιμή προεπιλεγμένης κατασκευής εάν η ακολουθία είναι κενή.

## Δείτε επίσης

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_FirstOrDefault(std::function\<bool(T)>) method


Επιστρέφει το πρώτο στοιχείο της ακολουθίας που ικανοποιεί μια συνθήκη ή μια προεπιλεγμένη τιμή εάν δεν βρεθεί τέτοιο στοιχείο.

```cpp
T System::Collections::Generic::IEnumerable<T>::LINQ_FirstOrDefault(std::function<bool(T)> predicate)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| προδιαγραφέας | std::function\<bool(T)> | Μια συνάρτηση για τη δοκιμή κάθε στοιχείου για μια συνθήκη. |

### ReturnValue

default(T) εάν η πηγή είναι κενή ή εάν κανένα στοιχείο δεν περνά το τεστ που καθορίζεται από την πρόβλεψη· διαφορετικά, το πρώτο στοιχείο στην πηγή που περνά το τεστ που καθορίζεται από την πρόβλεψη.

## Δείτε επίσης

* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
