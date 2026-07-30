---
title: "Класс System::Text::EncoderReplacementFallback"
linktitle: "EncoderReplacementFallback"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::EncoderReplacementFallback. Предоставляет стратегию отката, заменяющую ошибочный символ заглушкой. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1400
url: /ru/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


Предоставляет стратегию отката, заменяющую ошибочный символ заглушкой. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## Методы

| Метод | Описание |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Создаёт буфер отката. |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | Конструктор, использующий строку замены по умолчанию "?". |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | Конструктор. |
| [get_DefaultString](./get_defaultstring/)() const | Получает строку замены. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Получает максимальное количество символов, которое может вернуть экземпляр. |
## См. также

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
