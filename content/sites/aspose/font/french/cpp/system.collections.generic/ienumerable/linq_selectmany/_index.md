---
title: "System::Collections::Generic::IEnumerable::LINQ_SelectMany méthode"
linktitle: "LINQ_SelectMany"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode LINQ_SelectMany de la classe System::Collections::Generic::IEnumerable en C++."
type: docs
weight: 2700
url: /fr/cpp/system.collections.generic/ienumerable/linq_selectmany/
---
## IEnumerable::LINQ_SelectMany(const Func\<Source, SharedPtr\<IEnumerable\<Result\>\>\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<Source, SharedPtr<IEnumerable<Result>>> &selector)
```

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_SelectMany(const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\&) method


Projette chaque élément d'une séquence et combine les séquences résultantes en une seule séquence.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_SelectMany(const Func<T, SharedPtr<IEnumerable<ResultType>>> &selector)
```


| Paramètre | Description |
| --- | --- |
| ResultType | Le type de la valeur retournée par le **selector**. |

| Paramètre | Type | Description |
| --- | --- | --- |
| selector | const Func\<T, SharedPtr\<IEnumerable\<ResultType\>\>\>\& | Une fonction de transformation. |

### ReturnValue

Un [IEnumerable](../) qui contient le résultat de l'appel d'une fonction de projection un-à-plusieurs sur chaque élément de la séquence d'entrée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
