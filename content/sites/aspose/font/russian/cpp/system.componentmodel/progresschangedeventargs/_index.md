---
title: "Класс System::ComponentModel::ProgressChangedEventArgs"
linktitle: "ProgressChangedEventArgs"
second_title: "Aspose.Font для C++"
description: "Класс System::ComponentModel::ProgressChangedEventArgs. Экземпляр этого класса передаётся в качестве аргумента делегату ProgressChangedEventHandler. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1100
url: /ru/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


Экземпляр этого класса передаётся в качестве аргумента делегату ProgressChangedEventHandler. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | Возвращает процент выполнения асинхронной задачи. |
| [get_UserState](./get_userstate/)() const | Возвращает уникальное состояние пользователя. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | Конструктор. |
## Поля

| Поле | Описание |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Статический член, представляющий «пустой» [EventArgs](../../system/eventargs/) shared pointer (null-pointer). |
## См. также

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
