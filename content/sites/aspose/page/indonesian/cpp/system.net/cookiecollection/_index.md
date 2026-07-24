---
title: "System::Net::CookieCollection class"
linktitle: "CookieCollection"
second_title: "Aspose.Page untuk C++"
description: "System::Net::CookieCollection class. Mewakili daftar cookie yang terurut. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen dalam C++."
type: docs
weight: 200
url: /id/cpp/system.net/cookiecollection/
---
## CookieCollection class


Mewakili daftar cookie yang terurut. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskan ke fungsi sebagai argumen.

```cpp
class CookieCollection : public System::Collections::Generic::ICollection<System::SharedPtr<System::Net::Cookie>>
```

## Enums

| Enum | Deskripsi |
| --- | --- |
| [Stamp](./stamp/) | Informasi RTTI. |
## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Cookie\>\&) override | Menambahkan cookie ke koleksi. |
| [Add](./add/)(System::SharedPtr\<CookieCollection\>) | Menambahkan cookie dari koleksi yang ditentukan ke yang saat ini. |
| [Clear](./clear/)() override | Menghapus semua cookie dari koleksi. |
| [Contains](./contains/)(const System::SharedPtr\<Cookie\>\&) const override | Memeriksa apakah koleksi berisi cookie yang ditentukan. |
| [CookieCollection](./cookiecollection/)() | Membuat instance baru. |
| [get_Count](./get_count/)() const override | Mendapatkan jumlah elemen dalam koleksi. |
| [get_IsOtherVersionSeen](./get_isotherversionseen/)() | Mengembalikan nilai yang menunjukkan apakah koleksi berisi cookie dengan versi yang tidak sama dengan [Cookie::MaxSupportedVersion](../cookie/maxsupportedversion/). |
| [GetEnumerator](./getenumerator/)() override | Mendapatkan enumerator. |
| [idx_get](./idx_get/)(int32_t) | Mengembalikan cookie dari koleksi cookie pada indeks yang ditentukan. |
| [idx_get](./idx_get/)(String) | Mengembalikan cookie dari koleksi cookie berdasarkan nama yang ditentukan. |
| [IndexOf](./indexof/)(System::SharedPtr\<Cookie\>) | Mengembalikan indeks dari cookie yang ditentukan. |
| [InternalAdd](./internaladd/)(System::SharedPtr\<Cookie\>, bool) | Menambahkan cookie yang ditentukan ke dalam koleksi. |
| [Remove](./remove/)(const System::SharedPtr\<Cookie\>\&) override | Menghapus cookie yang ditentukan dari koleksi. |
| [RemoveAt](./removeat/)(int32_t) | Menghapus cookie pada indeks yang ditentukan. |
| [TimeStamp](./timestamp/)(CookieCollection::Stamp) | Memperbarui cap waktu berdasarkan skenario yang ditentukan dan mengembalikan nilai baru. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | Mendapatkan implementasi begin const iterator untuk kontainer saat ini. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | Mendapatkan implementasi begin iterator untuk kontainer saat ini. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | Mendapatkan implementasi end const iterator untuk kontainer saat ini. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | Mendapatkan implementasi end iterator untuk kontainer saat ini. |
## Lihat Juga

* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
