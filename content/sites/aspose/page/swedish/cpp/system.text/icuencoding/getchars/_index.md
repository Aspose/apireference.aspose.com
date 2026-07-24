---
title: "System::Text::ICUEncoding::GetChars metod"
linktitle: "GetChars"
second_title: "Aspose.Page för C++"
description: "System::Text::ICUEncoding::GetChars metod. Hämta tecknen som resultat av avkodning av en bytebuffer i C++."
type: docs
weight: 500
url: /sv/cpp/system.text/icuencoding/getchars/
---
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>) method


Hämta de tecken som erhålls genom att avkoda en bytebuffert.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) att läsa byte från. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Hämta de tecken som erhålls genom att avkoda en bytebuffert.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) att läsa byte från. |
| byte_index | int | Inmatningsbuffertens offset. |
| byte_count | int | Storlek på inmatningsbuffert. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) för att placera tecken i. |
| char_index | int | Utmatningsbuffertens offset. |

### ReturnValue

Antal skrivna tecken.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


Hämta de tecken som erhålls genom att avkoda en bytebuffert.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) att läsa byte från. |
| index | int | Inmatningsbuffertens offset. |
| count | int | Storlek på inmatningsbuffert. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Se även

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(const uint8_t *, int, char_t *, int) method


Hämta de tecken som erhålls genom att avkoda en bytebuffert.

```cpp
int System::Text::ICUEncoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) att läsa byte från. |
| byte_count | int | Storlek på inmatningsbuffert. |
| chars | char_t * | [Buffer](../../../system/buffer/) för att placera tecken i. |
| char_count | int | Storlek på utdatabuffert. |

### ReturnValue

Antal skrivna tecken.

## Se även

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
