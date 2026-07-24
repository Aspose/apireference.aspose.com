---
title: "Kelas System::Collections::Generic::DictionaryIterator"
linktitle: "DictionaryIterator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::DictionaryIterator. Iterator kamus yang menyediakan notasi KeyValuePair dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.collections.generic/dictionaryiterator/
---
## DictionaryIterator class


[Dictionary](../dictionary/) iterator that provides [KeyValuePair](../keyvaluepair/) notation.

```cpp
template<typename Dict>class DictionaryIterator : public System::Details::NativeIteratorWrapperBase<Dict::KeyValuePairType, Dict::map_t::const_iterator>,
                                                  private System::Details::IteratorPointerUpdater<Dict::KeyValuePairType, false>
```


| Parameter | Deskripsi |
| --- | --- |
| Dict | Kelas [Dictionary](../dictionary/). |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mengkloning iterator saat ini. |
| [DecrementIterator](./decrementiterator/)() override | Memindahkan iterator satu langkah mundur. |
| [DictionaryIterator](./dictionaryiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Konstruktor. |
| [DictionaryIterator](./dictionaryiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Konstruktor. |
| [DictionaryIterator](./dictionaryiterator/)(DictionaryIterator\&&) | Konstruktor pemindahan. |
| [IncrementIterator](./incrementiterator/)() override | Memindahkan iterator satu langkah maju. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Memindahkan iterator sebanyak jumlah langkah yang ditentukan. |
| virtual [~DictionaryIterator](./~dictionaryiterator/)() | Destruktor. |

## Lihat Juga

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
