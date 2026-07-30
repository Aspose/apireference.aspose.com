---
title: "System::Collections::Generic::IEnumerable::LINQ_Select méthode"
linktitle: "LINQ_Select"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode LINQ_Select de la classe System::Collections::Generic::IEnumerable en C++."
type: docs
weight: 2600
url: /fr/cpp/system.collections.generic/ienumerable/linq_select/
---
## IEnumerable::LINQ_Select(const Func\<Source, int32_t, Result\>\&) method




```cpp
template<typename Result> SharedPtr<IEnumerable<Result>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<Source, int32_t, Result> &selector)
```

## Voir aussi

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

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, int32_t, ResultType\>\&) method


Transforme chaque élément d'une séquence en une nouvelle forme en incorporant l'index de l'élément.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, int32_t, ResultType> &selector)
```


| Paramètre | Description |
| --- | --- |
| ResultType | Le type de la valeur retournée par le **selector**. |

| Paramètre | Type | Description |
| --- | --- | --- |
| selector | const Func\<T, int32_t, ResultType\>\& | Une fonction de transformation. |

### ReturnValue

Un [IEnumerable](../) qui contient les éléments retournés par la fonction **selector**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Select(const Func\<T, ResultType\>\&) method


Transforme les éléments d'une séquence.

```cpp
template<typename ResultType> SharedPtr<IEnumerable<ResultType>> System::Collections::Generic::IEnumerable<T>::LINQ_Select(const Func<T, ResultType> &selector)
```


| Paramètre | Description |
| --- | --- |
| ResultType | Le type de la valeur retournée par le **selector**. |

| Paramètre | Type | Description |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Une fonction de transformation. |

### ReturnValue

Un [IEnumerable](../) qui contient les éléments retournés par la fonction **selector**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IEnumerable](../)
* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
