---
title: "Метод System::Text::EncoderFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Font для C++"
description: "Метод System::Text::EncoderFallbackBuffer::Fallback. Реализует фактическую процедуру отката в C++."
type: docs
weight: 100
url: /ru/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


Реализует фактическую процедуру отката.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charUnknown | char_t | Кодировщик символов не может выполнить кодирование. |
| индекс | int | Индекс символа, вызвавшего ошибку. |

### ReturnValue

True, если буфер обрабатывает неизвестные символы, false, если игнорирует их.

## См. также

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


Реализует фактическую процедуру отката.

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charUnknownHigh | char_t | Высокая часть суррогатной пары, вызвавшей ошибку. |
| charUnknownLow | char_t | Низкая часть суррогатной пары, вызвавшей ошибку. |
| индекс | int | Индекс символа, вызвавшего ошибку. |

### ReturnValue

True, если буфер обрабатывает неизвестные символы, false, если игнорирует их.

## См. также

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
