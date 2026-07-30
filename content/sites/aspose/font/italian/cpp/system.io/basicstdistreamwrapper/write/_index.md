---
title: "System::IO::BasicSTDIStreamWrapper::Write metodo"
linktitle: "Write"
second_title: "Aspose.Font per C++"
description: "System::IO::BasicSTDIStreamWrapper::Write metodo. Se la modalità di wrapping è binaria, scrive nello stream il sottointervallo specificato di byte dall'array di byte specificato; altrimenti converte il sottointervallo specificato di byte dall'array di byte specificato al tipo char_type e poi scrive il risultato nello stream. Non supportato! in C++."
type: docs
weight: 700
url: /it/cpp/system.io/basicstdistreamwrapper/write/
---
## BasicSTDIStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Se la modalità di wrapping è binaria, scrive nello stream il sottointervallo specificato di byte dall'array di byte specificato; altrimenti converte il sottointervallo specificato di byte dall'array di byte specificato al tipo [char_type](../char_type/) e poi scrive il risultato nello stream. Non supportato!

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array contenente i byte da scrivere. |
| offset | int32_t | Un indice basato su zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere. |
| count | int32_t | Il numero di elementi nel sottointervallo da scrivere. |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## BasicSTDIStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso.

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | La vista dell'array contenente i byte da scrivere |
| offset | int32_t | Un indice a base zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere |
| count | int32_t | Il numero di elementi nel sottointervallo da scrivere |

## Vedi anche

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
