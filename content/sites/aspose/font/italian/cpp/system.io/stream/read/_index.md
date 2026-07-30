---
title: "System::IO::Stream::Read metodo"
linktitle: "Read"
second_title: "Aspose.Font per C++"
description: "System::IO::Stream::Read metodo. Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato in C++."
type: docs
weight: 1800
url: /it/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato.

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array di byte in cui scrivere i byte letti |
| offset | int32_t | Una posizione a base zero in **buffer** da cui iniziare a scrivere |
| count | int32_t | Il numero di byte da leggere |

### ReturnValue

Il numero di byte letti

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato.

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | La vista dell'array di byte a cui scrivere i byte letti |
| offset | int32_t | Una posizione a base zero in **buffer** da cui iniziare a scrivere |
| count | int32_t | Il numero di byte da leggere |

### ReturnValue

Il numero di byte letti

## Vedi anche

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato.

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parametro | Descrizione |
| --- | --- |
| N | La dimensione dell'array di stack |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::StackArray\<uint8_t, N\>\& | L'array stack di byte in cui scrivere i byte letti |
| offset | int32_t | Una posizione a base zero in **buffer** da cui iniziare a scrivere |
| count | int32_t | Il numero di byte da leggere |

### ReturnValue

Il numero di byte letti

## Vedi anche

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
