---
title: "System::Collections::Generic::KeyIterator क्लास"
linktitle: "KeyIterator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::KeyIterator क्लास। Dictionary इटररेटर जो C++ में कुंजी पहुंच प्रदान करता है।"
type: docs
weight: 2800
url: /hi/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
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
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | निर्माता। |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | निर्माता। |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | मूव कंस्ट्रक्टर। |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | इटररेटर को निर्दिष्ट संख्या में कदमों द्वारा ले जाता है। |
| virtual [~KeyIterator](./~keyiterator/)() | डिस्ट्रक्टर। |

## संबंधित देखें

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
