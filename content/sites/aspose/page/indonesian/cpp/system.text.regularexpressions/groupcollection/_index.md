---
title: "System::Text::RegularExpressions::GroupCollection class"
linktitle: "GroupCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Text::RegularExpressions::GroupCollection. Daftar grup penangkap dalam satu kecocokan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject() . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 400
url: /id/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


Daftar grup penangkap dalam satu kecocokan. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/) . Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | Menonaktifkan penambahan elemen ke dalam koleksi. |
| [AddGroup](./addgroup/)(const GroupPtr\&) | Menambahkan grup ke dalam koleksi. |
| [Clear](./clear/)() override | Menonaktifkan penghapusan elemen dari koleksi. |
| [get_Item](./get_item/)(int) const | [Group](../group/) akses. |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) akses. |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | Konstruktor. |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) akses. |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) akses. |
| [IsReadOnly](./isreadonly/)() const | Menandai koleksi sebagai hanya-baca. |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) akses. |
| [operator[]](./operator[]/)(int) | [Group](../group/) akses. |
| [operator[]](./operator[]/)(int) const | [Group](../group/) akses. |
| [Remove](./remove/)(const GroupPtr\&) override | Menonaktifkan penghilangan elemen dari koleksi. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Base](./base/) | [Base](./base/) kelas. |
## Lihat Juga

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
