---
title: "Kelas System::Xml::XmlDocument"
linktitle: "XmlDocument"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::XmlDocument. Mewakili dokumen XML. Anda dapat menggunakan kelas ini untuk memuat, memvalidasi, mengedit, menambah, dan memposisikan XML dalam sebuah dokumen di C++."
type: docs
weight: 1400
url: /id/cpp/system.xml/xmldocument/
---
## XmlDocument class


Mewakili sebuah dokumen XML. Anda dapat menggunakan kelas ini untuk memuat, memvalidasi, mengedit, menambah, dan memposisikan XML dalam sebuah dokumen.

```cpp
class XmlDocument : public System::Xml::XmlNode
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [CloneNode](./clonenode/)(bool) override | Membuat duplikat dari node ini. |
| [CreateAttribute](./createattribute/)(const String\&) | Membuat sebuah [XmlAttribute](../xmlattribute/) dengan nama yang ditentukan. |
| [CreateAttribute](./createattribute/)(const String\&, const String\&) | Membuat sebuah [XmlAttribute](../xmlattribute/) dengan nama terkualifikasi yang ditentukan dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateAttribute](./createattribute/)(const String\&, const String\&, const String\&) | Membuat sebuah [XmlAttribute](../xmlattribute/) dengan [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/), dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) yang ditentukan. |
| virtual [CreateCDataSection](./createcdatasection/)(const String\&) | Membuat sebuah [XmlCDataSection](../xmlcdatasection/) yang berisi data yang ditentukan. |
| virtual [CreateComment](./createcomment/)(const String\&) | Membuat sebuah [XmlComment](../xmlcomment/) yang berisi data yang ditentukan. |
| virtual [CreateDocumentFragment](./createdocumentfragment/)() | Membuat sebuah [XmlDocumentFragment](../xmldocumentfragment/). |
| virtual [CreateDocumentType](./createdocumenttype/)(const String\&, const String\&, const String\&, const String\&) | Mengembalikan sebuah objek [XmlDocumentType](../xmldocumenttype/) baru. |
| [CreateElement](./createelement/)(const String\&) | Membuat sebuah elemen dengan nama yang ditentukan. |
| [CreateElement](./createelement/)(const String\&, const String\&) | Membuat sebuah [XmlElement](../xmlelement/) dengan nama terkualifikasi dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateElement](./createelement/)(const String\&, const String\&, const String\&) | Membuat sebuah elemen dengan [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_LocalName](./get_localname/), dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) yang ditentukan. |
| virtual [CreateEntityReference](./createentityreference/)(const String\&) | Membuat sebuah [XmlEntityReference](../xmlentityreference/) dengan nama yang ditentukan. |
| [CreateNavigator](./createnavigator/)() override | Membuat sebuah objek XPathNavigator baru untuk menavigasi dokumen ini. |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&, const String\&) | Membuat sebuah [XmlNode](../xmlnode/) dengan [XmlNodeType](../xmlnodetype/), [XmlNode::get_Prefix](../xmlnode/get_prefix/), [XmlDocument::get_Name](./get_name/), dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) yang ditentukan. |
| virtual [CreateNode](./createnode/)(const String\&, const String\&, const String\&) | Membuat sebuah [XmlNode](../xmlnode/) dengan tipe node yang ditentukan, [XmlDocument::get_Name](./get_name/), dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/). |
| virtual [CreateNode](./createnode/)(XmlNodeType, const String\&, const String\&) | Membuat sebuah [XmlNode](../xmlnode/) dengan [XmlNodeType](../xmlnodetype/), [XmlDocument::get_Name](./get_name/), dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) yang ditentukan. |
| virtual [CreateProcessingInstruction](./createprocessinginstruction/)(const String\&, const String\&) | Membuat sebuah [XmlProcessingInstruction](../xmlprocessinginstruction/) dengan nama dan data yang ditentukan. |
| virtual [CreateSignificantWhitespace](./createsignificantwhitespace/)(const String\&) | Membuat sebuah node [XmlSignificantWhitespace](../xmlsignificantwhitespace/). |
| virtual [CreateTextNode](./createtextnode/)(const String\&) | Membuat sebuah [XmlText](../xmltext/) dengan teks yang ditentukan. |
| virtual [CreateWhitespace](./createwhitespace/)(const String\&) | Membuat sebuah node [XmlWhitespace](../xmlwhitespace/). |
| virtual [CreateXmlDeclaration](./createxmldeclaration/)(const String\&, const String\&, const String\&) | Membuat sebuah node [XmlDeclaration](../xmldeclaration/) dengan nilai yang ditentukan. |
| [get_BaseURI](./get_baseuri/)() override | Mengembalikan URI dasar dari node saat ini. |
| [get_DocumentElement](./get_documentelement/)() | Mengembalikan [XmlElement](../xmlelement/) root untuk dokumen. |
| virtual [get_DocumentType](./get_documenttype/)() | Mengembalikan node yang berisi deklarasi DOCTYPE. |
| [get_Implementation](./get_implementation/)() | Mengembalikan objek [XmlImplementation](../xmlimplementation/) untuk dokumen saat ini. |
| [get_InnerXml](./get_innerxml/)() override | Mengembalikan markup yang mewakili anak-anak node saat ini. |
| [get_IsReadOnly](./get_isreadonly/)() override | Mengembalikan nilai yang menunjukkan apakah node saat ini bersifat read-only. |
| [get_LocalName](./get_localname/)() override | Mengembalikan nama lokal dari node. |
| [get_Name](./get_name/)() override | Mengembalikan nama lengkap dari node. |
| [get_NameTable](./get_nametable/)() | Mengembalikan [XmlNameTable](../xmlnametable/) yang terkait dengan implementasi ini. |
| [get_NodeType](./get_nodetype/)() override | Mengembalikan tipe dari node saat ini. |
| [get_OwnerDocument](./get_ownerdocument/)() override | Mengembalikan [XmlDocument](./) tempat node saat ini berada. |
| [get_PreserveWhitespace](./get_preservewhitespace/)() | Mengembalikan nilai yang menunjukkan apakah harus mempertahankan spasi putih dalam konten elemen. |
| [get_SchemaInfo](./get_schemainfo/)() override | Mengembalikan Post-Schema-Validation-Infoset (PSVI) dari node. |
| [get_Schemas](./get_schemas/)() | Mengembalikan objek XmlSchemaSet yang terkait dengan [XmlDocument](./) ini. |
| virtual [GetElementById](./getelementbyid/)(String) | Mengembalikan [XmlElement](../xmlelement/) dengan ID yang ditentukan. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String) | Mengembalikan sebuah [XmlNodeList](../xmlnodelist/) yang berisi daftar semua elemen turunan yang cocok dengan nama yang ditentukan. |
| virtual [GetElementsByTagName](./getelementsbytagname/)(String, String) | Mengembalikan sebuah [XmlNodeList](../xmlnodelist/) yang berisi daftar semua elemen turunan yang cocok dengan [XmlDocument::get_LocalName](./get_localname/) dan [XmlNode::get_NamespaceURI](../xmlnode/get_namespaceuri/) yang ditentukan. |
| virtual [ImportNode](./importnode/)(SharedPtr\<XmlNode\>, bool) | Mengimpor sebuah node dari dokumen lain ke dokumen saat ini. |
| virtual [Load](./load/)(String) | Memuat dokumen XML dari URL yang ditentukan. |
| virtual [Load](./load/)(SharedPtr\<IO::Stream\>) | Memuat dokumen XML dari stream yang ditentukan. |
| virtual [Load](./load/)(SharedPtr\<IO::TextReader\>) | Memuat dokumen XML dari TextReader yang ditentukan. |
| virtual [Load](./load/)(SharedPtr\<XmlReader\>) | Memuat dokumen XML dari [XmlReader](../xmlreader/) yang ditentukan. |
| virtual [LoadXml](./loadxml/)(String) | Memuat dokumen XML dari string yang ditentukan. |
| virtual [ReadNode](./readnode/)(SharedPtr\<XmlReader\>) | Membuat objek [XmlNode](../xmlnode/) berdasarkan informasi dalam [XmlReader](../xmlreader/). Pembaca harus berada pada node atau atribut. |
| virtual [Save](./save/)(String) | Menyimpan dokumen XML ke file yang ditentukan. Jika file yang ditentukan ada, metode ini akan menimpanya. |
| virtual [Save](./save/)(SharedPtr\<IO::Stream\>) | Menyimpan dokumen XML ke stream yang ditentukan. |
| virtual [Save](./save/)(SharedPtr\<IO::TextWriter\>) | Menyimpan dokumen XML ke TextWriter yang ditentukan. |
| virtual [Save](./save/)(SharedPtr\<XmlWriter\>) | Menyimpan dokumen XML ke [XmlWriter](../xmlwriter/) yang ditentukan. |
| [set_InnerText](./set_innertext/)(String) override | Melempar InvalidOperationException dalam semua kasus. |
| [set_InnerXml](./set_innerxml/)(String) override | Mengatur markup yang mewakili anak-anak node saat ini. |
| [set_PreserveWhitespace](./set_preservewhitespace/)(bool) | Mengatur nilai yang menunjukkan apakah harus mempertahankan spasi putih dalam konten elemen. |
| [set_Schemas](./set_schemas/)(const SharedPtr\<Schema::XmlSchemaSet\>\&) | Mengatur objek XmlSchemaSet yang terkait dengan [XmlDocument](./) ini. |
| virtual [set_XmlResolver](./set_xmlresolver/)(SharedPtr\<System::Xml::XmlResolver\>) | Mengatur [XmlResolver](../xmlresolver/) yang akan digunakan untuk menyelesaikan sumber daya eksternal. |
| [Validate](./validate/)(Schema::ValidationEventHandler) | Memvalidasi [XmlDocument](./) terhadap skema XML [Schema](../../system.xml.schema/) Definition Language (XSD) yang terdapat dalam daftar [XmlDocument::get_Schemas](./get_schemas/). |
| [Validate](./validate/)(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) | Memvalidasi objek [XmlNode](../xmlnode/) yang ditentukan terhadap skema XML [Schema](../../system.xml.schema/) Definition Language (XSD) dalam daftar [XmlDocument::get_Schemas](./get_schemas/). |
| [WriteContentTo](./writecontentto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan semua anak node [XmlDocument](./) ke [XmlWriter](../xmlwriter/) yang ditentukan. |
| [WriteTo](./writeto/)(const SharedPtr\<XmlWriter\>\&) override | Menyimpan node [XmlDocument](./) ke [XmlWriter](../xmlwriter/) yang ditentukan. |
| [XmlDocument](./xmldocument/)() | Menginisialisasi instance baru dari kelas [XmlDocument](./). |
| [XmlDocument](./xmldocument/)(const SharedPtr\<XmlNameTable\>\&) | Menginisialisasi instance baru dari kelas [XmlDocument](./) dengan [XmlNameTable](../xmlnametable/) yang ditentukan. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [XmlNode](../xmlnode/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
