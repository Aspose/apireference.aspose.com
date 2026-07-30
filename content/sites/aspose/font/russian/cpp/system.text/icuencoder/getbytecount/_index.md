---
title: "System::Text::ICUEncoder::GetByteCount метод"
linktitle: "GetByteCount"
second_title: "Aspose.Font для C++"
description: "System::Text::ICUEncoder::GetByteCount метод. Получает количество байтов, необходимых для кодирования буфера в C++."
type: docs
weight: 400
url: /ru/cpp/system.text/icuencoder/getbytecount/
---
## ICUEncoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Возвращает количество байтов, необходимое для кодирования буфера.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | Символы для кодирования. |
| index | int | [Buffer](../../../system/buffer/) смещение. |
| count | int | Количество символов для кодирования. |
| сброс | bool | Если true, очищает внутреннее состояние кодировщика после вычисления. |

### ReturnValue

Количество байтов, необходимых для кодирования буфера.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## ICUEncoder::GetByteCount(const char_t *, int, bool) method


Возвращает количество байтов, необходимое для кодирования буфера.

```cpp
virtual int System::Text::ICUEncoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| chars | const char_t * | Символы для кодирования. |
| count | int | Количество символов для кодирования. |
| сброс | bool | Если true, очищает внутреннее состояние кодировщика после вычисления. |

### ReturnValue

Количество байтов, необходимых для кодирования буфера.

## См. также

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
