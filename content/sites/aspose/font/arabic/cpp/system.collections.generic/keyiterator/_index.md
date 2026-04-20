---
title: "فئة System::Collections::Generic::KeyIterator"
linktitle: "KeyIterator"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::KeyIterator. مكرّر القاموس الذي يوفر وصولًا إلى المفاتيح في C++."
type: docs
weight: 2800
url: /ar/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
```


| معامل | الوصف |
| --- | --- |
| Dict | فئة [Dictionary](../dictionary/). |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المكرِّر الحالي. |
| [DecrementIterator](./decrementiterator/)() override | يحرك المكرّر خطوة إلى الخلف. |
| [IncrementIterator](./incrementiterator/)() override | يحرك المكرّر خطوة إلى الأمام. |
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | المُنشئ. |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | المُنشئ. |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | منشئ نقل. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | يحرك المكرّر بعدد الخطوات المحدد. |
| virtual [~KeyIterator](./~keyiterator/)() | المدمر. |

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
