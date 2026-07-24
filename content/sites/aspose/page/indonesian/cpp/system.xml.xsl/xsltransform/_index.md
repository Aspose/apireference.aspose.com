---
title: "System::Xml::Xsl::XslTransform kelas"
linktitle: "XslTransform"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Xsl::XslTransform kelas. Mengubah data XML menggunakan lembar gaya Extensible Stylesheet Language for Transformations (XSLT) dalam C++."
type: docs
weight: 700
url: /id/cpp/system.xml.xsl/xsltransform/
---
## XslTransform class


Mengubah data XML menggunakan lembar gaya Extensible Stylesheet Language for Transformations (XSLT).

```cpp
class XslTransform : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&) | Memuat lembar gaya XSLT yang terdapat dalam [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<XmlReader\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Memuat lembar gaya XSLT yang terdapat dalam [XmlReader](../../system.xml/xmlreader/). |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&) | Memuat lembar gaya XSLT yang terdapat dalam IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Memuat lembar gaya XSLT yang terdapat dalam IXPathNavigable. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&) | Memuat lembar gaya XSLT yang terdapat dalam XPathNavigator. |
| [Load](./load/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Memuat lembar gaya XSLT yang terdapat dalam XPathNavigator. |
| [Load](./load/)(const String\&) | Memuat lembar gaya XSLT yang ditentukan oleh URL. |
| [Load](./load/)(const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Memuat lembar gaya XSLT yang ditentukan oleh URL. |
| [set_XmlResolver](./set_xmlresolver/)(const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengatur [XmlResolver](../../system.xml/xmlresolver/) yang digunakan untuk menyelesaikan sumber daya eksternal ketika metode [XslTransform::Transform](./transform/) dipanggil. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&) | Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengubah data XML dalam XPathNavigator menggunakan args yang ditentukan dan mengeluarkan hasilnya ke [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Mengubah data XML dalam XPathNavigator menggunakan args yang ditentukan dan mengeluarkan hasilnya ke [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::XPathNavigator\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Mengubah data XML dalam XPathNavigator menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&) | Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke [XmlReader](../../system.xml/xmlreader/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::TextWriter\>\&) | Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke TextWriter. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<IO::Stream\>\&) | Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke Stream. |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const SharedPtr\<System::Xml::XPath::IXPathNavigable\>\&, const SharedPtr\<XsltArgumentList\>\&, const SharedPtr\<XmlWriter\>\&) | Mengubah data XML dalam IXPathNavigable menggunakan **args** yang ditentukan dan mengeluarkan hasilnya ke [XmlWriter](../../system.xml/xmlwriter/). |
| [Transform](./transform/)(const String\&, const String\&, const SharedPtr\<System::Xml::XmlResolver\>\&) | Mengubah data XML dalam file masukan dan mengeluarkan hasilnya ke file keluaran. |
| [Transform](./transform/)(const String\&, const String\&) | Mengubah data XML dalam file masukan dan mengeluarkan hasilnya ke file keluaran. |
| [XslTransform](./xsltransform/)() | Menginisialisasi sebuah instance baru dari kelas [XslTransform](./). |
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
