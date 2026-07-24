---
title: "System::Xml::Schema::XmlSchemaObjectTable class"
linktitle: "XmlSchemaObjectTable"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaObjectTable class. Menyediakan koleksi untuk elemen yang terkandung dalam kelas XmlSchema (misalnya, Attributes, AttributeGroups, Elements, dan sebagainya) dalam C++."
type: docs
weight: 5300
url: /id/cpp/system.xml.schema/xmlschemaobjecttable/
---
## XmlSchemaObjectTable class


Menyediakan koleksi untuk elemen yang terkandung dalam kelas [XmlSchema](../xmlschema/) (misalnya, Attributes, AttributeGroups, Elements, dan sebagainya).

```cpp
class XmlSchemaObjectTable : public System::Collections::Generic::IEnumerable<System::Collections::Generic::KeyValuePair<SharedPtr<System::Xml::XmlQualifiedName>, SharedPtr<System::Xml::Schema::XmlSchemaObject>>>
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Contains](./contains/)(const SharedPtr\<XmlQualifiedName\>\&) | Menentukan apakah nama yang memenuhi syarat yang ditentukan ada dalam koleksi. |
| [get_Count](./get_count/)() | Mengembalikan jumlah item yang terkandung dalam [XmlSchemaObjectTable](./). |
| [get_Names](./get_names/)() | Mengembalikan koleksi semua elemen bernama dalam [XmlSchemaObjectTable](./). |
| [get_Values](./get_values/)() | Mengembalikan koleksi semua nilai untuk semua elemen dalam [XmlSchemaObjectTable](./). |
| [GetEnumerator](./getenumerator/)() override | Mengembalikan enumerator yang dapat mengiterasi melalui [XmlSchemaObjectTable](./). |
| [idx_get](./idx_get/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengembalikan elemen dalam [XmlSchemaObjectTable](./) yang ditentukan oleh nama yang memenuhi syarat. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [IEnumerable](../../system.collections.generic/ienumerable/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
