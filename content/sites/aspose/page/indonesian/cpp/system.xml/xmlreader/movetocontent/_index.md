---
title: "System::Xml::XmlReader::MoveToContent method"
linktitle: "MoveToContent"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::MoveToContent method. Memeriksa apakah node saat ini adalah node konten (teks non-spasi putih, CDATA, Element, EndElement, EntityReference, atau EndEntity). Jika node bukan node konten, pembaca melompati ke node konten berikutnya atau akhir berkas. Ia melompati node dengan tipe berikut: ProcessingInstruction, DocumentType, Comment, Whitespace, atau SignificantWhitespace dalam C++."
type: docs
weight: 3300
url: /id/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


Memeriksa apakah node saat ini adalah node konten (teks non-spasi putih, **CDATA**, **Element**, **EndElement**, **EntityReference**, atau **EndEntity**). Jika node bukan node konten, pembaca melompati ke node konten berikutnya atau akhir berkas. Ia melompati node dengan tipe berikut: **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, atau **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

Nilai [XmlReader::get_NodeType](../get_nodetype/) dari node saat ini yang ditemukan oleh metode atau [XmlNodeType::None](../../xmlnodetype/) jika pembaca telah mencapai akhir aliran masukan.

## Lihat Juga

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
