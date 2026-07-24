---
title: "Метод System::Text::ICUEncoder::GetBytes"
linktitle: "GetBytes"
second_title: "Aspose.Page для C++"
description: "Метод System::Text::ICUEncoder::GetBytes. Получает байты, полученные в результате кодирования буфера в C++."
type: docs
weight: 500
url: /ru/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


Получает байты, полученные в результате кодирования буфера.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Символы для кодирования. |
| charIndex | int | Смещение исходного массива. |
| charCount | int | Длина подмассива источника. |
| байты | ArrayPtr\<uint8_t\> | Буфер байтов назначения. |
| byteIndex | int | Смещение буфера назначения. |
| flush | bool | Если true, очищает внутреннее состояние кодировщика после вычисления. |

### ReturnValue

Количество записанных байтов.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


Получает байты, полученные в результате кодирования буфера.

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| chars | const char_t * | Символы для кодирования. |
| charCount | int | Длина исходного массива. |
| байты | uint8_t * | Буфер байтов назначения. |
| byteCount | int | Размер буфера назначения. |
| flush | bool | Если true, очищает внутреннее состояние кодировщика после вычисления. |

### ReturnValue

Количество записанных байтов.

## См. также

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
