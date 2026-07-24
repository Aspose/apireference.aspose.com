---
title: "System::Collections::Generic::IEnumerable::LINQ_SelectMany methode"
linktitle: "LINQ_SelectMany"
second_title: "Aspose.Page voor C++"
description: "Hoe de LINQ_SelectMany methode van de System::Collections::Generic::IEnumerable klasse te gebruiken in C++."
type: docs
weight: 2700
url: /nl/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


Projetteert elk element van een reeks en combineert de resulterende reeksen tot één reeks.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| Parameter | Beschrijving |
| --- | --- |
| ResultType | Het type van de waarde die wordt geretourneerd door de **selector**. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | Een transformatiefunctie. |

### ReturnValue

Een [IEnumerable](../) die het resultaat bevat van het aanroepen van een één-op-veel projectiefunctie op elk element van de invoerreeks.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
