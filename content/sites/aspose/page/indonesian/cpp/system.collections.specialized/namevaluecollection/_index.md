---
title: "Kelas System::Collections::Specialized::NameValueCollection"
linktitle: "NameValueCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Collections::Specialized::NameValueCollection. Kumpulan kunci String yang terkait dan nilai String yang dapat diakses baik dengan kunci maupun dengan indeks dalam C++."
type: docs
weight: 200
url: /id/cpp/system.collections.specialized/namevaluecollection/
---
## NameValueCollection class


Kumpulan kunci [String](../../system/string/) yang terkait dan nilai [String](../../system/string/) yang dapat diakses baik dengan kunci maupun dengan indeks.

```cpp
class NameValueCollection : public System::Collections::Generic::ICollection<System::String>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const String\&) override | Metode [ICollection](../../system.collections/icollection/) yang ditimpa - belum diimplementasikan. |
| [Add](./add/)(const System::SharedPtr\<NameValueCollection\>\&) | Menyalin entri dalam [NameValueCollection](./) yang ditentukan ke yang saat ini. |
| virtual [Add](./add/)(const String\&, const String\&) | Menambahkan entri dengan nama dan nilai yang ditentukan. |
| [Clear](./clear/)() override | Menghapus semua elemen. |
| [Contains](./contains/)(const String\&) const override | Memeriksa apakah item ada dalam koleksi. |
| [CopyTo](./copyto/)(System::ArrayPtr\<String\>, int32_t) override | Menyalin elemen koleksi ke dalam elemen array yang sudah ada. |
| virtual [Get](./get/)(const String\&) | Mendapatkan nilai yang terkait dengan kunci yang ditentukan. |
| virtual [get_AllKeys](./get_allkeys/)() | Mendapatkan semua kunci. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah pasangan kunci/nilai. |
| virtual [get_Keys](./get_keys/)() | Mendapatkan semua kunci. |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator untuk mengiterasi koleksi. |
| virtual [GetValues](./getvalues/)(const String\&) | Mendapatkan nilai yang terkait dengan kunci yang ditentukan. |
| [HasKeys](./haskeys/)() | Mendapatkan nilai yang menunjukkan apakah [NameValueCollection](./) berisi kunci yang tidak null. |
| [idx_get](./idx_get/)(const String\&) | Mendapatkan nilai pada indeks yang ditentukan. |
| [idx_set](./idx_set/)(const String\&, const String\&) | Menetapkan nilai dari entri. |
| [NameValueCollection](./namevaluecollection/)() | Menginisialisasi sebuah instance baru dari kelas [NameValueCollection](./) yang kosong. |
| [NameValueCollection](./namevaluecollection/)(const System::SharedPtr\<NameValueCollection\>\&) | Menyalin entri dari [NameValueCollection](./) yang ditentukan ke sebuah [NameValueCollection](./) baru. |
| [Remove](./remove/)(const String\&) override | Menghapus item tertentu. |
| virtual [Set](./set/)(const String\&, const String\&) | Menetapkan nilai dari sebuah entri. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Lihat Juga

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
