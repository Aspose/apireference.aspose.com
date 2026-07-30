---
title: "System::Text::Encoder::Convert Methode"
linktitle: "Convert"
second_title: "Aspose.Font für C++"
description: "System::Text::Encoder::Convert Methode. Konvertiert Zeichen in Bytes in C++."
type: docs
weight: 100
url: /de/cpp/system.text/encoder/convert/
---
## Encoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


Konvertiert Zeichen in Bytes.

```cpp
virtual void System::Text::Encoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Zeichen zum Kodieren. |
| charIndex | int | Versatz des Eingabepuffers. |
| charCount | int | Größe des Eingabepuffers. |
| Bytes | ArrayPtr\<uint8_t\> | Ziel-Byte-Puffer. |
| byteIndex | int | Versatz des Zielarrays. |
| byteCount | int | Größe des Zielarrays. |
| flush | bool | Wenn true, wird der interne Encoder-Zustand nach der Berechnung bereinigt. |
| charsUsed | int\& | Referenz auf die Variable, die die Anzahl gelesener Zeichen speichert. |
| bytesUsed | int\& | Referenz auf die Variable, die die Anzahl geschriebener Bytes speichert. |
| completed | bool\& | Referenz auf die Variable, die auf true gesetzt wird, wenn der Eingabepuffer erschöpft ist, und andernfalls auf false. |

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


Konvertiert Zeichen in Bytes.

```cpp
virtual void System::Text::Encoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | const char_t * | Zeichen zum Kodieren. |
| charCount | int | Größe des Eingabepuffers. |
| Bytes | uint8_t * | Ziel-Byte-Puffer. |
| byteCount | int | Größe des Zielarrays. |
| flush | bool | Wenn true, wird der interne Encoder-Zustand nach der Berechnung bereinigt. |
| charsUsed | int\& | Referenz auf die Variable, die die Anzahl gelesener Zeichen speichert. |
| bytesUsed | int\& | Referenz auf die Variable, die die Anzahl geschriebener Bytes speichert. |
| completed | bool\& | Referenz auf die Variable, die auf true gesetzt wird, wenn der Eingabepuffer erschöpft ist, und andernfalls auf false. |

## Siehe auch

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
