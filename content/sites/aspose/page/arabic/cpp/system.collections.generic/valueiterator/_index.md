---
title: "فئة System::Collections::Generic::ValueIterator"
linktitle: "ValueIterator"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Collections::Generic::ValueIterator. مكرّر القاموس الذي يوفر الوصول إلى القيمة في C++."
type: docs
weight: 4800
url: /ar/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
```


| Parameter | الوصف |
| --- | --- |
| Dict | الفئة [Dictionary](../dictionary/). |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المتكرر الحالي. |
| [DecrementIterator](./decrementiterator/)() override | يحرك المكرّر خطوة إلى الخلف. |
| [IncrementIterator](./incrementiterator/)() override | يحرك المكرّر خطوة إلى الأمام. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | يحرك المكرّر بعدد الخطوات المحددة. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | منشئ. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | منشئ. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | منشئ نقل. |
| virtual [~ValueIterator](./~valueiterator/)() | المدمر. |

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
