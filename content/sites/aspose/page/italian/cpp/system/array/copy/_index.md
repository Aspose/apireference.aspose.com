---
title: "System::Array::Copy method"
linktitle: "Copia"
second_title: "Aspose.Page per C++"
description: "System::Array::Copy method. Copia il numero specificato di elementi dall'array di origine all'array di destinazione in C++."
type: docs
weight: 4900
url: /it/cpp/system/array/copy/
---
## Array::Copy(const ArrayPtr\<SrcType\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Copia il numero specificato di elementi dall'array di origine all'array di destinazione.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Array di origine |
| dstArray | const ArrayPtr\<DstType\>\& | Array di destinazione |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Copia un numero specificato di elementi dall'array di origine a partire dall'indice specificato verso la posizione specificata nell'array di destinazione.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametro | Descrizione |
| --- | --- |
| SrcType | Tipo degli elementi nell'array di origine |
| DstType | Tipo degli elementi nell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Array di origine |
| srcIndex | int64_t | Indice nell'array di origine che indica l'inizio dell'intervallo di elementi da copiare |
| dstArray | const ArrayPtr\<DstType\>\& | Array di destinazione |
| dstIndex | int64_t | Indice nell'array di destinazione dove iniziare a inserire gli elementi copiati |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Copia un numero specificato di elementi dall'array di origine a partire dall'indice specificato verso la posizione specificata nella vista dell'array di destinazione.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parametro | Descrizione |
| --- | --- |
| SrcType | Tipo degli elementi nell'array di origine |
| DstType | Tipo di elementi nella visualizzazione dell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Array di origine |
| srcIndex | int64_t | Indice nell'array di origine che indica l'inizio dell'intervallo di elementi da copiare |
| dstArray | System::Details::ArrayView\<DstType\> | Visualizzazione dell'array di destinazione |
| dstIndex | int64_t | Indice nella visualizzazione dell'array di destinazione dove iniziare a inserire gli elementi copiati |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, N\>\&, int64_t, int64_t) method


Copia un numero specificato di elementi dall'array di origine a partire dall'indice specificato verso la posizione specificata nell'array di destinazione sullo stack.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, N> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametro | Descrizione |
| --- | --- |
| SrcType | Tipo degli elementi nell'array di origine |
| DstType | Tipo di elementi nell'array di destinazione sullo stack |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Array di origine |
| srcIndex | int64_t | Indice nell'array di origine che indica l'inizio dell'intervallo di elementi da copiare |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Array di destinazione sullo stack |
| dstIndex | int64_t | Indice nell'array di destinazione sullo stack dove iniziare a inserire gli elementi copiati |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::ArrayView\<DstType\>, int64_t) method


Copia il numero specificato di elementi dall'array di origine alla vista dell'array di destinazione.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Array di origine |
| dstArray | System::Details::ArrayView\<DstType\> | Visualizzazione dell'array di destinazione |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(const ArrayPtr\<SrcType\>\&, System::Details::StackArray\<DstType, N\>\&, int64_t) method


