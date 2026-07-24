---
title: "System::Collections::Generic::IEnumerable::LINQ_Select μέθοδος"
linktitle: "LINQ_Select"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο LINQ_Select της κλάσης System::Collections::Generic::IEnumerable σε C++."
type: docs
weight: 2600
url: /el/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<Source, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, Result> &selector)
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


Μετασχηματίζει κάθε στοιχείο μιας ακολουθίας σε νέα μορφή ενσωματώνοντας το δείκτη του στοιχείου.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| Parameter | Περιγραφή |
| --- | --- |
| ResultType | Ο τύπος της τιμής που επιστρέφεται από το **selector**. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | Μια συνάρτηση μετασχηματισμού. |

### ReturnValue

Ένα [IEnumerable](../) που περιέχει στοιχεία που επιστρέφονται από τη λειτουργία **selector**.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


Μετασχηματίζει στοιχεία μιας ακολουθίας.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| Parameter | Περιγραφή |
| --- | --- |
| ResultType | Ο τύπος της τιμής που επιστρέφεται από το **selector**. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Μια συνάρτηση μετασχηματισμού. |

### ReturnValue

Ένα [IEnumerable](../) που περιέχει στοιχεία που επιστρέφονται από τη λειτουργία **selector**.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
