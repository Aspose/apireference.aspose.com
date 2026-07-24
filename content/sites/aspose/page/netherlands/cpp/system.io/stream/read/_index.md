---
title: "System::IO::Stream::Read-methode"
linktitle: "Lezen"
second_title: "Aspose.Page voor C++"
description: "System::IO::Stream::Read-methode. Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte-array in C++."
type: docs
weight: 1800
url: /nl/cpp/system.io/stream/read/
---
## Stream::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array.

```cpp
virtual int32_t System::IO::Stream::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count)=0
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
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array.

```cpp
virtual int32_t System::IO::Stream::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Het byte‑array‑view waarin de gelezen bytes moeten worden geschreven |
| offset | int32_t | Een 0‑gebaseerde positie in **buffer** om te beginnen met schrijven |
| count | int32_t | Het aantal bytes om te lezen |

### ReturnValue

Het aantal gelezen bytes

## Zie ook

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## Stream::Read(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) method


Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array.

```cpp
template<std::size_t> int32_t System::IO::Stream::Read(const System::Details::StackArray<uint8_t, N> &buffer, int32_t offset, int32_t count)
```


| Parameter | Beschrijving |
| --- | --- |
| N | De grootte van de stack-array |

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::StackArray\<uint8_t, N\>\& | De byte-stack-array om de gelezen bytes naar te schrijven |
| offset | int32_t | Een 0‑gebaseerde positie in **buffer** om te beginnen met schrijven |
| count | int32_t | Het aantal bytes om te lezen |

### ReturnValue

Het aantal gelezen bytes

## Zie ook

* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
