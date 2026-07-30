---
title: "System::Collections::Generic::ValueIterator Klasse"
linktitle: "ValueIterator"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::ValueIterator Klasse. Dictionary-Iterator, der in C++ den Zugriff auf Werte bereitstellt."
type: docs
weight: 4800
url: /de/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
```


| Parameter | Beschreibung |
| --- | --- |
| Dict | [Dictionary](../dictionary/) Klasse. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Klonen des aktuellen Iterators. |
| [DecrementIterator](./decrementiterator/)() override | Bewegt den Iterator einen Schritt zurück. |
| [IncrementIterator](./incrementiterator/)() override | Bewegt den Iterator einen Schritt vorwärts. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Bewegt den Iterator um die angegebene Anzahl von Schritten. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Konstruktor. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Konstruktor. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | Move-Konstruktor. |
| virtual [~ValueIterator](./~valueiterator/)() | Destruktor. |

## Siehe auch

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
