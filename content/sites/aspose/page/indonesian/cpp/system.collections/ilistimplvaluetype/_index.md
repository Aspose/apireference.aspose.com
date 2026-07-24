---
title: "System::Collections::IListImplValueType kelas"
linktitle: "IListImplValueType"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::IListImplValueType kelas. Stub yang mengimplementasikan antarmuka System::Collections::IList pada objek System::Collections::Generic::List. Implementasi untuk tipe nilai dalam C++."
type: docs
weight: 1200
url: /id/cpp/system.collections/ilistimplvaluetype/
---
## IListImplValueType class


Stub yang mengimplementasikan antarmuka [System::Collections::IList](../ilist/) pada objek [System::Collections::Generic::List](../../system.collections.generic/list/). Implementasi untuk tipe nilai.

```cpp
template<typename T>class IListImplValueType : public virtual System::Collections::IList
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Menambahkan elemen ke akhir daftar. |
| [Clear](./clear/)() override | Menghapus semua elemen. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Memeriksa apakah item ada dalam daftar. |
| [get_Count](./get_count/)() const override | Implementasi metode [ICollection.get_Count()](../icollection/get_count/) Mendapatkan jumlah elemen dalam koleksi. |
| [GetEnumerator](./getenumerator/)() override | Implementasi [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) Mengembalikan enumerator yang mengiterasi koleksi. |
| [idx_get](./idx_get/)(int, int) const override | Mendapatkan elemen pada indeks yang ditentukan. |
| [IListImplValueType](./ilistimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IList\<T\>\>) | Membuat instance objek baru. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Mendapatkan indeks kemunculan pertama item dalam kontainer. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Menyisipkan elemen ke posisi yang ditentukan, menggeser elemen lain. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Menghapus instansi pertama item tertentu dari daftar. |
| [RemoveAt](./removeat/)(int) override | Menghapus item pada posisi yang ditentukan. |
## Lihat Juga

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
