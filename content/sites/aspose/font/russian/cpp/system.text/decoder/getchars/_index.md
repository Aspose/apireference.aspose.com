---
title: "System::Text::Decoder::GetChars метод"
linktitle: "GetChars"
second_title: "Aspose.Font для C++"
description: "System::Text::Decoder::GetChars метод. Получить символы, полученные в результате декодирования буфера в C++."
type: docs
weight: 500
url: /ru/cpp/system.text/decoder/getchars/
---
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


Получить символы, полученные в результате декодирования буфера.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | The number of attributes on the current node. This number includes default attributes. | Байты для декодирования. |
| byteIndex | int | Смещение входного буфера. |
| byteCount | int | Размер входного буфера. |
| chars | ArrayPtr\<char_t\> | Буфер целевых символов. |
| charIndex | int | Смещение массива назначения. |

### ReturnValue

Количество записанных символов.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


Получить символы, полученные в результате декодирования буфера.

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | The number of attributes on the current node. This number includes default attributes. | Байты для декодирования. |
| byteIndex | int | Смещение входного буфера. |
| byteCount | int | Размер входного буфера. |
| chars | ArrayPtr\<char_t\> | Буфер целевых символов. |
| charIndex | int | Смещение массива назначения. |
| сброс | bool | Если истинно, очищает внутреннее состояние декодера после вычисления. |

### ReturnValue

Количество записанных символов.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


Получить символы, полученные в результате декодирования буфера.

```cpp
virtual int System::Text::Decoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | const uint8_t * | Байты для декодирования. |
| byteCount | int | Размер входного буфера. |
| chars | char_t * | Буфер целевых символов. |
| charCount | int | Размер массива назначения. |
| сброс | bool | Если истинно, очищает внутреннее состояние декодера после вычисления. |

### ReturnValue

Количество записанных символов.

## См. также

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
