---
title: "System::Text::Encoder::Convert metod"
linktitle: "Konvertera"
second_title: "Aspose.Page för C++"
description: "System::Text::Encoder::Convert metod. Konverterar tecken till byte i C++."
type: docs
weight: 100
url: /sv/cpp/system.text/encoder/convert/
---
## Encoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


Konverterar tecken till byte.

```cpp
virtual void System::Text::Encoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Tecken att koda. |
| charIndex | int | Inmatningsbuffertens offset. |
| charCount | int | Storlek på inmatningsbuffert. |
| bytes | ArrayPtr\<uint8_t\> | Destinationsbyte‑buffert. |
| byteIndex | int | Offset för destinationsarray. |
| byteCount | int | Storlek på destinationsarrayen. |
| flush | bool | Om true, rensar det interna kodarens tillstånd efter beräkning. |
| charsUsed | int\& | Referens till variabel för att lagra antalet tecken som lästs. |
| bytesUsed | int\& | Referens till variabel för att lagra antalet bytes som skrivits. |
| completed | bool\& | Referens till variabel som ska sättas till true om inmatningsbufferten är uttömd och till false annars. |

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


Konverterar tecken till byte.

```cpp
virtual void System::Text::Encoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| chars | const char_t * | Tecken att koda. |
| charCount | int | Storlek på inmatningsbuffert. |
| bytes | uint8_t * | Destinationsbyte‑buffert. |
| byteCount | int | Storlek på destinationsarrayen. |
| flush | bool | Om true, rensar det interna kodarens tillstånd efter beräkning. |
| charsUsed | int\& | Referens till variabel för att lagra antalet tecken som lästs. |
| bytesUsed | int\& | Referens till variabel för att lagra antalet bytes som skrivits. |
| completed | bool\& | Referens till variabel som ska sättas till true om inmatningsbufferten är uttömd och till false annars. |

## Se även

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
