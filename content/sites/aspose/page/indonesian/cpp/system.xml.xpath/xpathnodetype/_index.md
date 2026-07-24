---
title: "enum System::Xml::XPath::XPathNodeType"
linktitle: "XPathNodeType"
second_title: "Aspose.Page untuk C++"
description: "enum System::Xml::XPath::XPathNodeType. Mendefinisikan tipe node XPath yang dapat dikembalikan dari kelas XPathNavigator dalam C++."
type: docs
weight: 1100
url: /id/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


Mendefinisikan tipe node [XPath](../) yang dapat dikembalikan dari kelas [XPathNavigator](../xpathnavigator/).

```cpp
enum class XPathNodeType
```

### Nilai

| Nama | Nilai | Deskripsi |
| --- | --- | --- |
| Root | 0 | Node akar dari dokumen XML atau pohon node. |
| Element | 1 | Sebuah elemen, seperti **<element>**. |
| Attribute | 2 | Sebuah atribut, seperti **id='123'**. |
| Namespace | 3 | Sebuah namespace, seperti **xmlns="namespace"**. |
| Text | 4 | Konten teks dari sebuah node. Setara dengan Model Objek Dokumen (DOM) [Object](../../system/object/) [Text](../../system.text/) dan tipe node CDATA. Mengandung setidaknya satu karakter. |
| SignificantWhitespace | 5 | Sebuah node dengan karakter spasi putih dan **xml:space** disetel ke **preserve**. |
| Spasi | 6 | Sebuah node dengan hanya karakter spasi putih dan tidak ada spasi putih yang signifikan. Karakter spasi putih adalah **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | Sebuah instruksi pemrosesan, seperti **<?pi test?>**. Ini tidak termasuk deklarasi XML, yang tidak terlihat oleh kelas [XPathNavigator](../xpathnavigator/). |
| Comment | 8 | Sebuah komentar, seperti ****. |
| All | 9 | Salah satu tipe node [XPathNodeType](./). |

## Lihat Juga

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
