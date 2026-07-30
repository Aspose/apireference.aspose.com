---
title: "System::Collections::Generic::IEnumerable::LINQ_Min méthode"
linktitle: "LINQ_Min"
second_title: "Aspose.Font pour C++"
description: "Comment utiliser la méthode LINQ_Min de la classe System::Collections::Generic::IEnumerable en C++."
type: docs
weight: 2100
url: /fr/cpp/system.collections.generic/ienumerable/linq_min/
---
## IEnumerable::LINQ_Min(const Func\<Source, ResultType\>\&) method




```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<Source, ResultType> &selector)
```

## Voir aussi

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
## IEnumerable::LINQ_Min(const Func\<T, ResultType\>\&) method


Applique une fonction de transformation à chaque élément d'une séquence générique et renvoie la valeur minimale résultante.

```cpp
template<typename ResultType> ResultType System::Collections::Generic::IEnumerable<T>::LINQ_Min(const Func<T, ResultType> &selector)
```


| Paramètre | Description |
| --- | --- |
| ResultType | Le type de la valeur retournée par le sélecteur. |

| Paramètre | Type | Description |
| --- | --- | --- |
| selector | const Func\<T, ResultType\>\& | Une fonction de transformation à appliquer à chaque élément. |

### ReturnValue

La valeur minimale dans la séquence.

## Voir aussi

* Class [Func](../../../system/func/)
* Class [IEnumerable](../)
* Namespace [System::Collections::Generic](../../)
* Library [Aspose.Font for C++](../../../)
