---
title: "System::IO::BasicSTDIOStreamWrapper::Read metodo"
linktitle: "Read"
second_title: "Aspose.Font per C++"
description: "System::IO::BasicSTDIOStreamWrapper::Read metodo. Se la modalità di wrapping è binaria, legge il numero specificato di byte dallo stream; altrimenti legge il numero specificato di caratteri e li converte al tipo uint8_t. Scrive il risultato della lettura nell'array di byte specificato in C++."
type: docs
weight: 400
url: /it/cpp/system.io/basicstdiostreamwrapper/read/
---
## BasicSTDIOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Se la modalità di wrapping è binaria, legge il numero specificato di byte dallo stream, altrimenti legge il numero specificato di caratteri e li converte al tipo uint8_t. Scrive il risultato della lettura nell'array di byte specificato.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array di byte in cui scrivere i byte letti |
| offset | int32_t | Una posizione a base zero in **buffer** da cui iniziare a scrivere |
| count | int32_t | Il numero di byte da leggere |

### ReturnValue

Numero di byte o caratteri letti

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Legge il numero specificato di byte dal flusso e li scrive nell'array di byte specificato.

```cpp
virtual int32_t System::IO::BasicSTDIOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | La vista dell'array di byte a cui scrivere i byte letti |
| offset | int32_t | Una posizione a base zero in **buffer** da cui iniziare a scrivere |
| count | int32_t | Il numero di byte da leggere |

### ReturnValue

Il numero di byte letti

## Vedi anche

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
