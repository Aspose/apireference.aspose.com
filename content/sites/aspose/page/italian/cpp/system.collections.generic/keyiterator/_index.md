---
title: "Classe System::Collections::Generic::KeyIterator"
linktitle: "KeyIterator"
second_title: "Aspose.Page per C++"
description: "Classe System::Collections::Generic::KeyIterator. Iteratore del dizionario che fornisce l'accesso alle chiavi in C++."
type: docs
weight: 2800
url: /it/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
```


| Parametro | Descrizione |
| --- | --- |
| Dict | Classe [Dictionary](../dictionary/). |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona l'iteratore corrente. |
| [DecrementIterator](./decrementiterator/)() override | Sposta l'iteratore di un passo indietro. |
| [IncrementIterator](./incrementiterator/)() override | Sposta l'iteratore di un passo avanti. |
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Costruttore. |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Costruttore. |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | Costruttore di spostamento. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Sposta l'iteratore del numero specificato di passi. |
| virtual [~KeyIterator](./~keyiterator/)() | Distruttore. |

## Vedi anche

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
