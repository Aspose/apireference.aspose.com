---
title: "System::Net::Sockets::NetworkStream::Write methode"
linktitle: "Write"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::NetworkStream::Write methode. Schrijft het opgegeven subbereik van bytes van de opgegeven byte-array naar de stream in C++."
type: docs
weight: 2500
url: /nl/cpp/system.net.sockets/networkstream/write/
---
## NetworkStream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream.

```cpp
void System::Net::Sockets::NetworkStream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De array die de te schrijven bytes bevat. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven. |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream.

```cpp
void System::Net::Sockets::NetworkStream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Het array‑view dat de te schrijven bytes bevat |
| offset | int32_t | Een 0‑gebaseerde index van het element in **buffer** waarop het subbereik dat moet worden geschreven begint |
| size | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven |

## Zie ook

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
