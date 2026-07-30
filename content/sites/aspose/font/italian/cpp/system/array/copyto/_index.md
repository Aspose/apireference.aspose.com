---
title: "Metodo System::Array::CopyTo"
linktitle: "CopyTo"
second_title: "Aspose.Font per C++"
description: "Metodo System::Array::CopyTo. Copia tutti gli elementi dell'array corrente nell'array di destinazione specificato. Gli elementi vengono inseriti nell'array di destinazione a partire dall'indice specificato dall'argomento arrayIndex in C++."
type: docs
weight: 900
url: /it/cpp/system/array/copyto/
---
## Array::CopyTo(ArrayPtr\<T\>, int) method


Copia tutti gli elementi dell'array corrente nell'array di destinazione specificato. Gli elementi vengono inseriti nell'array di destinazione a partire dall'indice specificato dall'argomento arrayIndex.

```cpp
virtual void System::Array<T>::CopyTo(ArrayPtr<T> arr, int arrayIndex) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| arr | ArrayPtr\<T\> | Array di destinazione |
| arrayIndex | int | Indice nell'array di destinazione dove iniziare a inserire gli elementi copiati |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t) const method


Copia tutti gli elementi dell'array corrente nell'array di destinazione specificato. Gli elementi vengono inseriti nell'array di destinazione a partire dall'indice specificato dall'argomento dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t dstIndex) const
```


| Parametro | Descrizione |
| --- | --- |
| DstType | Tipo degli elementi nell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Array di destinazione |
| dstIndex | int64_t | Indice nell'array di destinazione dove iniziare a inserire gli elementi copiati |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const ArrayPtr\<DstType\>\&, int64_t, int64_t, int64_t) const method


Copia un numero specificato di elementi dall'array corrente a partire dalla posizione specificata verso l'array di destinazione specificato. Gli elementi vengono inseriti nell'array di destinazione a partire dall'indice specificato dall'argomento dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const ArrayPtr<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parametro | Descrizione |
| --- | --- |
| DstType | Tipo degli elementi nell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dstArray | const ArrayPtr\<DstType\>\& | Array di destinazione |
| srcIndex | int64_t | Indice nell'array di origine da cui iniziare a copiare gli elementi |
| dstIndex | int64_t | Indice nell'array di destinazione dove iniziare a inserire gli elementi copiati |
| count | int64_t | Numero di elementi da copiare |

## Vedi anche

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t) const method


Copia tutti gli elementi dell'array corrente nella vista dell'array di destinazione specificata. Gli elementi vengono inseriti nella vista dell'array di destinazione a partire dall'indice specificato dall'argomento dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t dstIndex) const
```


| Parametro | Descrizione |
| --- | --- |
| DstType | Tipo degli elementi nella vista dell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Vista dell'array di destinazione |
| dstIndex | int64_t | Indice nella vista dell'array di destinazione in cui iniziare a inserire gli elementi copiati |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Array::CopyTo(const System::Details::ArrayView\<DstType\>\&, int64_t, int64_t, int64_t) const method


Copia un numero specificato di elementi dall'array corrente a partire da una posizione specificata nella vista dell'array di destinazione. Gli elementi vengono inseriti nella vista dell'array di destinazione a partire dall'indice specificato dall'argomento dstIndex.

```cpp
template<typename DstType> void System::Array<T>::CopyTo(const System::Details::ArrayView<DstType> &dstArray, int64_t srcIndex, int64_t dstIndex, int64_t count) const
```


| Parametro | Descrizione |
| --- | --- |
| DstType | Tipo degli elementi nella vista dell'array di destinazione |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| dstArray | const System::Details::ArrayView\<DstType\>\& | Vista dell'array di destinazione |
| srcIndex | int64_t | Indice nell'array di origine da cui iniziare a copiare gli elementi |
| dstIndex | int64_t | Indice nella vista dell'array di destinazione in cui iniziare a inserire gli elementi copiati |
| count | int64_t | Numero di elementi da copiare |

## Vedi anche

* Class [Array](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
