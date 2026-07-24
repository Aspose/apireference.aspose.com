---
title: "System::ComponentModel::IContainer класс"
linktitle: "IContainer"
second_title: "Aspose.Page для C++"
description: "System::ComponentModel::IContainer класс. Фиктивный интерфейс для кода, использующего IContainer, чтобы он компилировался. Объекты этого класса должны создаваться только с помощью функции System::MakeObject() функции. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 900
url: /ru/cpp/system.componentmodel/icontainer/
---
## IContainer class


Фиктивный интерфейс для кода, использующего IContainer, чтобы он компилировался. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/) функции. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class IContainer : public virtual System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [Add](./add/)(System::SharedPtr\<IComponent\>) | Информация RTTI. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
