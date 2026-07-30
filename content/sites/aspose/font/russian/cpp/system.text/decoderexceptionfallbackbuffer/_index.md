---
title: "Класс System::Text::DecoderExceptionFallbackBuffer"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "Aspose.Font для C++"
description: "System::Text::DecoderExceptionFallbackBuffer класс. Буфер для стратегии отката декодирования, бросающей исключения. На самом деле ничего не хранит, а бросает исключение. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 400
url: /ru/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## Методы

| Метод | Описание |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | Конструктор. |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | Обрабатывает сбой декодирования. |
| [get_Remaining](./get_remaining/)() const override | Возвращает количество оставшихся символов. |
| [GetNextChar](./getnextchar/)() override | Получает следующий доступный символ. |
| [MovePrevious](./moveprevious/)() override | Переходит к предыдущему символу. |
## См. также

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
