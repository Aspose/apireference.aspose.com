---
title: "System::IO::BasicSTDIOStreamWrapper::Write metod"
linktitle: "Write"
second_title: "Aspose.Page för C++"
description: "System::IO::BasicSTDIOStreamWrapper::Write metod. Om omslagsläget är binärt skrivs det angivna delintervallet av bytes från den angivna bytearrayen till strömmen, annars konverteras det angivna delintervallet av bytes från den angivna bytearrayen till char_type-typ och sedan skrivs resultatet till strömmen i C++."
type: docs
weight: 700
url: /sv/cpp/system.io/basicstdiostreamwrapper/write/
---
## BasicSTDIOStreamWrapper::Write(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


Om omslutningsläget är binärt skriver den till strömmen det angivna delintervallet av bytes från den angivna bytearrayen, annars konverteras det angivna delintervallet av bytes från den angivna bytearrayen till [char_type](../char_type/) typ och sedan skrivs resultatet till strömmen.

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const ArrayPtr<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const ArrayPtr\<uint8_t\>\& | Arrayen som innehåller byte som ska skrivas. |
| offset | int32_t | Ett 0-baserat index för elementet i **buffer** där delintervallet att skriva börjar |
| count | int32_t | Antalet element i delintervallet som ska skrivas |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BasicSTDIOStreamWrapper::Write(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) method


Skriver det angivna delintervallet av byte från den angivna bytearrayen till strömmen.

```cpp
virtual void System::IO::BasicSTDIOStreamWrapper<T, typename>::Write(const System::Details::ArrayView<uint8_t> &buffer, int32_t offset, int32_t count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | const System::Details::ArrayView\<uint8_t\>\& | Arrayvyn som innehåller byte som ska skrivas |
| offset | int32_t | Ett 0-baserat index för elementet i **buffer** där delintervallet som ska skrivas börjar |
| count | int32_t | Antalet element i delintervallet som ska skrivas |

## Se även

* Class [BasicSTDIOStreamWrapper](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
