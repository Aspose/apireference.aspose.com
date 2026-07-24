---
title: "System::Xml::XmlValidatingReader::get_Value method"
linktitle: "get_Value"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlValidatingReader::get_Value method. Mengembalikan nilai teks dari node saat ini dalam C++."
type: docs
weight: 2900
url: /id/cpp/system.xml/xmlvalidatingreader/get_value/
---
## XmlValidatingReader::get_Value method


Mengembalikan nilai teks dari node saat ini.

```cpp
String System::Xml::XmlValidatingReader::get_Value() override
```


### ReturnValue

Nilai yang dikembalikan tergantung pada XmlValidatingReader::NodeType dari node tersebut.
## Catatan



Tabel berikut mencantumkan jenis node yang memiliki nilai untuk dikembalikan. Semua jenis node lainnya mengembalikan [String::Empty](../../../system/string/empty/). |||
|-|-|
| Tipe Node | Nilai |
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
