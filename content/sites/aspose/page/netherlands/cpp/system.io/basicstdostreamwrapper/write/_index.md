---
title: "System::IO::BasicSTDOStreamWrapper::Write methode"
linktitle: "Write"
second_title: "Aspose.Page voor C++"
description: "System::IO::BasicSTDOStreamWrapper::Write methode. Als de wraapmodus binair is, schrijft het de opgegeven subreeks van bytes van de opgegeven byte‑array naar de stream; anders wordt de opgegeven subreeks van bytes van de opgegeven byte‑array geconverteerd naar het type char_type en vervolgens wordt het resultaat naar de stream geschreven in C++."
type: docs
weight: 700
url: /nl/cpp/system.io/basicstdostreamwrapper/write/
---
## BasicSTDOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Als de wraapmodus binair is, schrijft het de opgegeven subreeks van bytes van de opgegeven byte‑array naar de stream; anders wordt de opgegeven subreeks van bytes van de opgegeven byte‑array geconverteerd naar het type [char_type](../char_type/) en vervolgens wordt het resultaat naar de stream geschreven.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const ArrayPtr\<uint8_t\>\& | De array die de te schrijven bytes bevat |
| offset | int32_t | Een 0-gebaseerde index van het element in **buffer** waarop het subbereik om te schrijven begint |
| count | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Schrijft het opgegeven subbereik van bytes van de opgegeven byte‑array naar de stream.

```cpp
virtual void System::IO::BasicSTDOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| buffer | const System::Details::ArrayView\<uint8_t\>\& | Het array‑view dat de te schrijven bytes bevat |
| offset | int32_t | Een 0‑gebaseerde index van het element in **buffer** waarop het subbereik dat moet worden geschreven begint |
| count | int32_t | Het aantal elementen in het subbereik dat moet worden geschreven |

## Zie ook

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
