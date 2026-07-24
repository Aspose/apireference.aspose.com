---
title: "Класс System::Text::RegularExpressions::GroupCollection"
linktitle: "GroupCollection"
second_title: "Aspose.Page для C++"
description: "Класс System::Text::RegularExpressions::GroupCollection. Список захваченных групп в одном совпадении. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 400
url: /ru/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Список захваченных групп в одном совпадении. Объекты этого класса должны создаваться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Отключает добавление элементов в коллекцию. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Добавляет группу в коллекцию. |
| [Clear](./clear/)() override | Отключает удаление элементов из коллекции. |
| [get_Item](./get_item/)(int) const | Аксессор [Group](../group/). |
| [get_Item](./get_item/)(const String\&) const | Аксессор [Group](../group/). |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Конструктор. |
| virtual [idx_get](./idx_get/)(String) const | Аксессор [Group](../group/). |
| [idx_get](./idx_get/)(int) const override | Аксессор [Group](../group/). |
| [IsReadOnly](./isreadonly/)() const | Помечает коллекцию как только для чтения. |
| [operator[]](./operator[]/)(const String\&) const | Аксессор [Group](../group/). |
| [operator[]](./operator[]/)(int) | Аксессор [Group](../group/). |
| [operator[]](./operator[]/)(int) const | Аксессор [Group](../group/). |
| [Remove](./remove/)(const GroupPtr\&) override | Отключает удаление элемента из коллекции. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [Base](./base/) | [Base](./base/) класс. |
## См. также

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
