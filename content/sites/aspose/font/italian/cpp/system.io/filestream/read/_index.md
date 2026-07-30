---
title: "System::IO::FileStream::Read metodo"
linktitle: "Read"
second_title: "Aspose.Font per C++"
description: "System::IO::FileStream::Read metodo. Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato in C++."
type: docs
weight: 1300
url: /it/cpp/system.io/filestream/read/
---
## FileStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato.

```cpp
int32_t System::IO::FileStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array di byte in cui scrivere i byte letti. |
| offset | int32_t | Una posizione basata su zero in **buffer** da cui iniziare la scrittura. |
| count | int32_t | Il numero di byte da leggere. |

### ReturnValue

Il numero di byte letti.

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## FileStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato.

```cpp
int32_t System::IO::FileStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | La vista dell'array di byte dove scrivere i byte letti. |
| offset | int32_t | Una posizione basata su zero in **buffer** da cui iniziare la scrittura. |
| count | int32_t | Il numero di byte da leggere. |

### ReturnValue

Il numero di byte letti.

## Vedi anche

* Class [FileStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
