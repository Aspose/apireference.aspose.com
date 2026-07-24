---
title: "System::IO::BasicSTDIStreamWrapper::Write methode"
linktitle: "Write"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSTDIStreamWrapper::Write methode. Als de omslagmodus binair is, schrijft het naar de stream het opgegeven subbereik van bytes uit de opgegeven byte-array, anders converteert het het opgegeven subbereik van bytes uit de opgegeven byte-array naar het type char_type en schrijft vervolgens het resultaat naar de stream. Niet ondersteund! in C++."
type: docs
weight: 700
url: /nl/cpp/system.io/basicstdistreamwrapper/write/
---
## BasicSTDIStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Als de omslagmodus binair is, schrijft het naar de stream het opgegeven subbereik van bytes uit de opgegeven byte-array, anders converteert het het opgegeven subbereik van bytes uit de opgegeven byte-array naar het type [char_type](../char_type/) en schrijft vervolgens het resultaat naar de stream. Niet ondersteund!

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De array die de te schrijven bytes bevat. |
| offset | int32_t | Een 0‑gebaseerde index van het element in **buffer** waarop de subreeks om te schrijven begint. |
| count | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven. |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream.

```cpp
virtual void System::IO::BasicSTDIStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Het array‑view dat de te schrijven bytes bevat |
| offset | int32_t | Een 0‑gebaseerde index van het element in **buffer** waarop het subbereik dat moet worden geschreven begint |
| count | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven |

## Zie ook

* Class [BasicSTDIStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
