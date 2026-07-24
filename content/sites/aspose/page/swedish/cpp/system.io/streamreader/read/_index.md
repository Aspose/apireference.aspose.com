---
title: "System::IO::StreamReader::Read metod"
linktitle: "Läs"
second_title: "Aspose.Page för C++"
description: "System::IO::StreamReader::Read metod. Läser ett enda tecken från strömmen i C++."
type: docs
weight: 900
url: /sv/cpp/system.io/streamreader/read/
---
## StreamReader::Read() method


Läser ett enda tecken från strömmen.

```cpp
virtual int System::IO::StreamReader::Read() override
```


### ReturnValue

Läs tecken kodade med UTF-16‑kodning; om det lästa tecknet representeras av två kodpunkter i UTF-16‑kodning returneras endast den högre surragate.

## Se även

* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamReader::Read(ArrayPtr\<char_t\>, int, int) method


Läser det angivna antalet tecken från strömmen, konverterar dem till UTF-16‑kodning och skriver de resulterande UTF-16‑tecknen till den angivna teckenarrayen med start vid den angivna positionen.

```cpp
virtual int System::IO::StreamReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | ArrayPtr\<char_t\> | Den UTF-16-teckenarrayen att skriva de lästa tecknen till från strömmen |
| index | int | Ett 0‑baserat index i **buffer** där skrivning ska påbörjas |
| count | int | Antalet tecken att läsa från strömmen |

### ReturnValue

Antalet tecken som lästs från strömmen

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
