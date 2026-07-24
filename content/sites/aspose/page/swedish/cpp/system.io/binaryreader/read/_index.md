---
title: "System::IO::BinaryReader::Read metod"
linktitle: "Läs"
second_title: "Aspose.Page för C++"
description: "System::IO::BinaryReader::Read metod. Läser ett enda tecken från inmatningsströmmen i C++."
type: docs
weight: 700
url: /sv/cpp/system.io/binaryreader/read/
---
## BinaryReader::Read() method


Läser ett enda tecken från inmatningsströmmen.

```cpp
virtual int System::IO::BinaryReader::Read()
```


### ReturnValue

Läs tecken kodade med UTF-16‑kodning; om det lästa tecknet representeras av två kodpunkter i UTF-16‑kodning returneras endast den högre surragate.

## Se även

* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<char_t\>, int, int) method


Läser det angivna antalet tecken från inmatningsströmmen, konverterar dem till UTF-16-kodning och skriver de resulterande UTF-16-tecknen till den angivna teckenarrayen med start vid den angivna positionen.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<char_t> buffer, int index, int count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | ArrayPtr\<char_t\> | Den UTF-16‑teckenarrayen att skriva de tecken som lästs från inmatningsströmmen till |
| index | int | Ett 0‑baserat index i **buffer** där skrivning ska påbörjas |
| count | int | Antalet tecken att läsa från strömmen |

### ReturnValue

Antalet tecken som lästs från inmatningsströmmen

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## BinaryReader::Read(ArrayPtr\<uint8_t\>, int, int) method


Läser det angivna antalet byte från inmatningsströmmen och skriver dem till den angivna bytearrayen.

```cpp
virtual int System::IO::BinaryReader::Read(ArrayPtr<uint8_t> buffer, int index, int count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| buffert | ArrayPtr\<uint8_t\> | Bytearrayen att skriva de lästa bytena till. |
| index | int | En 0-baserad position i **buffer** att börja skriva vid |
| count | int | Antalet byte att läsa |

### ReturnValue

Antalet lästa byte

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [BinaryReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
