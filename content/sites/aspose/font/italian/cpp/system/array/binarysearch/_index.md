---
title: "System::Array::BinarySearch method"
linktitle: "BinarySearch"
second_title: "Aspose.Font per C++"
description: "System::Array::BinarySearch method. Esegue una ricerca binaria nell'array ordinato in C++."
type: docs
weight: 4600
url: /it/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Esegue una ricerca binaria nell'array ordinato.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Array ordinato in cui eseguire la ricerca |
| elemento | const T\& | Un elemento da cercare |

### ReturnValue

Indice dell'elemento cercato se trovato, altrimenti un intero negativo che è il complemento a livello di bit dell'indice del prossimo elemento maggiore dell'elemento cercato o, se non esiste un elemento maggiore, il complemento a livello di bit del numero di elementi nell'array.

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


NON IMPLEMENTATO.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
