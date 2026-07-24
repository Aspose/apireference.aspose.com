---
title: "Класс System::Text::EncoderExceptionFallbackBuffer"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "Aspose.Page для C++"
description: "Класс System::Text::EncoderExceptionFallbackBuffer. Буфер стратегии отката кодирования, бросающей исключение. На самом деле ничего не хранит, а бросает исключение. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1100
url: /ru/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## Методы

| Метод | Описание |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | Конструктор. |
| [Fallback](./fallback/)(char_t, int) override | Обрабатывает ошибку кодирования. |
| [Fallback](./fallback/)(char_t, char_t, int) override | Обрабатывает ошибку кодирования. |
| [get_Remaining](./get_remaining/)() const override | Возвращает количество оставшихся символов. |
| [GetNextChar](./getnextchar/)() override | Возвращает следующий доступный символ. |
| [MovePrevious](./moveprevious/)() override | Перемещается к предыдущему символу. |
## См. также

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
