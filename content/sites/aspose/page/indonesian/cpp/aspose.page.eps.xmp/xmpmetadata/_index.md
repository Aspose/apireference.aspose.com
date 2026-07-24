---
title: "Aspose::Page::EPS::XMP::XmpMetadata kelas"
linktitle: "XmpMetadata"
second_title: "Aspose.Page untuk C++"
description: "kelas Aspose::Page::EPS::XMP::XmpMetadata. Menyediakan akses ke aliran metadata XMP dalam C++."
type: docs
weight: 200
url: /id/cpp/aspose.page.eps.xmp/xmpmetadata/
---
## XmpMetadata class


Menyediakan akses ke aliran metadata [XMP](../).

```cpp
class XmpMetadata : public System::Collections::Generic::IDictionary<System::String, System::SharedPtr<XmpValue>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<XmpValue\>\&) override | Menambahkan nilai ke metadata. |
| [Add](./add/)(const System::String\&, const System::SharedPtr\<System::Object\>\&) | Menambahkan nilai ke metadata. |
| [Add](./add/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Menambahkan pasangan dengan kunci dan nilai ke dalam kamus. |
| [AddArrayItem](./addarrayitem/)(System::String, System::SharedPtr\<XmpValue\>) | Menambahkan nilai ke dalam array. Nilai akan ditambahkan di akhir array. |
| [AddArrayItem](./addarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Menambahkan nilai ke dalam array pada indeks yang ditentukan. |
| [AddNamedValue](./addnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Menambahkan nilai bernama ke dalam struktur. |
| [Clear](./clear/)() override | Menghapus metadata. |
| [Contains](./contains/)(const System::String\&) const | Memeriksa apakah kunci terdapat dalam metadata. |
| [Contains](./contains/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const override | Memeriksa apakah pasangan kunci-nilai yang ditentukan terdapat dalam kamus. |
| [ContainsKey](./containskey/)(const System::String\&) const override | Menentukan apakah kamus ini berisi kunci yang ditentukan. |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\>, int32_t) override | Menyalin elemen koleksi ke dalam array. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah elemen dalam koleksi. |
| [get_IsFixedSize](./get_isfixedsize/)() const | Memeriksa apakah koleksi memiliki ukuran tetap. |
| [get_IsReadOnly](./get_isreadonly/)() const override | Memeriksa apakah koleksi bersifat hanya-baca. |
| [get_IsSynchronized](./get_issynchronized/)() | Memeriksa apakah koleksi disinkronkan. |
| [get_Keys](./get_keys/)() const override | Mendapatkan koleksi kunci metadata. |
| [get_NamespaceManager](./get_namespacemanager/)() | Mendapatkan manajer namespace. |
| [get_SyncRoot](./get_syncroot/)() const | Mendapatkan objek sinkronisasi koleksi. |
| [get_Values](./get_values/)() const override | Mendapatkan nilai dalam metadata. |
| [GetEnumerator](./getenumerator/)() override | Mengembalikan enumerator kamus. |
| [GetNamespaceUriByPrefix](./getnamespaceuribyprefix/)(System::String) | Mengembalikan URI namespace berdasarkan prefiks. |
| [GetPrefixByNamespaceUri](./getprefixbynamespaceuri/)(System::String) | Mengembalikan prefiks berdasarkan URI namespace. |
| [idx_get](./idx_get/)(const System::String\&) const override | Mendapatkan data dari metadata. |
| [idx_set](./idx_set/)(const System::String\&, System::SharedPtr\<XmpValue\>) override | Mengatur data dari metadata. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String) | Mendaftarkan URI namespace. |
| [RegisterNamespaceUri](./registernamespaceuri/)(System::String, System::String, System::String) | Mendaftarkan URI namespace. |
| [Remove](./remove/)(const System::String\&) override | Menghapus entri dari metadata. |
| [Remove](./remove/)(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) override | Menghapus pasangan kunci/nilai dari koleksi. |
| [SetArrayItem](./setarrayitem/)(System::String, int32_t, System::SharedPtr\<XmpValue\>) | Mengatur nilai dalam array. Nilai sebelumnya akan diganti dengan yang baru. |
| [SetNamedValue](./setnamedvalue/)(System::String, System::String, System::SharedPtr\<XmpValue\>) | Mengatur nilai bernama ke dalam struktur. Nilai bernama sebelumnya, jika sudah ada, akan diganti dengan yang baru. |
| [TryGetValue](./trygetvalue/)(const System::String\&, System::SharedPtr\<XmpValue\>\&) const override | Mencoba menemukan kunci dalam kamus dan mengambil nilai jika ditemukan. |
## Lihat Juga

* Class [IDictionary](../../system.collections.generic/idictionary/)
* Namespace [Aspose::Page::EPS::XMP](../)
* Library [Aspose.Page for C++](../../)
