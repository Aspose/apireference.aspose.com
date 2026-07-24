---
title: "System::Xml::XmlTextReader::get_Value method"
linktitle: "get_Value"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlTextReader::get_Value method. Mengembalikan nilai teks dari node saat ini dalam C++."
type: docs
weight: 2900
url: /id/cpp/system.xml/xmltextreader/get_value/
---
## XmlTextReader::get_Value method


Mengembalikan nilai teks dari node saat ini.

```cpp
String System::Xml::XmlTextReader::get_Value() override
```


### ReturnValue

Nilai yang dikembalikan tergantung pada nilai [XmlTextReader::get_NodeType](../get_nodetype/) dari node.
## Catatan



Tabel berikut mencantumkan jenis node yang memiliki nilai untuk dikembalikan. Semua jenis node lainnya mengembalikan [String::Empty](../../../system/string/empty/). |||
|-|-|
| Tipe Node | Nilai |
| Attribute | Nilai atribut. |
| CDATA | Konten bagian CDATA. |
| Comment | Konten komentar. |
| DocumentType | Subset internal. |
| ProcessingInstruction | Seluruh konten, kecuali target. |
| SignificantWhitespace | Spasi putih di dalam ruang lingkup xml:space='preserve'. |
| Text | Isi node teks. |
| Spasi | Spasi putih di antara markup. |
| XmlDeclaration | Konten deklarasi. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
