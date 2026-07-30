---
title: "System::Collections::Generic::IEnumerable::LINQ_SelectMany Methode"
linktitle: "LINQ_SelectMany"
second_title: "Aspose.Font für C++"
description: "Wie man die LINQ_SelectMany Methode der Klasse System::Collections::Generic::IEnumerable in C++ verwendet."
type: docs
weight: 2700
url: /de/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


Projiziert jedes Element einer Sequenz und kombiniert die resultierenden Sequenzen zu einer einzigen Sequenz.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| Parameter | Beschreibung |
| --- | --- |
| ResultType | Der Typ des von dem **selector** zurückgegebenen Werts. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | Eine Transformationsfunktion. |

### ReturnValue

Ein [IEnumerable](../), das das Ergebnis der Aufruf einer Eins-zu-Viele-Projektionsfunktion für jedes Element der Eingabesequenz enthält.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
