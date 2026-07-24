---
title: "Kelas System::Xml::Schema::XmlSchemaCollection"
linktitle: "XmlSchemaCollection"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaCollection. Berisi cache skema bahasa definisi XML Schema (XSD) dan XML-Data Reduced (XDR) dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.xml.schema/xmlschemacollection/
---
## XmlSchemaCollection class


Berisi cache skema bahasa definisi XML [Schema](../) (XSD) dan XML-Data Reduced (XDR).

```cpp
class XmlSchemaCollection : public System::Collections::Generic::IEnumerable<SharedPtr<System::Xml::Schema::XmlSchema>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Add](./add/)(const String\&, const String\&) | Menambahkan skema yang terletak pada URL yang diberikan ke dalam koleksi skema. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&) | Menambahkan skema yang terdapat dalam [XmlReader](../../system.xml/xmlreader/) ke koleksi skema. |
| [Add](./add/)(const String\&, const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Menambahkan skema yang terdapat dalam [XmlReader](../../system.xml/xmlreader/) ke koleksi skema. [XmlResolver](../../system.xml/xmlresolver/) yang ditentukan digunakan untuk menyelesaikan sumber daya eksternal apa pun. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&) | Menambahkan [XmlSchema](../xmlschema/) ke dalam koleksi. |
| [Add](./add/)(const SharedPtr\<XmlSchema\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Menambahkan [XmlSchema](../xmlschema/) ke dalam koleksi. [XmlResolver](../../system.xml/xmlresolver/) yang ditentukan digunakan untuk menyelesaikan referensi eksternal apa pun. |
| [Add](./add/)(const SharedPtr\<XmlSchemaCollection\>\&) | Menambahkan semua namespace yang didefinisikan dalam koleksi yang diberikan (termasuk skema terkait) ke koleksi ini. |
| [Contains](./contains/)(const SharedPtr\<XmlSchema\>\&) | Mengembalikan nilai yang menunjukkan apakah **targetNamespace** dari [XmlSchema](../xmlschema/) yang ditentukan berada dalam koleksi. |
| [Contains](./contains/)(const String\&) | Mengembalikan nilai yang menunjukkan apakah ada skema dengan namespace yang ditentukan dalam koleksi. |
| [CopyTo](./copyto/)(const ArrayPtr\<SharedPtr\<XmlSchema\>\>\&, int32_t) | Menyalin semua objek [XmlSchema](../xmlschema/) dari koleksi ini ke dalam array yang diberikan mulai dari indeks yang ditentukan. |
| [get_Count](./get_count/)() | Mengembalikan jumlah namespace yang didefinisikan dalam koleksi ini. |
| [get_NameTable](./get_nametable/)() | Mengembalikan [XmlNameTable](../../system.xml/xmlnametable/) default yang digunakan oleh [XmlSchemaCollection](./) saat memuat skema baru. |
| [GetEnumerator](./getenumerator/)() override | Menyediakan dukungan untuk iterasi atas koleksi skema. |
| [idx_get](./idx_get/)(const String\&) | Mengembalikan [XmlSchema](../xmlschema/) yang terkait dengan URI namespace yang diberikan. |
| [XmlSchemaCollection](./xmlschemacollection/)() | Menginisialisasi instance baru dari kelas [XmlSchemaCollection](./). |
| [XmlSchemaCollection](./xmlschemacollection/)(const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlSchemaCollection](./) dengan [XmlNameTable](../../system.xml/xmlnametable/) yang ditentukan. [XmlNameTable](../../system.xml/xmlnametable/) digunakan saat memuat skema. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan


## Deprecated
Kelas XmlSchemaCollection sudah usang. Gunakan XmlSchemaSet sebagai gantinya.

Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
