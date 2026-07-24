---
title: "System::Xml::Schema::XmlSchemaAttribute class"
linktitle: "XmlSchemaAttribute"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaAttribute. Mewakili elemen attribute dari XML Schema sebagaimana ditentukan oleh World Wide Web Consortium (W3C). Atribut memberikan informasi tambahan untuk elemen dokumen lainnya. Tag attribute ditempatkan di antara tag elemen dokumen''s untuk skema. Dokumen XML menampilkan atribut sebagai item bernama dalam tag pembuka sebuah elemen di C++."
type: docs
weight: 1100
url: /id/cpp/system.xml.schema/xmlschemaattribute/
---
## XmlSchemaAttribute class


Mewakili elemen **attribute** dari XML [Schema](../) sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C). Atribut memberikan informasi tambahan untuk elemen dokumen lainnya. Tag attribute ditempatkan di antara tag elemen dokumen untuk skema. Dokumen XML menampilkan atribut sebagai item bernama dalam tag pembuka sebuah elemen.

```cpp
class XmlSchemaAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_AttributeSchemaType](./get_attributeschematype/)() | Mengembalikan objek [XmlSchemaSimpleType](../xmlschemasimpletype/) yang mewakili tipe atribut berdasarkan nilai [XmlSchemaAttribute::get_SchemaType](./get_schematype/) atau [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) dari atribut. |
| [get_AttributeType](./get_attributetype/)() | Mengembalikan objek berdasarkan nilai [XmlSchemaAttribute::get_SchemaType](./get_schematype/) atau [XmlSchemaAttribute::get_SchemaTypeName](./get_schematypename/) dari atribut yang menyimpan interpretasi pasca-kompilasi dari nilai **AttributeType**. |
| [get_DefaultValue](./get_defaultvalue/)() | Mengembalikan nilai default untuk atribut. |
| [get_FixedValue](./get_fixedvalue/)() | Mengembalikan nilai tetap untuk atribut. |
| [get_Form](./get_form/)() | Mengembalikan bentuk untuk atribut. |
| [get_Name](./get_name/)() | Mengembalikan nama atribut. |
| [get_QualifiedName](./get_qualifiedname/)() | Mengembalikan nama yang terkualifikasi untuk atribut. |
| [get_RefName](./get_refname/)() | Mengembalikan nama sebuah atribut yang dideklarasikan dalam skema ini (atau skema lain yang ditunjukkan oleh ruang nama yang ditentukan). |
| [get_SchemaType](./get_schematype/)() | Mengembalikan tipe atribut ke tipe sederhana. |
| [get_SchemaTypeName](./get_schematypename/)() | Mengembalikan nama tipe sederhana yang didefinisikan dalam skema ini (atau skema lain yang ditunjukkan oleh namespace yang ditentukan). |
| [get_Use](./get_use/)() | Mengembalikan informasi tentang bagaimana atribut digunakan. |
| [set_DefaultValue](./set_defaultvalue/)(const String\&) | Mengatur nilai default untuk atribut. |
| [set_FixedValue](./set_fixedvalue/)(const String\&) | Mengatur nilai tetap untuk atribut. |
| [set_Form](./set_form/)(XmlSchemaForm) | Mengatur bentuk untuk atribut. |
| [set_Name](./set_name/)(const String\&) | Mengatur nama atribut. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama atribut yang dideklarasikan dalam skema ini (atau skema lain yang ditunjukkan oleh namespace yang ditentukan). |
| [set_SchemaType](./set_schematype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Mengatur tipe atribut ke tipe sederhana. |
| [set_SchemaTypeName](./set_schematypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Mengatur nama tipe sederhana yang didefinisikan dalam skema ini (atau skema lain yang ditunjukkan oleh namespace yang ditentukan). |
| [set_Use](./set_use/)(XmlSchemaUse) | Mengatur informasi tentang bagaimana atribut digunakan. |
| [XmlSchemaAttribute](./xmlschemaattribute/)() | Menginisialisasi instance baru dari kelas [XmlSchemaAttribute](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
