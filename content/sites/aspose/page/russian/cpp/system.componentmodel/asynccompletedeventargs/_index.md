---
title: "System::ComponentModel::AsyncCompletedEventArgs класс"
linktitle: "AsyncCompletedEventArgs"
second_title: "Aspose.Page для C++"
description: "System::ComponentModel::AsyncCompletedEventArgs класс. Экземпляр этого класса передаётся в качестве аргумента делегату AsyncCompletedEventHandler. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 100
url: /ru/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


Экземпляр этого класса передаётся в качестве аргумента делегату AsyncCompletedEventHandler. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## Методы

| Метод | Описание |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | Конструктор. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | Инициализирует новый экземпляр класса [System.ComponentModel.AsyncCompletedEventArgs](./). |
| [get_Cancelled](./get_cancelled/)() const | Получает значение, указывающее, была ли отменена асинхронная операция. true, если фоновая операция была отменена; иначе false. По умолчанию false. |
| [get_Error](./get_error/)() const | Получает значение, указывающее, какая ошибка произошла во время асинхронной операции. |
| [get_UserState](./get_userstate/)() const | Получает уникальный идентификатор асинхронной задачи. Ссылка на объект, который уникально идентифицирует асинхронную задачу; иначе null, если значение не установлено. |
## Поля

| Поле | Описание |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Статический член, представляющий "пустой" [EventArgs](../../system/eventargs/) разделяемый указатель (null-pointer). |
## См. также

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
