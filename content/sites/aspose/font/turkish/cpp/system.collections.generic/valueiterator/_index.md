---
title: "System::Collections::Generic::ValueIterator sınıfı"
linktitle: "ValueIterator"
second_title: "Aspose.Font için C++"
description: "System::Collections::Generic::ValueIterator sınıfı. C++'da değer erişimi sağlayan sözlük yineleyicisi."
type: docs
weight: 4800
url: /tr/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
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
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Yineleyiciyi belirtilen adım sayısı kadar hareket ettirir. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Yapıcı. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Yapıcı. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | Taşıma kurucusu. |
| virtual [~ValueIterator](./~valueiterator/)() | Yıkıcı. |

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
