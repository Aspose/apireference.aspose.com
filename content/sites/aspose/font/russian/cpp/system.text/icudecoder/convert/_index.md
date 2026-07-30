---
title: "Метод System::Text::ICUDecoder::Convert"
linktitle: "Convert"
second_title: "Aspose.Font для C++"
description: "Метод System::Text::ICUDecoder::Convert. Преобразует байты в символы в C++."
type: docs
weight: 300
url: /ru/cpp/system.text/icudecoder/convert/
---
## ICUDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


Преобразует байты в символы.

```cpp
virtual void System::Text::ICUDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | The number of attributes on the current node. This number includes default attributes. | Байты для декодирования. |
| byteIndex | int | Смещение входного буфера. |
| byteCount | int | Размер входного буфера. |
| chars | ArrayPtr\<char_t\> | Буфер целевых символов. |
| charIndex | int | Смещение массива назначения. |
| charCount | int | Размер массива назначения. |
| сброс | bool | Если истинно, очищает внутреннее состояние декодера после вычисления. |
| bytesUsed | int\& | Ссылка на переменную для хранения количества прочитанных байтов. |
| charsUsed | int\& | Ссылка на переменную для хранения количества записанных символов. |
| завершено | bool\& | Ссылка на переменную, которая будет установлена в true, если входной буфер исчерпан, и в false в противном случае. |

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


Преобразует байты в символы.

```cpp
virtual void System::Text::ICUDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | const uint8_t * | Байты для декодирования. |
| byteCount | int | Размер входного буфера. |
| chars | char_t * | Буфер целевых символов. |
| charCount | int | Размер массива назначения. |
| сброс | bool | Если истинно, очищает внутреннее состояние декодера после вычисления. |
| bytesUsed | int\& | Ссылка на переменную для хранения количества прочитанных байтов. |
| charsUsed | int\& | Ссылка на переменную для хранения количества записанных символов. |
| завершено | bool\& | Ссылка на переменную, которая будет установлена в true, если входной буфер исчерпан, и в false в противном случае. |

## См. также

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
