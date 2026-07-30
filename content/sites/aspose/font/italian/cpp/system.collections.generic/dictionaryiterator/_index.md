---
title: "classe System::Collections::Generic::DictionaryIterator"
linktitle: "DictionaryIterator"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::DictionaryIterator. Iteratore di dizionario che fornisce la notazione KeyValuePair in C++."
type: docs
weight: 1200
url: /it/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| Parametro | Descrizione |
| --- | --- |
| Dict | [Dictionary](../dictionary/) classe. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona l'iteratore corrente. |
| [DecrementIterator](./decrementiterator/)() override | Sposta l'iteratore indietro di un passo. |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Costruttore. |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Costruttore. |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | Costruttore di spostamento. |
| [IncrementIterator](./incrementiterator/)() override | Sposta l'iteratore avanti di un passo. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Sposta l'iteratore del numero specificato di passi. |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | Distruttore. |

## Vedi anche

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
