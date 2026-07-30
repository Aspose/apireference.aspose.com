---
title: "Classe System::Collections::Generic::DictionaryIterator"
linktitle: "DictionaryIterator"
second_title: "Aspose.Font pour C++"
description: "Classe System::Collections::Generic::DictionaryIterator. Itérateur de dictionnaire qui fournit la notation KeyValuePair en C++."
type: docs
weight: 1200
url: /fr/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| Paramètre | Description |
| --- | --- |
| Dict | classe [Dictionary](../dictionary/). |
## Méthodes

| Méthode | Description |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clone l'itérateur actuel. |
| [DecrementIterator](./decrementiterator/)() override | Déplace l'itérateur d'un pas en arrière. |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Constructeur. |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Constructeur. |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | Constructeur de déplacement. |
| [IncrementIterator](./incrementiterator/)() override | Déplace l'itérateur d'un pas en avant. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Déplace l'itérateur du nombre de pas spécifié. |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | Destructeur. |

## Voir aussi

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
