---
title: "System::IO::BasicSTDIStreamWrapper::Read methode"
linktitle: "Lezen"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSTDIStreamWrapper::Read methode. Als de omslagmodus binair is, leest het het opgegeven aantal bytes uit de stream, anders leest het het opgegeven aantal tekens en converteert deze naar het type uint8_t. Schrijft het resultaat van het lezen naar de opgegeven byte-array in C++."
type: docs
weight: 400
url: /nl/cpp/system.io/basicstdistreamwrapper/read/
---
## BasicSTDIStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Als de wraapmodus binair is, leest het het opgegeven aantal bytes van de stream, anders leest het het opgegeven aantal tekens en converteert deze naar het type uint8_t. Schrijft het resultaat van het lezen naar de opgegeven byte‑array.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De byte-array om de gelezen bytes naartoe te schrijven |
| offset | int32_t | Een 0‑gebaseerde positie in **buffer** om te beginnen met schrijven |
| count | int32_t | Het aantal bytes om te lezen |

### ReturnValue

Aantal gelezen bytes of tekens

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Leest het opgegeven aantal bytes van de stream en schrijft ze naar de opgegeven byte‑array.

```cpp
virtual int32_t System::IO::BasicSTDIStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Het byte‑array‑view waarin de gelezen bytes moeten worden geschreven |
| offset | int32_t | Een 0‑gebaseerde positie in **buffer** om te beginnen met schrijven |
| count | int32_t | Het aantal bytes om te lezen |

### ReturnValue

Het aantal gelezen bytes

## Zie ook

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
