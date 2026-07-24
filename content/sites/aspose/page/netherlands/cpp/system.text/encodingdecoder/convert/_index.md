---
title: "System::Text::EncodingDecoder::Convert methode"
linktitle: "Converteren"
second_title: "Aspose.Page voor C++"
description: "System::Text::EncodingDecoder::Convert methode. Converteert bytes naar tekens in C++."
type: docs
weight: 100
url: /nl/cpp/system.text/encodingdecoder/convert/
---
## EncodingDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Converteert bytes naar tekens.

```cpp
void System::Text::EncodingDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | Bytes om te decoderen. |
| byteIndex | int | Offset van de invoerbuffer. |
| byteCount | int | Grootte van invoerbuffer. |
| tekens | ArrayPtr\<char_t\> | Doeltekenbuffer. |
| charIndex | int | Offset van doelarray. |
| charCount | int | Grootte van doelarray. |
| flush | bool | Indien waar, wordt de interne decoderstatus na de berekening opgeschoond. |
| bytesUsed | int\& | Referentie naar variabele om het aantal gelezen bytes op te slaan. |
| charsUsed | int\& | Referentie naar variabele om het aantal geschreven tekens op te slaan. |
| voltooid | bool\& | Referentie naar variabele die op true moet worden gezet als de invoerbuffer is uitgeput en anders op false. |

## Zie ook

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncodingDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Converteert bytes naar tekens.

```cpp
void System::Text::EncodingDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed) override
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| bytes | const uint8_t * | Bytes om te decoderen. |
| byteCount | int | Grootte van invoerbuffer. |
| tekens | char_t * | Doeltekenbuffer. |
| charCount | int | Grootte van doelarray. |
| flush | bool | Indien waar, wordt de interne decoderstatus na de berekening opgeschoond. |
| bytesUsed | int\& | Referentie naar variabele om het aantal gelezen bytes op te slaan. |
| charsUsed | int\& | Referentie naar variabele om het aantal geschreven tekens op te slaan. |
| voltooid | bool\& | Referentie naar variabele die op true moet worden gezet als de invoerbuffer is uitgeput en anders op false. |

## Zie ook

* Class [EncodingDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
