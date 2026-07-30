---
title: "Класс System::Text::EncoderExceptionFallback"
linktitle: "EncoderExceptionFallback"
second_title: "Aspose.Font для C++"
description: "Класс System::Text::EncoderExceptionFallback. Предоставляет стратегию отката, бросающую исключения. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 1000
url: /ru/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


Предоставляет стратегию отката, бросающую исключение. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## Методы

| Метод | Описание |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | Создаёт буфер отката. |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | Конструктор. |
| [get_MaxCharCount](./get_maxcharcount/)() const override | Получает максимальное количество символов, которое может вернуть экземпляр. |
## См. также

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Font for C++](../../)
