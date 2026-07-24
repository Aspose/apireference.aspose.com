---
title: "Kelas System::Collections::Specialized::StringCollection"
linktitle: "StringCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Specialized::StringCollection. Daftar terindeks berisi string. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 300
url: /id/cpp/system.collections.specialized/stringcollection/
---
## StringCollection class


Daftar terindeks berisi string. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class StringCollection : public System::Collections::Generic::IEnumerable<System::String>
```

## Nested classes

* Class [Enumerator](./enumerator/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const System::String\&) | Menambahkan nilai ke akhir daftar. |
| [AddRange](./addrange/)(const ArrayPtr\<System::String\>\&) | Menambahkan elemen ke dalam kontainer. |
| [begin](./begin/)() | Mengembalikan iterator ke elemen pertama dari kontainer. Jika kontainer kosong, iterator yang dikembalikan akan sama dengan [end()](./end/). |
| [begin](./begin/)() const | Mengembalikan iterator ke elemen pertama dari kontainer yang dikualifikasi const. Jika kontainer kosong, iterator yang dikembalikan akan sama dengan [end()](./end/). |
| [cbegin](./cbegin/)() const | Mengembalikan iterator ke elemen pertama yang dikualifikasi const dari kontainer. Jika kontainer kosong, iterator yang dikembalikan akan sama dengan [cend()](./cend/). |
| [cend](./cend/)() const | Mengembalikan iterator ke elemen yang mengikuti elemen terakhir dari kontainer. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya akan menghasilkan perilaku tidak terdefinisi. |
| [Clear](./clear/)() | Menghapus semua elemen. |
| [Contains](./contains/)(const System::String\&) const | Memeriksa apakah string tertentu ada di dalam kontainer. |
| [CopyTo](./copyto/)(const ArrayPtr\<System::String\>\&, const int32_t) const | Menyalin elemen ke elemen array yang ada. |
| [crbegin](./crbegin/)() const | Mengembalikan reverse iterator ke elemen pertama dari kontainer terbalik. Ini sesuai dengan elemen terakhir dari kontainer yang tidak terbalik. Jika kontainer kosong, iterator yang dikembalikan sama dengan [crend()](./crend/). |
| [crend](./crend/)() const | Mengembalikan reverse iterator ke elemen yang mengikuti elemen terakhir dari kontainer terbalik. Ini sesuai dengan elemen yang mendahului elemen pertama dari kontainer yang tidak terbalik. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya menghasilkan perilaku tidak terdefinisi. |
| [data](./data/)() | Aksesor struktur data internal. |
| [data](./data/)() const | Aksesor struktur data internal. |
| [end](./end/)() | Mengembalikan iterator ke elemen yang mengikuti elemen terakhir dari kontainer. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya akan menghasilkan perilaku tidak terdefinisi. |
| [end](./end/)() const | Mengembalikan iterator ke elemen yang mengikuti elemen terakhir dari kontainer yang dikualifikasi const. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya akan menghasilkan perilaku tidak terdefinisi. |
| [get_Count](./get_count/)() const | Mendapatkan jumlah elemen dalam koleksi. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator yang mengiterasi melalui koleksi saat ini. |
| [idx_get](./idx_get/)(int) const | Mendapatkan nilai pada posisi yang ditentukan. |
| [idx_set](./idx_set/)(int, const System::String\&) | Menetapkan nilai pada posisi yang ditentukan. |
| [IndexOf](./indexof/)(const System::String\&) const | Mencari string tertentu dalam kontainer. |
| [Insert](./insert/)(int, const System::String\&) | Menyisipkan nilai tertentu ke dalam kontainer. |
| [operator[]](./operator[]/)(int) | Fungsi accessor. |
| [rbegin](./rbegin/)() | Mengembalikan iterator terbalik ke elemen pertama dari kontainer yang dibalik. Ini sesuai dengan elemen terakhir dari kontainer yang tidak dibalik. Jika kontainer kosong, iterator yang dikembalikan sama dengan [rend()](./rend/). |
| [rbegin](./rbegin/)() const | Mengembalikan iterator terbalik ke elemen pertama dari kontainer yang dibalik. Ini sesuai dengan elemen terakhir dari kontainer yang tidak dibalik. Jika kontainer kosong, iterator yang dikembalikan sama dengan [rend()](./rend/). |
| [Remove](./remove/)(const System::String\&) | Menghapus kemunculan pertama dari string yang ditentukan. |
| [RemoveAt](./removeat/)(int) | Menghapus elemen pada posisi yang ditentukan. |
| [rend](./rend/)() | Mengembalikan reverse iterator ke elemen yang mengikuti elemen terakhir dari kontainer terbalik. Ini sesuai dengan elemen yang mendahului elemen pertama dari kontainer yang tidak terbalik. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya menghasilkan perilaku tidak terdefinisi. |
| [rend](./rend/)() const | Mengembalikan reverse iterator ke elemen yang mengikuti elemen terakhir dari kontainer terbalik. Ini sesuai dengan elemen yang mendahului elemen pertama dari kontainer yang tidak terbalik. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya menghasilkan perilaku tidak terdefinisi. |
| [StringCollection](./stringcollection/)() | Membuat koleksi string kosong. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [const_reverse_iterator](./const_reverse_iterator/) | Tipe iterator terbalik konstan. |
| [iterator](./iterator/) | Tipe iterator. |
| [reverse_iterator](./reverse_iterator/) | Tipe iterator terbalik. |
## Lihat Juga

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
