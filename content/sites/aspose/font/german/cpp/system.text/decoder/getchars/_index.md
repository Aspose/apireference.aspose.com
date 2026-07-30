---
title: "System::Text::Decoder::GetChars Methode"
linktitle: "GetChars"
second_title: "Aspose.Font für C++"
description: "System::Text::Decoder::GetChars Methode. Erhalte die Zeichen, die durch das Dekodieren eines Puffers in C++ entstehen."
type: docs
weight: 500
url: /de/cpp/system.text/decoder/getchars/
---
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Gibt die Zeichen zurück, die durch das Dekodieren eines Puffers entstehen.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bytes | ArrayPtr\<uint8_t\> | Bytes zum Dekodieren. |
| byteIndex | int | Versatz des Eingabepuffers. |
| byteCount | int | Größe des Eingabepuffers. |
| chars | ArrayPtr\<char_t\> | Zielzeichenpuffer. |
| charIndex | int | Versatz des Zielarrays. |

### ReturnValue

Anzahl der geschriebenen Zeichen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Gibt die Zeichen zurück, die durch das Dekodieren eines Puffers entstehen.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bytes | ArrayPtr\<uint8_t\> | Bytes zum Dekodieren. |
| byteIndex | int | Versatz des Eingabepuffers. |
| byteCount | int | Größe des Eingabepuffers. |
| chars | ArrayPtr\<char_t\> | Zielzeichenpuffer. |
| charIndex | int | Versatz des Zielarrays. |
| flush | bool | Falls wahr, wird der interne Decoder-Zustand nach der Berechnung bereinigt. |

### ReturnValue

Anzahl der geschriebenen Zeichen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Gibt die Zeichen zurück, die durch das Dekodieren eines Puffers entstehen.

```cpp
virtual int System::Text::Decoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bytes | const uint8_t * | Bytes zum Dekodieren. |
| byteCount | int | Größe des Eingabepuffers. |
| chars | char_t * | Zielzeichenpuffer. |
| charCount | int | Größe des Zielarrays. |
| flush | bool | Falls wahr, wird der interne Decoder-Zustand nach der Berechnung bereinigt. |

### ReturnValue

Anzahl der geschriebenen Zeichen.

## Siehe auch

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
