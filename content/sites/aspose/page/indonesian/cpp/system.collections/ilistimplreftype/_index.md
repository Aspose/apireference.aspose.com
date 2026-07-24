---
title: "Kelas System::Collections::IListImplRefType"
linktitle: "IListImplRefType"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::IListImplRefType. Stub yang mengimplementasikan antarmuka System::Collections::IList pada objek System::Collections::Generic::List. Implementasi untuk tipe referensi dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.collections/ilistimplreftype/
---
## IListImplRefType class


Stub yang mengimplementasikan antarmuka [System::Collections::IList](../ilist/) pada objek [System::Collections::Generic::List](../../system.collections.generic/list/) Implementasi untuk tipe referensi.

```cpp
template<typename T>class IListImplRefType : public virtual System::Collections::IList
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(SharedPtr\<System::Object\>) override | Menambahkan elemen ke akhir daftar. |
| static [BoxValue](./boxvalue/)(System::SharedPtr\<T\>) | Mengonversi referensi tipe menjadi nilai objek menjadi objek. |
| [Clear](./clear/)() override | Menghapus semua elemen. |
| [Contains](./contains/)(SharedPtr\<System::Object\>) const override | Memeriksa apakah item ada dalam daftar. |
| [get_Count](./get_count/)() const override | Implementasi metode [ICollection.get_Count()](../icollection/get_count/) Mendapatkan jumlah elemen dalam koleksi. |
| [GetEnumerator](./getenumerator/)() override | Implementasi [IEnumerable.GetEnumerator()](../ienumerable/getenumerator/) Mengembalikan enumerator yang mengiterasi koleksi. |
| [idx_get](./idx_get/)(int, int) const override | Mendapatkan elemen pada indeks yang ditentukan. |
| [IListImplRefType](./ilistimplreftype/)(System::SharedPtr\<System::Collections::Generic::List\<System::SharedPtr\<T\>\>\>) | Membuat instance objek baru. |
| [IndexOf](./indexof/)(System::SharedPtr\<System::Object\>) const override | Mendapatkan indeks kemunculan pertama item dalam kontainer. |
| [Insert](./insert/)(int, System::SharedPtr\<System::Object\>) override | Menyisipkan elemen ke posisi yang ditentukan, menggeser elemen lain. |
| [Remove](./remove/)(SharedPtr\<System::Object\>) override | Menghapus instansi pertama item tertentu dari daftar. |
| [RemoveAt](./removeat/)(int) override | Menghapus item pada posisi yang ditentukan. |
| static [UnboxValue](./unboxvalue/)(System::SharedPtr\<System::Object\>) | Mengonversi nilai objek menjadi referensi tipe tertentu. |
## Lihat Juga

* Class [IList](../ilist/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