Copia il numero specificato di elementi dall'array di origine all'array di destinazione sullo stack.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(const ArrayPtr<SrcType> &srcArray, System::Details::StackArray<DstType, N> &dstArray, int64_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | const ArrayPtr\<SrcType\>\& | Array di origine |
| dstArray | System::Details::StackArray\<DstType, N\>\& | Array di destinazione sullo stack |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Copia un numero specificato di elementi dalla vista dell'array di origine a partire dall'indice specificato verso la posizione specificata nell'array di destinazione sullo stack.

```cpp
template<typename SrcType,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametro | Descrizione |
| --- | --- |
| SrcType | Tipo di elementi nell'array di origine sullo stack |
| DstType | Tipo di elementi nell'array di destinazione sullo stack |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\>\& | Visualizzazione dell'array di origine |
| srcIndex | int64_t | Indice nella visualizzazione dell'array di origine che indica l'inizio dell'intervallo di elementi da copiare |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Array di destinazione sullo stack |
| dstIndex | int64_t | Indice nell'array di destinazione sullo stack dove iniziare a inserire gli elementi copiati |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, const ArrayPtr\<DstType\>\&, int64_t) method


Copia il numero specificato di elementi dalla vista dell'array di origine all'array di destinazione.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Visualizzazione dell'array di origine |
| dstArray | const ArrayPtr\<DstType\>\& | Array di destinazione |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Copia un numero specificato di elementi dalla vista dell'array di origine a partire dall'indice specificato verso la posizione specificata nell'array di destinazione.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametro | Descrizione |
| --- | --- |
| SrcType | Tipo di elementi nella visualizzazione dell'array di origine |
| DstType | Tipo degli elementi nell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Visualizzazione dell'array di origine |
| srcIndex | int64_t | Indice nella visualizzazione dell'array di origine che indica l'inizio dell'intervallo di elementi da copiare |
| dstArray | const ArrayPtr\<DstType\>\& | Array di destinazione |
| dstIndex | int64_t | Indice nell'array di destinazione dove iniziare a inserire gli elementi copiati |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, int64_t, System::Details::ArrayView\<DstType\>, int64_t, int64_t) method


Copia un numero specificato di elementi dalla vista dell'array di origine a partire dall'indice specificato verso la posizione specificata nella vista dell'array di destinazione.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, int64_t srcIndex, System::Details::ArrayView<DstType> dstArray, int64_t dstIndex, int64_t count)
```


| Parametro | Descrizione |
| --- | --- |
| SrcType | Tipo di elementi nella visualizzazione dell'array di origine |
| DstType | Tipo di elementi nella visualizzazione dell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Visualizzazione dell'array di origine |
| srcIndex | int64_t | Indice nella visualizzazione dell'array di origine che indica l'inizio dell'intervallo di elementi da copiare |
| dstArray | System::Details::ArrayView\<DstType\> | Visualizzazione dell'array di destinazione |
| dstIndex | int64_t | Indice nella visualizzazione dell'array di destinazione dove iniziare a inserire gli elementi copiati |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::ArrayView\<SrcType\>, System::Details::ArrayView\<DstType\>, int64_t) method


Copia il numero specificato di elementi dalla vista dell'array di origine alla vista dell'array di destinazione.

```cpp
template<typename SrcType,typename DstType> static void System::Array<T>::Copy(System::Details::ArrayView<SrcType> srcArray, System::Details::ArrayView<DstType> dstArray, int64_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | System::Details::ArrayView\<SrcType\> | Visualizzazione dell'array di origine |
| dstArray | System::Details::ArrayView\<DstType\> | Visualizzazione dell'array di destinazione |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, const ArrayPtr\<DstType\>\&, int64_t) method


Copia il numero specificato di elementi dall'array di origine sullo stack all'array di destinazione.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, const ArrayPtr<DstType> &dstArray, int64_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Array di origine nello stack |
| dstArray | const ArrayPtr\<DstType\>\& | Array di destinazione |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, N\>\&, int64_t, const ArrayPtr\<DstType\>\&, int64_t, int64_t) method


Copia un numero specificato di elementi dall'array di origine sullo stack a partire dall'indice specificato verso la posizione specificata nell'array di destinazione.

```cpp
template<typename SrcType,std::size_t,typename DstType> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, N> &srcArray, int64_t srcIndex, const ArrayPtr<DstType> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametro | Descrizione |
| --- | --- |
| SrcType | Tipo di elementi nell'array di origine sullo stack |
| DstType | Tipo degli elementi nell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, N\>\& | Array di origine nello stack |
| srcIndex | int64_t | Indice nell'array di origine nello stack che indica l'inizio dell'intervallo di elementi da copiare |
| dstArray | const ArrayPtr\<DstType\>\& | Array di destinazione |
| dstIndex | int64_t | Indice nell'array di destinazione dove iniziare a inserire gli elementi copiati |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, int64_t, System::Details::StackArray\<DstType, ND\>\&, int64_t, int64_t) method


Copia un numero specificato di elementi dall'array di origine sullo stack a partire dall'indice specificato verso la posizione specificata nell'array di destinazione sullo stack.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, int64_t srcIndex, System::Details::StackArray<DstType, ND> &dstArray, int64_t dstIndex, int64_t count)
```


| Parametro | Descrizione |
| --- | --- |
| SrcType | Tipo di elementi nell'array di origine sullo stack |
| DstType | Tipo di elementi nell'array di destinazione sullo stack |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Array di origine nello stack |
| srcIndex | int64_t | Indice nell'array di origine nello stack che indica l'inizio dell'intervallo di elementi da copiare |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Array di destinazione sullo stack |
| dstIndex | int64_t | Indice nell'array di destinazione sullo stack dove iniziare a inserire gli elementi copiati |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Array::Copy(System::Details::StackArray\<SrcType, NS\>\&, System::Details::StackArray\<DstType, ND\>\&, int64_t) method


Copia il numero specificato di elementi dall'array di origine sullo stack all'array di destinazione sullo stack.

```cpp
template<typename SrcType,std::size_t,typename DstType,std::size_t> static void System::Array<T>::Copy(System::Details::StackArray<SrcType, NS> &srcArray, System::Details::StackArray<DstType, ND> &dstArray, int64_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| srcArray | System::Details::StackArray\<SrcType, NS\>\& | Array di origine nello stack |
| dstArray | System::Details::StackArray\<DstType, ND\>\& | Array di destinazione sullo stack |
| count | int64_t | Il numero di elementi da copiare |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
