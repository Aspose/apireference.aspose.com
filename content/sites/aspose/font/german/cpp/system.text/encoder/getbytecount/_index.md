---
title: "System::Text::Encoder::GetByteCount Methode"
linktitle: "GetByteCount"
second_title: "Aspose.Font für C++"
description: "System::Text::Encoder::GetByteCount Methode. Gibt die Anzahl der Bytes zurück, die zum Codieren eines Puffers in C++ benötigt werden."
type: docs
weight: 400
url: /de/cpp/system.text/encoder/getbytecount/
---
## Encoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Ermittelt die Anzahl der Bytes, die zum Kodieren eines Puffers benötigt werden.

```cpp
virtual int System::Text::Encoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Zeichen zum Kodieren. |
| index | int | [Buffer](../../../system/buffer/) Versatz. |
| count | int | Anzahl der zu codierenden Zeichen. |
| flush | bool | Wenn true, wird der interne Encoder-Zustand nach der Berechnung bereinigt. |

### ReturnValue

Anzahl der Bytes, die zum Codieren des Puffers erforderlich sind.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoder::GetByteCount(const char_t *, int, bool) method


Ermittelt die Anzahl der Bytes, die zum Kodieren eines Puffers benötigt werden.

```cpp
virtual int System::Text::Encoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| chars | const char_t * | Zeichen zum Kodieren. |
| count | int | Anzahl der zu codierenden Zeichen. |
| flush | bool | Wenn true, wird der interne Encoder-Zustand nach der Berechnung bereinigt. |

### ReturnValue

Anzahl der Bytes, die zum Codieren des Puffers erforderlich sind.

## Siehe auch

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
