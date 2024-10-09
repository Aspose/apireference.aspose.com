---
title: Aspose::Page::XPS::XpsModel::XpsElement class
linktitle: XpsElement
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsModel::XpsElement class. Class incapsulating common XPS element features in C++.'
type: docs
weight: 1000
url: /cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


Class incapsulating common [XPS](../../aspose.page.xps/) element features.

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<Aspose::Page::XPS::XpsModel::XpsContentElement>>
```

## Methods

| Method | Description |
| --- | --- |
| [begin](./begin/)() | Gets iterator pointing to the first element (if any) of the collection. |
| [begin](./begin/)() const | Gets iterator pointing to the first element (if any) of the const-qualified instance of the collection. |
| [cbegin](./cbegin/)() const | Gets iterator pointing to the first const-qualified element (if any) of the collection. |
| [cend](./cend/)() const | Gets iterator pointing right after the last const-qualified element (if any) of the collection. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | Gets iterator pointing right after the last element (if any) of the collection. |
| [end](./end/)() const | Gets iterator pointing right after the last element (if any) of the const-qualified instance of the collection. |
| [get_Count](./get_count/)() | Returns number of child elements. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | Implementation of [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/) interface. |
| [idx_get](./idx_get/)(int32_t) | Provides access to element's children by index *i* . |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Set n'th template argument a weak pointer (rather than shared). Allows switching pointers in containers to weak mode. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Gets iterator pointing to the first element (if any)of the const-qualified instance of the collection. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Gets iterator pointing to the first element (if any) of the collection. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Gets iterator pointing right after the last element (if any)of the const-qualified instance of the collection. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Gets iterator pointing right after the last element (if any) of the collection. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [const_iterator](./const_iterator/) | Const iterator type. |
| [iterator](./iterator/) | Iterator type. |
| [iterator_holder_type](./iterator_holder_type/) | A collection type whose iterator types is used as iterator types in the current collection. |
| [virtualized_iterator](./virtualized_iterator/) | Virtualized type. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Virtualized element type. |
## See Also

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
