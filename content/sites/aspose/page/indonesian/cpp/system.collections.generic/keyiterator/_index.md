---
title: "System::Collections::Generic::KeyIterator class"
linktitle: "KeyIterator"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::KeyIterator class. Iterator Dictionary yang menyediakan akses kunci dalam C++."
type: docs
weight: 2800
url: /id/cpp/system.collections.generic/keyiterator/
---
## KeyIterator class


[Dictionary](../dictionary/) iterator that provides key access.

```cpp
template<typename Dict>class KeyIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::key_type, Dict::map_t::const_iterator>,
                                           private System::Details::IteratorPointerUpdater<Dict::map_t::key_type, false>
```


| Parameter | Deskripsi |
| --- | --- |
| Dict | Kelas [Dictionary](../dictionary/). |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mengkloning iterator saat ini. |
| [DecrementIterator](./decrementiterator/)() override | Memindahkan iterator satu langkah mundur. |
| [IncrementIterator](./incrementiterator/)() override | Memindahkan iterator satu langkah maju. |
| [KeyIterator](./keyiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Konstruktor. |
| [KeyIterator](./keyiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Konstruktor. |
| [KeyIterator](./keyiterator/)(KeyIterator\&&) | Konstruktor pemindahan. |
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Memindahkan iterator sebanyak jumlah langkah yang ditentukan. |
| virtual [~KeyIterator](./~keyiterator/)() | Destruktor. |

## Lihat Juga

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
