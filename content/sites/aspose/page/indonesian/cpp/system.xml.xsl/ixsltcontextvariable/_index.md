---
title: "System::Xml::Xsl::IXsltContextVariable class"
linktitle: "IXsltContextVariable"
second_title: "Aspose.Page untuk C++"
description: "Kelas System::Xml::Xsl::IXsltContextVariable. Menyediakan antarmuka untuk variabel tertentu yang didefinisikan dalam lembar gaya selama eksekusi waktu berjalan di C++."
type: docs
weight: 200
url: /id/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


Menyediakan antarmuka ke variabel tertentu yang didefinisikan dalam lembar gaya selama eksekusi runtime.

```cpp
class IXsltContextVariable : public virtual System::Object
```

## Metode

| Metode | Deskripsi |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | Mengevaluasi variabel pada waktu jalan dan mengembalikan objek yang mewakili nilai variabel tersebut. |
| virtual [get_IsLocal](./get_islocal/)() | Mengembalikan nilai yang menunjukkan apakah variabel bersifat lokal. |
| virtual [get_IsParam](./get_isparam/)() | Mengembalikan nilai yang menunjukkan apakah variabel adalah parameter Extensible Stylesheet Language Transformations (XSLT). Ini dapat menjadi parameter untuk lembar gaya atau templat. |
| virtual [get_VariableType](./get_variabletype/)() | Mengembalikan XPathResultType yang mewakili tipe XML Path Language ([XPath](../../system.xml.xpath/)) dari variabel. |
## Lihat Juga

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
