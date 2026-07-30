---
title: "System::Collections::Generic::DictionaryIterator sınıfı"
linktitle: "DictionaryIterator"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::DictionaryIterator sınıfı. C++'da KeyValuePair gösterimi sağlayan sözlük yineleyicisi."
type: docs
weight: 1200
url: /tr/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| Parametre | Açıklama |
| --- | --- |
| Dict | [Dictionary](../dictionary/) sınıfı. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi klonlar. |
| [DecrementIterator](./decrementiterator/)() override | Yineleyiciyi bir adım geriye hareket ettirir. |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Yapıcı. |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Yapıcı. |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | Taşıma kurucusu. |
| [IncrementIterator](./incrementiterator/)() override | Yineleyiciyi bir adım ileri hareket ettirir. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Yineleyiciyi belirtilen adım sayısı kadar hareket ettirir. |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | Yıkıcı. |

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
