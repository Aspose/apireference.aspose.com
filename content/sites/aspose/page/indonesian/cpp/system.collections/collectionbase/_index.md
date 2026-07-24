---
title: "System::Collections::CollectionBase kelas"
linktitle: "CollectionBase"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::CollectionBase kelas. Menyediakan kelas dasar abstrak untuk koleksi bertipe kuat dalam C++."
type: docs
weight: 300
url: /id/cpp/system.collections/collectionbase/
---
## CollectionBase class


Menyediakan kelas dasar abstrak untuk koleksi yang bertipe kuat.

```cpp
template<typename T>class CollectionBase : public virtual System::Collections::Generic::IEnumerable<T>
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe elemen koleksi |
## Nested classes

* Class [ListImpl](./listimpl/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Clear](./clear/)() | Menghapus semua objek dari instance koleksi. Metode ini tidak dapat ditimpa. |
| [get_Capacity](./get_capacity/)() | Mengembalikan jumlah elemen yang dapat ditampung oleh koleksi. |
| [get_Count](./get_count/)() | Mengembalikan jumlah elemen yang terdapat dalam instance koleksi. Metode ini tidak dapat ditimpa. |
| [GetEnumerator](./getenumerator/)() override | Mengembalikan enumerator yang mengiterasi instance koleksi. |
| [RemoveAt](./removeat/)(int32_t) | Menghapus elemen pada indeks yang ditentukan dari instance koleksi. Metode ini tidak dapat ditimpa. |
| [set_Capacity](./set_capacity/)(int32_t) | Mengatur jumlah elemen yang dapat ditampung oleh koleksi. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | Atur argumen templat ke‑n menjadi pointer lemah (bukan berbagi). Memungkinkan penggantian pointer dalam kontainer ke mode lemah. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |

## Lihat Juga

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
