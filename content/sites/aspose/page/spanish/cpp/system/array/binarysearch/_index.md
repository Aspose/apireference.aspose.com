---
title: "Método System::Array::BinarySearch"
linktitle: "BinarySearch"
second_title: "Aspose.Page para C++"
description: "Método System::Array::BinarySearch. Realiza una búsqueda binaria en el arreglo ordenado en C++."
type: docs
weight: 4600
url: /es/cpp/system/array/binarysearch/
---
## Array::BinarySearch(System::ArrayPtr\<T\>, const T\&) method


Realiza una búsqueda binaria en el array ordenado.

```cpp
static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const T &item)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | System::ArrayPtr\<T\> | Arreglo ordenado en el que realizar la búsqueda |
| item | const T\& | Un elemento a buscar |

### ReturnValue

Índice del elemento buscado si se encuentra; de lo contrario, un entero negativo que es el complemento a nivel de bits del índice del siguiente elemento mayor que el buscado o, si no hay un elemento mayor, el complemento a nivel de bits del número de elementos del arreglo.

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::BinarySearch(System::ArrayPtr\<T\>, const Y\&, const SharedPtr\<Collections::Generic::IComparer\<Z\>\>\&) method


NO IMPLEMENTADO.

```cpp
template<typename Y,typename Z> static int System::Array<T>::BinarySearch(System::ArrayPtr<T> arr, const Y &item, const SharedPtr<Collections::Generic::IComparer<Z>> &comparer)
```


## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IComparer](../../../system.collections.generic/icomparer/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
