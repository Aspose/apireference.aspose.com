---
title: "System::Xml::XmlReader::get_Value metode"
linktitle: "get_Value"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::get_Value metode. Ketika dioverride dalam kelas turunan, mengambil nilai teks dari node saat ini dalam C++."
type: docs
weight: 2400
url: /id/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


Saat ditimpa dalam kelas turunan, mengambil nilai teks dari node saat ini.

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

Nilai yang dikembalikan tergantung pada nilai [XmlReader::get_NodeType](../get_nodetype/) dari node.
## Catatan



Tabel berikut mencantumkan jenis node yang memiliki nilai untuk dikembalikan. Semua jenis node lainnya mengembalikan [String::Empty](../../../system/string/empty/). |||
|-|-|
| Tipe node | Nilai |
| Attribute | Nilai atribut. |
| CDATA | Konten bagian CDATA. |
| Comment | Konten komentar. |
| DocumentType | Subset internal. |
| ProcessingInstruction | Seluruh konten, kecuali target. |
| SignificantWhitespace | Spasi putih di antara markup dalam model konten campuran. |
| Text | Isi node teks. |
| Spasi | Spasi putih di antara markup. |
| XmlDeclaration | Konten deklarasi. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
