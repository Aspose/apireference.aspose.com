---
title: "Kelas System::Xml::Xsl::XsltContext"
linktitle: "XsltContext"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Xsl::XsltContext. Mengenkapsulasi konteks eksekusi saat ini dari prosesor Extensible Stylesheet Language for Transformations (XSLT) yang memungkinkan XML Path Language (XPath) untuk menyelesaikan fungsi, parameter, dan namespace dalam ekspresi XPath di C++."
type: docs
weight: 500
url: /id/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Mengkapsulasi konteks eksekusi saat ini dari prosesor Extensible Stylesheet Language for Transformations (XSLT) yang memungkinkan XML Path Language ([XPath](../../system.xml.xpath/)) untuk menyelesaikan fungsi, parameter, dan namespace dalam ekspresi [XPath](../../system.xml.xpath/).

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | Saat dioverride dalam kelas turunan, membandingkan Uniform Resource Identifier (URI) dasar dari dua dokumen berdasarkan urutan dokumen dimuat oleh prosesor XSLT (yaitu, kelas [XslTransform](../xsltransform/)). |
| virtual [get_Whitespace](./get_whitespace/)() | Saat dioverride dalam kelas turunan, mendapatkan nilai yang menunjukkan apakah akan menyertakan node spasi putih dalam output. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Saat dioverride dalam kelas turunan, mengevaluasi apakah akan mempertahankan node spasi putih atau menghapusnya untuk konteks yang diberikan. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | Saat dioverride dalam kelas turunan, menyelesaikan referensi fungsi dan mengembalikan sebuah [IXsltContextFunction](../ixsltcontextfunction/) yang mewakili fungsi tersebut. [IXsltContextFunction](../ixsltcontextfunction/) digunakan pada waktu eksekusi untuk mendapatkan nilai kembali fungsi. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | Saat dioverride dalam kelas turunan, menyelesaikan referensi variabel dan mengembalikan sebuah [IXsltContextVariable](../ixsltcontextvariable/) yang mewakili variabel tersebut. |
## Typedefs

| Typedef | Deskripsi |
| --- | --- |
| [Ptr](./ptr/) | Alias untuk shared pointer ke instance kelas ini. |
## Lihat Juga

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
