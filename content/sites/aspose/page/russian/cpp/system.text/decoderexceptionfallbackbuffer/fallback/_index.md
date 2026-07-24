---
title: "System::Text::DecoderExceptionFallbackBuffer::Fallback method"
linktitle: "Fallback"
second_title: "Aspose.Page для C++"
description: "System::Text::DecoderExceptionFallbackBuffer::Fallback method. Обрабатывает ошибку декодирования в C++."
type: docs
weight: 200
url: /ru/cpp/system.text/decoderexceptionfallbackbuffer/fallback/
---
## DecoderExceptionFallbackBuffer::Fallback method


Обрабатывает сбой декодирования.

```cpp
virtual bool System::Text::DecoderExceptionFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) неизвестных байтов; игнорируется. |
| индекс | int | Смещение неизвестных байтов; игнорируется. |

### ReturnValue

Никогда фактически не возвращает, вместо этого бросает исключение.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
