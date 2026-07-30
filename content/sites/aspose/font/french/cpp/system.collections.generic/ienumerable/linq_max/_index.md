---
title: "System::Collections::Generic::IEnumerable::LINQ_Max méthode"
linktitle: "LINQ_Max"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode LINQ_Max de la classe System::Collections::Generic::IEnumerable en C++."
type: docs
weight: 2000
url: /fr/cpp/system.collections.generic/ienumerable/linq_max/
---
## IEnumerable::LINQ_Max(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<Source, ResultType> &selector)
```

## Voir aussi

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Max(const Func\<T, ResultType\>\&) method


Applique une fonction de transformation à chaque élément d'une séquence générique et renvoie la valeur maximale résultante.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Max(const Func<T, ResultType> &selector)
```


| Paramètre | Description |
| --- | --- |
| ResultType | Le type de la valeur retournée par le sélecteur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Une fonction de transformation à appliquer à chaque élément. |

### ReturnValue

La valeur maximale de la séquence.

## Voir aussi

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
