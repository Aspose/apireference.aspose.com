---
title: "System::Array::BinarySearch μέθοδος"
linktitle: "BinarySearch"
second_title: "Aspose.Page για C++"
description: "System::Array::BinarySearch μέθοδος. Εκτελεί δυαδική αναζήτηση στον ταξινομημένο πίνακα σε C++."
type: docs
weight: 4600
url: /el/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Εκτελεί δυαδική αναζήτηση στον ταξινομημένο πίνακα.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Τάξινομένος πίνακας για εκτέλεση αναζήτησης |
| στοιχείο | const T\& | Ένα στοιχείο προς αναζήτηση |

### ReturnValue

Δείκτης του αναζητημένου στοιχείου εάν βρεθεί, διαφορετικά, ένας αρνητικός ακέραιος που είναι το δυαδικό συμπλήρωμα του δείκτη του επόμενου στοιχείου μεγαλύτερου από το αναζητημένο στοιχείο ή, εάν δεν υπάρχει μεγαλύτερο στοιχείο, το δυαδικό συμπλήρωμα του αριθμού των στοιχείων στον πίνακα.

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
