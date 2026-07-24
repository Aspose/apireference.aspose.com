---
title: "System::Text::EncodingDecoder::Convert Methode"
linktitle: "Konvertieren"
second_title: "Aspose.Page für C++"
description: "System::Text::EncodingDecoder::Convert Methode. Konvertiert Bytes zu Zeichen in C++."
type: docs
weight: 100
url: /de/cpp/system.text/encodingdecoder/convert/
---
## EncodingDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Konvertiert Bytes in Zeichen.

```cpp
void System::Text::EncodingDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bytes | ArrayPtr\<uint8_t\> | Bytes zum Dekodieren. |
| byteIndex | int | Versatz des Eingabepuffers. |
| byteCount | int | Größe des Eingabepuffers. |
| chars | ArrayPtr\<char_t\> | Zielzeichenpuffer. |
| charIndex | int | Versatz des Ziel-Arrays. |
| charCount | int | Größe des Zielarrays. |
| flush | bool | Wenn wahr, wird der interne Decoder-Zustand nach der Berechnung bereinigt. |
| bytesUsed | int\& | Referenz auf die Variable, die die Anzahl gelesener Bytes speichert. |
| charsUsed | int\& | Referenz auf die Variable, die die Anzahl geschriebener Zeichen speichert. |
| completed | bool\& | Verweis auf die Variable, die auf true gesetzt wird, wenn der Eingabepuffer erschöpft war, und andernfalls auf false. |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncodingDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Konvertiert Bytes in Zeichen.

```cpp
void System::Text::EncodingDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bytes | const uint8_t * | Bytes zum Dekodieren. |
| byteCount | int | Größe des Eingabepuffers. |
| chars | char_t * | Zielzeichenpuffer. |
| charCount | int | Größe des Zielarrays. |
| flush | bool | Wenn wahr, wird der interne Decoder-Zustand nach der Berechnung bereinigt. |
| bytesUsed | int\& | Referenz auf die Variable, die die Anzahl gelesener Bytes speichert. |
| charsUsed | int\& | Referenz auf die Variable, die die Anzahl geschriebener Zeichen speichert. |
| completed | bool\& | Verweis auf die Variable, die auf true gesetzt wird, wenn der Eingabepuffer erschöpft war, und andernfalls auf false. |

## Siehe auch

* Class [EncodingDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
