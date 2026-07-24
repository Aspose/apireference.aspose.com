---
title: "System::Collections::Generic::IEnumerable::LINQ_Min methode"
linktitle: "LINQ_Min"
second_title: "Aspose.Page voor C++"
description: "Hoe de LINQ_Min methode van de System::Collections::Generic::IEnumerable klasse te gebruiken in C++."
type: docs
weight: 2100
url: /nl/cpp/system.collections.generic/ienumerable/linq_min/
---
## IEnumerable::LINQ_Min(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<Source, ResultType> &selector)
```

## Zie ook

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


Roept een transformatiefunctie aan op elk element van een generieke reeks en retourneert de minimale resulterende waarde.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| Parameter | Beschrijving |
| --- | --- |
| ResultType | Het type van de waarde die door selector wordt geretourneerd. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Een transformatiefunctie die op elk element wordt toegepast. |

### ReturnValue

De minimumwaarde in de reeks.

## Zie ook

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
