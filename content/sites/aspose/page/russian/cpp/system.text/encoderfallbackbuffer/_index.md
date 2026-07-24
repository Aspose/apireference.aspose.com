---
title: "System::Text::EncoderFallbackBuffer класс"
linktitle: "EncoderFallbackBuffer"
second_title: "Aspose.Page для C++"
description: "System::Text::EncoderFallbackBuffer класс. Предоставляет буфер для реализации отката. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1300
url: /ru/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


Предоставляет буфер для реализации отката. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class EncoderFallbackBuffer : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | Реализует фактическую процедуру отката. |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | Реализует фактическую процедуру отката. |
| virtual [get_Remaining](./get_remaining/)() const | Получает оставшееся количество символов для обработки. |
| virtual [GetNextChar](./getnextchar/)() | Извлекает следующий символ из буфера отката. |
| virtual [MovePrevious](./moveprevious/)() | Перемещает позицию буфера на один шаг назад, если это возможно. |
| virtual [Reset](./reset/)() | Сбрасывает буфер в исходное состояние. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
