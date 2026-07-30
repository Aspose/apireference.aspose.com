---
title: "System::Text::Decoder::GetCharCount Methode"
linktitle: "GetCharCount"
second_title: "Aspose.Font für C++"
description: "System::Text::Decoder::GetCharCount Methode. Gibt die Anzahl der Zeichen zurück, die zum Dekodieren eines Puffers in C++ benötigt werden."
type: docs
weight: 400
url: /de/cpp/system.text/decoder/getcharcount/
---
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Puffers benötigt werden.

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bytes | ArrayPtr\<uint8_t\> | Bytes zum Dekodieren. |
| index | int | [Buffer](../../../system/buffer/) Versatz. |
| count | int | Anzahl der zu dekodierenden Bytes. |

### ReturnValue

Anzahl der zum Dekodieren des Puffers erforderlichen Zeichen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Puffers benötigt werden.

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bytes | ArrayPtr\<uint8_t\> | Bytes zum Dekodieren. |
| index | int | [Buffer](../../../system/buffer/) Versatz. |
| count | int | Anzahl der zu dekodierenden Bytes. |
| flush | bool | Falls wahr, wird der interne Decoder-Zustand nach der Berechnung bereinigt. |

### ReturnValue

Anzahl der zum Dekodieren des Puffers erforderlichen Zeichen.

## Siehe auch

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetCharCount(const uint8_t *, int, bool) method


Ermittelt die Anzahl der Zeichen, die zum Dekodieren eines Puffers benötigt werden.

```cpp
virtual int System::Text::Decoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Bytes | const uint8_t * | Bytes zum Dekodieren. |
| count | int | Anzahl der zu dekodierenden Bytes. |
| flush | bool | Falls wahr, wird der interne Decoder-Zustand nach der Berechnung bereinigt. |

### ReturnValue

Anzahl der zum Dekodieren des Puffers erforderlichen Zeichen.

## Siehe auch

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
