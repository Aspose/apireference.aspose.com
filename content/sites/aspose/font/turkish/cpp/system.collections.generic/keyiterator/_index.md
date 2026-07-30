---
title: "System::Collections::Generic::KeyIterator sınıfı"
linktitle: "KeyIterator"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::KeyIterator sınıfı. C++'ta anahtar erişimi sağlayan sözlük yineleyicisi."
type: docs
weight: 2800
url: /tr/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
```


| Parametre | Açıklama |
| --- | --- |
| Dict | [Dictionary](../dictionary/) sınıfı. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi klonlar. |
| [DecrementIterator](./decrementiterator/)() override | Yineleyiciyi bir adım geriye hareket ettirir. |
| [IncrementIterator](./incrementiterator/)() override | Yineleyiciyi bir adım ileri hareket ettirir. |
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Yapıcı. |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Yapıcı. |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | Taşıma kurucusu. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Yineleyiciyi belirtilen adım sayısı kadar hareket ettirir. |
| virtual [~KeyIterator](./~keyiterator/)() | Yıkıcı. |

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
