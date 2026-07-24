---
title: "System::Collections::Generic::ValueIterator klasse"
linktitle: "ValueIterator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::ValueIterator klasse. Dictionary‑iterator die toegang tot waarden biedt in C++."
type: docs
weight: 4800
url: /nl/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
```


| Parameter | Beschrijving |
| --- | --- |
| Dict | [Dictionary](../dictionary/) klasse. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Kloont de huidige iterator. |
| [DecrementIterator](./decrementiterator/)() override | Verplaatst de iterator één stap terug. |
| [IncrementIterator](./incrementiterator/)() override | Verplaatst de iterator één stap vooruit. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Verplaatst de iterator met het opgegeven aantal stappen. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Constructor. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Constructor. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | Move-constructor. |
| virtual [~ValueIterator](./~valueiterator/)() | Destructor. |

## Zie ook

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
