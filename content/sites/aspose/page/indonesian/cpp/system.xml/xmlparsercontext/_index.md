---
title: "System::Xml::XmlParserContext kelas"
linktitle: "XmlParserContext"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlParserContext kelas. Menyediakan semua informasi konteks yang diperlukan oleh XmlReader untuk mengurai fragmen XML dalam C++."
type: docs
weight: 3000
url: /id/cpp/system.xml/xmlparsercontext/
---
## XmlParserContext class


Menyediakan semua informasi konteks yang diperlukan oleh [XmlReader](../xmlreader/) untuk mengurai fragmen XML.

```cpp
class XmlParserContext : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_BaseURI](./get_baseuri/)() | Mengembalikan URI dasar. |
| [get_DocTypeName](./get_doctypename/)() | Mengembalikan nama deklarasi tipe dokumen. |
| [get_Encoding](./get_encoding/)() | Mengembalikan tipe enkoding. |
| [get_InternalSubset](./get_internalsubset/)() | Mengembalikan subset DTD internal. |
| [get_NamespaceManager](./get_namespacemanager/)() | Mengembalikan [XmlNamespaceManager](../xmlnamespacemanager/). |
| [get_NameTable](./get_nametable/)() | Mengembalikan [XmlNameTable](../xmlnametable/) yang digunakan untuk mengatomkan string. Untuk informasi lebih lanjut tentang string yang diatomkan, lihat [XmlNameTable](../xmlnametable/). |
| [get_PublicId](./get_publicid/)() | Mengembalikan pengenal publik. |
| [get_SystemId](./get_systemid/)() | Mengembalikan pengenal sistem. |
| [get_XmlLang](./get_xmllang/)() | Mengembalikan ruang lingkup **xml:lang** saat ini. |
| [get_XmlSpace](./get_xmlspace/)() | Mengembalikan ruang lingkup **xml:space** saat ini. |
| [set_BaseURI](./set_baseuri/)(const String\&) | Menetapkan URI dasar. |
| [set_DocTypeName](./set_doctypename/)(const String\&) | Menetapkan nama deklarasi tipe dokumen. |
| [set_Encoding](./set_encoding/)(const SharedPtr\<System::Text::Encoding\>\&) | Menetapkan tipe enkoding. |
| [set_InternalSubset](./set_internalsubset/)(const String\&) | Menetapkan subset DTD internal. |
| [set_NamespaceManager](./set_namespacemanager/)(const SharedPtr\<XmlNamespaceManager\>\&) | Menetapkan [XmlNamespaceManager](../xmlnamespacemanager/). |
| [set_NameTable](./set_nametable/)(const SharedPtr\<XmlNameTable\>\&) | Menetapkan [XmlNameTable](../xmlnametable/) yang digunakan untuk mengatomkan string. Untuk informasi lebih lanjut tentang string yang diatomkan, lihat [XmlNameTable](../xmlnametable/). |
| [set_PublicId](./set_publicid/)(const String\&) | Menetapkan pengenal publik. |
| [set_SystemId](./set_systemid/)(const String\&) | Menetapkan pengenal sistem. |
| [set_XmlLang](./set_xmllang/)(const String\&) | Menetapkan ruang lingkup **xml:lang** saat ini. |
| [set_XmlSpace](./set_xmlspace/)(System::Xml::XmlSpace) | Menetapkan ruang lingkup **xml:space** saat ini. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) | Menginisialisasi instance baru dari kelas [XmlParserContext](./) dengan [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, dan **xml:space** yang ditentukan. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Menginisialisasi instance baru dari kelas [XmlParserContext](./) dengan [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), **xml:lang**, **xml:space**, dan enkoding yang ditentukan. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) | Menginisialisasi instance baru dari kelas [XmlParserContext](./) dengan [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/), URI dasar, **xml:lang**, **xml:space**, dan nilai tipe dokumen yang ditentukan. |
| [XmlParserContext](./xmlparsercontext/)(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) | Menginisialisasi instance baru dari kelas [XmlParserContext](./) dengan [XmlNameTable](../xmlnametable/), [XmlNamespaceManager](../xmlnamespacemanager/) yang ditentukan, URI dasar, **xml:lang**, **xml:space**, encoding, dan nilai tipe dokumen. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
