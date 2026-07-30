---
title: "System::Text::DecoderReplacementFallbackBuffer класс"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "Aspose.Font для C++"
description: "System::Text::DecoderReplacementFallbackBuffer класс. Буфер для замены стратегии отката декодирования в C++."
type: docs
weight: 800
url: /ru/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Методы

| Метод | Описание |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | Конструктор. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Обрабатывает сбой декодирования. |
| [get_Remaining](./get_remaining/)() const override | Получает количество оставшихся символов в буфере. |
| [GetNextChar](./getnextchar/)() override | Получает следующий доступный символ. |
| [MovePrevious](./moveprevious/)() override | Переходит к предыдущему символу. |
| [Reset](./reset/)() override | Сбрасывает буфер в исходное состояние (до вызова [Fallback()](./fallback/)). |
## См. также

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
