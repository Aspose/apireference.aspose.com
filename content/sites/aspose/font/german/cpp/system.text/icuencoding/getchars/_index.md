---
title: "System::Text::ICUEncoding::GetChars Methode"
linktitle: "GetChars"
second_title: "Aspose.Font für C++"
description: "System::Text::ICUEncoding::GetChars Methode. Gibt die Zeichen zurück, die durch das Dekodieren eines Byte-Puffers in C++ entstehen."
type: docs
weight: 500
url: /de/cpp/system.text/icuencoding/getchars/
---
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>) method


Ermittelt die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) zum Lesen von Bytes. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Ermittelt die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) zum Lesen von Bytes. |
| byte_index | int | Versatz des Eingabepuffers. |
| byte_count | int | Größe des Eingabepuffers. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) zum Ablegen von Zeichen. |
| char_index | int | Versatz des Ausgabepuffers. |

### ReturnValue

Anzahl der geschriebenen Zeichen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


Ermittelt die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) zum Lesen von Bytes. |
| Index | int | Versatz des Eingabepuffers. |
| count | int | Größe des Eingabepuffers. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetChars(const uint8_t *, int, char_t *, int) method


Ermittelt die Zeichen, die durch das Dekodieren eines Byte-Puffers entstehen.

```cpp
int System::Text::ICUEncoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) zum Lesen von Bytes. |
| byte_count | int | Größe des Eingabepuffers. |
| chars | char_t * | [Buffer](../../../system/buffer/) zum Ablegen von Zeichen. |
| char_count | int | Größe des Ausgabepuffers. |

### ReturnValue

Anzahl der geschriebenen Zeichen.

## Siehe auch

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
