---
title: "System::Collections::Generic::ValueIterator क्लास"
linktitle: "ValueIterator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::ValueIterator क्लास। Dictionary इटरेटर जो C++ में वैल्यू एक्सेस प्रदान करता है।"
type: docs
weight: 4800
url: /hi/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
```


| पैरामीटर | विवरण |
| --- | --- |
| Dict | [Dictionary](../dictionary/) क्लास। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | वर्तमान इटरेटर की क्लोन बनाता है। |
| [DecrementIterator](./decrementiterator/)() override | इटररेटर को एक कदम पीछे ले जाता है। |
| [IncrementIterator](./incrementiterator/)() override | इटररेटर को एक कदम आगे ले जाता है। |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | इटररेटर को निर्दिष्ट संख्या में कदमों द्वारा ले जाता है। |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | निर्माता। |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | निर्माता। |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | मूव कंस्ट्रक्टर। |
| virtual [~ValueIterator](./~valueiterator/)() | डिस्ट्रक्टर। |

## संबंधित देखें

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
