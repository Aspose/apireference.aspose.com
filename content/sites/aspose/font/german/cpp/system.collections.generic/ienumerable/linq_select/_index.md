---
title: "System::Collections::Generic::IEnumerable::LINQ_Select Methode"
linktitle: "LINQ_Select"
second_title: "Aspose.Font für C++"
description: "Wie man die LINQ_Select-Methode der System::Collections::Generic::IEnumerable-Klasse in C++ verwendet."
type: docs
weight: 2600
url: /de/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<Source, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, Result> &selector)
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


Transformiert jedes Element einer Sequenz in eine neue Form, indem der Index des Elements einbezogen wird.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| Parameter | Beschreibung |
| --- | --- |
| ResultType | Der Typ des von dem **selector** zurückgegebenen Werts. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | Eine Transformationsfunktion. |

### ReturnValue

Ein [IEnumerable](../), das Elemente enthält, die von der **selector**-Funktion zurückgegeben werden.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


Transformiert Elemente einer Sequenz.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| Parameter | Beschreibung |
| --- | --- |
| ResultType | Der Typ des von dem **selector** zurückgegebenen Werts. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Eine Transformationsfunktion. |

### ReturnValue

Ein [IEnumerable](../), das Elemente enthält, die von der **selector**-Funktion zurückgegeben werden.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
