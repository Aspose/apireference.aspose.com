---
title: "System::Array::CopyTo μέθοδος"
linktitle: "CopyTo"
second_title: "Aspose.Page για C++"
description: "System::Array::CopyTo μέθοδος. Αντιγράφει όλα τα στοιχεία του τρέχοντος πίνακα στον καθορισμένο πίνακα προορισμού. Τα στοιχεία εισάγονται στον πίνακα προορισμού ξεκινώντας από το δείκτη που καθορίζεται από το όρισμα arrayIndex σε C++."
type: docs
weight: 900
url: /el/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


Αντιγράφει όλα τα στοιχεία του τρέχοντος πίνακα στον καθορισμένο πίνακα προορισμού. Τα στοιχεία εισάγονται στον πίνακα προορισμού ξεκινώντας από το ευρετήριο που καθορίζεται από το όρισμα arrayIndex.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Πίνακας προορισμού |
| arrayIndex | int | Δείκτης στον προοριστικό πίνακα όπου αρχίζει η εισαγωγή των αντιγραμμένων στοιχείων |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


Αντιγράφει όλα τα στοιχεία του τρέχοντος πίνακα στον καθορισμένο πίνακα προορισμού. Τα στοιχεία εισάγονται στον πίνακα προορισμού ξεκινώντας από το δείκτη που καθορίζεται από το όρισμα dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Περιγραφή |
| --- | --- |
| DstType | Τύπος των στοιχείων στον προοριστικό πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Πίνακας προορισμού |
| dstIndex | int64_t | Δείκτης στον προοριστικό πίνακα όπου αρχίζει η εισαγωγή των αντιγραμμένων στοιχείων |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον τρέχοντα πίνακα ξεκινώντας από τη καθορισμένη θέση στον καθορισμένο πίνακα προορισμού. Τα στοιχεία εισάγονται στον πίνακα προορισμού ξεκινώντας από το δείκτη που καθορίζεται από το όρισμα dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Περιγραφή |
| --- | --- |
| DstType | Τύπος των στοιχείων στον προοριστικό πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Πίνακας προορισμού |
| srcIndex | int64_t | Δείκτης στον πηγαίο πίνακα για να αρχίσει η αντιγραφή των στοιχείων |
| dstIndex | int64_t | Δείκτης στον προοριστικό πίνακα όπου αρχίζει η εισαγωγή των αντιγραμμένων στοιχείων |
| count | int64_t | Αριθμός στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


Αντιγράφει όλα τα στοιχεία του τρέχοντος πίνακα στην καθορισμένη προβολή πίνακα προορισμού. Τα στοιχεία εισάγονται στην προβολή πίνακα προορισμού ξεκινώντας από το δείκτη που καθορίζεται από το όρισμα dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Parameter | Περιγραφή |
| --- | --- |
| DstType | Τύπος στοιχείων στην προβολή του προορισμένου πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Προβολή προορισμένου πίνακα |
| dstIndex | int64_t | Δείκτης στην προβολή του προορισμένου πίνακα για έναρξη εισαγωγής των αντιγραμμένων στοιχείων |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον τρέχοντα πίνακα ξεκινώντας από τη καθορισμένη θέση στην καθορισμένη προβολή πίνακα προορισμού. Τα στοιχεία εισάγονται στην προβολή πίνακα προορισμού ξεκινώντας από το δείκτη που καθορίζεται από το όρισμα dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parameter | Περιγραφή |
| --- | --- |
| DstType | Τύπος στοιχείων στην προβολή του προορισμένου πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Προβολή προορισμένου πίνακα |
| srcIndex | int64_t | Δείκτης στον πηγαίο πίνακα για να αρχίσει η αντιγραφή των στοιχείων |
| dstIndex | int64_t | Δείκτης στην προβολή του προορισμένου πίνακα για έναρξη εισαγωγής των αντιγραμμένων στοιχείων |
| count | int64_t | Αριθμός στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
