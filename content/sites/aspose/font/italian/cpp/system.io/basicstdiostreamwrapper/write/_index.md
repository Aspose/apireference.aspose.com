---
title: "System::IO::BasicSTDIOStreamWrapper::Write metodo"
linktitle: "Write"
second_title: "Aspose.Font per C++"
description: "System::IO::BasicSTDIOStreamWrapper::Write metodo. Se la modalità di wrapping è binaria, scrive sullo stream il sottointervallo specificato di byte dall'array di byte specificato; altrimenti converte il sottointervallo specificato di byte dall'array di byte specificato al tipo char_type e poi scrive il risultato sullo stream in C++."
type: docs
weight: 700
url: /it/cpp/system.io/basicstdiostreamwrapper/write/
---
## BasicSTDIOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Se la modalità di wrapping è binaria, scrive nello stream il sottointervallo specificato di byte dall'array di byte specificato, altrimenti converte il sottointervallo specificato di byte dall'array di byte specificato al tipo [char_type](../char_type/) e poi scrive il risultato nello stream.

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array contenente i byte da scrivere |
| offset | int32_t | Un indice basato su zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere |
| count | int32_t | Il numero di elementi nel sottointervallo da scrivere |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso.

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | La vista dell'array contenente i byte da scrivere |
| offset | int32_t | Un indice a base zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere |
| count | int32_t | Il numero di elementi nel sottointervallo da scrivere |

## Vedi anche

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
