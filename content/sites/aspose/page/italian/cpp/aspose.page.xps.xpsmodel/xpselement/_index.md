---
title: "Aspose::Page::XPS::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsModel::XpsElement class. Classe che incapsula le funzionalità comuni degli elementi XPS in C++."
type: docs
weight: 900
url: /it/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


Classe che incapsula le funzionalità comuni degli elementi [XPS](../../aspose.page.xps/).

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [begin](./begin/)() | Restituisce l'iteratore che punta al primo elemento (se presente) della collezione. |
| [begin](./begin/)() const | Restituisce l'iteratore che punta al primo elemento (se presente) dell'istanza costante qualificata della collezione. |
| [cbegin](./cbegin/)() const | Restituisce l'iteratore che punta al primo elemento costante qualificato (se presente) della collezione. |
| [cend](./cend/)() const | Restituisce l'iteratore che punta subito dopo l'ultimo elemento costante qualificato (se presente) della collezione. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | Restituisce l'iteratore che punta subito dopo l'ultimo elemento (se presente) della collezione. |
| [end](./end/)() const | Restituisce l'iteratore che punta subito dopo l'ultimo elemento (se presente) dell'istanza costante della collezione. |
| [get_Count](./get_count/)() | Restituisce il numero di elementi figli. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | Implementazione dell'interfaccia [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/). |
| [idx_get](./idx_get/)(int32_t) | Fornisce l'accesso ai figli dell'elemento tramite l'indice *i*. |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Restituisce l'iteratore che punta al primo elemento (se presente) dell'istanza costante della collezione. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Restituisce l'iteratore che punta al primo elemento (se presente) della collezione. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Restituisce l'iteratore che punta subito dopo l'ultimo elemento (se presente) dell'istanza costante della collezione. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Restituisce l'iteratore che punta subito dopo l'ultimo elemento (se presente) della collezione. |
## Typedefs

| Typedef | Descrizione |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipo di iteratore const. |
| [iterator](./iterator/) | Tipo di iteratore. |
| [iterator_holder_type](./iterator_holder_type/) | Un tipo di collezione il cui tipo di iteratore è usato come tipo di iteratore nella collezione corrente. |
| [virtualized_iterator](./virtualized_iterator/) | Tipo virtualizzato. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Tipo di elemento virtualizzato. |
## Vedi anche

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
