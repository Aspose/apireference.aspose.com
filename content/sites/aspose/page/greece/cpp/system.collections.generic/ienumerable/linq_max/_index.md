---
title: "System::Collections::Generic::IEnumerable::LINQ_Max μέθοδος"
linktitle: "LINQ_Max"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο LINQ_Max της κλάσης System::Collections::Generic::IEnumerable σε C++."
type: docs
weight: 2000
url: /el/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## Δείτε επίσης

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


Καλεί μια συνάρτηση μετασχηματισμού σε κάθε στοιχείο μιας γενικής ακολουθίας και επιστρέφει τη μέγιστη προκύπτουσα τιμή.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Parameter | Περιγραφή |
| --- | --- |
| ResultType | Ο τύπος της τιμής που επιστρέφεται από τον επιλογέα. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Μια συνάρτηση μετασχηματισμού για εφαρμογή σε κάθε στοιχείο. |

### ReturnValue

Η μέγιστη τιμή στη σειρά.

## Δείτε επίσης

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
