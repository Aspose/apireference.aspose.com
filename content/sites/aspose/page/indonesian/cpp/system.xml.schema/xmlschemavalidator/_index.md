---
title: "Kelas System::Xml::Schema::XmlSchemaValidator"
linktitle: "XmlSchemaValidator"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Schema::XmlSchemaValidator. Mewakili mesin validasi Skema Bahasa Definisi XML (XSD). Kelas XmlSchemaValidator tidak dapat diwarisi dalam C++."
type: docs
weight: 7000
url: /id/cpp/system.xml.schema/xmlschemavalidator/
---
## XmlSchemaValidator class


Mewakili mesin validasi [Schema](../) Bahasa Definisi XML (XSD) [Schema](../). Kelas [XmlSchemaValidator](./) tidak dapat diwarisi.

```cpp
class XmlSchemaValidator : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [AddSchema](./addschema/)(const SharedPtr\<XmlSchema\>\&) | Menambahkan sebuah [Schema](../) Bahasa Definisi XML (XSD) ke dalam kumpulan skema yang digunakan untuk validasi. |
| [EndValidation](./endvalidation/)() | Mengakhiri validasi dan memeriksa batasan identitas untuk seluruh dokumen XML. |
| [get_LineInfoProvider](./get_lineinfoprovider/)() | Mengembalikan informasi nomor baris untuk node XML yang sedang divalidasi. |
| [get_SourceUri](./get_sourceuri/)() | Mengembalikan URI sumber untuk node XML yang sedang divalidasi. |
| [get_ValidationEventSender](./get_validationeventsender/)() | Mengembalikan objek yang dikirim sebagai objek pengirim dari suatu peristiwa validasi. |
| [GetExpectedAttributes](./getexpectedattributes/)() | Mengembalikan atribut yang diharapkan untuk konteks elemen saat ini. |
| [GetExpectedParticles](./getexpectedparticles/)() | Mengembalikan partikel yang diharapkan dalam konteks elemen saat ini. |
| [GetUnspecifiedDefaultAttributes](./getunspecifieddefaultattributes/)(const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\&) | Memvalidasi batasan identitas pada atribut default dan mengisi List yang ditentukan dengan objek [XmlSchemaAttribute](../xmlschemaattribute/) untuk setiap atribut dengan nilai default yang belum pernah divalidasi sebelumnya menggunakan metode [XmlSchemaValidator::ValidateAttribute](./validateattribute/) dalam konteks elemen. |
| [Initialize](./initialize/)() | Menginisialisasi keadaan objek [XmlSchemaValidator](./). |
| [Initialize](./initialize/)(const SharedPtr\<XmlSchemaObject\>\&) | Menginisialisasi keadaan objek [XmlSchemaValidator](./) menggunakan [XmlSchemaObject](../xmlschemaobject/) yang ditentukan untuk validasi parsial. |
| [set_LineInfoProvider](./set_lineinfoprovider/)(const SharedPtr\<IXmlLineInfo\>\&) | Mengatur informasi nomor baris untuk node XML yang sedang divalidasi. |
| [set_SourceUri](./set_sourceuri/)(const SharedPtr\<Uri\>\&) | Mengatur URI sumber untuk node XML yang sedang divalidasi. |
| [set_ValidationEventSender](./set_validationeventsender/)(const SharedPtr\<Object\>\&) | Mengatur objek yang dikirim sebagai objek pengirim dari peristiwa validasi. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengatur objek [XmlResolver](../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan elemen **xs:import** dan **xs:include** serta atribut **xsi:schemaLocation** dan **xsi:noNamespaceSchemaLocation**. |
| [SkipToEndElement](./skiptoendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Melewatkan validasi konten elemen saat ini dan menyiapkan objek [XmlSchemaValidator](./) untuk memvalidasi konten dalam konteks elemen induk. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Memvalidasi nama atribut, URI ruang nama, dan nilai dalam konteks elemen saat ini. |
| [ValidateAttribute](./validateattribute/)(const String\&, const String\&, XmlValueGetter, const SharedPtr\<XmlSchemaInfo\>\&) | Memvalidasi nama atribut, URI ruang nama, dan nilai dalam konteks elemen saat ini. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&) | Memvalidasi elemen dalam konteks saat ini. |
| [ValidateElement](./validateelement/)(const String\&, const String\&, const SharedPtr\<XmlSchemaInfo\>\&, const String\&, const String\&, const String\&, const String\&) | Memvalidasi elemen dalam konteks saat ini dengan nilai atribut **xsi:Type**, **xsi:Nil**, **xsi:SchemaLocation**, dan **xsi:NoNamespaceSchemaLocation** yang ditentukan. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&) | Memverifikasi apakah konten teks elemen valid sesuai tipe datanya untuk elemen dengan konten sederhana, dan memverifikasi apakah konten elemen saat ini lengkap untuk elemen dengan konten kompleks. |
| [ValidateEndElement](./validateendelement/)(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) | Memverifikasi apakah konten teks elemen yang ditentukan valid sesuai tipe datanya. |
| [ValidateEndOfAttributes](./validateendofattributes/)(const SharedPtr\<XmlSchemaInfo\>\&) | Memverifikasi apakah semua atribut yang diperlukan dalam konteks elemen hadir dan menyiapkan objek [XmlSchemaValidator](./) untuk memvalidasi konten anak elemen. |
| [ValidateText](./validatetext/)(const String\&) | Memvalidasi apakah **string** teks yang ditentukan diizinkan dalam konteks elemen saat ini, dan mengakumulasi teks untuk validasi jika elemen saat ini memiliki konten sederhana. |
| [ValidateText](./validatetext/)(XmlValueGetter) | Memvalidasi apakah teks yang dikembalikan oleh objek [XmlValueGetter](../xmlvaluegetter/) yang ditentukan diizinkan dalam konteks elemen saat ini, dan mengakumulasi teks untuk validasi jika elemen saat ini memiliki konten sederhana. |
| [ValidateWhitespace](./validatewhitespace/)(const String\&) | Memvalidasi apakah spasi putih dalam **string** yang ditentukan diizinkan dalam konteks elemen saat ini, dan mengakumulasi spasi putih untuk validasi jika elemen saat ini memiliki konten sederhana. |
| [ValidateWhitespace](./validatewhitespace/)(XmlValueGetter) | Memvalidasi apakah spasi putih yang dikembalikan oleh objek [XmlValueGetter](../xmlvaluegetter/) yang ditentukan diizinkan dalam konteks elemen saat ini, dan mengakumulasi spasi putih untuk validasi jika elemen saat ini memiliki konten sederhana. |
| [XmlSchemaValidator](./xmlschemavalidator/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlSchemaSet\>\&, const SharedPtr\<IXmlNamespaceResolver\>\&, XmlSchemaValidationFlags) | Menginisialisasi instance baru dari kelas [XmlSchemaValidator](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Page for C++](../../)
