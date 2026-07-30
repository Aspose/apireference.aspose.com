---
title: "System::Text::Decoder::GetCharCount метод"
linktitle: "GetCharCount"
second_title: "Aspose.Font для C++"
description: "System::Text::Decoder::GetCharCount метод. Получает количество символов, необходимых для декодирования буфера в C++."
type: docs
weight: 400
url: /ru/cpp/system.text/decoder/getcharcount/
---
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int) method


Возвращает количество символов, необходимое для декодирования буфера.

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | The number of attributes on the current node. This number includes default attributes. | Байты для декодирования. |
| index | int | [Buffer](../../../system/buffer/) смещение. |
| count | int | Количество байтов для декодирования. |

### ReturnValue

Количество символов, необходимых для декодирования буфера.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetCharCount(ArrayPtr\<uint8_t\>, int, int, bool) method


Возвращает количество символов, необходимое для декодирования буфера.

```cpp
virtual int System::Text::Decoder::GetCharCount(ArrayPtr<uint8_t> bytes, int index, int count, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | The number of attributes on the current node. This number includes default attributes. | Байты для декодирования. |
| index | int | [Buffer](../../../system/buffer/) смещение. |
| count | int | Количество байтов для декодирования. |
| сброс | bool | Если истинно, очищает внутреннее состояние декодера после вычисления. |

### ReturnValue

Количество символов, необходимых для декодирования буфера.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Decoder::GetCharCount(const uint8_t *, int, bool) method


Возвращает количество символов, необходимое для декодирования буфера.

```cpp
virtual int System::Text::Decoder::GetCharCount(const uint8_t *bytes, int count, bool flush)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| байты | const uint8_t * | Байты для декодирования. |
| count | int | Количество байтов для декодирования. |
| сброс | bool | Если истинно, очищает внутреннее состояние декодера после вычисления. |

### ReturnValue

Количество символов, необходимых для декодирования буфера.

## См. также

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
