---
title: "System::Text::ICUDecoder::GetChars metod"
linktitle: "GetChars"
second_title: "Aspose.Page för C++"
description: "System::Text::ICUDecoder::GetChars metod. Hämta tecknen som resultat av att avkoda en buffert i C++."
type: docs
weight: 500
url: /sv/cpp/system.text/icudecoder/getchars/
---
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Hämta tecknen som resultat av att avkoda en buffert.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Byte att avkoda. |
| byteIndex | int | Inmatningsbuffertens offset. |
| byteCount | int | Storlek på inmatningsbuffert. |
| chars | ArrayPtr\<char_t\> | Destinationsteckenbuffert. |
| charIndex | int | Offset för destinationsarray. |

### ReturnValue

Antal skrivna tecken.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Hämta tecknen som resultat av att avkoda en buffert.

```cpp
virtual int System::Text::ICUDecoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Byte att avkoda. |
| byteIndex | int | Inmatningsbuffertens offset. |
| byteCount | int | Storlek på inmatningsbuffert. |
| chars | ArrayPtr\<char_t\> | Destinationsteckenbuffert. |
| charIndex | int | Offset för destinationsarray. |
| flush | bool | Om sant, rensar det interna avkodartillståndet efter beräkning. |

### ReturnValue

Antal skrivna tecken.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Hämta tecknen som resultat av att avkoda en buffert.

```cpp
virtual int System::Text::ICUDecoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | const uint8_t * | Byte att avkoda. |
| byteCount | int | Storlek på inmatningsbuffert. |
| chars | char_t * | Destinationsteckenbuffert. |
| charCount | int | Storlek på destinationsarrayen. |
| flush | bool | Om sant, rensar det interna avkodartillståndet efter beräkning. |

### ReturnValue

Antal skrivna tecken.

## Se även

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
