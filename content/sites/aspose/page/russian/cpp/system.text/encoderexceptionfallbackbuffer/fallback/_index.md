---
title: "Метод System::Text::EncoderExceptionFallbackBuffer::Fallback"
linktitle: "Fallback"
second_title: "Aspose.Page для C++"
description: "Метод System::Text::EncoderExceptionFallbackBuffer::Fallback. Обрабатывает сбой кодирования в C++."
type: docs
weight: 200
url: /ru/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


Обрабатывает ошибку кодирования.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charUnknown | char_t | Неизвестные символы; игнорируются. |
| индекс | int | Смещение неизвестных символов; игнорируется. |

### ReturnValue

Никогда фактически не возвращает, вместо этого бросает исключение.

## См. также

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


Обрабатывает ошибку кодирования.

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| charUnknownHigh | char_t | Высокая часть суррогатной пары, вызвавшей ошибку. |
| charUnknownLow | char_t | Низкая часть суррогатной пары, вызвавшей ошибку. |
| индекс | int | Смещение неизвестного символа; игнорируется. |

### ReturnValue

Никогда фактически не возвращает, вместо этого бросает исключение.

## См. также

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
