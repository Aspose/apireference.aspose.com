---
title: "System::Text::ICUEncoder::GetBytes Methode"
linktitle: "GetBytes"
second_title: "Aspose.Font für C++"
description: "System::Text::ICUEncoder::GetBytes Methode. Erhalte die Bytes, die durch das Codieren eines Puffers in C++ entstehen."
type: docs
weight: 500
url: /de/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


Gibt die Bytes zurück, die durch das Kodieren eines Puffers entstehen.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Zeichen zum Kodieren. |
| charIndex | int | Versatz des Quellarrays. |
| charCount | int | Länge des Quellunterarrays. |
| Bytes | ArrayPtr\<uint8_t\> | Ziel-Byte-Puffer. |
| byteIndex | int | Versatz des Zielpuffers. |
| flush | bool | Wenn true, wird der interne Encoder-Zustand nach der Berechnung bereinigt. |

### ReturnValue

Anzahl der geschriebenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


Gibt die Bytes zurück, die durch das Kodieren eines Puffers entstehen.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | const char_t * | Zeichen zum Kodieren. |
| charCount | int | Länge des Quellarrays. |
| Bytes | uint8_t * | Ziel-Byte-Puffer. |
| byteCount | int | Größe des Zielpuffers. |
| flush | bool | Wenn true, wird der interne Encoder-Zustand nach der Berechnung bereinigt. |

### ReturnValue

Anzahl der geschriebenen Bytes.

## Siehe auch

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
