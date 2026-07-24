---
title: "Aspose::Page::XPS::XpsModel::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsModel::XpsElement class. Класс, инкапсулирующий общие свойства элементов XPS в C++."
type: docs
weight: 900
url: /ru/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


Класс, инкапсулирующий общие свойства элементов [XPS](../../aspose.page.xps/).

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## Методы

| Метод | Описание |
| --- | --- |
| [begin](./begin/)() | Получает итератор, указывающий на первый элемент (если он существует) коллекции. |
| [begin](./begin/)() const | Получает итератор, указывающий на первый элемент (если он существует) константно-квалифицированного экземпляра коллекции. |
| [cbegin](./cbegin/)() const | Получает итератор, указывающий на первый константно-квалифицированный элемент (если он существует) коллекции. |
| [cend](./cend/)() const | Получает итератор, указывающий сразу после последнего константно-квалифицированного элемента (если он существует) коллекции. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | Получает итератор, указывающий сразу после последнего элемента (если он есть) коллекции. |
| [end](./end/)() const | Получает итератор, указывающий сразу после последнего элемента (если он есть) константно‑квалифицированного экземпляра коллекции. |
| [get_Count](./get_count/)() | Возвращает количество дочерних элементов. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | Реализация интерфейса [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/). |
| [idx_get](./idx_get/)(int32_t) | Обеспечивает доступ к дочерним элементам по индексу *i*. |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Получает итератор, указывающий на первый элемент (если он есть) константно‑квалифицированного экземпляра коллекции. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Получает итератор, указывающий на первый элемент (если он существует) коллекции. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Получает итератор, указывающий сразу после последнего элемента (если он есть) константно‑квалифицированного экземпляра коллекции. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Получает итератор, указывающий сразу после последнего элемента (если он есть) коллекции. |
## Typedefs

| Определение типа. | Описание |
| --- | --- |
| [const_iterator](./const_iterator/) | Тип константного итератора. |
| [iterator](./iterator/) | Тип итератора. |
| [iterator_holder_type](./iterator_holder_type/) | Тип коллекции, чьи типы итераторов используются в качестве типов итераторов в текущей коллекции. |
| [virtualized_iterator](./virtualized_iterator/) | Виртуализированный тип. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Виртуализированный тип элемента. |
## См. также

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
