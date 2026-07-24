---
title: "System::IO::StringReader::Read metod"
linktitle: "Läs"
second_title: "Aspose.Page för C++"
description: "System::IO::StringReader::Read metod. Läser ett enda tecken från strömmen i C++."
type: docs
weight: 500
url: /sv/cpp/system.io/stringreader/read/
---
## StringReader::Read() method


Läser ett enda tecken från strömmen.

```cpp
virtual int System::IO::StringReader::Read() override
```


### ReturnValue

Ett läst tecken eller -1 om inget tecken har lästs

## Se även

* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StringReader::Read(ArrayPtr\<char_t\>, int, int) method


Läser det angivna antalet tecken från strömmen till den angivna teckenarrayen med start vid den angivna positionen.

```cpp
virtual int System::IO::StringReader::Read(ArrayPtr<char_t> buffer, int index, int count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | ArrayPtr\<char_t\> | Teckenarrayen att skriva tecknen som lästs från strömmen till |
| index | int | Ett 0‑baserat index i **buffer** där skrivning ska påbörjas |
| count | int | Antalet tecken att läsa från strömmen |

### ReturnValue

Antalet tecken som lästs från strömmen

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
