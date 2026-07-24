---
title: "System::With μέθοδος"
linktitle: "Με"
second_title: "Aspose.Page για C++"
description: "System::With μέθοδος. Κλωνοποιεί το αρχείο αναφοράς και εφαρμόζει τον αρχικοποιητή functor σε αυτό σε C++."
type: docs
weight: 40100
url: /el/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Κλωνοποιεί το αρχείο αναφοράς και εφαρμόζει τον αρχικοποιητή functor σε αυτό.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος εγγραφής για κλωνοποίηση. |
| A | Τύπος αρχικοποιητικού functor. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εγγραφή | const SharedPtr\<T\>\& | Κοινόχρηστος δείκτης προς το αντικείμενο για κλωνοποίηση και αρχικοποίηση. |
| αρχικοποιητής | const A\& | Αρχικοποιητικός functor που εφαρμόζεται στην κλωνοποίηση της εγγραφής. |

### ReturnValue

Κοινός δείκτης σε κλωνοποιημένη εγγραφή.

## Δείτε επίσης

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


Αντιγράφει τη δομή εγγραφής και εφαρμόζει το functor αρχικοποίησης σε αυτήν.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Parameter | Περιγραφή |
| --- | --- |
| T | Τύπος εγγραφής προς αντιγραφή. |
| A | Τύπος αρχικοποιητικού functor. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| εγγραφή | const T\& | Εγγραφή προς αντιγραφή και αρχικοποίηση. |
| αρχικοποιητής | const A\& | Το functor αρχικοποίησης εφαρμόζεται στο αντίγραφο της εγγραφής. |

### ReturnValue

Αντιγραμμένη εγγραφή.

## Δείτε επίσης

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
