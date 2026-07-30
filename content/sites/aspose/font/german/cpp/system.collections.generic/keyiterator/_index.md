---
title: "System::Collections::Generic::KeyIterator Klasse"
linktitle: "KeyIterator"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::KeyIterator Klasse. Dictionary-Iterator, der Schlüsselzugriff in C++ bereitstellt."
type: docs
weight: 2800
url: /de/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
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
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Konstruktor. |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Konstruktor. |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | Move-Konstruktor. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Bewegt den Iterator um die angegebene Anzahl von Schritten. |
| virtual [~KeyIterator](./~keyiterator/)() | Destruktor. |

## Siehe auch

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
