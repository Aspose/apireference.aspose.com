---
title: "System::Collections::Generic::IEnumerable::LINQ_SelectMany method"
linktitle: "LINQ_SelectMany"
second_title: "Aspose.Page για C++"
description: "Πώς να χρησιμοποιήσετε τη μέθοδο LINQ_SelectMany της κλάσης System::Collections::Generic::IEnumerable σε C++."
type: docs
weight: 2700
url: /el/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


Προβάλλει κάθε στοιχείο μιας ακολουθίας και συνδυάζει τις προκύπτουσες ακολουθίες σε μία ακολουθία.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| Parameter | Περιγραφή |
| --- | --- |
| ResultType | Ο τύπος της τιμής που επιστρέφεται από το **selector**. |

| Parameter | Type | Περιγραφή |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | Μια συνάρτηση μετασχηματισμού. |

### ReturnValue

Ένα [IEnumerable](../) που περιέχει το αποτέλεσμα της κλήσης μιας συνάρτησης προβολής ενός-προς-πολλά σε κάθε στοιχείο της εισαγόμενης ακολουθίας.

## Δείτε επίσης

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
