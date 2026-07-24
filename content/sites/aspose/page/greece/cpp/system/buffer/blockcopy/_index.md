---
title: "System::Buffer::BlockCopy μέθοδος"
linktitle: "BlockCopy"
second_title: "Aspose.Page για C++"
description: "System::Buffer::BlockCopy μέθοδος. Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο σε C++."
type: docs
weight: 100
url: /el/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Περιγραφή |
| --- | --- |
| TSrc | Ο τύπος των στοιχείων του πηγαίου πίνακα |
| TDst | Ο τύπος των στοιχείων του πίνακα προορισμού |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Ο πηγαίος πίνακας |
| srcOffset | int | Μία μετατόπιση byte στον πηγαίο πίνακα tho στην οποία ξεκινά η αντιγραφή |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Ο πίνακας προορισμού |
| dstOffset | int | Μία μετατόπιση byte στον πίνακα προορισμού στην οποία αρχίζει η εισαγωγή δεδομένων |
| count | int | Ο αριθμός των byte προς αντιγραφή |

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Περιγραφή |
| --- | --- |
| TSrc | Ο τύπος των στοιχείων του πηγαίου πίνακα |
| TDst | Ο τύπος των στοιχείων της προβολής του προορισμένου πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Ο πηγαίος πίνακας |
| srcOffset | int | Μία μετατόπιση byte στον πηγαίο πίνακα tho στην οποία ξεκινά η αντιγραφή |
| dst | const System::Details::ArrayView\<TDst\>\& | Η προβολή του προορισμένου πίνακα |
| dstOffset | int | Μια μετατόπιση byte στην προβολή του προορισμένου πίνακα στην οποία θα ξεκινήσει η εισαγωγή δεδομένων |
| count | int | Ο αριθμός των byte προς αντιγραφή |

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Περιγραφή |
| --- | --- |
| TSrc | Ο τύπος των στοιχείων του πηγαίου πίνακα |
| TDst | Ο τύπος των στοιχείων του προορισμένου στοίβα πίνακα |
| ND | Το μέγεθος του προορισμένου στοίβα πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | Ο πηγαίος πίνακας |
| srcOffset | int | Μία μετατόπιση byte στον πηγαίο πίνακα tho στην οποία ξεκινά η αντιγραφή |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Ο προορισμένος στοίβα πίνακας |
| dstOffset | int | Μια μετατόπιση byte στον προορισμένο στοίβα πίνακα στην οποία θα ξεκινήσει η εισαγωγή δεδομένων |
| count | int | Ο αριθμός των byte προς αντιγραφή |

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Περιγραφή |
| --- | --- |
| TSrc | Ο τύπος των στοιχείων της προβολής του πηγαίου πίνακα |
| TDst | Ο τύπος των στοιχείων του πίνακα προορισμού |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Η προβολή του πηγαίου πίνακα |
| srcOffset | int | Μια μετατόπιση byte στην προβολή του πηγαίου πίνακα στην οποία ξεκινά η αντιγραφή |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Ο πίνακας προορισμού |
| dstOffset | int | Μία μετατόπιση byte στον πίνακα προορισμού στην οποία αρχίζει η εισαγωγή δεδομένων |
| count | int | Ο αριθμός των byte προς αντιγραφή |

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parameter | Περιγραφή |
| --- | --- |
| TSrc | Ο τύπος των στοιχείων της προβολής του πηγαίου πίνακα |
| TDst | Ο τύπος των στοιχείων της προβολής του προορισμένου πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | Η προβολή του πηγαίου πίνακα |
| srcOffset | int | Μια μετατόπιση byte στην προβολή του πηγαίου πίνακα στην οποία ξεκινά η αντιγραφή |
| dst | const System::Details::ArrayView\<TDst\>\& | Η προβολή του προορισμένου πίνακα |
| dstOffset | int | Μια μετατόπιση byte στην προβολή του προορισμένου πίνακα στην οποία θα ξεκινήσει η εισαγωγή δεδομένων |
| count | int | Ο αριθμός των byte προς αντιγραφή |

## Δείτε επίσης

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parameter | Περιγραφή |
| --- | --- |
| TSrc | Ο τύπος των στοιχείων του πηγαίου στοίβα πίνακα |
| NS | Το μέγεθος του πηγαίου στοίβα πίνακα |
| TDst | Ο τύπος των στοιχείων του πίνακα προορισμού |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Ο πηγαίος στοίβα πίνακας |
| srcOffset | int | Μια μετατόπιση byte στον πηγαίο στοίβα πίνακα στην οποία ξεκινά η αντιγραφή |
| dst | const SharedPtr\<Array\<TDst\>\>\& | Ο πίνακας προορισμού |
| dstOffset | int | Μία μετατόπιση byte στον πίνακα προορισμού στην οποία αρχίζει η εισαγωγή δεδομένων |
| count | int | Ο αριθμός των byte προς αντιγραφή |

## Δείτε επίσης

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Ερμηνεύει δύο καθορισμένους τύπους πινάκων ως ακατέργαστους πίνακες byte και αντιγράφει δεδομένα από τον έναν στον άλλο.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parameter | Περιγραφή |
| --- | --- |
| TSrc | Ο τύπος των στοιχείων του πηγαίου στοίβα πίνακα |
| NS | Το μέγεθος του πηγαίου στοίβα πίνακα |
| TDst | Ο τύπος των στοιχείων του προορισμένου στοίβα πίνακα |
| ND | Το μέγεθος του προορισμένου στοίβα πίνακα |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | Ο πηγαίος στοίβα πίνακας |
| srcOffset | int | Μια μετατόπιση byte στον πηγαίο στοίβα πίνακα στην οποία ξεκινά η αντιγραφή |
| dst | const System::Details::StackArray\<TDst, ND\>\& | Ο προορισμένος στοίβα πίνακας |
| dstOffset | int | Μια μετατόπιση byte στον προορισμένο στοίβα πίνακα στην οποία θα ξεκινήσει η εισαγωγή δεδομένων |
| count | int | Ο αριθμός των byte προς αντιγραφή |

## Δείτε επίσης

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Αντιγράφει έναν καθορισμένο αριθμό byte από το buffer προέλευσης στο buffer προορισμού.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| src | const uint8_t * | Δείκτης προς το πηγαίο buffer |
| srcOffset | int | Μια μετατόπιση byte στο πηγαίο buffer στην οποία ξεκινά η αντιγραφή |
| dst | uint8_t * | Δείκτης προς το προορισμένο buffer |
| dstOffset | int | Μια μετατόπιση byte στο προορισμένο buffer στην οποία θα ξεκινήσει η εισαγωγή δεδομένων |
| count | int | Ο αριθμός των byte προς αντιγραφή |

## Δείτε επίσης

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
