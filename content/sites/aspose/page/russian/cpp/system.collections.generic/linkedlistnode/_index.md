---
title: "System::Collections::Generic::LinkedListNode класс"
linktitle: "LinkedListNode"
second_title: "Aspose.Page для C++"
description: "System::Collections::Generic::LinkedListNode класс. Узел связного списка. Реализует обёртку над итератором std::list, который обёрнут в связный список. Объекты этого класса должны выделяться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 3200
url: /ru/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


Узел связного списка. Реализует обёртку над итератором std::list, который обёрнут в связный список. Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Параметр | Описание |
| --- | --- |
| T | Тип хранимого значения. |
## Методы

| Метод | Описание |
| --- | --- |
| [get_List](./get_list/)() const | Возвращает содержащий список. |
| [get_Next](./get_next/)() const | Возвращает следующий узел. |
| [get_Previous](./get_previous/)() const | Получает предыдущий узел. |
| [get_Value](./get_value/)() const | Получает сохранённое значение. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | Конструктор. |
| [set_Value](./set_value/)(const T\&) | Устанавливает сохранённое значение. |

## См. также

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
