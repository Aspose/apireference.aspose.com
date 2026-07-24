---
title: "Aspose::Page::XPS::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsModel::XpsElement class. Klasse die algemene XPS‑elementkenmerken incapsuleert in C++."
type: docs
weight: 900
url: /nl/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


Klasse die algemene [XPS](../../aspose.page.xps/) elementkenmerken incapsuleert.

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [begin](./begin/)() | Haalt iterator op die naar het eerste element (indien aanwezig) van de collectie wijst. |
| [begin](./begin/)() const | Haalt iterator op die naar het eerste element (indien aanwezig) van de const‑gekwalificeerde instantie van de collectie wijst. |
| [cbegin](./cbegin/)() const | Haalt iterator op die naar het eerste const‑gekwalificeerde element (indien aanwezig) van de collectie wijst. |
| [cend](./cend/)() const | Haalt iterator op die direct na het laatste const‑gekwalificeerde element (indien aanwezig) van de collectie wijst. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | Haalt iterator op die direct na het laatste element (indien aanwezig) van de collectie wijst. |
| [end](./end/)() const | Haalt iterator op die direct na het laatste element (indien aanwezig) van de const‑gekwalificeerde instantie van de collectie wijst. |
| [get_Count](./get_count/)() | Retourneert het aantal onderliggende elementen. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | Implementatie van de [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/) interface. |
| [idx_get](./idx_get/)(int32_t) | Biedt toegang tot de onderliggende elementen van het element via index *i*. |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Haalt iterator op die naar het eerste element (indien aanwezig) van de const‑gekwalificeerde instantie van de collectie wijst. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Haalt iterator op die naar het eerste element (indien aanwezig) van de collectie wijst. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Haalt iterator op die direct na het laatste element (indien aanwezig) van de const‑gekwalificeerde instantie van de collectie wijst. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Haalt iterator op die direct na het laatste element (indien aanwezig) van de collectie wijst. |
## Typedefs

| Typedef | Beschrijving |
| --- | --- |
| [const_iterator](./const_iterator/) | Const-iterator type. |
| [iterator](./iterator/) | Iterator type. |
| [iterator_holder_type](./iterator_holder_type/) | Een collectietype waarvan de iterator‑typen worden gebruikt als iterator‑typen in de huidige collectie. |
| [virtualized_iterator](./virtualized_iterator/) | Gevirtualiseerd type. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Gevirtualiseerd elementtype. |
## Zie ook

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
