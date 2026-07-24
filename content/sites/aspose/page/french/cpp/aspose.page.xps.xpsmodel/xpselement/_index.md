---
title: "Aspose::Page::XPS::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page pour C++"
description: "Aspose::Page::XPS::XpsElement class. Classe encapsulant les fonctionnalités communes des éléments XPS en C++."
type: docs
weight: 900
url: /fr/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


Classe encapsulant les fonctionnalités communes des éléments [XPS](../../aspose.page.xps/).

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [begin](./begin/)() | Obtient l'itérateur pointant vers le premier élément (le cas échéant) de la collection. |
| [begin](./begin/)() const | Obtient l'itérateur pointant vers le premier élément (le cas échéant) de l'instance const-qualifiée de la collection. |
| [cbegin](./cbegin/)() const | Obtient l'itérateur pointant vers le premier élément const-qualifié (le cas échéant) de la collection. |
| [cend](./cend/)() const | Obtient l'itérateur pointant juste après le dernier élément const-qualifié (le cas échéant) de la collection. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | Obtient l'itérateur pointant juste après le dernier élément (le cas échéant) de la collection. |
| [end](./end/)() const | Obtient l'itérateur pointant juste après le dernier élément (le cas échéant) de l'instance const-qualifiée de la collection. |
| [get_Count](./get_count/)() | Renvoie le nombre d'éléments enfants. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | Implémentation de l'interface [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/). |
| [idx_get](./idx_get/)(int32_t) | Fournit l'accès aux enfants de l'élément par l'index *i*. |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Obtient l'itérateur pointant vers le premier élément (le cas échéant) de l'instance const-qualifiée de la collection. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Obtient l'itérateur pointant vers le premier élément (le cas échéant) de la collection. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Obtient l'itérateur pointant juste après le dernier élément (le cas échéant) de l'instance const-qualifiée de la collection. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Obtient l'itérateur pointant juste après le dernier élément (le cas échéant) de la collection. |
## Typedefs

| Typedef | Description |
| --- | --- |
| [const_iterator](./const_iterator/) | Type d'itérateur constant. |
| [iterator](./iterator/) | Type d'itérateur. |
| [iterator_holder_type](./iterator_holder_type/) | Un type de collection dont les types d'itérateur sont utilisés comme types d'itérateur dans la collection actuelle. |
| [virtualized_iterator](./virtualized_iterator/) | Type virtualisé. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Type d'élément virtualisé. |
## Voir aussi

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
