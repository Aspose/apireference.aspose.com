---
title: "System::Xml::Xsl::XslCompiledTransform class"
linktitle: "XslCompiledTransform"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Xsl::XslCompiledTransform. Mengubah data XML menggunakan lembar gaya XSLT dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml.xsl/xslcompiledtransform/
---
## XslCompiledTransform class


Mengubah data XML menggunakan lembar gaya XSLT.

```cpp
class XslCompiledTransform : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [get_OutputSettings](./get_outputsettings/)() | Mengembalikan objek [XmlWriterSettings](../../system.xml/xmlwritersettings/) yang berisi informasi output yang diambil dari elemen **xsl:output** pada lembar gaya. |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Mengompilasi lembar gaya yang terdapat dalam [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Mengompilasi lembar gaya XSLT yang terdapat dalam [XmlReader](../../system.xml/xmlreader/). [XmlResolver](../../system.xml/xmlresolver/) menyelesaikan elemen XSLT **import** atau **include** apa pun dan pengaturan XSLT menentukan izin untuk lembar gaya. |
| [Load](./load/)(const String\&) | Memuat dan mengompilasi lembar gaya yang terletak pada URI yang ditentukan. |
| [Load](./load/)(const String\&, const SharedPtr\<XsltSettings\>\&, const SharedPtr\<XmlResolver\>\&) | Memuat dan mengkompilasi lembar gaya XSLT yang ditentukan oleh URI. [XmlResolver](../../system.xml/xmlresolver/) menyelesaikan elemen XSLT **import** atau **include** apa pun dan pengaturan XSLT menentukan izin untuk lembar gaya tersebut. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Mengkompilasi lembar gaya yang terdapat dalam objek IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, SharedPtr\<XsltSettings\>, SharedPtr\<XmlResolver\>) | Mengkompilasi lembar gaya XSLT yang terdapat dalam IXPathNavigable. [XmlResolver](../../system.xml/xmlresolver/) menyelesaikan elemen XSLT **import** atau **include** apa pun dan pengaturan XSLT menentukan izin untuk lembar gaya tersebut. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XmlWriter\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke [XmlWriter](../../system.xml/xmlwriter/). [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke TextWriter. [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke aliran. [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XmlWriter\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh objek [XmlReader](../../system.xml/xmlreader/) dan menghasilkan hasil ke [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh objek [XmlReader](../../system.xml/xmlreader/) dan menghasilkan hasil ke [XmlWriter](../../system.xml/xmlwriter/). [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh objek [XmlReader](../../system.xml/xmlreader/) dan menghasilkan hasil ke TextWriter. [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh objek [XmlReader](../../system.xml/xmlreader/) dan menghasilkan hasil ke aliran. [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XmlWriter\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh URI dan menghasilkan hasil ke [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh URI dan menghasilkan hasil ke [XmlWriter](../../system.xml/xmlwriter/). [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh URI dan menghasilkan hasil ke TextWriter. |
| [Transform](./transform/)(const String\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh URI dan menghasilkan hasil ke aliran. [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan. |
| [Transform](./transform/)(const String\&, const String\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh URI dan menghasilkan hasil ke berkas. |
| [Transform](./transform/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Menjalankan transformasi menggunakan dokumen masukan yang ditentukan oleh objek [XmlReader](../../system.xml/xmlreader/) dan menghasilkan hasil ke [XmlWriter](../../system.xml/xmlwriter/). [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan dan [XmlResolver](../../system.xml/xmlresolver/) menyelesaikan fungsi XSLT **document()**. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<XmlResolver\>\&) | Menjalankan transformasi dengan menggunakan dokumen masukan yang ditentukan oleh objek IXPathNavigable dan menghasilkan hasil ke [XmlWriter](../../system.xml/xmlwriter/). [XsltArgumentList](../xsltargumentlist/) menyediakan argumen runtime tambahan dan [XmlResolver](../../system.xml/xmlresolver/) menyelesaikan fungsi XSLT **document()**. |
| [XslCompiledTransform](./xslcompiledtransform/)() | Menginisialisasi instance baru dari kelas [XslCompiledTransform](./). |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Catatan



Objek dari kelas ini hanya boleh dialokasikan menggunakan fungsi [System::MakeObject()](../../system/makeobject/). Jangan pernah membuat instance tipe ini di stack atau menggunakan operator new, karena akan menyebabkan kesalahan runtime dan/atau kegagalan asersi. Selalu bungkus kelas ini ke dalam pointer [System::SmartPtr](../../system/smartptr/) dan gunakan pointer ini untuk meneruskannya ke fungsi sebagai argumen.

## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
