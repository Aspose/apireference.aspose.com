---
title: "System::Collections::Generic::IEnumerable::LINQ_Min μέθοδος"
linktitle: "LINQ_Min"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο LINQ_Min της κλάσης System::Collections::Generic::IEnumerable σε C++."
type: docs
weight: 2100
url: /el/cpp/system.collections.generic/ienumerable/linq_min/
---
## IEnumerable::LINQ_Min(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<Source, ResultType> &selector)
```

## Δείτε επίσης

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


Καλεί μια συνάρτηση μετασχηματισμού σε κάθε στοιχείο μιας γενικής ακολουθίας και επιστρέφει τη ελάχιστη προκύπτουσα τιμή.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| Parameter | Περιγραφή |
| --- | --- |
| ResultType | Ο τύπος της τιμής που επιστρέφεται από τον επιλογέα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Μια συνάρτηση μετασχηματισμού για εφαρμογή σε κάθε στοιχείο. |

### ReturnValue

Η ελάχιστη τιμή στην ακολουθία.

## Δείτε επίσης

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
