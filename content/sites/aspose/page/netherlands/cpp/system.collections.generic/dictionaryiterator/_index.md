---
title: "System::Collections::Generic::DictionaryIterator class"
linktitle: "DictionaryIterator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::DictionaryIterator class. Dictionary‑iterator die KeyValuePair-notatie biedt in C++."
type: docs
weight: 1200
url: /nl/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| Parameter | Beschrijving |
| --- | --- |
| Dict | [Dictionary](../dictionary/) klasse. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Kloont de huidige iterator. |
| [DecrementIterator](./decrementiterator/)() override | Verplaatst de iterator één stap terug. |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Constructor. |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Constructor. |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | Move-constructor. |
| [IncrementIterator](./incrementiterator/)() override | Verplaatst de iterator één stap vooruit. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Verplaatst de iterator met het opgegeven aantal stappen. |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | Destructor. |

## Zie ook

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
