---
title: "System::Array::BinarySearch méthode"
linktitle: "BinarySearch"
second_title: "Aspose.Font pour C++"
description: "System::Array::BinarySearch méthode. Effectue une recherche binaire dans le tableau trié en C++."
type: docs
weight: 4600
url: /fr/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Effectue une recherche binaire dans le tableau trié.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Tableau trié dans lequel effectuer la recherche |
| élément | const T\& | Un élément à rechercher |

### ReturnValue

Indice de l'élément recherché s'il est trouvé, sinon un entier négatif qui est le complément à un de l'indice de l'élément suivant plus grand que l'élément recherché ou, s'il n'existe aucun élément plus grand, le complément à un du nombre d'éléments du tableau.

## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


NON IMPLEMENTÉ.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## Voir aussi

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
