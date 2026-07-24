---
title: "System::ExceptionWrapper класс"
linktitle: "ExceptionWrapper"
second_title: "Aspose.Page для C++"
description: "System::ExceptionWrapper класс. Шаблон, представляющий обёртку исключений, производных от класса Exception в C++."
type: docs
weight: 2600
url: /ru/cpp/system/exceptionwrapper/
---
## ExceptionWrapper class


Шаблон, представляющий обёртку исключений, наследуемых от класса [Exception](../exception/).

```cpp
template<typename T>class ExceptionWrapper
```

## Методы

| Метод | Описание |
| --- | --- |
| [ExceptionWrapper](./exceptionwrapper/)(std::nullptr_t) | Создаёт нулевой экземпляр класса [ExceptionWrapper](./), который не представляет никакое исключение. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionPtr\&) | Создаёт экземпляр класса [ExceptionWrapper](./), содержащий переданный указатель. |
| [ExceptionWrapper](./exceptionwrapper/)(const ExceptionWrapper\&) | Конструктор копирования. |
| [ExceptionWrapper](./exceptionwrapper/)(ExceptionWrapper\&&) | Конструктор перемещения. |
| explicit [ExceptionWrapper](./exceptionwrapper/)(Args\&&...) | Конструктор, который передаёт параметры в конструкторы класса [Exception](../exception/) и создаёт умный указатель, содержащий новый экземпляр класса [Exception](../exception/). |
| static [operator new](./operatornew/)(std::size_t) |  |
| static [operator new[]](./operatornew[]/)(std::size_t) |  |
| [operator SharedPtr< Object >](./operatorsharedptr_object_/)() | Неявный оператор приведения к типу [SharedPtr<Object>](../sharedptr/) |
| [operator->](./operator-_/)() const | Позволяет получать доступ к членам объекта [Exception](../exception/). |
| [operator=](./operator=/)(const ExceptionWrapper\&) | Оператор присваивания. |
| [operator=](./operator=/)(ExceptionWrapper\&&) | Оператор перемещения присваивания. |
| static [Type](./type/)() | Сокращение для получения объекта [System::TypeInfo](../typeinfo/) для типа [Exception](../exception/). |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [ExceptionType](./exceptiontype/) | Используется для функций приведения типов. |
## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
