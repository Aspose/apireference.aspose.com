---
title: "System::Text::UTF7Encoding::GetChars methode"
linktitle: "GetChars"
second_title: "Aspose.Page voor C++"
description: "System::Text::UTF7Encoding::GetChars methode. Haal de tekens op die ontstaan bij het decoderen van een bytebuffer in C++."
type: docs
weight: 700
url: /nl/cpp/system.text/utf7encoding/getchars/
---
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>) method


Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) om bytes van te lezen. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer.

```cpp
int System::Text::UTF7Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) om bytes van te lezen. |
| byte_index | int | Offset van de invoerbuffer. |
| byte_count | int | Grootte van invoerbuffer. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) om tekens in te plaatsen. |
| char_index | int | Offset van de uitvoerbuffer. |

### ReturnValue

Aantal geschreven tekens.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) om bytes van te lezen. |
| index | int | Offset van de invoerbuffer. |
| count | int | Grootte van invoerbuffer. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## UTF7Encoding::GetChars(const uint8_t *, int, char_t *, int) method


Haal de tekens op die het resultaat zijn van het decoderen van een bytebuffer.

```cpp
int System::Text::UTF7Encoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) om bytes van te lezen. |
| byte_count | int | Grootte van invoerbuffer. |
| chars | char_t * | [Buffer](../../../system/buffer/) om tekens in te plaatsen. |
| char_count | int | Grootte van uitvoerbuffer. |

### ReturnValue

Aantal geschreven tekens.

## Zie ook

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
