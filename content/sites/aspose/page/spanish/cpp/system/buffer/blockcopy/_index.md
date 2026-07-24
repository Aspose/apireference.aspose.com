---
title: "System::Buffer::BlockCopy método"
linktitle: "BlockCopy"
second_title: "Aspose.Page para C++"
description: "Método System::Buffer::BlockCopy. Interpreta dos matrices tipadas especificadas como matrices crudas de bytes y copia datos de una a otra en C++."
type: docs
weight: 100
url: /es/cpp/system/buffer/blockcopy/
---
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpreta dos matrices tipadas especificadas como matrices crudas de bytes y copia datos de una a otra.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parámetro | Descripción |
| --- | --- |
| TSrc | El tipo de elementos del array de origen |
| TDst | El tipo de elementos del arreglo de destino |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | El arreglo de origen |
| srcOffset | int | Un desplazamiento de bytes en el arreglo de origen en el que comienza la copia |
| dst | const SharedPtr\<Array\<TDst\>\>\& | El arreglo de destino |
| dstOffset | int | Un desplazamiento de bytes en el arreglo de destino en el que se comienza a insertar datos |
| count | int | El número de bytes a copiar |

## Ver también

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interpreta dos matrices tipadas especificadas como matrices crudas de bytes y copia datos de una a otra.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parámetro | Descripción |
| --- | --- |
| TSrc | El tipo de elementos del array de origen |
| TDst | El tipo de elementos de la vista de matriz de destino |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | El arreglo de origen |
| srcOffset | int | Un desplazamiento de bytes en el arreglo de origen en el que comienza la copia |
| dst | const System::Details::ArrayView\<TDst\>\& | La vista de matriz de destino |
| dstOffset | int | Un desplazamiento de byte en la vista de matriz de destino en el que comenzar a insertar datos |
| count | int | El número de bytes a copiar |

## Ver también

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interpreta dos matrices tipadas especificadas como matrices crudas de bytes y copia datos de una a otra.

```cpp
template<typename TSrc,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const SharedPtr<Array<TSrc>> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parámetro | Descripción |
| --- | --- |
| TSrc | El tipo de elementos del array de origen |
| TDst | El tipo de elementos de la matriz de pila de destino |
| ND | El tamaño de la matriz de pila de destino |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| src | const SharedPtr\<Array\<TSrc\>\>\& | El arreglo de origen |
| srcOffset | int | Un desplazamiento de bytes en el arreglo de origen en el que comienza la copia |
| dst | const System::Details::StackArray\<TDst, ND\>\& | La matriz de pila de destino |
| dstOffset | int | Un desplazamiento de byte en la matriz de pila de destino en el que comenzar a insertar datos |
| count | int | El número de bytes a copiar |

## Ver también

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpreta dos matrices tipadas especificadas como matrices crudas de bytes y copia datos de una a otra.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parámetro | Descripción |
| --- | --- |
| TSrc | El tipo de elementos de la vista de matriz de origen |
| TDst | El tipo de elementos del arreglo de destino |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | La vista del array de origen |
| srcOffset | int | Un desplazamiento de bytes en la vista del array de origen tho en el que comienza la copia |
| dst | const SharedPtr\<Array\<TDst\>\>\& | El arreglo de destino |
| dstOffset | int | Un desplazamiento de bytes en el arreglo de destino en el que se comienza a insertar datos |
| count | int | El número de bytes a copiar |

## Ver también

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) method


Interpreta dos matrices tipadas especificadas como matrices crudas de bytes y copia datos de una a otra.

```cpp
template<typename TSrc,typename TDst> static void System::Buffer::BlockCopy(const System::Details::ArrayView<TSrc> &src, int srcOffset, const System::Details::ArrayView<TDst> &dst, int dstOffset, int count)
```


| Parámetro | Descripción |
| --- | --- |
| TSrc | El tipo de elementos de la vista de matriz de origen |
| TDst | El tipo de elementos de la vista de matriz de destino |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| src | const System::Details::ArrayView\<TSrc\>\& | La vista del array de origen |
| srcOffset | int | Un desplazamiento de bytes en la vista del array de origen tho en el que comienza la copia |
| dst | const System::Details::ArrayView\<TDst\>\& | La vista de matriz de destino |
| dstOffset | int | Un desplazamiento de byte en la vista de matriz de destino en el que comenzar a insertar datos |
| count | int | El número de bytes a copiar |

## Ver también

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) method


Interpreta dos matrices tipadas especificadas como matrices crudas de bytes y copia datos de una a otra.

```cpp
template<typename TSrc,std::size_t,typename TDst> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const SharedPtr<Array<TDst>> &dst, int dstOffset, int count)
```


| Parámetro | Descripción |
| --- | --- |
| TSrc | El tipo de elementos del array de pila de origen |
| NS | El tamaño del array de pila de origen |
| TDst | El tipo de elementos del arreglo de destino |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | El array de pila de origen |
| srcOffset | int | Un desplazamiento de bytes en el array de pila de origen tho en el que comienza la copia |
| dst | const SharedPtr\<Array\<TDst\>\>\& | El arreglo de destino |
| dstOffset | int | Un desplazamiento de bytes en el arreglo de destino en el que se comienza a insertar datos |
| count | int | El número de bytes a copiar |

## Ver también

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) method


Interpreta dos matrices tipadas especificadas como matrices crudas de bytes y copia datos de una a otra.

```cpp
template<typename TSrc,std::size_t,typename TDst,std::size_t> static void System::Buffer::BlockCopy(const System::Details::StackArray<TSrc, NS> &src, int srcOffset, const System::Details::StackArray<TDst, ND> &dst, int dstOffset, int count)
```


| Parámetro | Descripción |
| --- | --- |
| TSrc | El tipo de elementos del array de pila de origen |
| NS | El tamaño del array de pila de origen |
| TDst | El tipo de elementos de la matriz de pila de destino |
| ND | El tamaño de la matriz de pila de destino |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| src | const System::Details::StackArray\<TSrc, NS\>\& | El array de pila de origen |
| srcOffset | int | Un desplazamiento de bytes en el array de pila de origen tho en el que comienza la copia |
| dst | const System::Details::StackArray\<TDst, ND\>\& | La matriz de pila de destino |
| dstOffset | int | Un desplazamiento de byte en la matriz de pila de destino en el que comenzar a insertar datos |
| count | int | El número de bytes a copiar |

## Ver también

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::BlockCopy(const uint8_t *, int, uint8_t *, int, int) method


Copia un número especificado de bytes del búfer de origen al búfer de destino.

```cpp
static void System::Buffer::BlockCopy(const uint8_t *src, int srcOffset, uint8_t *dst, int dstOffset, int count)
```


| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| src | const uint8_t * | Puntero al buffer de origen |
| srcOffset | int | Un desplazamiento de bytes en el buffer de origen en el que comienza la copia |
| dst | uint8_t * | Puntero al buffer de destino |
| dstOffset | int | Un desplazamiento de bytes en el buffer de destino en el que comenzar a insertar datos |
| count | int | El número de bytes a copiar |

## Ver también

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
