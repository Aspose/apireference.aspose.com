---
title: "System::Text::Encoder::GetBytes‑metod"
linktitle: "GetBytes"
second_title: "Aspose.Page för C++"
description: "System::Text::Encoder::GetBytes‑metod. Hämtar de byte som resultat av att koda en buffer i C++."
type: docs
weight: 500
url: /sv/cpp/system.text/encoder/getbytes/
---
## Encoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


Hämta de byte som resultat av att koda en buffert.

```cpp
virtual int System::Text::Encoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Tecken att koda. |
| charIndex | int | Källarray‑offset. |
| charCount | int | Källsubarray‑längd. |
| bytes | ArrayPtr\<uint8_t\> | Destinationsbyte‑buffert. |
| byteIndex | int | Destinationsbuffer‑offset. |
| flush | bool | Om true, rensar det interna kodarens tillstånd efter beräkning. |

### ReturnValue

Antal byte skrivna.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


Hämta de byte som resultat av att koda en buffert.

```cpp
virtual int System::Text::Encoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| chars | const char_t * | Tecken att koda. |
| charCount | int | Källarray‑längd. |
| bytes | uint8_t * | Destinationsbyte‑buffert. |
| byteCount | int | Destinationsbuffer‑storlek. |
| flush | bool | Om true, rensar det interna kodarens tillstånd efter beräkning. |

### ReturnValue

Antal byte skrivna.

## Se även

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
