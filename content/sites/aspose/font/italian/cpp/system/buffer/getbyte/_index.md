---
title: "Metodo System::Buffer::GetByte"
linktitle: "GetByte"
second_title: "Aspose.Font per C++"
description: "Metodo System::Buffer::GetByte. Interpreta l'array tipizzato specificato come un array di byte grezzo e recupera il valore del byte all'offset di byte specificato in C++."
type: docs
weight: 300
url: /it/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


Interpreta l'array tipizzato specificato come un array grezzo di byte e recupera il valore byte allo offset di byte specificato.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi dell'array |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | L'array di destinazione |
| indice | int | Offset a base zero del byte da recuperare |

### ReturnValue

Il valore del byte all'indice specificato

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


Interpreta l'array tipizzato specificato come un array grezzo di byte e recupera il valore byte allo offset di byte specificato.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di elementi della vista dell'array |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | La vista dell'array di destinazione |
| indice | int | Offset a base zero del byte da recuperare |

### ReturnValue

Il valore del byte all'indice specificato

## Vedi anche

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


Interpreta l'array tipizzato specificato come un array grezzo di byte e recupera il valore byte allo offset di byte specificato.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo di elementi dell'array stack |
| N | La dimensione dell'array di stack |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | L'array di stack di destinazione |
| indice | int | Offset a base zero del byte da recuperare |

### ReturnValue

Il valore del byte all'indice specificato

## Vedi anche

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
