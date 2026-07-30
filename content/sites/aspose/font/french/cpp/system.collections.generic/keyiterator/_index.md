---
title: "classe System::Collections::Generic::KeyIterator"
linktitle: "KeyIterator"
second_title: "Aspose.Font pour C++"
description: "classe System::Collections::Generic::KeyIterator. Itérateur de dictionnaire qui fournit l'accès aux clés en C++."
type: docs
weight: 2800
url: /fr/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
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
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Constructeur. |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Constructeur. |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | Constructeur de déplacement. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Déplace l'itérateur du nombre de pas spécifié. |
| virtual [~KeyIterator](./~keyiterator/)() | Destructeur. |

## Voir aussi

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
