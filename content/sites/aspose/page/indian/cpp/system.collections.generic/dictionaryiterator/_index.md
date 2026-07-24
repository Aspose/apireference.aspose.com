---
title: "System::Collections::Generic::DictionaryIterator क्लास"
linktitle: "DictionaryIterator"
second_title: "Aspose.Page C++ के लिए"
description: "System::Collections::Generic::DictionaryIterator क्लास। वह डिक्शनरी इटरेटर जो C++ में KeyValuePair नोटेशन प्रदान करता है।"
type: docs
weight: 1200
url: /hi/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| पैरामीटर | विवरण |
| --- | --- |
| Dict | [Dictionary](../dictionary/) क्लास। |
## विधियाँ

| विधि | विवरण |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | वर्तमान इटरेटर की क्लोन बनाता है। |
| [DecrementIterator](./decrementiterator/)() override | इटररेटर को एक कदम पीछे ले जाता है। |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | निर्माता। |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | निर्माता। |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | मूव कंस्ट्रक्टर। |
| [IncrementIterator](./incrementiterator/)() override | इटररेटर को एक कदम आगे ले जाता है। |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | इटररेटर को निर्दिष्ट संख्या में कदमों द्वारा ले जाता है। |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | डिस्ट्रक्टर। |

## संबंधित देखें

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
