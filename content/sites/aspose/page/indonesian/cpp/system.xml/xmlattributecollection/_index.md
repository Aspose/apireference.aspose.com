---
title: "System::Xml::XmlAttributeCollection class"
linktitle: "XmlAttributeCollection"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlAttributeCollection class. Mewakili kumpulan atribut yang dapat diakses berdasarkan nama atau indeks dalam C++."
type: docs
weight: 700
url: /id/cpp/system.xml/xmlattributecollection/
---
## XmlAttributeCollection class


Mewakili kumpulan atribut yang dapat diakses berdasarkan nama atau indeks.

```cpp
class XmlAttributeCollection : public System::Xml::XmlNamedNodeMap
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Append](./append/)(const SharedPtr\<XmlAttribute\>\&) | Menyisipkan atribut yang ditentukan sebagai node terakhir dalam koleksi. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&, int32_t) | Menyalin semua objek [XmlAttribute](../xmlattribute/) dari koleksi ini ke dalam array yang diberikan. |
| [idx_get](./idx_get/)(int32_t) | Mengembalikan atribut dengan indeks yang ditentukan. |
| [idx_get](./idx_get/)(const String\&) | Mengembalikan atribut dengan nama yang ditentukan. |
| [idx_get](./idx_get/)(const String\&, const String\&) | Mengembalikan atribut dengan nama lokal dan Uniform Resource Identifier (URI) ruang nama yang ditentukan. |
| [InsertAfter](./insertafter/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Menyisipkan atribut yang ditentukan segera setelah atribut referensi yang ditentukan. |
| [InsertBefore](./insertbefore/)(const SharedPtr\<XmlAttribute\>\&, const SharedPtr\<XmlAttribute\>\&) | Menyisipkan atribut yang ditentukan segera sebelum atribut referensi yang ditentukan. |
| [Prepend](./prepend/)(const SharedPtr\<XmlAttribute\>\&) | Menyisipkan atribut yang ditentukan sebagai node pertama dalam koleksi. |
| [Remove](./remove/)(const SharedPtr\<XmlAttribute\>\&) | Menghapus atribut yang ditentukan dari koleksi. |
| [RemoveAll](./removeall/)() | Menghapus semua atribut dari koleksi. |
| [RemoveAt](./removeat/)(int32_t) | Menghapus atribut yang sesuai dengan indeks yang ditentukan dari koleksi. |
| [SetNamedItem](./setnameditem/)(SharedPtr\<XmlNode\>) override | Menambahkan sebuah [XmlNode](../xmlnode/) menggunakan hasil [XmlNode::get_Name](../xmlnode/get_name/). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlNamedNodeMap](../xmlnamednodemap/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
