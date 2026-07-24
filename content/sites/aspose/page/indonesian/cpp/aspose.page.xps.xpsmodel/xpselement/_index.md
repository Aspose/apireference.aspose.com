---
title: "Aspose::Page::XPS::XpsElement class"
linktitle: "XpsElement"
second_title: "Aspose.Page untuk C++"
description: "Aspose::Page::XPS::XpsModel::XpsElement class. Kelas yang menginkapsulasi fitur umum elemen XPS dalam C++."
type: docs
weight: 900
url: /id/cpp/aspose.page.xps.xpsmodel/xpselement/
---
## XpsElement class


Kelas yang menginkapsulasi fitur umum elemen [XPS](../../aspose.page.xps/).

```cpp
class XpsElement : public Aspose::Page::XPS::XpsModel::XpsObject,
                   public System::Collections::Generic::IEnumerable<System::SharedPtr<XpsContentElement>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [begin](./begin/)() | Mendapatkan iterator yang menunjuk ke elemen pertama (jika ada) dari koleksi. |
| [begin](./begin/)() const | Mendapatkan iterator yang menunjuk ke elemen pertama (jika ada) dari instance koleksi yang dikualifikasi const. |
| [cbegin](./cbegin/)() const | Mendapatkan iterator yang menunjuk ke elemen pertama yang dikualifikasi const (jika ada) dari koleksi. |
| [cend](./cend/)() const | Mendapatkan iterator yang menunjuk tepat setelah elemen terakhir yang dikualifikasi const (jika ada) dari koleksi. |
| [cpp_set_parent_shared](./cpp_set_parent_shared/)() |  |
| [cpp_set_parent_weak](./cpp_set_parent_weak/)() |  |
| [end](./end/)() | Mendapatkan iterator yang menunjuk tepat setelah elemen terakhir (jika ada) dari koleksi. |
| [end](./end/)() const | Mendapatkan iterator yang menunjuk tepat setelah elemen terakhir (jika ada) dari instance koleksi yang bersifat const. |
| [get_Count](./get_count/)() | Mengembalikan jumlah elemen anak. |
| [get_Parent](./get_parent/)() const |  |
| [GetEnumerator](./getenumerator/)() override | Implementasi antarmuka [System::Collections::Generic::IEnumerable<XpsContentElement>](../../system.collections.generic/ienumerable/). |
| [idx_get](./idx_get/)(int32_t) | Menyediakan akses ke anak elemen melalui indeks *i*. |
| [set_Parent](./set_parent/)(System::SharedPtr\<XpsElement\>) |  |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan iterator yang menunjuk ke elemen pertama (jika ada) dari instance koleksi yang bersifat const. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan iterator yang menunjuk ke elemen pertama (jika ada) dari koleksi. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan iterator yang menunjuk tepat setelah elemen terakhir (jika ada) dari instance koleksi yang bersifat const. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan iterator yang menunjuk tepat setelah elemen terakhir (jika ada) dari koleksi. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [iterator](./iterator/) | Tipe iterator. |
| [iterator_holder_type](./iterator_holder_type/) | Tipe koleksi yang tipe iteratornya digunakan sebagai tipe iterator dalam koleksi saat ini. |
| [virtualized_iterator](./virtualized_iterator/) | Tipe yang di-virtualisasi. |
| [virtualized_iterator_element](./virtualized_iterator_element/) | Tipe elemen yang di-virtualisasi. |
## Lihat Juga

* Class [XpsObject](../xpsobject/)
* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
