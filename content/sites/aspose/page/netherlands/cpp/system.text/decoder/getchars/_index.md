---
title: "System::Text::Decoder::GetChars methode"
linktitle: "GetChars"
second_title: "Aspose.Page voor C++"
description: "System::Text::Decoder::GetChars methode. Haalt de tekens op die ontstaan bij het decoderen van een buffer in C++."
type: docs
weight: 500
url: /nl/cpp/system.text/decoder/getchars/
---
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Haal de tekens op die voortkomen uit het decoderen van een buffer.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes om te decoderen. |
| byteIndex | int | Offset van de invoerbuffer. |
| byteCount | int | Grootte van invoerbuffer. |
| tekens | ArrayPtr\<char_t\> | Doeltekenbuffer. |
| charIndex | int | Offset van doelarray. |

### ReturnValue

Aantal geschreven tekens.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Haal de tekens op die voortkomen uit het decoderen van een buffer.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes om te decoderen. |
| byteIndex | int | Offset van de invoerbuffer. |
| byteCount | int | Grootte van invoerbuffer. |
| tekens | ArrayPtr\<char_t\> | Doeltekenbuffer. |
| charIndex | int | Offset van doelarray. |
| flush | bool | Indien waar, wordt de interne decoderstatus na de berekening opgeschoond. |

### ReturnValue

Aantal geschreven tekens.

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Haal de tekens op die voortkomen uit het decoderen van een buffer.

```cpp
virtual int System::Text::Decoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytes | const uint8_t * | Bytes om te decoderen. |
| byteCount | int | Grootte van invoerbuffer. |
| tekens | char_t * | Doeltekenbuffer. |
| charCount | int | Grootte van doelarray. |
| flush | bool | Indien waar, wordt de interne decoderstatus na de berekening opgeschoond. |

### ReturnValue

Aantal geschreven tekens.

## Zie ook

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
