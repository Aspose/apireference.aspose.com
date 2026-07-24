---
title: "System::Net::Sockets::NetworkStream::Read method"
linktitle: "Lezen"
second_title: "Aspose.Page voor C++"
description: "System::Net::Sockets::NetworkStream::Read method. Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array in C++."
type: docs
weight: 1900
url: /nl/cpp/system.net.sockets/networkstream/read/
---
## NetworkStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De byte-array waarin de gelezen bytes worden geschreven. |
| offset | int32_t | De offset in bytes in de opgegeven array. |
| size | int32_t | Het aantal bytes om te lezen. |

### ReturnValue

Het aantal gelezen bytes.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## NetworkStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array.

```cpp
int32_t System::Net::Sockets::NetworkStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t size) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Het byte‑array‑view waarin de gelezen bytes moeten worden geschreven |
| offset | int32_t | Een 0‑gebaseerde positie in **buffer** om te beginnen met schrijven |
| size | int32_t | Het aantal bytes om te lezen |

### ReturnValue

Het aantal gelezen bytes

## Zie ook

* Class [NetworkStream](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
