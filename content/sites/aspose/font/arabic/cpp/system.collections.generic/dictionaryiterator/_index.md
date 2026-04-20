---
title: "فئة System::Collections::Generic::DictionaryIterator"
linktitle: "DictionaryIterator"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::Generic::DictionaryIterator. مكرّر القاموس الذي يوفر تدوين KeyValuePair في C++."
type: docs
weight: 1200
url: /ar/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| معامل | الوصف |
| --- | --- |
| Dict | فئة [Dictionary](../dictionary/). |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المكرِّر الحالي. |
| [DecrementIterator](./decrementiterator/)() override | يحرك المكرّر خطوة إلى الخلف. |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | المُنشئ. |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | المُنشئ. |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | منشئ نقل. |
| [IncrementIterator](./incrementiterator/)() override | يحرك المكرّر خطوة إلى الأمام. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | يحرك المكرّر بعدد الخطوات المحدد. |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | المدمر. |

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
