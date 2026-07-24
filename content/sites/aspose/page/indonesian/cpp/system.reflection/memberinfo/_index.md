---
title: "kelas System::Reflection::MemberInfo"
linktitle: "MemberInfo"
second_title: "Aspose.Page untuk C++"
description: "kelas System::Reflection::MemberInfo. Menyediakan informasi refleksi pada anggota. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi System::MakeObject(). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer System::SmartPtr dan gunakan pointer tersebut untuk meneruskannya ke fungsi sebagai argumen dalam C++."
type: docs
weight: 700
url: /id/cpp/system.reflection/memberinfo/
---
## MemberInfo class


Menyediakan informasi refleksi pada anggota. Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menghasilkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk melewatkannya ke fungsi sebagai argumen.

```cpp
class MemberInfo : public System::Object
```

## Nested classes

* Class [TypeInternal](./typeinternal/)
## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddAttribute](./addattribute/)(const ObjectPtr\&) | Menambahkan atribut ke koleksi. |
| [get_DeclaringType](./get_declaringtype/)() const | Mendapatkan tipe deklarasi. |
| [get_FullName](./get_fullname/)() const | Mendapatkan nama lengkap anggota. Bisa berbeda pada bagian yang diimplementasikan secara manual. |
| virtual [get_MemberType](./get_membertype/)() const | Mendapatkan nilai [System::Reflection::MemberTypes](../membertypes/) yang menunjukkan tipe anggota - metode, konstruktor, event, dan sebagainya. |
| [get_Name](./get_name/)() const | Mendapatkan nama anggota. |
| [get_ReflectedType](./get_reflectedtype/)() const | Mendapatkan tipe yang direfleksikan. |
| [GetCustomAttributes](./getcustomattributes/)(const TypeInfo\&, bool) const | Mengembalikan sebuah array yang berisi objek-objek yang mewakili semua atribut khusus yang diterapkan pada tipe yang diwakili oleh objek saat ini. |
| [GetCustomAttributes](./getcustomattributes/)(bool) const | Mengembalikan sebuah array yang berisi objek-objek yang mewakili semua atribut khusus yang diterapkan pada tipe yang diwakili oleh objek saat ini. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [ObjectPtr](./objectptr/) | Alias untuk shared pointer ke [Object](../../system/object/). |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
