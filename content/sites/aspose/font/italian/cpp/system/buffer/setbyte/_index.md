---
title: "System::Buffer::SetByte metodo"
linktitle: "SetByte"
second_title: "Aspose.Font per C++"
description: "System::Buffer::SetByte metodo. Interpreta l'array tipizzato specificato come un array di byte grezzo e imposta il valore del byte specificato allo offset di byte specificato in C++."
type: docs
weight: 400
url: /it/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


Interpreta l'array tipizzato specificato come un array di byte grezzo e imposta il valore byte specificato allo spostamento di byte specificato.

```cpp
template<typename T> static void System::Buffer::SetByte(const SharedPtr<Array<T>> &array, int index, uint8_t value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi dell'array |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const SharedPtr\<Array\<T\>\>\& | L'array di destinazione |
| indice | int | Offset basato su zero del byte da impostare |
| valore | uint8_t | Il valore del byte da impostare |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


Interpreta l'array tipizzato specificato come un array di byte grezzo e imposta il valore byte specificato allo spostamento di byte specificato.

```cpp
template<typename T> static void System::Buffer::SetByte(const System::Details::ArrayView<T> &array, int index, uint8_t value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi dell'array |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const System::Details::ArrayView\<T\>\& | La vista dell'array di destinazione |
| indice | int | Offset basato su zero del byte da impostare |
| valore | uint8_t | Il valore del byte da impostare |

## Vedi anche

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


Interpreta l'array tipizzato specificato come un array di byte grezzo e imposta il valore byte specificato allo spostamento di byte specificato.

```cpp
template<typename T,std::size_t> static void System::Buffer::SetByte(const System::Details::StackArray<T, N> &array, int index, uint8_t value)
```


| Parametro | Descrizione |
| --- | --- |
| T | Il tipo degli elementi dell'array |
| N | La dimensione dell'array di stack |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| array | const System::Details::StackArray\<T, N\>\& | L'array di stack di destinazione |
| indice | int | Offset basato su zero del byte da impostare |
| valore | uint8_t | Il valore del byte da impostare |

## Vedi anche

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
