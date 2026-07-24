---
title: "System::Array::IndexOf método"
linktitle: "IndexOf"
second_title: "Aspose.Page para C++"
description: "System::Array::IndexOf método. Determina el índice de la primera aparición del elemento especificado en el arreglo en C++."
type: docs
weight: 2900
url: /es/cpp/system/array/indexof/
---
## Array::IndexOf(const T\&) const method


Determina el índice de la primera aparición del elemento especificado en el arreglo.

```cpp
virtual int System::Array<T>::IndexOf(const T &item) const override
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| item | const T\& | Índice del elemento cuyo índice se debe determinar |

### ReturnValue

Índice de la primera aparición del elemento especificado si se encuentra, de lo contrario -1

## Ver también

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&) method


Determina el índice de la primera aparición del elemento especificado en el arreglo.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value)
```


| Parámetro | Descripción |
| --- | --- |
| ArrayType | Tipo de los elementos en el array de destino |
| ValueType | tipo del elemento a buscar en el arreglo |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) para buscar el elemento especificado |
| value | const ValueType\& | Índice del elemento cuyo índice se debe determinar |

### ReturnValue

Índice de la primera aparición del elemento especificado si se encuentra, de lo contrario -1

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int) method


Determina el índice de la primera aparición del elemento especificado en el arreglo a partir del índice especificado.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex)
```


| Parámetro | Descripción |
| --- | --- |
| ArrayType | Tipo de los elementos en el array de destino |
| ValueType | tipo del elemento a buscar en el arreglo |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) para buscar el elemento especificado |
| value | const ValueType\& | Índice del elemento cuyo índice se debe determinar |
| startIndex | int | Índice en el que se inicia la búsqueda |

### ReturnValue

Índice de la primera aparición del elemento especificado si se encuentra, de lo contrario -1

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::IndexOf(const ArrayPtr\<ArrayType\>\&, const ValueType\&, int, int) method


Determina el índice de la primera aparición del elemento especificado en un rango de elementos del arreglo especificado por el índice de inicio y el número de elementos en el rango.

```cpp
template<typename ArrayType,typename ValueType> static int System::Array<T>::IndexOf(const ArrayPtr<ArrayType> &arr, const ValueType &value, int startIndex, int count)
```


| Parámetro | Descripción |
| --- | --- |
| ArrayType | Tipo de los elementos en el array de destino |
| ValueType | tipo del elemento a buscar en el arreglo |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| arr | const ArrayPtr\<ArrayType\>\& | [Array](../) para buscar el elemento especificado |
| value | const ValueType\& | Índice del elemento cuyo índice se debe determinar |
| startIndex | int | Índice en el que se inicia la búsqueda |
| count | int | Número de elementos del rango en el que buscar |

### ReturnValue

Índice de la primera aparición del elemento especificado si se encuentra, de lo contrario -1

## Ver también

* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [ValueType](../valuetype/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
