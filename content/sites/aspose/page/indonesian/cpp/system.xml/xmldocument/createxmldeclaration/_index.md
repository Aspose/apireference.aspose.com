---
title: "Metode System::Xml::XmlDocument::CreateXmlDeclaration"
linktitle: "CreateXmlDeclaration"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlDocument::CreateXmlDeclaration. Membuat node XmlDeclaration dengan nilai yang ditentukan dalam C++."
type: docs
weight: 1600
url: /id/cpp/system.xml/xmldocument/createxmldeclaration/
---
## XmlDocument::CreateXmlDeclaration method


Membuat node [XmlDeclaration](../../xmldeclaration/) dengan nilai yang ditentukan.

```cpp
virtual SharedPtr<XmlDeclaration> System::Xml::XmlDocument::CreateXmlDeclaration(const String &version, const String &encoding, const String &standalone)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| versi | const String\& | Versi harus "1.0". |
| encoding | const String\& | Nilai atribut encoding. Ini adalah encoding yang digunakan saat Anda menyimpan [XmlDocument](../) ke file atau aliran; oleh karena itu, harus diatur ke string yang didukung oleh kelas [Text::Encoding](../../../system.text/encoding/), jika tidak "XmlDocument::Save(String)" gagal. Jika ini **nullptr** atau [String::Empty](../../../system/string/empty/), metode [XmlDocument::Save](../save/) tidak menulis atribut encoding pada deklarasi XML dan sehingga encoding default, UTF-8, digunakan. |
| standalone | const String\& | Nilai harus "yes" atau "no". Jika ini **nullptr** atau [String::Empty](../../../system/string/empty/), metode [XmlDocument::Save](../save/) tidak menulis atribut standalone pada deklarasi XML. |

### ReturnValue

[XmlDeclaration](../../xmldeclaration/) node baru.
## Catatan



Catatan: Jika [XmlDocument](../) disimpan ke TextWriter atau [XmlTextWriter](../../xmltextwriter/), nilai encoding ini dibuang. Sebagai gantinya, encoding dari TextWriter atau [XmlTextWriter](../../xmltextwriter/) yang digunakan. Hal ini memastikan bahwa XML yang ditulis dapat dibaca kembali menggunakan encoding yang benar.
## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlDeclaration](../../xmldeclaration/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
