---
title: "Metode System::Xml::XmlTextReader::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlTextReader::get_Name. Mengembalikan nama yang memenuhi syarat dari node saat ini dalam C++."
type: docs
weight: 1900
url: /id/cpp/system.xml/xmltextreader/get_name/
---
## XmlTextReader::get_Name method


Mengembalikan nama yang memenuhi syarat dari node saat ini.

```cpp
String System::Xml::XmlTextReader::get_Name() override
```


### ReturnValue

Nama yang memenuhi syarat dari node saat ini. Misalnya, **Name** adalah **bk:book** untuk elemen **<bk:book>**.
## Catatan



Nama yang dikembalikan tergantung pada nilai [XmlTextReader::get_NodeType](../get_nodetype/) dari node. Jenis node berikut mengembalikan nilai yang tercantum. Semua jenis node lainnya mengembalikan string kosong. |||
|-|-|
| Tipe Node | Nama |
| Attribute | Nama atribut. |
| DocumentType | Nama tipe dokumen. |
| Element | Nama tag. |
| EntityReference | Nama entitas yang dirujuk. |
| ProcessingInstruction | Target instruksi pemrosesan. |
| XmlDeclaration | String literal xml. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
