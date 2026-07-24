---
title: "System::Collections::Generic::KeyIterator klasse"
linktitle: "KeyIterator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::KeyIterator klasse. Dictionary‑iterator die sleuteltoegang biedt in C++."
type: docs
weight: 2800
url: /nl/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
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
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Constructor. |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Constructor. |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | Move-constructor. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Verplaatst de iterator met het opgegeven aantal stappen. |
| virtual [~KeyIterator](./~keyiterator/)() | Destructor. |

## Zie ook

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
