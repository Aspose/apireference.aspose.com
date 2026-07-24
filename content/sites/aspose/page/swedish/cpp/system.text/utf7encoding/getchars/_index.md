---
title: "System::Text::UTF7Encoding::GetChars metod"
linktitle: "GetChars"
second_title: "Aspose.Page för C++"
description: "System::Text::UTF7Encoding::GetChars metod. Hämtar tecknen som resultat av avkodning av en bytebuffert i C++."
type: docs
weight: 700
url: /sv/cpp/system.text/utf7encoding/getchars/
---
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>) method


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
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Hämta de tecken som erhålls genom att avkoda en bytebuffert.

```cpp
int System::Text::UTF7Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index) override
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
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


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
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetChars(const uint8_t *, int, char_t *, int) method


Hämta de tecken som erhålls genom att avkoda en bytebuffert.

```cpp
int System::Text::UTF7Encoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
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

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
