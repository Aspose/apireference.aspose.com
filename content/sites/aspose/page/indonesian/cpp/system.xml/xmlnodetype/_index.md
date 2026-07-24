---
title: "System::Xml::XmlNodeType enum"
linktitle: "XmlNodeType"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlNodeType enum. Menentukan jenis node dalam C++."
type: docs
weight: 6200
url: /id/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


Menentukan jenis node.

```cpp
enum class XmlNodeType
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| None | 0 | Ini dikembalikan oleh [XmlReader](../xmlreader/) jika metode **Read** belum dipanggil. |
| Element | 1 | Sebuah elemen (misalnya, **<item>**). |
| Attribute | 2 | Sebuah atribut (misalnya, **id='123'**). |
| Text | 3 | Konten teks dari sebuah node. Node [XmlNodeType::Text](./) tidak dapat memiliki node anak. Node ini dapat muncul sebagai node anak dari node [XmlNodeType::Attribute](./), [XmlNodeType::DocumentFragment](./), [XmlNodeType::Element](./), dan [XmlNodeType::EntityReference](./) nodes. |
| CDATA | 4 | Sebuah bagian CDATA (misalnya, **my escaped text**). |
| EntityReference | 5 | Sebuah referensi ke entitas (misalnya, **&num;**). |
| Entity | 6 | Sebuah deklarasi entitas (misalnya, **<!ENTITY...>**). |
| ProcessingInstruction | 7 | Sebuah instruksi pemrosesan (misalnya, **<?pi test?>**). |
| Comment | 8 | Sebuah komentar (misalnya, ****). |
| Document | 9 | Sebuah objek dokumen yang, sebagai akar dari pohon dokumen, menyediakan akses ke seluruh dokumen XML. |
| DocumentType | 10 | Deklarasi tipe dokumen, ditunjukkan oleh tag berikut (misalnya, **<!DOCTYPE...>**). |
| DocumentFragment | 11 | Sebuah fragmen dokumen. |
| Notasi | 12 | Sebuah notasi dalam deklarasi tipe dokumen (misalnya, **<!NOTATION...>**). |
| Spasi | 13 | Spasi antara markup. |
| SignificantWhitespace | 14 | Spasi antara markup dalam model konten campuran atau spasi dalam ruang lingkup **xml:space=\"preserve\"**. |
| EndElement | 15 | Tag elemen akhir (misalnya, ****). |
| EndEntity | 16 | Dikembalikan ketika [XmlReader](../xmlreader/) mencapai akhir penggantian entitas sebagai hasil dari pemanggilan [XmlReader::ResolveEntity](../xmlreader/resolveentity/). |
| XmlDeclaration | 17 | Deklarasi XML (misalnya, **<?xml version='1.0'?>**). Node [XmlNodeType::XmlDeclaration](./) harus menjadi node pertama dalam dokumen. Node ini tidak dapat memiliki anak. Itu adalah anak dari node [XmlNodeType::Document](./). Ia dapat memiliki atribut yang menyediakan informasi versi dan pengkodean. |

## Lihat Juga

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
