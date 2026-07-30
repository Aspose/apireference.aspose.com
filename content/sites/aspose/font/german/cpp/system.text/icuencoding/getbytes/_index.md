---
title: "System::Text::ICUEncoding::GetBytes Methode"
linktitle: "GetBytes"
second_title: "Aspose.Font für C++"
description: "System::Text::ICUEncoding::GetBytes Methode. Gibt die Bytes zurück, die durch das Kodieren eines Zeichenpuffers in C++ entstehen."
type: docs
weight: 300
url: /de/cpp/system.text/icuencoding/getbytes/
---
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Zeichen zum Kodieren. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
virtual int System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Zeichen zum Kodieren. |
| char_index | int | Beginn des Zeichenabschnitts. |
| char_count | int | Anzahl der zu konvertierenden Zeichen. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) zum Ablegen von Zeichen. |
| byte_index | int | Versatz des Ausgabepuffers. |

### ReturnValue

Anzahl der geschriebenen Bytes.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Zeichen zum Kodieren. |
| Index | int | Beginn des Zeichenabschnitts. |
| count | int | Anzahl der zu konvertierenden Zeichen. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const char_t *, int, uint8_t *, int) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
int System::Text::ICUEncoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count) override
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | const char_t * | Zeichen zum Kodieren. |
| char_count | int | Anzahl der zu konvertierenden Zeichen. |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) zum Ablegen von Zeichen. |
| byte_count | int | Größe des Ausgabepuffers. |

### ReturnValue

Anzahl der geschriebenen Bytes.

## Siehe auch

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const String\&) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) zum Kodieren. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
virtual int System::Text::Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) zum Kodieren. |
| char_index | int | Beginn des Zeichenabschnitts. |
| char_count | int | Anzahl der zu konvertierenden Zeichen. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) zum Ablegen von Zeichen. |
| byte_index | int | Versatz des Ausgabepuffers. |

### ReturnValue

Anzahl der geschriebenen Bytes.

## Siehe auch

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | Zeichen zum Kodieren. |
| Index | int | Beginn des Zeichenabschnitts. |
| count | int | Anzahl der zu konvertierenden Zeichen. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | Zeichen zum Kodieren. |
| Index | int | Beginn des Zeichenabschnitts. |
| count | int | Anzahl der zu konvertierenden Zeichen. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | Zeichen zum Kodieren. |
| char_index | int | Beginn des Zeichenabschnitts. |
| char_count | int | Anzahl der zu konvertierenden Zeichen. |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) zum Ablegen von Zeichen. |
| byte_index | int | Versatz des Ausgabepuffers. |

### ReturnValue

Anzahl der geschriebenen Bytes.

## Siehe auch

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


Ermittelt die Bytes, die durch das Codieren eines Zeichenpuffers entstehen.

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | Zeichen zum Kodieren. |
| char_index | int | Beginn des Zeichenabschnitts. |
| char_count | int | Anzahl der zu konvertierenden Zeichen. |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) zum Ablegen von Zeichen. |
| byte_index | int | Versatz des Ausgabepuffers. |

### ReturnValue

Anzahl der geschriebenen Bytes.

## Siehe auch

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
