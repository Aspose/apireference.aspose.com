---
title: "System::Text::RegularExpressions::GroupCollection class"
linktitle: "GroupCollection"
second_title: "Aspose.Font для C++"
description: "System::Text::RegularExpressions::GroupCollection class. Список групп захвата в одном совпадении. Объекты этого класса должны создаваться только с помощью функции System::MakeObject(). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель System::SmartPtr и используйте этот указатель для передачи его в функции в качестве аргумента в C++."
type: docs
weight: 400
url: /ru/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Список захваченных групп в единственном совпадении. Объекты этого класса должны быть выделены только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляр этого типа в стеке или с помощью оператора new, так как это приведет к ошибкам выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Методы

| Метод | Описание |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Отключает добавление элемента в коллекцию. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Добавляет группу в коллекцию. |
| [Clear](./clear/)() override | Отключает удаление элементов из коллекции. |
| [get_Item](./get_item/)(int) const | [Group](../group/) аксессор. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) аксессор. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Конструктор. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) аксессор. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) аксессор. |
| [IsReadOnly](./isreadonly/)() const | Помечает коллекцию как только для чтения. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) аксессор. |
| [operator[]](./operator[]/)(int) | [Group](../group/) аксессор. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) аксессор. |
| [Remove](./remove/)(const GroupPtr\&) override | Отключает удаление элемента из коллекции. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Base](./base/) | [Base](./base/) класс. |
## См. также

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Font for C++](../../)
