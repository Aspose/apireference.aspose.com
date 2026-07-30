---
title: "System::Delegate< ReturnType(ArgumentTypes...)> класс"
linktitle: "Delegate< ReturnType(ArgumentTypes...)>"
second_title: "Aspose.Font для C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)> класс. Представляет указатель на функцию, метод или функциональный объект. Этот тип должен быть выделен в стеке и передаваться в функции по значению или по ссылке. Никогда не используйте класс System::SmartPtr для управления объектами этого типа в C++."
type: docs
weight: 2100
url: /ru/cpp/system/delegate_returntype(argumenttypes...)_/
---
## Delegate< ReturnType(ArgumentTypes...)> class


Представляет указатель на функцию, метод или функциональный объект. Этот тип должен быть выделен в стеке и передаваться в функции по значению или по ссылке. Никогда не используйте класс [System::SmartPtr](../smartptr/) для управления объектами этого типа.

```cpp
template<class ReturnType,class...>class Delegate< ReturnType(ArgumentTypes...)> : public System::Details::DelegateHoldingVariables
```


| Параметр | Описание |
| --- | --- |
| ReturnType | Тип возвращаемого значения функции, метода или указателя на функциональный объект, представленного этим классом |
| ArgumentTypes | Список аргументов функции, метода или указателя на функциональный объект, представленного этим классом |
## Методы

| Метод | Описание |
| --- | --- |
| [Delegate](./delegate/)() | Конструктор по умолчанию. Создает объект делегата, который не указывает ни на что. |
| [Delegate](./delegate/)(const Delegate\&) |  |
| [Delegate](./delegate/)(Delegate\&&) | Перемещающий копирующий конструктор. Перенимает владение сущностью, на которую указывает указанный делегат. |
| [Delegate](./delegate/)(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) | Конструктор. Создает объект делегата из указанного указателя на свободную функцию или статический метод. |
| [Delegate](./delegate/)(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) | Конструктор. Создает делегат из указанного указателя на объект функции, сгенерированный std::bind(). |
| [Delegate](./delegate/)(int, T\&) | Конструктор. Создает делегат из указанного функционального объекта. |
| [Delegate](./delegate/)(long, T\&&) | Перемещающий конструктор. Создает делегат из указанного функционального объекта. |
| [Delegate](./delegate/)(MemberType ClassType::*, ClassType *) | Конструктор. Создает делегат, указывающий на указанный нестатический метод указанного объекта. |
| [Delegate](./delegate/)(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) | Конструктор. Создает делегат, указывающий на указанный нестатический метод указанного объекта. |
| [Delegate](./delegate/)(std::function\<R(Args...)>) | Создает объект делегата, указывающий на объект функции std::function. |
| [Empty](./empty/)() const | Определяет, пустой ли текущий объект делегата, т.е. не указывает ни на какую сущность. |
| [operator()](./operator()/)(ArgumentTypes...) const | Вызывает функцию, метод или функциональный объект, на который указывает текущий объект делегата. |
| [operator=](./operator=/)(const Delegate\&) |  |
| [operator=](./operator=/)(Delegate\&&) | Перемещающий оператор присваивания. Перенимает владение сущностью, на которую указывает указанный делегат. |
| [operator==](./operator==/)(const Delegate\&) const | Сравнивает два объекта делегата, чтобы проверить, указывают ли они на одну и ту же сущность. |
## Примечания



```cpp
#include "system/delegate.h"
#include <iostream>

// Объявите делегат.
using Message = System::Delegate<void()>;

void PrintMessage()
{
  std::cout << "Hello, world!" << std::endl;
}

int main()
{
  // Присвойте переменной адрес функции PrintMessage.
  Message mes = Message(&PrintMessage);

  // Вызовите функцию.
  mes();

  return 0;
}
/*
This code example produces the following output:
Hello, world!
*/
```

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
