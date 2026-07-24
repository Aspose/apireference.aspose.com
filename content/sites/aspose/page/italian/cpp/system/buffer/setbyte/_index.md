---
title: "Metodo System::Buffer::SetByte"
linktitle: "SetByte"
second_title: "Aspose.Page per C++"
description: "Metodo System::Buffer::SetByte. Interpreta l'array tipizzato specificato come un array di byte grezzo e imposta il valore byte specificato allo offset byte specificato in C++."
type: docs
weight: 400
url: /it/cpp/system/buffer/setbyte/
---
## Buffer::SetByte(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) method


Interpreta l'array tipizzato specificato come un array grezzo di byte e imposta il valore byte specificato allo scostamento di byte specificato.

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
| value | uint8_t | Il valore byte da impostare |

## Vedi anche

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::ArrayView\<T\>\&, int, uint8_t) method


Interpreta l'array tipizzato specificato come un array grezzo di byte e imposta il valore byte specificato allo scostamento di byte specificato.

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
| value | uint8_t | Il valore byte da impostare |

## Vedi anche

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Buffer::SetByte(const System::Details::StackArray\<T, N\>\&, int, uint8_t) method


Interpreta l'array tipizzato specificato come un array grezzo di byte e imposta il valore byte specificato allo scostamento di byte specificato.

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
| value | uint8_t | Il valore byte da impostare |

## Vedi anche

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
