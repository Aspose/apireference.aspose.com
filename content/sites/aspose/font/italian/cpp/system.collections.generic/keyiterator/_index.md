---
title: "System::Collections::Generic::KeyIterator classe"
linktitle: "KeyIterator"
second_title: "Aspose.Font per C++"
description: "System::Collections::Generic::KeyIterator classe. Iteratore del dizionario che fornisce l'accesso alle chiavi in C++."
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
| Dict | [Dictionary](../dictionary/) classe. |
## Metodi

| Metodo | Descrizione |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Clona l'iteratore corrente. |
| [DecrementIterator](./decrementiterator/)() override | Sposta l'iteratore indietro di un passo. |
| [IncrementIterator](./incrementiterator/)() override | Sposta l'iteratore avanti di un passo. |
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Costruttore. |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Costruttore. |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | Costruttore di spostamento. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Sposta l'iteratore del numero specificato di passi. |
| virtual [~KeyIterator](./~keyiterator/)() | Distruttore. |

## Vedi anche

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
