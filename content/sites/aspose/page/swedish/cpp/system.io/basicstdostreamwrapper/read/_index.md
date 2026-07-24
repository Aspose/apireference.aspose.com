---
title: "System::IO::BasicSTDOStreamWrapper::Read metod"
linktitle: "Läs"
second_title: "Aspose.Page för C++"
description: "System::IO::BasicSTDOStreamWrapper::Read‑metod. Om omslagsläget är binärt läser den angivna mängden byte från strömmen, annars läser den angivet antal tecken och konverterar dem till uint8_t‑typ. Skriver resultatet av läsningen till den angivna byte‑arrayen. Stöds inte! i C++."
type: docs
weight: 400
url: /sv/cpp/system.io/basicstdostreamwrapper/read/
---
## BasicSTDOStreamWrapper::Read(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Om omslagsläget är binärt läses det angivna antalet byte från strömmen, annars läses det angivna antalet tecken och konverteras till uint8_t‑typ. Skriver resultatet av läsningen till den angivna bytearrayen. Stöds inte!

```cpp
virtual int32_t System::IO::BasicSTDOStreamWrapper<T, typename>::Read(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<uint8_t\>\& | Bytearrayen att skriva de lästa bytena till. |
| offset | int32_t | En 0-baserad position i **buffer** att börja skriva vid |
| count | int32_t | Antalet byte att läsa |

### ReturnValue

Antal byte eller tecken som lästs

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDOStreamWrapper::Read(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Läser det angivna antalet byte från strömmen och skriver dem till den angivna bytearrayen.

```cpp
virtual int32_t System::IO::BasicSTDOStreamWrapper<T, typename>::Read(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const System::Details::ArrayView\<uint8_t\>\& | Bytearrayvyn att skriva de lästa byten till |
| offset | int32_t | En 0-baserad position i **buffer** att börja skriva vid |
| count | int32_t | Antalet byte att läsa |

### ReturnValue

Antalet lästa byte

## Se även

* Class [BasicSTDOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
