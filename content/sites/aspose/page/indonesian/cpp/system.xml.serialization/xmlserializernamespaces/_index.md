---
title: "System::Xml::Serialization::XmlSerializerNamespaces kelas"
linktitle: "XmlSerializerNamespaces"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Serialization::XmlSerializerNamespaces kelas. Berisi namespace XML dan prefiks yang digunakan oleh Serialization::XmlSerializer untuk menghasilkan nama yang memenuhi syarat dalam sebuah instance dokumen XML dalam C++."
type: docs
weight: 800
url: /id/cpp/system.xml.serialization/xmlserializernamespaces/
---
## XmlSerializerNamespaces class


Berisi namespace XML dan prefiks yang digunakan oleh [Serialization::XmlSerializer](../xmlserializer/) untuk menghasilkan nama yang memenuhi syarat dalam sebuah instance dokumen XML.

```cpp
class XmlSerializerNamespaces : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Menambahkan pasangan prefiks dan namespace ke objek [Serialization::XmlSerializerNamespaces](./). |
| [get_Count](./get_count/)() | Mengembalikan jumlah pasangan prefiks dan namespace dalam koleksi. |
| [get_NamespaceList](./get_namespacelist/)() |  |
| [get_Namespaces](./get_namespaces/)() |  |
| [set_Namespaces](./set_namespaces/)(const SharedPtr\<Collections::Generic::Dictionary\<String, String\>\>\&) |  |
| [ToArray](./toarray/)() | Mengembalikan array pasangan prefiks dan namespace dalam objek [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)() | Menginisialisasi sebuah instance baru dari kelas [Serialization::XmlSerializerNamespaces](./). |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const SharedPtr\<XmlSerializerNamespaces\>\&) | Menginisialisasi sebuah instance baru dari kelas [Serialization::XmlSerializerNamespaces](./), menggunakan instance **[XmlSerializerNamespaces](./)** yang ditentukan yang berisi koleksi pasangan prefiks dan namespace. |
| [XmlSerializerNamespaces](./xmlserializernamespaces/)(const ArrayPtr\<SharedPtr\<XmlQualifiedName\>\>\&) | Menginisialisasi sebuah instance baru dari kelas [Serialization::XmlSerializerNamespaces](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Serialization](../)
* Library [Aspose.Page for C++](../../)
