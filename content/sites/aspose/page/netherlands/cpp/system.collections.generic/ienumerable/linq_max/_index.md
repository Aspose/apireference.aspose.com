---
title: "System::Collections::Generic::IEnumerable::LINQ_Max methode"
linktitle: "LINQ_Max"
second_title: "Aspose.Page voor C++"
description: "Hoe gebruik je de LINQ_Max methode van de System::Collections::Generic::IEnumerable klasse in C++."
type: docs
weight: 2000
url: /nl/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## Zie ook

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


Roept een transformatiefunctie aan op elk element van een generieke reeks en retourneert de maximale resulterende waarde.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Parameter | Beschrijving |
| --- | --- |
| ResultType | Het type van de waarde die door selector wordt geretourneerd. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Een transformatiefunctie die op elk element wordt toegepast. |

### ReturnValue

De maximale waarde in de reeks.

## Zie ook

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
