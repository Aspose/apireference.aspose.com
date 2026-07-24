---
title: "System::IO::Stream::Write-methode"
linktitle: "Write"
second_title: "Aspose.Page voor C++"
description: "System::IO::Stream::Write-methode. Schrijft het opgegeven subbereik van bytes van de opgegeven byte-array naar de stream in C++."
type: docs
weight: 2600
url: /nl/cpp/system.io/stream/write/
---
## Stream::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream.

```cpp
virtual void System::IO::Stream::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De array die de te schrijven bytes bevat |
| offset | int32_t | Een 0‑gebaseerde index van het element in **buffer** waarop het subbereik dat moet worden geschreven begint |
| count | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream.

```cpp
virtual void System::IO::Stream::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Het array‑view dat de te schrijven bytes bevat |
| offset | int32_t | Een 0‑gebaseerde index van het element in **buffer** waarop het subbereik dat moet worden geschreven begint |
| count | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven |

## Zie ook

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Write(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream.

```cpp
template<std::size_t> void System::IO::Stream::Write(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| N | De grootte van de stack-array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::StackArray\<uint8_t, N\>\& | De stack-array die de te schrijven bytes bevat |
| offset | int32_t | Een 0‑gebaseerde index van het element in **buffer** waarop het subbereik dat moet worden geschreven begint |
| count | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven |

## Zie ook

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
