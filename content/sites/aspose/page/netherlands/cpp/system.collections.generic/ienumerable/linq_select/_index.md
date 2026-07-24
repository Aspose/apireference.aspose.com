---
title: "System::Collections::Generic::IEnumerable::LINQ_Select-methode"
linktitle: "LINQ_Select"
second_title: "Aspose.Page voor C++"
description: "Hoe de LINQ_Select-methode van de System::Collections::Generic::IEnumerable-klasse te gebruiken in C++."
type: docs
weight: 2600
url: /nl/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## Zie ook

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

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


Transformeert elk element van een reeks naar een nieuwe vorm door de index van het element op te nemen.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| Parameter | Beschrijving |
| --- | --- |
| ResultType | Het type van de waarde die wordt geretourneerd door de **selector**. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | Een transformatiefunctie. |

### ReturnValue

Een [IEnumerable](../) die elementen bevat die worden geretourneerd door de **selector**-functie.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


Transformeert elementen van een reeks.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| Parameter | Beschrijving |
| --- | --- |
| ResultType | Het type van de waarde die wordt geretourneerd door de **selector**. |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Een transformatiefunctie. |

### ReturnValue

Een [IEnumerable](../) die elementen bevat die worden geretourneerd door de **selector**-functie.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Page for C++](../../../)
