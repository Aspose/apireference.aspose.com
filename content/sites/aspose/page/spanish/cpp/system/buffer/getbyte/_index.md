---
title: "Método System::Buffer::GetByte"
linktitle: "GetByte"
second_title: "Aspose.Page para C++"
description: "Método System::Buffer::GetByte. Interpreta la matriz tipada especificada como una matriz de bytes cruda y recupera el valor del byte en el desplazamiento de byte especificado en C++."
type: docs
weight: 300
url: /es/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


Interpreta la matriz tipada especificada como una matriz cruda de bytes y recupera el valor del byte en el desplazamiento de byte especificado.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de elementos de la matriz |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | La matriz objetivo |
| índice | int | Desplazamiento basado en cero del byte a recuperar |

### ReturnValue

El valor del byte en el índice especificado

## Ver también

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


Interpreta la matriz tipada especificada como una matriz cruda de bytes y recupera el valor del byte en el desplazamiento de byte especificado.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de elementos de la vista del array |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | La vista de matriz objetivo |
| índice | int | Desplazamiento basado en cero del byte a recuperar |

### ReturnValue

El valor del byte en el índice especificado

## Ver también

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


Interpreta la matriz tipada especificada como una matriz cruda de bytes y recupera el valor del byte en el desplazamiento de byte especificado.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Parámetro | Descripción |
| --- | --- |
| T | El tipo de elementos del array de pila |
| N | El tamaño de la matriz de pila |

| Parámetro | Tipo | Descripción |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | La matriz de pila objetivo |
| índice | int | Desplazamiento basado en cero del byte a recuperar |

### ReturnValue

El valor del byte en el índice especificado

## Ver también

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
