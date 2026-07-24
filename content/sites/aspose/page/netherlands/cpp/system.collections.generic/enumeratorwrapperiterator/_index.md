---
title: "System::Collections::Generic::EnumeratorWrapperIterator klasse"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Page voor C++"
description: "System::Collections::Generic::EnumeratorWrapperIterator klasse. Iterator die de vooraf aangemaakte enumerator omsluit en alle oproepen ernaar doorstuurt in C++."
type: docs
weight: 1500
url: /nl/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Iterator die de vooraf gemaakte enumerator omsluit en alle aanroepen ernaar doorstuurt.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Parameter | Beschrijving |
| --- | --- |
| Element | Elementtype. |
## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Kloont de huidige iterator. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Verplaatst de iterator één stap vooruit. Moet m_is_end en m_pointer bijwerken. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | Controleert of twee iterators naar hetzelfde item wijzen. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Destructor. |

## Zie ook

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
