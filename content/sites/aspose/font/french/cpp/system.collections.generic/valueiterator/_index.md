---
title: "Classe System::Collections::Generic::ValueIterator"
linktitle: "ValueIterator"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::ValueIterator. Itérateur de dictionnaire qui fournit l'accès aux valeurs en C++."
type: docs
weight: 4800
url: /fr/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
```


| Paramètre | Description |
| --- | --- |
| Dict | classe [Dictionary](../dictionary/). |
## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clone l'itérateur actuel. |
| [DecrementIterator](./decrementiterator/)() override | Déplace l'itérateur d'un pas en arrière. |
| [IncrementIterator](./incrementiterator/)() override | Déplace l'itérateur d'un pas en avant. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Déplace l'itérateur du nombre de pas spécifié. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Constructeur. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Constructeur. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | Constructeur de déplacement. |
| virtual [~ValueIterator](./~valueiterator/)() | Destructeur. |

## Voir aussi

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
