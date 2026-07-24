---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader constructor"
linktitle: "XmlValidatingReader"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader constructor. Menginisialisasi instance baru dari kelas XmlValidatingReader dengan nilai yang ditentukan dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlValidatingReader](../) dengan nilai yang ditentukan.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | Aliran yang berisi fragmen XML untuk diparse. |
| fragType | XmlNodeType | [XmlNodeType](../../xmlnodetype/) dari fragmen XML. Ini menentukan apa yang dapat dimuat oleh fragmen (lihat tabel di bawah). |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/) di mana fragmen XML akan diparsing. Ini mencakup [XmlNameTable](../../xmlnametable/) yang digunakan, pengkodean, ruang nama, **xml:lang** saat ini, dan ruang lingkup **xml:space**. |
## Catatan



Tabel berikut mencantumkan nilai yang valid untuk **fragType** dan bagaimana pembaca mem-parsing setiap jenis node yang berbeda. |||
|-|-|
| XmlNodeType | Fragmen Dapat Memuat |
| Element | Konten elemen yang valid apa pun (misalnya, kombinasi apa pun dari elemen, komentar, instruksi pemrosesan, cdata, teks, dan referensi entitas). |
| Attribute | Nilai dari sebuah atribut (bagian di dalam tanda kutip). |
| Document | Isi dari seluruh dokumen XML; ini menegakkan aturan tingkat dokumen. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlValidatingReader](../) yang memvalidasi konten yang dikembalikan dari [XmlReader](../../xmlreader/) yang diberikan.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | Pembaca [XmlReader](../../xmlreader/) untuk dibaca saat memvalidasi. Implementasi saat ini hanya mendukung [XmlTextReader](../../xmltextreader/). |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlValidatingReader](../) dengan nilai yang ditentukan.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| xmlFragment | const String\& | String yang berisi fragmen XML untuk diparsing. |
| fragType | XmlNodeType | Jenis [XmlNodeType](../../xmlnodetype/) dari fragmen XML. Ini juga menentukan apa yang dapat berisi string fragmen (lihat tabel di bawah). |
| context | const SharedPtr\<XmlParserContext\>\& | Konteks [XmlParserContext](../../xmlparsercontext/) tempat fragmen XML akan diparsing. Ini mencakup [NameTable](../../nametable/) yang digunakan, pengkodean, ruang nama, **xml:lang** saat ini, dan ruang lingkup **xml:space**. |
## Catatan



Tabel berikut mencantumkan nilai yang valid untuk **fragType** dan bagaimana pembaca mem-parsing setiap jenis node yang berbeda. |||
|-|-|
| XmlNodeType | Fragmen Dapat Memuat |
| Element | Konten elemen yang valid apa pun (misalnya, kombinasi apa pun dari elemen, komentar, instruksi pemrosesan, cdata, teks, dan referensi entitas). |
| Attribute | Nilai dari sebuah atribut (bagian di dalam tanda kutip). |
| Document | Isi dari seluruh dokumen XML; ini menegakkan aturan tingkat dokumen. |

## Lihat Juga

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
