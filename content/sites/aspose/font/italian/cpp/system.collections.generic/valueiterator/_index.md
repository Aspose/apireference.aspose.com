---
title: "classe System::Collections::Generic::ValueIterator"
linktitle: "ValueIterator"
second_title: "Aspose.Font per C++"
description: "classe System::Collections::Generic::ValueIterator. Iteratore del dizionario che fornisce l'accesso ai valori in C++."
type: docs
weight: 4800
url: /it/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
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
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Sposta l'iteratore del numero specificato di passi. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Costruttore. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Costruttore. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | Costruttore di spostamento. |
| virtual [~ValueIterator](./~valueiterator/)() | Distruttore. |

## Vedi anche

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
