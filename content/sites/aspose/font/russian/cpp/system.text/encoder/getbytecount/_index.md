---
title: "Метод GetByteCount класса System::Text::Encoder"
linktitle: "GetByteCount"
second_title: "Aspose.Font для C++"
description: "Метод GetByteCount класса System::Text::Encoder. Получает количество байтов, необходимых для кодирования буфера в C++."
type: docs
weight: 400
url: /ru/cpp/system.text/encoder/getbytecount/
---
## Encoder::GetByteCount(ArrayPtr\<char_t\>, int, int, bool) method


Возвращает количество байтов, необходимое для кодирования буфера.

```cpp
virtual int System::Text::Encoder::GetByteCount(ArrayPtr<char_t> chars, int index, int count, bool flush)
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
* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoder::GetByteCount(const char_t *, int, bool) method


Возвращает количество байтов, необходимое для кодирования буфера.

```cpp
virtual int System::Text::Encoder::GetByteCount(const char_t *chars, int count, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| chars | const char_t * | Символы для кодирования. |
| count | int | Количество символов для кодирования. |
| сброс | bool | Если true, очищает внутреннее состояние кодировщика после вычисления. |

### ReturnValue

Количество байтов, необходимых для кодирования буфера.

## См. также

* Class [Encoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
