---
title: "System::Collections::Generic::EnumeratorWrapperIterator Klasse"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Font für C++"
description: "System::Collections::Generic::EnumeratorWrapperIterator Klasse. Iterator, der den vorab erstellten Enumerator umschließt und alle Aufrufe in C++ an ihn weiterleitet."
type: docs
weight: 1500
url: /de/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Iterator, der den vorab erstellten Enumerator kapselt und alle Aufrufe an ihn weiterleitet.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Parameter | Beschreibung |
| --- | --- |
| Element | Elementtyp. |
## Methoden

| Methode | Beschreibung |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Klonen des aktuellen Iterators. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Bewegt den Iterator einen Schritt vorwärts. Muss m_is_end und m_pointer aktualisieren. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | Prüft, ob zwei Iteratoren auf dasselbe Element zeigen. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Destruktor. |

## Siehe auch

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
