---
title: "System::Collections::Generic::_net_binnary_search μέθοδος"
linktitle: "_net_binnary_search"
second_title: "Aspose.Page για C++"
description: "System::Collections::Generic::_net_binnary_search μέθοδος. Υλοποιεί δυαδική αναζήτηση σε container τυχαίας πρόσβασης. Ειδίκευση για έξυπνους δείκτες. Χρησιμοποιεί τη μέθοδο System::Object::CompareTo σε C++."
type: docs
weight: 4900
url: /el/cpp/system.collections.generic/_net_binnary_search/
---
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Υλοποιεί δυαδική αναζήτηση σε container τυχαίας πρόσβασης. Ειδίκευση για έξυπνους δείκτες. Χρησιμοποιεί τη μέθοδο System::Object::CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<IsSmartPtr<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Περιγραφή |
| --- | --- |
| containerT | Τύπος προτύπου container τύπου STL με δύο ορίσματα προτύπου: τύπο στοιχείου και τύπο allocator. |
| T | Τύπος στοιχείου. |
| Allocator | Τύπος Allocator. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κοντέινερ | const containterT\<T, Allocator\>\& | Container για αναζήτηση. |
| δείκτης | int | Δείκτης έναρξης εύρους αναζήτησης. |
| count | int | Μήκος εύρους αναζήτησης. |
| τιμή | T | Τιμή προς αναζήτηση. |

### ReturnValue

Εάν βρεθεί, δείκτης του επόμενου στοιχείου· διαφορετικά, συμπληρωματικά του δείκτη στο οποίο σταμάτησε η αναζήτηση.

## Δείτε επίσης

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Υλοποιεί δυαδική αναζήτηση σε δοχείο τυχαίας πρόσβασης. Εξειδίκευση για τύπους τιμών. Χρησιμοποιεί τη μέθοδο CompareTo.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<!IsSmartPtr<T>::value &&!std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Περιγραφή |
| --- | --- |
| containerT | Τύπος προτύπου container τύπου STL με δύο ορίσματα προτύπου: τύπο στοιχείου και τύπο allocator. |
| T | Τύπος στοιχείου. |
| Allocator | Τύπος Allocator. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κοντέινερ | const containterT\<T, Allocator\>\& | Container για αναζήτηση. |
| δείκτης | int | Δείκτης έναρξης εύρους αναζήτησης. |
| count | int | Μήκος εύρους αναζήτησης. |
| τιμή | T | Τιμή προς αναζήτηση. |

### ReturnValue

Εάν βρεθεί, δείκτης του επόμενου στοιχείου· διαφορετικά, συμπληρωματικά του δείκτη στο οποίο σταμάτησε η αναζήτηση.

## Δείτε επίσης

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T) method


Υλοποιεί δυαδική αναζήτηση σε δοχείο τυχαίας πρόσβασης. Εξειδίκευση για βαθμωτούς τύπους. Συγκρίνει στοιχεία χρησιμοποιώντας τους τελεστές μεγαλύτερο και μικρότερο.

```cpp
template<template< typename, typename > class,class T,class Allocator> std::enable_if<std::is_scalar<T>::value, int>::type System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value)
```


| Parameter | Περιγραφή |
| --- | --- |
| containerT | Τύπος προτύπου container τύπου STL με δύο ορίσματα προτύπου: τύπο στοιχείου και τύπο allocator. |
| T | Τύπος στοιχείου. |
| Allocator | Τύπος Allocator. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κοντέινερ | const containterT\<T, Allocator\>\& | Container για αναζήτηση. |
| δείκτης | int | Δείκτης έναρξης εύρους αναζήτησης. |
| count | int | Μήκος εύρους αναζήτησης. |
| τιμή | T | Τιμή προς αναζήτηση. |

### ReturnValue

Εάν βρεθεί, δείκτης του επόμενου στοιχείου· διαφορετικά, συμπληρωματικά του δείκτη στο οποίο σταμάτησε η αναζήτηση.

## Δείτε επίσης

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
## System::Collections::Generic::_net_binnary_search(const containterT\<T, Allocator\>\&, int, int, T, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Υλοποιεί δυαδική αναζήτηση σε δοχείο τυχαίας πρόσβασης.

```cpp
template<template< typename, typename > class,class T,class Allocator> int System::Collections::Generic::_net_binnary_search(const containterT<T, Allocator> &container, int index, int count, T value, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparer)
```


| Parameter | Περιγραφή |
| --- | --- |
| containerT | Τύπος προτύπου container τύπου STL με δύο ορίσματα προτύπου: τύπο στοιχείου και τύπο allocator. |
| T | Τύπος στοιχείου. |
| Allocator | Τύπος Allocator. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| κοντέινερ | const containterT\<T, Allocator\>\& | Container για αναζήτηση. |
| δείκτης | int | Δείκτης έναρξης εύρους αναζήτησης. |
| count | int | Μήκος εύρους αναζήτησης. |
| τιμή | T | Τιμή προς αναζήτηση. |
| comparer | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | [Comparer](../comparer/) αντικείμενο. |

### ReturnValue

Εάν βρεθεί, δείκτης του επόμενου στοιχείου· διαφορετικά, συμπληρωματικά του δείκτη στο οποίο σταμάτησε η αναζήτηση.

## Δείτε επίσης

* Typedef [SharedPtr](../../system/sharedptr/)
* Class [IComparer](../icomparer/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
