---
title: "Метод System::Text::EncoderReplacementFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page для C++"
description: "Метод System::Text::EncoderReplacementFallbackBuffer::Fallback. Обрабатывает ошибку кодирования в C++."
type: docs
weight: 200
url: /ru/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


Обрабатывает ошибку кодирования.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charUnknown | char_t | Неизвестный символ; игнорировано. |
| индекс | int | Неизвестная позиция символа; игнорировано. |

### ReturnValue

Истина, если строка замены предоставлена и не пуста, иначе ложь.

## См. также

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


Обрабатывает ошибку кодирования.

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charUnknownHigh | char_t | Высокая часть суррогатной пары, вызвавшей ошибку. |
| charUnknownLow | char_t | Низкая часть суррогатной пары, вызвавшей ошибку. |
| индекс | int | Неизвестная позиция символа; игнорировано. |

### ReturnValue

Истина, если строка замены предоставлена и не пуста, иначе ложь.

## См. также

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
