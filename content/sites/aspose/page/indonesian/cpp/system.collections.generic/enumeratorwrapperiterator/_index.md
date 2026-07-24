---
title: "kelas System::Collections::Generic::EnumeratorWrapperIterator"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Generic::EnumeratorWrapperIterator. Iterator yang membungkus enumerator yang telah dibuat sebelumnya dan mengarahkan semua panggilan ke dalamnya dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


Iterator yang membungkus enumerator yang telah dibuat sebelumnya dan mengarahkan semua panggilan ke dalamnya.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Parameter | Deskripsi |
| --- | --- |
| Element | Tipe elemen. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | Mengkloning iterator saat ini. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | Memindahkan iterator satu langkah ke depan. Harus memperbarui m_is_end dan m_pointer. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | Memeriksa apakah dua iterator menunjuk ke item yang sama. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | Destruktor. |

## Lihat Juga

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
