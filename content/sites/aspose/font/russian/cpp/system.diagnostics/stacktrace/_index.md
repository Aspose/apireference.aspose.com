---
title: "Класс System::Diagnostics::StackTrace"
linktitle: "StackTrace"
second_title: "Aspose.Font для C++"
description: "Класс System::Diagnostics::StackTrace. Коллекция стековых кадров. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 600
url: /ru/cpp/system.diagnostics/stacktrace/
---
## StackTrace class


Коллекция стековых кадров. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class StackTrace : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_FrameCount](./get_framecount/)() const | Получает количество кадров в трассировке стека. |
| virtual [GetFrame](./getframe/)(uint32_t) | Получает стековый кадр. |
| [operator=](./operator=/)(const StackTrace\&) const | Нет присваивания. |
| [StackTrace](./stacktrace/)() | Создаёт трассировку стека, описывающую текущее состояние стека. |
| [StackTrace](./stacktrace/)(bool) | Создаёт трассировку стека, описывающую текущее состояние стека. |
| [StackTrace](./stacktrace/)(const StackTrace\&) | Копирование запрещено. |
| virtual [~StackTrace](./~stacktrace/)() | Деструктор. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Diagnostics](../)
* Library [Aspose.Font for C++](../../)
