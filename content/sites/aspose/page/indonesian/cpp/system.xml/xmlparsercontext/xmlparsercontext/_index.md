---
title: "Konstruktor System::Xml::XmlParserContext::XmlParserContext"
linktitle: "XmlParserContext"
second_title: "Aspose.Page untuk C++"
description: "Konstruktor System::Xml::XmlParserContext::XmlParserContext. Menginisialisasi sebuah instance baru dari kelas XmlParserContext dengan XmlNameTable, XmlNamespaceManager, URI dasar, xml:lang, xml:space, dan nilai tipe dokumen yang ditentukan dalam C++."
type: docs
weight: 100
url: /id/cpp/system.xml/xmlparsercontext/xmlparsercontext/
---
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace) constructor


Menginisialisasi sebuah instance baru dari kelas [XmlParserContext](../) dengan [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), URI dasar, **xml:lang**, **xml:space**, dan nilai tipe dokumen yang ditentukan.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) yang digunakan untuk mengatomkan string. Jika ini **nullptr**, tabel nama yang digunakan untuk membuat **nsMgr** akan digunakan sebagai gantinya. Untuk informasi lebih lanjut tentang string yang diatomkan, lihat [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | [XmlNamespaceManager](../../xmlnamespacemanager/) yang digunakan untuk mencari informasi namespace, atau **nullptr**. |
| docTypeName | const String\& | Nama deklarasi tipe dokumen. |
| pubId | const String\& | Pengidentifikasi publik. |
| sysId | const String\& | Pengidentifikasi sistem. |
| internalSubset | const String\& | Subset DTD internal. Subset DTD digunakan untuk resolusi entitas, bukan untuk validasi dokumen. |
| baseURI | const String\& | URI dasar untuk fragmen XML (lokasi tempat fragmen dimuat). |
| xmlLang | const String\& | Ruang lingkup **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Sebuah nilai [XmlSpace](../../xmlspace/) yang menunjukkan ruang lingkup **xml:space**. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, const String\&, const String\&, const String\&, const String\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlParserContext](../) dengan [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), base URI, **xml:lang**, **xml:space**, encoding, dan nilai tipe dokumen.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &docTypeName, const String &pubId, const String &sysId, const String &internalSubset, const String &baseURI, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) yang digunakan untuk mengatomkan string. Jika ini **nullptr**, tabel nama yang digunakan untuk membuat **nsMgr** akan digunakan sebagai gantinya. Untuk informasi lebih lanjut tentang string yang diatomkan, lihat [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | [XmlNamespaceManager](../../xmlnamespacemanager/) yang digunakan untuk mencari informasi namespace, atau **nullptr**. |
| docTypeName | const String\& | Nama deklarasi tipe dokumen. |
| pubId | const String\& | Pengidentifikasi publik. |
| sysId | const String\& | Pengidentifikasi sistem. |
| internalSubset | const String\& | Subset DTD internal. DTD digunakan untuk resolusi entitas, bukan untuk validasi dokumen. |
| baseURI | const String\& | URI dasar untuk fragmen XML (lokasi tempat fragmen dimuat). |
| xmlLang | const String\& | Ruang lingkup **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Sebuah nilai [XmlSpace](../../xmlspace/) yang menunjukkan ruang lingkup **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Objek Encoding yang menunjukkan pengaturan encoding. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace) constructor


Menginisialisasi instance baru dari kelas [XmlParserContext](../) dengan [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, dan **xml:space**.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) yang digunakan untuk mengatomkan string. Jika ini **nullptr**, tabel nama yang digunakan untuk membuat **nsMgr** akan digunakan sebagai gantinya. Untuk informasi lebih lanjut tentang string yang diatomkan, lihat [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | [XmlNamespaceManager](../../xmlnamespacemanager/) yang digunakan untuk mencari informasi namespace, atau **nullptr**. |
| xmlLang | const String\& | Ruang lingkup **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Sebuah nilai [XmlSpace](../../xmlspace/) yang menunjukkan ruang lingkup **xml:space**. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlParserContext::XmlParserContext(const SharedPtr\<XmlNameTable\>\&, const SharedPtr\<XmlNamespaceManager\>\&, const String\&, System::Xml::XmlSpace, const SharedPtr\<System::Text::Encoding\>\&) constructor


Menginisialisasi instance baru dari kelas [XmlParserContext](../) dengan [XmlNameTable](../../xmlnametable/), [XmlNamespaceManager](../../xmlnamespacemanager/), **xml:lang**, **xml:space**, dan encoding.

```cpp
System::Xml::XmlParserContext::XmlParserContext(const SharedPtr<XmlNameTable> &nt, const SharedPtr<XmlNamespaceManager> &nsMgr, const String &xmlLang, System::Xml::XmlSpace xmlSpace, const SharedPtr<System::Text::Encoding> &enc)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| nt | const SharedPtr\<XmlNameTable\>\& | [XmlNameTable](../../xmlnametable/) yang digunakan untuk mengatomisasi string. Jika ini **nullptr**, tabel nama yang digunakan untuk membangun **nsMgr** akan digunakan sebagai gantinya. Untuk informasi lebih lanjut tentang string yang diatomisasi, lihat [XmlNameTable](../../xmlnametable/). |
| nsMgr | const SharedPtr\<XmlNamespaceManager\>\& | [XmlNamespaceManager](../../xmlnamespacemanager/) yang digunakan untuk mencari informasi namespace, atau **nullptr**. |
| xmlLang | const String\& | Ruang lingkup **xml:lang**. |
| xmlSpace | System::Xml::XmlSpace | Sebuah nilai [XmlSpace](../../xmlspace/) yang menunjukkan ruang lingkup **xml:space**. |
| enc | const SharedPtr\<System::Text::Encoding\>\& | Objek Encoding yang menunjukkan pengaturan encoding. |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNameTable](../../xmlnametable/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [String](../../../system/string/)
* Enum [XmlSpace](../../xmlspace/)
* Class [Encoding](../../../system.text/encoding/)
* Class [XmlParserContext](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
