---
title: "Metodo System::Net::Sockets::NetworkStream::Write"
linktitle: "Write"
second_title: "Aspose.Font per C++"
description: "Metodo System::Net::Sockets::NetworkStream::Write. Scrive il sottointervallo specificato di byte dall'array di byte specificato allo stream in C++."
type: docs
weight: 2500
url: /it/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso.

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | L'array contenente i byte da scrivere. |
| offset | int32_t | L'offset in byte nell'array specificato. |
| size | int32_t | Il numero di elementi nel sottointervallo da scrivere. |

## Vedi anche

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Scrive l'intervallo specificato di byte dall'array di byte specificato nel flusso.

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | La vista dell'array contenente i byte da scrivere |
| offset | int32_t | Un indice a base zero dell'elemento in **buffer** al quale inizia il sottointervallo da scrivere |
| size | int32_t | Il numero di elementi nel sottointervallo da scrivere |

## Vedi anche

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Font for C++](../../../)
