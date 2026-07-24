---
title: "Μέθοδος System::Array::Sort"
linktitle: "Ταξινόμηση"
second_title: "Aspose.Page για C++"
description: "Μέθοδος System::Array::Sort. Ταξινομεί δύο πίνακες, έναν που περιέχει **keys** και τον άλλο - τα αντίστοιχα **items**, βάσει των τιμών του πίνακα που περιέχει **keys**, των οποίων τα στοιχεία συγκρίνονται χρησιμοποιώντας τον τελεστή < σε C++."
type: docs
weight: 5800
url: /el/cpp/system/array/sort/
---
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&) method


Ταξινομεί δύο πίνακες, έναν που περιέχει κλειδιά και τον άλλο - τα αντίστοιχα στοιχεία, βάσει των τιμών του πίνακα που περιέχει κλειδιά, των οποίων τα στοιχεία συγκρίνονται χρησιμοποιώντας το operator<.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items)
```


| Parameter | Περιγραφή |
| --- | --- |
| TKey | Ο τύπος των στοιχείων στον πίνακα **keys** |
| TValue | ο τύπος των στοιχείων στον πίνακα **items** |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) που περιέχει τιμές κλειδιών |
| items | const ArrayPtr\<TValue\>\& | [Array](../) που περιέχει στοιχεία που αντιστοιχούν στις τιμές κλειδιών στον πίνακα **keys** |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<TKey\>\&, const ArrayPtr\<TValue\>\&, int, int) method


Ταξινομεί δύο πίνακες, έναν που περιέχει κλειδιά και τον άλλο - τα αντίστοιχα στοιχεία, βάσει των τιμών του πίνακα που περιέχει κλειδιά, των οποίων τα στοιχεία συγκρίνονται χρησιμοποιώντας τον προεπιλεγμένο συγκριτή.

```cpp
template<typename TKey,typename TValue> static void System::Array<T>::Sort(const ArrayPtr<TKey> &keys, const ArrayPtr<TValue> &items, int index, int length)
```


| Parameter | Περιγραφή |
| --- | --- |
| TKey | Ο τύπος των στοιχείων στον πίνακα **keys** |
| TValue | ο τύπος των στοιχείων στον πίνακα **items** |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| keys | const ArrayPtr\<TKey\>\& | [Array](../) που περιέχει τιμές κλειδιών |
| items | const ArrayPtr\<TValue\>\& | [Array](../) που περιέχει στοιχεία που αντιστοιχούν στις τιμές κλειδιών στον πίνακα **keys** |
| δείκτης | int | Ο δείκτης που καθορίζει την αρχή του εύρους για ταξινόμηση |
| length | int | Ο αριθμός των στοιχείων στο εύρος για ταξινόμηση |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&) method


Ταξινομεί τα στοιχεία στον καθορισμένο πίνακα χρησιμοποιώντας τον προεπιλεγμένο συγκριτή.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Πίνακας προορισμού |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\&) method


Ταξινομεί τα στοιχεία στον καθορισμένο πίνακα χρησιμοποιώντας τον καθορισμένο συγκριτή.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<T>> &comparator)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Πίνακας προορισμού |
| συγκριτής | const SharedPtr\<System::Collections::Generic::IComparer\<T\>\>\& | Αντικείμενο IComparer<T> που χρησιμοποιείται για τη σύγκριση των στοιχείων του πίνακα |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, const SharedPtr\<System::Collections::Generic::IComparer\<Y\>\>\&) method


ΔΕΝ ΥΛΟΠΟΙΗΘΗΚΕ.

```cpp
template<typename Type,typename Y> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, const SharedPtr<System::Collections::Generic::IComparer<Y>> &comparator)
```


## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Sort(const ArrayPtr\<Type\>\&, int, int) method


Ταξινομεί μια περιοχή στοιχείων στον καθορισμένο πίνακα χρησιμοποιώντας τον προεπιλεγμένο συγκριτή.

```cpp
template<typename Type> static void System::Array<T>::Sort(const ArrayPtr<Type> &arr, int startIndex, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | const ArrayPtr\<Type\>\& | Πίνακας προορισμού |
| startIndex | int | Ο δείκτης που καθορίζει την αρχή του εύρους των στοιχείων για ταξινόμηση |
| count | int | Το μέγεθος του εύρους των στοιχείων για ταξινόμηση |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
