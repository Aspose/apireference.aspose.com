---
title: "System::IO::BufferedStream::Read methode"
linktitle: "Lezen"
second_title: "Aspose.Page voor C++"
description: "System::IO::BufferedStream::Read methode. Leest het opgegeven aantal bytes van de onderliggende stream en schrijft ze naar de opgegeven byte-array in C++."
type: docs
weight: 900
url: /nl/cpp/system.io/bufferedstream/read/
---
## BufferedStream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Leest het opgegeven aantal bytes van de onderliggende stream en schrijft ze naar de opgegeven byte‑array.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De byte-array om de gelezen bytes naartoe te schrijven |
| offset | int32_t | Een 0‑gebaseerde positie in **buffer** om te beginnen met schrijven |
| count | int32_t | Het aantal bytes om te lezen |

### ReturnValue

Het aantal gelezen bytes

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BufferedStream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Leest het opgegeven aantal bytes van de onderliggende stream en schrijft ze naar de opgegeven byte‑array.

```cpp
virtual int32_t System::IO::BufferedStream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | De byte-array om de gelezen bytes naartoe te schrijven |
| offset | int32_t | Een 0‑gebaseerde positie in **buffer** om te beginnen met schrijven |
| count | int32_t | Het aantal bytes om te lezen |

### ReturnValue

Het aantal gelezen bytes

## Zie ook

* Class [BufferedStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
