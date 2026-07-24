---
title: "Kelas System::Xml::Schema::XmlSchema"
linktitle: "XmlSchema"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchema. Representasi dalam memori dari sebuah XML Schema, sebagaimana ditentukan oleh World Wide Web Consortium (W3C) dan dalam C++."
type: docs
weight: 400
url: /id/cpp/system.xml.schema/xmlschema/
---
## XmlSchema class


Representasi dalam memori dari sebuah XML [Schema](../), sebagaimana ditentukan oleh World Wide [Web](../../system.web/) Consortium (W3C) [XML Schema Part 1: Structures](https://www.w3.org/TR/xmlschema-1/) dan [XML Schema Part 2: Datatypes](https://www.w3.org/TR/xmlschema-2/).

```cpp
class XmlSchema : public System::Xml::Schema::XmlSchemaObject
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Compile](./compile/)(ValidationEventHandler) | Menyusun (compile) Model XML [Schema](../)[Object](../../system/object/) (SOM) menjadi informasi skema untuk validasi. Digunakan untuk memeriksa struktur sintaksis dan semantik dari SOM yang dibangun secara programatik. Pemeriksaan validasi semantik dilakukan selama kompilasi. |
| [Compile](./compile/)(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) | Menyusun (compile) Model XML [Schema](../)[Object](../../system/object/) (SOM) menjadi informasi skema untuk validasi. Digunakan untuk memeriksa struktur sintaksis dan semantik dari SOM yang dibangun secara programatik. Pemeriksaan validasi semantik dilakukan selama kompilasi. |
| [get_AttributeFormDefault](./get_attributeformdefault/)() | Mengembalikan bentuk untuk atribut yang dideklarasikan dalam namespace target skema. |
| [get_AttributeGroups](./get_attributegroups/)() | Mengembalikan nilai pasca-kompilasi-skema dari semua grup atribut global dalam skema. |
| [get_Attributes](./get_attributes/)() | Mengembalikan nilai pasca-kompilasi-skema untuk semua atribut dalam skema. |
| [get_BlockDefault](./get_blockdefault/)() | Mengembalikan atribut **blockDefault** yang menetapkan nilai default dari atribut **block** pada elemen dan tipe kompleks dalam **targetNamespace** skema. |
| [get_ElementFormDefault](./get_elementformdefault/)() | Mengembalikan bentuk untuk elemen yang dideklarasikan dalam namespace target skema. |
| [get_Elements](./get_elements/)() | Mengembalikan nilai pasca-kompilasi-skema untuk semua elemen dalam skema. |
| [get_FinalDefault](./get_finaldefault/)() | Mengembalikan atribut **finalDefault** yang menetapkan nilai default dari atribut **final** pada elemen dan tipe kompleks dalam namespace target skema. |
| [get_Groups](./get_groups/)() | Mengembalikan nilai pasca-kompilasi-skema untuk semua grup dalam skema. |
| [get_Id](./get_id/)() | Mengembalikan ID string. |
| [get_Includes](./get_includes/)() | Mengembalikan koleksi skema yang disertakan dan diimpor. |
| [get_IsCompiled](./get_iscompiled/)() | Menunjukkan apakah skema telah dikompilasi. |
| [get_Items](./get_items/)() | Mengembalikan koleksi elemen skema dalam skema dan digunakan untuk menambahkan tipe elemen baru pada tingkat elemen **schema**. |
| [get_LineNumber](../xmlschemaobject/get_linenumber/)() | Mengembalikan nomor baris dalam file yang dirujuk oleh elemen **schema**. |
| [get_LinePosition](../xmlschemaobject/get_lineposition/)() | Mengembalikan posisi baris dalam file yang dirujuk oleh elemen **schema**. |
| [get_Namespaces](../xmlschemaobject/get_namespaces/)() | Mengembalikan XmlSerializerNamespaces yang akan digunakan dengan objek skema ini. |
| [get_Notations](./get_notations/)() | Mengembalikan nilai pasca-kompilasi-skema untuk semua notasi dalam skema. |
| [get_Parent](../xmlschemaobject/get_parent/)() | Mengembalikan induk dari [XmlSchemaObject](../xmlschemaobject/). |
| [get_SchemaTypes](./get_schematypes/)() | Mengembalikan nilai pasca-kompilasi-skema untuk semua tipe skema dalam skema. |
| [get_SourceUri](../xmlschemaobject/get_sourceuri/)() | Mengembalikan lokasi sumber untuk file yang memuat skema. |
| [get_TargetNamespace](./get_targetnamespace/)() | Mengembalikan Uniform Resource Identifier (URI) dari namespace target skema. |
| [get_UnhandledAttributes](./get_unhandledattributes/)() | Mengembalikan atribut yang memenuhi syarat yang tidak termasuk dalam namespace target skema. |
| [get_Version](./get_version/)() | Mengembalikan versi skema. |
| static [Read](./read/)(const SharedPtr\<IO::TextReader\>\&, ValidationEventHandler) | Membaca XML [Schema](../) dari [IO::TextReader](../../system.io/textreader/) yang disediakan. |
| static [Read](./read/)(const SharedPtr\<IO::Stream\>\&, ValidationEventHandler) | Membaca XML [Schema](../) dari aliran yang disediakan. |
| static [Read](./read/)(const SharedPtr\<XmlReader\>\&, ValidationEventHandler) | Membaca XML [Schema](../) dari [XmlReader](../../system.xml/xmlreader/) yang disediakan. |
| [set_AttributeFormDefault](./set_attributeformdefault/)(XmlSchemaForm) | Mengatur bentuk untuk atribut yang dideklarasikan dalam namespace target skema. |
| [set_BlockDefault](./set_blockdefault/)(XmlSchemaDerivationMethod) | Mengatur atribut **blockDefault** yang menetapkan nilai default atribut **block** pada elemen dan tipe kompleks di **targetNamespace** skema. |
| [set_ElementFormDefault](./set_elementformdefault/)(XmlSchemaForm) | Mengatur bentuk untuk elemen yang dideklarasikan dalam namespace target skema. |
| [set_FinalDefault](./set_finaldefault/)(XmlSchemaDerivationMethod) | Mengatur atribut **finalDefault** yang menetapkan nilai default atribut **final** pada elemen dan tipe kompleks di namespace target skema. |
| [set_Id](./set_id/)(const String\&) | Mengatur ID string. |
| [set_LineNumber](../xmlschemaobject/set_linenumber/)(int32_t) | Mengatur nomor baris dalam file yang dirujuk oleh elemen **schema**. |
| [set_LinePosition](../xmlschemaobject/set_lineposition/)(int32_t) | Mengatur posisi baris dalam file yang dirujuk oleh elemen **schema**. |
| [set_Namespaces](../xmlschemaobject/set_namespaces/)(const SharedPtr\<System::Xml::Serialization::XmlSerializerNamespaces\>\&) | Mengatur XmlSerializerNamespaces yang akan digunakan dengan objek skema ini. |
| [set_Parent](../xmlschemaobject/set_parent/)(const SharedPtr\<XmlSchemaObject\>\&) | Mengatur induk dari [XmlSchemaObject](../xmlschemaobject/) ini. |
| [set_SourceUri](../xmlschemaobject/set_sourceuri/)(const String\&) | Mengatur lokasi sumber untuk file yang memuat skema. |
| [set_TargetNamespace](./set_targetnamespace/)(const String\&) | Mengatur Uniform Resource Identifier (URI) dari ruang nama target skema. |
| [set_UnhandledAttributes](./set_unhandledattributes/)(const ArrayPtr\<SharedPtr\<XmlAttribute\>\>\&) | Mengatur atribut yang memenuhi syarat yang tidak termasuk dalam ruang nama target skema. |
| [set_Version](./set_version/)(const String\&) | Mengatur versi skema. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&) | Menulis [Schema](../) XML ke aliran data yang disediakan. |
| [Write](./write/)(const SharedPtr\<IO::Stream\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Menulis [Schema](../) XML ke Stream yang disediakan menggunakan [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/) yang ditentukan. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&) | Menulis [Schema](../) XML ke [IO::TextWriter](../../system.io/textwriter/) yang disediakan. |
| [Write](./write/)(const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Menulis [Schema](../) XML ke TextWriter yang disediakan. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&) | Menulis [Schema](../) XML ke [XmlWriter](../../system.xml/xmlwriter/) yang disediakan. |
| [Write](./write/)(const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlNamespaceManager\>\&) | Menulis [Schema](../) XML ke [XmlWriter](../../system.xml/xmlwriter/) yang disediakan. |
| [XmlSchema](./xmlschema/)() | Menginisialisasi instance baru dari kelas [XmlSchema](./). |
| [XmlSchemaObject](../xmlschemaobject/xmlschemaobject/)() | Menginisialisasi instance baru dari kelas [XmlSchemaObject](../xmlschemaobject/). |
## Bidang

| Bidang | Deskripsi |
| --- | --- |
| static [InstanceNamespace](./instancenamespace/) | Namespace instance skema XML. Bidang ini konstan. |
| static [Namespace](./namespace/) | Namespace skema XML. Bidang ini konstan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
