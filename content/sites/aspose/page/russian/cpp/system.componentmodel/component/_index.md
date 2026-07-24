---
title: "System::ComponentModel::Component класс"
linktitle: "Component"
second_title: "Aspose.Page для C++"
description: "System::ComponentModel::Component класс. Фиктивный класс, чтобы переведённый код с использованием класса Component был компилируемым. Объекты этого класса должны выделяться только с помощью функции System::MakeObject() . Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 400
url: /ru/cpp/system.componentmodel/component/
---
## Component class


Фиктивный класс, чтобы переведённый код с использованием класса [Component](./) был компилируемым. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## Методы

| Метод | Описание |
| --- | --- |
| [Component](./component/)() | Информация RTTI. |
| [Dispose](./dispose/)(bool) | Поддержка паттерна Disposable; ничего не делает. |
| [get_DesignMode](./get_designmode/)() | Проверяет, находится ли компонент в режиме дизайна. |
## См. также

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
