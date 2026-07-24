---
title: "System::Text::Decoder::Convert metod"
linktitle: "Konvertera"
second_title: "Aspose.Page för C++"
description: "System::Text::Decoder::Convert metod. Konverterar byte till tecken i C++."
type: docs
weight: 100
url: /sv/cpp/system.text/decoder/convert/
---
## Decoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Konverterar byte till tecken.

```cpp
virtual void System::Text::Decoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Byte att avkoda. |
| byteIndex | int | Inmatningsbuffertens offset. |
| byteCount | int | Storlek på inmatningsbuffert. |
| chars | ArrayPtr\<char_t\> | Destinationsteckenbuffert. |
| charIndex | int | Offset för destinationsarray. |
| charCount | int | Storlek på destinationsarrayen. |
| flush | bool | Om sant, rensar det interna avkodartillståndet efter beräkning. |
| bytesUsed | int\& | Referens till variabel för att lagra antalet lästa byte. |
| charsUsed | int\& | Referens till variabel för att lagra antalet skrivna tecken. |
| completed | bool\& | Referens till variabel som ska sättas till true om inmatningsbufferten är uttömd och till false annars. |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Konverterar byte till tecken.

```cpp
virtual void System::Text::Decoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | const uint8_t * | Byte att avkoda. |
| byteCount | int | Storlek på inmatningsbuffert. |
| chars | char_t * | Destinationsteckenbuffert. |
| charCount | int | Storlek på destinationsarrayen. |
| flush | bool | Om sant, rensar det interna avkodartillståndet efter beräkning. |
| bytesUsed | int\& | Referens till variabel för att lagra antalet lästa byte. |
| charsUsed | int\& | Referens till variabel för att lagra antalet skrivna tecken. |
| completed | bool\& | Referens till variabel som ska sättas till true om inmatningsbufferten är uttömd och till false annars. |

## Se även

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
