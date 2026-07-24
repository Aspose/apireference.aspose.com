---
title: "Aspose::Page::XPS::XpsModel::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsModel::XpsElement class. Klasse, die gemeinsame XPS-Elementfunktionen in C++ kapselt."
type: docs
weight: 900
url: /de/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


Klasse, die gemeinsame [XPS](../../aspose.page.xps/) Elementfunktionen kapselt.

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| [begin](./begin/)() | Gibt den Iterator zurück, der auf das erste Element (falls vorhanden) der Sammlung zeigt. |
| [begin](./begin/)() const | Gibt den Iterator zurück, der auf das erste Element (falls vorhanden) der const‑qualifizierten Instanz der Sammlung zeigt. |
| [cbegin](./cbegin/)() const | Gibt den Iterator zurück, der auf das erste const‑qualifizierte Element (falls vorhanden) der Sammlung zeigt. |
| [cend](./cend/)() const | Gibt den Iterator zurück, der direkt nach dem letzten const‑qualifizierten Element (falls vorhanden) der Sammlung zeigt. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | Gibt einen Iterator zurück, der direkt nach dem letzten Element (falls vorhanden) der Sammlung zeigt. |
| [end](./end/)() const | Gibt einen Iterator zurück, der direkt nach dem letzten Element (falls vorhanden) der const‑qualifizierten Instanz der Sammlung zeigt. |
| [get_Count](./get_count/)() | Gibt die Anzahl der Kindelemente zurück. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | Implementierung des [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/) Interfaces. |
| [idx_get](./idx_get/)(int32_t) | Stellt Zugriff auf die Kindelemente des Elements über den Index *i* . |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Gibt einen Iterator zurück, der auf das erste Element (falls vorhanden) der const‑qualifizierten Instanz der Sammlung zeigt. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Gibt den Iterator zurück, der auf das erste Element (falls vorhanden) der Sammlung zeigt. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Gibt einen Iterator zurück, der direkt nach dem letzten Element (falls vorhanden) der const‑qualifizierten Instanz der Sammlung zeigt. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Gibt einen Iterator zurück, der direkt nach dem letzten Element (falls vorhanden) der Sammlung zeigt. |
## Typedefs

| Typedef | Beschreibung |
| --- | --- |
| [const_iterator](./const_iterator/) | Konstanter Iterator-Typ. |
| [iterator](./iterator/) | Iterator-Typ. |
| [iterator_holder_type](./iterator_holder_type/) | Ein Sammlungstyp, dessen Iterator‑Typen als Iterator‑Typen in der aktuellen Sammlung verwendet werden. |
| [virtualized_iterator](./virtualized_iterator/) | Virtualisierter Typ. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Virtualisierter Elementtyp. |
## Siehe auch

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
