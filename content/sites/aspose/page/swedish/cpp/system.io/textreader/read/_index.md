---
title: "System::IO::TextReader::Read‑metod"
linktitle: "Läs"
second_title: "Aspose.Page för C++"
description: "System::IO::TextReader::Read‑metod. Läser ett enda tecken från strömmen i C++."
type: docs
weight: 400
url: /sv/cpp/system.io/textreader/read/
---
## TextReader::Read() method


Läser ett enda tecken från strömmen.

```cpp
virtual int System::IO::TextReader::Read()
```


### ReturnValue

Läs tecken kodade med UTF-16‑kodning; om det lästa tecknet representeras av två kodpunkter i UTF-16‑kodning returneras endast den högre surragate.

## Se även

* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextReader::Read(ArrayPtr\<char_t\>, int, int) method


Läser det angivna antalet tecken från strömmen och skriver dem till den angivna teckenarrayen med start på den angivna positionen.

```cpp
virtual int System::IO::TextReader::Read(ArrayPtr<char_t> buffer, int index, int count)
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
* Class [TextReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
