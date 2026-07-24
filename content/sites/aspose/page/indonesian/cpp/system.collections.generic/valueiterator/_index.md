---
title: "Kelas System::Collections::Generic::ValueIterator"
linktitle: "ValueIterator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::ValueIterator. Iterator kamus yang menyediakan akses nilai dalam C++."
type: docs
weight: 4800
url: /id/cpp/system.collections.generic/valueiterator/
---
## ValueIterator class


[Dictionary](../dictionary/) iterator that provides value access.

```cpp
template<typename Dict>class ValueIterator : public System::Details::NativeIteratorWrapperBase<Dict::map_t::mapped_type, Dict::map_t::const_iterator>,
                                             private System::Details::IteratorPointerUpdater<Dict::map_t::mapped_type, false>
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
| [ShiftIteratorBy](./shiftiteratorby/)(std::ptrdiff_t) override | Memindahkan iterator sebanyak jumlah langkah yang ditentukan. |
| [ValueIterator](./valueiterator/)(typename Dict::map_t::const_iterator\&&, typename Dict::map_t::const_iterator\&&) | Konstruktor. |
| [ValueIterator](./valueiterator/)(const typename Dict::map_t::const_iterator\&, const typename Dict::map_t::const_iterator\&) | Konstruktor. |
| [ValueIterator](./valueiterator/)(ValueIterator\&&) | Konstruktor pemindahan. |
| virtual [~ValueIterator](./~valueiterator/)() | Destruktor. |

## Lihat Juga

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
