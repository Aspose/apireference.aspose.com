---
title: "Класс System::Text::DecoderReplacementFallback"
linktitle: "DecoderReplacementFallback"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::DecoderReplacementFallback. Предоставляет стратегию отката, заменяющую ошибочный символ заглушкой. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 700
url: /ru/cpp/system.text/decoderreplacementfallback/
---
## DecoderReplacementFallback class


Предоставляет стратегию отката, заменяющую ошибочный символ заглушкой. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class DecoderReplacementFallback : public System::Text::DecoderFallback
```

## Методы

| Метод | Описание |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Создаёт буфер отката. |
| [DecoderReplacementFallback](./decoderreplacementfallback/)() | Конструктор, использующий строку замены по умолчанию "?". |
| [DecoderReplacementFallback](./decoderreplacementfallback/)(const String\&) | Конструктор. |
| [get_DefaultString](./get_defaultstring/)() const | Получает строку замены. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Получает максимальное количество символов, которое может вернуть экземпляр. |
## См. также

* Class [DecoderFallback](../decoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
