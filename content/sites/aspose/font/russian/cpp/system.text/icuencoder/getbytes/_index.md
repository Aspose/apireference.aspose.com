---
title: "System::Text::ICUEncoder::GetBytes метод"
linktitle: "GetBytes"
second_title: "Aspose.Font для C++"
description: "System::Text::ICUEncoder::GetBytes метод. Получить байты, полученные в результате кодирования буфера в C++."
type: docs
weight: 500
url: /ru/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


Получить байты, полученные в результате кодирования буфера.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Символы для кодирования. |
| charIndex | int | Смещение исходного массива. |
| charCount | int | Длина подмассива источника. |
| байты | The number of attributes on the current node. This number includes default attributes. | Буфер байтов назначения. |
| byteIndex | int | Смещение буфера назначения. |
| сброс | bool | Если true, очищает внутреннее состояние кодировщика после вычисления. |

### ReturnValue

Количество записанных байтов.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


Получить байты, полученные в результате кодирования буфера.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| chars | const char_t * | Символы для кодирования. |
| charCount | int | Длина исходного массива. |
| байты | uint8_t * | Буфер байтов назначения. |
| byteCount | int | Размер буфера назначения. |
| сброс | bool | Если true, очищает внутреннее состояние кодировщика после вычисления. |

### ReturnValue

Количество записанных байтов.

## См. также

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
