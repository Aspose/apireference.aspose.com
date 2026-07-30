---
title: "Metodo System::IO::MemoryStream::Read"
linktitle: "Read"
second_title: "Aspose.Font per C++"
description: "Metodo System::IO::MemoryStream::Read. Legge il numero specificato di byte dallo stream e li scrive nell'array di byte specificato in C++."
type: docs
weight: 1100
url: /it/cpp/system.io/memorystream/read/
---
## MemoryStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato.

```cpp
int32_t System::IO::MemoryStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
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
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato.

```cpp
int32_t System::IO::MemoryStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | La vista dell'array di byte a cui scrivere i byte letti |
| offset | int32_t | Una posizione a base zero in **buffer** da cui iniziare a scrivere |
| count | int32_t | Il numero di byte da leggere |

### ReturnValue

Il numero di byte letti

## Vedi anche

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
