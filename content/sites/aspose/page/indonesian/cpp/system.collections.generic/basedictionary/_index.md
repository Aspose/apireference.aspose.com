---
title: "System::Collections::Generic::BaseDictionary class"
linktitle: "BaseDictionary"
second_title: "Aspose.Page untuk C++"
description: "System::Collections::Generic::BaseDictionary class. Mengimplementasikan kode umum untuk berbagai struktur data mirip kamus (mis. Dictionary, SortedDictionary). Tidak boleh digunakan secara langsung, kecuali untuk pewarisan saat mendefinisikan kontainer. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 500
url: /id/cpp/system.collections.generic/basedictionary/
---
## BaseDictionary class


Mengimplementasikan kode umum untuk berbagai struktur data mirip kamus (mis. [Dictionary](../dictionary/), [SortedDictionary](../sorteddictionary/)). Tidak boleh digunakan secara langsung, kecuali untuk pewarisan saat mendefinisikan kontainer. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
template<typename Map>class BaseDictionary : public System::Collections::Generic::IDictionary<Map::key_type, Map::mapped_type>
```


| Parameter | Deskripsi |
| --- | --- |
| Peta | Tipe peta yang mendasari. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [_add_range](./_add_range/)(std::initializer_list\<typename Map::value_type\>) | Spesifik C++. |
| [Add](./add/)(const key_t\&, const mapped_t\&) override | Menambahkan pasangan kunci-nilai ke dalam kamus. |
| [BaseDictionary](./basedictionary/)() | Membuat struktur data kosong. |
| [BaseDictionary](./basedictionary/)(int, const Args\&...) | Konstruktor forwarding untuk meneruskan argumen ke konstruktor peta yang mendasari. |
| [BaseDictionary](./basedictionary/)(BaseType *, const Args\&...) | Konstruktor penyalinan. |
| [BaseDictionary](./basedictionary/)(BaseType *) | Konstruktor penyalinan. |
| [begin](./begin/)() const | Mengembalikan iterator ke pembungkus KVPair untuk elemen kunci-nilai dari kontainer. Diimplementasikan dengan gaya C# - iterator harus mengembalikan objek KVPair dengan antarmuka get_Key() dan get_Value(). Jika kontainer kosong, iterator yang dikembalikan akan sama dengan [end()](../ienumerable/end/). |
| [cbegin](./cbegin/)() const | Mengembalikan iterator ke elemen pertama dari kontainer. Diimplementasikan dengan gaya STL. Jika kontainer kosong, iterator yang dikembalikan akan sama dengan [end()](../ienumerable/end/). |
| [cend](./cend/)() const | Mengembalikan iterator ke elemen yang mengikuti elemen terakhir dari kontainer. Diimplementasikan dengan gaya STL. Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya akan menghasilkan perilaku tak terdefinisi. |
| [Clear](./clear/)() override | Menghapus semua elemen. |
| [ContainsKey](./containskey/)(const key_t\&) const override | Memeriksa apakah kunci ada di dalam kamus. |
| [ContainsValue](./containsvalue/)(const mapped_t\&) | Memeriksa apakah nilai ada di dalam kamus. Menggunakan operator == untuk membandingkan nilai. |
| [data](./data/)() | Pengakses penyimpanan data dasar. |
| [data](./data/)() const | Pengakses penyimpanan data dasar. |
| [end](./end/)() const | Mengembalikan iterator ke KVPair-wrapper untuk elemen kunci-nilai yang mengikuti elemen terakhir dari kontainer. Diimplementasikan dalam gaya C# - iterator harus mengembalikan KVPair-object dengan antarmuka get_Key() dan get_Value(). Elemen ini berfungsi sebagai placeholder; mencoba mengaksesnya menghasilkan perilaku tak terdefinisi. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah elemen. |
| virtual [GetEnumerator](./getenumerator/)() | Membuat instance enumerator, harus diimplementasikan oleh subclass. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&) const override | Mengembalikan nilai jika ditemukan; atau **Value()** sebaliknya. |
| [GetValueOrDefault](./getvalueordefault/)(const key_t\&, const mapped_t\&) const override | Mengembalikan nilai jika ditemukan; atau **defaultValue** jika tidak. |
| [GetValueOrNull](./getvalueornull/)(const key_t\&) const override | Mengembalikan nilai jika ditemukan; atau **null** jika tidak. Masuk akal hanya untuk tipe referensi. |
| [idx_get](./idx_get/)(const key_t\&) const override | Fungsi getter berkey. |
| [idx_set](./idx_set/)(const key_t\&, mapped_t) override | Fungsi setter berkey. Mengubah atau membuat elemen. |
| virtual [operator[]](./operator[]/)(const key_t\&) | Fungsi accessor. |
| [Remove](./remove/)(const key_t\&) override | Menghapus kunci spesifik dari kamus. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(unsigned int) override |  |
| [TryGetValue](./trygetvalue/)(const key_t\&, mapped_t\&) const override | Mencari nilai berkey dan mengambilnya jika ditemukan. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [BaseType](./basetype/) | Antarmuka yang diimplementasikan. |
| [const_iterator](./const_iterator/) | Tipe iterator konstan. |
| [iterator](./iterator/) | Tipe iterator. |
| [KeyCollection](./keycollection/) | Pastikan kita menggunakan alokator yang tepat dengan tipe penyimpanan dasar. |
| [KVPair](./kvpair/) | Tipe pasangan kunci-nilai. |
| [map_t](./map_t/) | Tipe peta internal. |
| [ValueCollection](./valuecollection/) | Koleksi nilai. |

## Lihat Juga

* Class [IDictionary](../idictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
