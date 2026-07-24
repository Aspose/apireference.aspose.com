---
title: "Kelas System::Xml::Xsl::IXsltContextFunction"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Xsl::IXsltContextFunction. Menyediakan antarmuka untuk fungsi tertentu yang didefinisikan dalam lembar gaya Extensible Stylesheet Language for Transformations (XSLT) selama eksekusi waktu jalan di C++."
type: docs
weight: 100
url: /id/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


Menyediakan antarmuka ke fungsi tertentu yang didefinisikan dalam lembar gaya Extensible Stylesheet Language for Transformations (XSLT) selama eksekusi runtime.

```cpp
class IXsltContextFunction : public System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | Mengembalikan tipe XML Path Language ([XPath](../../system.xml.xpath/)) yang disediakan untuk daftar argumen fungsi. Informasi ini dapat digunakan untuk menemukan tanda tangan fungsi yang memungkinkan Anda membedakan antara fungsi yang overload. |
| virtual [get_Maxargs](./get_maxargs/)() | Mengembalikan jumlah maksimum argumen untuk fungsi. Ini memungkinkan pengguna membedakan antara fungsi yang overload. |
| virtual [get_Minargs](./get_minargs/)() | Mengembalikan jumlah minimum argumen untuk fungsi. Ini memungkinkan pengguna membedakan antara fungsi yang overload. |
| virtual [get_ReturnType](./get_returntype/)() | Mengembalikan XPathResultType yang mewakili tipe [XPath](../../system.xml.xpath/) yang dikembalikan oleh fungsi. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Menyediakan metode untuk memanggil fungsi dengan argumen yang diberikan dalam konteks yang diberikan. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
