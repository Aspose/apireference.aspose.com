---
title: "System::IO::Stream::Write metodo"
linktitle: "Write"
second_title: "Aspose.Font per C++"
description: "System::IO::Stream::Write metodo. Scrive il sottointervallo specificato di byte dall'array di byte specificato al flusso in C++."
type: docs
weight: 2600
url: /it/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso.

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array contenente i byte da scrivere |
| offset | int32_t | Un indice a base zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere |
| count | int32_t | Il numero di elementi nel sottointervallo da scrivere |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso.

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | La vista dell'array contenente i byte da scrivere |
| offset | int32_t | Un indice a base zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere |
| count | int32_t | Il numero di elementi nel sottointervallo da scrivere |

## Vedi anche

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso.

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parametro | Descrizione |
| --- | --- |
| N | La dimensione dell'array di stack |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::StackArray\<uint8_t, N\>\& | L'array stack contenente i byte da scrivere |
| offset | int32_t | Un indice a base zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere |
| count | int32_t | Il numero di elementi nel sottointervallo da scrivere |

## Vedi anche

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
