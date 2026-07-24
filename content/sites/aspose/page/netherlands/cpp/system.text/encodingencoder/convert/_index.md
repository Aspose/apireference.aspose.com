---
title: "System::Text::EncodingEncoder::Convert methode"
linktitle: "Converteren"
second_title: "Aspose.Page voor C++"
description: "System::Text::EncodingEncoder::Convert methode. Converteert tekens naar bytes in C++."
type: docs
weight: 100
url: /nl/cpp/system.text/encodingencoder/convert/
---
## EncodingEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


Converteert tekens naar bytes.

```cpp
virtual void System::Text::EncodingEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | ArrayPtr\<char_t\> | Tekens om te coderen. |
| charIndex | int | Offset van de invoerbuffer. |
| charCount | int | Grootte van invoerbuffer. |
| bytes | ArrayPtr\<uint8_t\> | Doel-bytebuffer. |
| byteIndex | int | Offset van doelarray. |
| byteCount | int | Grootte van doelarray. |
| flush | bool | Indien true, wordt de interne encoderstatus na de berekening opgeschoond. |
| charsUsed | int\& | Referentie naar variabele om het aantal gelezen tekens op te slaan. |
| bytesUsed | int\& | Referentie naar variabele om het aantal geschreven bytes op te slaan. |
| voltooid | bool\& | Referentie naar variabele die op true moet worden gezet als de invoerbuffer is uitgeput en anders op false. |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncodingEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


Converteert tekens naar bytes.

```cpp
virtual void System::Text::EncodingEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| tekens | const char_t * | Tekens om te coderen. |
| charCount | int | Grootte van invoerbuffer. |
| bytes | uint8_t * | Doel-bytebuffer. |
| byteCount | int | Grootte van doelarray. |
| flush | bool | Indien true, wordt de interne encoderstatus na de berekening opgeschoond. |
| charsUsed | int\& | Referentie naar variabele om het aantal gelezen tekens op te slaan. |
| bytesUsed | int\& | Referentie naar variabele om het aantal geschreven bytes op te slaan. |
| voltooid | bool\& | Referentie naar variabele die op true moet worden gezet als de invoerbuffer is uitgeput en anders op false. |

## Zie ook

* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
