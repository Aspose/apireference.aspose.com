---
title: "System::Diagnostics::TraceListener класс"
linktitle: "TraceListener"
second_title: "Aspose.Font для C++"
description: "System::Diagnostics::TraceListener класс. Интерфейс для реагирования на отладочную и трассировочную информацию. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 800
url: /ru/cpp/system.diagnostics/tracelistener/
---
## TraceListener class


Интерфейс для реагирования на отладочную и трассировочную информацию. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class TraceListener : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Fail](./fail/)(System::String) | Записывает сообщение об ошибке в отладчик. |
| virtual [Fail](./fail/)(System::String, System::String) | Записывает сообщение об ошибке в отладчик. |
| virtual [Write](./write/)(System::String) | Информация RTTI. |
| virtual [WriteLine](./writeline/)(System::String) | Записывает строку в отладчик. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
