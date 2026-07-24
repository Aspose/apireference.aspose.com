---
title: "Класс System::ComponentModel::CancelEventArgs"
linktitle: "CancelEventArgs"
second_title: "Aspose.Page для C++"
description: "Класс System::ComponentModel::CancelEventArgs. Аргументы отменяемого события. Объекты этого класса должны выделяться только с помощью функции System::MakeObject() function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 300
url: /ru/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


Аргументы отменяемого события. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/) function. Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class CancelEventArgs : public System::EventArgs
```

## Методы

| Метод | Описание |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | Информация RTTI. |
| [CancelEventArgs](./canceleventargs/)() | Конструктор; устанавливает свойство Cancel в false. |
| [get_Cancel](./get_cancel/)() | Возвращает значение, указывающее, следует ли отменить событие. |
| [set_Cancel](./set_cancel/)(bool) | Устанавливает значение, указывающее, следует ли отменить событие. |
## Поля

| Поле | Описание |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Статический член, представляющий "пустой" [EventArgs](../../system/eventargs/) разделяемый указатель (null-pointer). |
## См. также

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
