---
title: "System::Collections::Generic::DictionaryIterator Klasse"
linktitle: "DictionaryIterator"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::DictionaryIterator Klasse. Dictionary-Iterator, der die KeyValuePair-Notation in C++ bereitstellt."
type: docs
weight: 1200
url: /de/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| Parameter | Beschreibung |
| --- | --- |
| Dict | [Dictionary](../dictionary/) Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Klonen des aktuellen Iterators. |
| [DecrementIterator](./decrementiterator/)() override | Bewegt den Iterator einen Schritt zurück. |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Konstruktor. |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Konstruktor. |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | Move-Konstruktor. |
| [IncrementIterator](./incrementiterator/)() override | Bewegt den Iterator einen Schritt vorwärts. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Bewegt den Iterator um die angegebene Anzahl von Schritten. |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | Destruktor. |

## Siehe auch

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
