---
title: "System::Text::DecoderReplacementFallbackBuffer::Fallback метод"
linktitle: "Fallback"
second_title: "Aspose.Page для C++"
description: "System::Text::DecoderReplacementFallbackBuffer::Fallback метод. Обрабатывает ошибку декодирования в C++."
type: docs
weight: 200
url: /ru/cpp/system.text/decoderreplacementfallbackbuffer/fallback/
---
## DecoderReplacementFallbackBuffer::Fallback method


Обрабатывает сбой декодирования.

```cpp
virtual bool System::Text::DecoderReplacementFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) неизвестных байтов; игнорируется. |
| индекс | int | Смещение неизвестных байтов; игнорируется. |

### ReturnValue

Истина, если строка замены предоставлена и не пуста, иначе ложь.

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
