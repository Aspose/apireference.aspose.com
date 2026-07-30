---
title: "System::ComponentModel::RunWorkerCompletedEventArgs class"
linktitle: "RunWorkerCompletedEventArgs"
second_title: "Aspose.Font для C++"
description: "System::ComponentModel::RunWorkerCompletedEventArgs class. Экземпляр этого класса передаётся в качестве аргумента делегату RunWorkerCompletedEventHandler. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 1300
url: /ru/cpp/system.componentmodel/runworkercompletedeventargs/
---
## RunWorkerCompletedEventArgs class


Экземпляр этого класса передаётся в качестве аргумента делегату RunWorkerCompletedEventHandler. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class RunWorkerCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Result](./get_result/)() const | Получает значение, представляющее результат асинхронной операции. |
| [RunWorkerCompletedEventArgs](./runworkercompletedeventargs/)(const System::SharedPtr\<System::Object\>\&, const System::Exception\&, bool) | Информация RTTI. |
## Поля

| Поле | Описание |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Статический член, представляющий «пустой» [EventArgs](../../system/eventargs/) shared pointer (null-pointer). |
## См. также

* Class [AsyncCompletedEventArgs](../asynccompletedeventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
