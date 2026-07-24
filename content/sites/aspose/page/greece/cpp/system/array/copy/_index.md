---
title: "System::Array::Copy method"
linktitle: "Αντιγραφή"
second_title: "Aspose.Page για C++"
description: "System::Array::Copy method. Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στον προορισμένο πίνακα σε C++."
type: docs
weight: 4900
url: /el/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στον πίνακα προορισμού.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Πηγαίος πίνακας |
| dstArray | const ArrayPtr\<DstType\>\& | Πίνακας προορισμού |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| SrcType | Τύπος των στοιχείων στον πηγαίο πίνακα |
| DstType | Τύπος των στοιχείων στον προοριστικό πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Πηγαίος πίνακας |
| srcIndex | int64_t | Δείκτης στον πηγαίο πίνακα που καθορίζει την αρχή της περιοχής των στοιχείων προς αντιγραφή |
| dstArray | const ArrayPtr\<DstType\>\& | Πίνακας προορισμού |
| dstIndex | int64_t | Δείκτης στον προοριστικό πίνακα όπου αρχίζει η εισαγωγή των αντιγραμμένων στοιχείων |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στην προβολή του πίνακα προορισμού.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| SrcType | Τύπος των στοιχείων στον πηγαίο πίνακα |
| DstType | Τύπος στοιχείων στην προβολή του προορισμένου πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Πηγαίος πίνακας |
| srcIndex | int64_t | Δείκτης στον πηγαίο πίνακα που καθορίζει την αρχή της περιοχής των στοιχείων προς αντιγραφή |
| dstArray | System::Details::ArrayView\<DstType\> | Προβολή προορισμένου πίνακα |
| dstIndex | int64_t | Δείκτης στην προβολή του προορισμένου πίνακα για έναρξη εισαγωγής των αντιγραμμένων στοιχείων |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού στη στοίβα.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| SrcType | Τύπος των στοιχείων στον πηγαίο πίνακα |
| DstType | Τύπος στοιχείων στον προορισμένο πίνακα στη στοίβα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Πηγαίος πίνακας |
| srcIndex | int64_t | Δείκτης στον πηγαίο πίνακα που καθορίζει την αρχή της περιοχής των στοιχείων προς αντιγραφή |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Προορισμένος πίνακας στη στοίβα |
| dstIndex | int64_t | Δείκτης στον προορισμένο πίνακα στη στοίβα για έναρξη εισαγωγής των αντιγραμμένων στοιχείων |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στην προβολή του πίνακα προορισμού.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Πηγαίος πίνακας |
| dstArray | System::Details::ArrayView\<DstType\> | Προβολή προορισμένου πίνακα |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στον πίνακα προορισμού στη στοίβα.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Πηγαίος πίνακας |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Προορισμένος πίνακας στη στοίβα |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού στη στοίβα.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| SrcType | Τύπος στοιχείων στον πηγαίο πίνακα στη στοίβα |
| DstType | Τύπος στοιχείων στον προορισμένο πίνακα στη στοίβα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | Προβολή πηγαίου πίνακα |
| srcIndex | int64_t | Δείκτης στην προβολή του πηγαίου πίνακα που καθορίζει την αρχή του εύρους των στοιχείων προς αντιγραφή |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Προορισμένος πίνακας στη στοίβα |
| dstIndex | int64_t | Δείκτης στον προορισμένο πίνακα στη στοίβα για έναρξη εισαγωγής των αντιγραμμένων στοιχείων |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


Αντιγράφει τον καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα στον πίνακα προορισμού.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Προβολή πηγαίου πίνακα |
| dstArray | const ArrayPtr\<DstType\>\& | Πίνακας προορισμού |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| SrcType | Τύπος των στοιχείων στην προβολή του πηγαίου πίνακα |
| DstType | Τύπος των στοιχείων στον προοριστικό πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Προβολή πηγαίου πίνακα |
| srcIndex | int64_t | Δείκτης στην προβολή του πηγαίου πίνακα που καθορίζει την αρχή του εύρους των στοιχείων προς αντιγραφή |
| dstArray | const ArrayPtr\<DstType\>\& | Πίνακας προορισμού |
| dstIndex | int64_t | Δείκτης στον προοριστικό πίνακα όπου αρχίζει η εισαγωγή των αντιγραμμένων στοιχείων |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στην προβολή του πίνακα προορισμού.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| SrcType | Τύπος των στοιχείων στην προβολή του πηγαίου πίνακα |
| DstType | Τύπος στοιχείων στην προβολή του προορισμένου πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Προβολή πηγαίου πίνακα |
| srcIndex | int64_t | Δείκτης στην προβολή του πηγαίου πίνακα που καθορίζει την αρχή του εύρους των στοιχείων προς αντιγραφή |
| dstArray | System::Details::ArrayView\<DstType\> | Προβολή προορισμένου πίνακα |
| dstIndex | int64_t | Δείκτης στην προβολή του προορισμένου πίνακα για έναρξη εισαγωγής των αντιγραμμένων στοιχείων |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


Αντιγράφει τον καθορισμένο αριθμό στοιχείων από την προβολή του πηγαίου πίνακα στην προβολή του πίνακα προορισμού.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Προβολή πηγαίου πίνακα |
| dstArray | System::Details::ArrayView\<DstType\> | Προβολή προορισμένου πίνακα |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στη στοίβα στον πίνακα προορισμού.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Πηγαίος πίνακας στη στοίβα |
| dstArray | const ArrayPtr\<DstType\>\& | Πίνακας προορισμού |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στη στοίβα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| SrcType | Τύπος στοιχείων στον πηγαίο πίνακα στη στοίβα |
| DstType | Τύπος των στοιχείων στον προοριστικό πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Πηγαίος πίνακας στη στοίβα |
| srcIndex | int64_t | Δείκτης στον πηγαίο πίνακα στη στοίβα που καθορίζει την αρχή της περιοχής των στοιχείων προς αντιγραφή |
| dstArray | const ArrayPtr\<DstType\>\& | Πίνακας προορισμού |
| dstIndex | int64_t | Δείκτης στον προοριστικό πίνακα όπου αρχίζει η εισαγωγή των αντιγραμμένων στοιχείων |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Αντιγράφει έναν καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στη στοίβα που ξεκινά από το καθορισμένο ευρετήριο στη συγκεκριμένη θέση στον πίνακα προορισμού στη στοίβα.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parameter | Περιγραφή |
| --- | --- |
| SrcType | Τύπος στοιχείων στον πηγαίο πίνακα στη στοίβα |
| DstType | Τύπος στοιχείων στον προορισμένο πίνακα στη στοίβα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Πηγαίος πίνακας στη στοίβα |
| srcIndex | int64_t | Δείκτης στον πηγαίο πίνακα στη στοίβα που καθορίζει την αρχή της περιοχής των στοιχείων προς αντιγραφή |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Προορισμένος πίνακας στη στοίβα |
| dstIndex | int64_t | Δείκτης στον προορισμένο πίνακα στη στοίβα για έναρξη εισαγωγής των αντιγραμμένων στοιχείων |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


Αντιγράφει τον καθορισμένο αριθμό στοιχείων από τον πηγαίο πίνακα στη στοίβα στον πίνακα προορισμού στη στοίβα.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Πηγαίος πίνακας στη στοίβα |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Προορισμένος πίνακας στη στοίβα |
| count | int64_t | Ο αριθμός των στοιχείων προς αντιγραφή |

## Δείτε επίσης

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
