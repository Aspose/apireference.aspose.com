---
title: "System::Collections::Generic::ValueIterator sınıfı"
linktitle: "ValueIterator"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::ValueIterator sınıfı. C++'ta değer erişimi sağlayan sözlük yineleyicisi."
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


| Parameter | Açıklama |
| --- | --- |
| Dict | [Dictionary](../dictionary/) sınıfı. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mevcut yineleyiciyi kopyalar. |
| [DecrementIterator](./decrementiterator/)() override | Yineleyiciyi bir adım geri hareket ettirir. |
| [IncrementIterator](./incrementiterator/)() override | Yineleyiciyi bir adım ileri hareket ettirir. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Yineleyiciyi belirtilen adım sayısı kadar hareket ettirir. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Yapıcı. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Yapıcı. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | Taşıma kurucusu. |
| virtual [~ValueIterator](./~valueiterator/)() | Yıkıcı. |

## Ayrıca Bakınız

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
