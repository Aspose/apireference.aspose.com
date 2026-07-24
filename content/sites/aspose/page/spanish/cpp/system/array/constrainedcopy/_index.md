---
title: "Método System::Array::ConstrainedCopy"
linktitle: "ConstrainedCopy"
second_title: "Aspose.Page para C++"
description: "Método System::Array::ConstrainedCopy. Copia un rango de elementos de un System.Array comenzando en la fuente especificada en C++."
type: docs
weight: 4700
url: /es/cpp/system/array/constrainedcopy/
---
## Array::ConstrainedCopy method


Copia un rango de elementos de un [System.Array](../) comenzando en la fuente especificada.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::ConstrainedCopy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parámetro | Descripción |
| --- | --- |
| SrcType | Tipo de elementos en el arreglo de origen |
| DstType | Tipo de elementos en el arreglo de destino |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Arreglo de origen |
| srcIndex | int64_t | Índice en el arreglo de origen que designa el comienzo del rango de elementos a copiar |
| dstArray | const ArrayPtr\<DstType\>\& | Arreglo de destino |
| dstIndex | int64_t | Índice en el arreglo de destino donde comenzar a insertar los elementos copiados |
| count | int64_t | El número de elementos a copiar |
## Observaciones


¡IMPLEMENTACIÓN CRUDA TEMPORAL SIN NINGÚN DESHACIMIENTO!
## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
