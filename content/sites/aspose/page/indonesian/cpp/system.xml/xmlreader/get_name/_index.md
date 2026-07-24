---
title: "System::Xml::XmlReader::get_Name method"
linktitle: "get_Name"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlReader::get_Name method. Ketika dioverride dalam kelas turunan, mendapatkan nama lengkap dari node saat ini dalam C++."
type: docs
weight: 1500
url: /id/cpp/system.xml/xmlreader/get_name/
---
## XmlReader::get_Name method


Saat ditimpa dalam kelas turunan, mendapatkan nama yang memenuhi syarat (qualified) dari node saat ini.

```cpp
virtual String System::Xml::XmlReader::get_Name()
```


### ReturnValue

Nama yang memenuhi syarat dari node saat ini. Misalnya, **Name** adalah **bk:book** untuk elemen **<bk:book>**.
## Catatan



Nama yang dikembalikan bergantung pada nilai [XmlReader::get_NodeType](../get_nodetype/) dari node. Tipe node berikut mengembalikan nilai yang tercantum. Semua tipe node lainnya mengembalikan string kosong. |||
|-|-|
| Tipe node | Nama |
| Attribute | Nama atribut. |
| DocumentType | Nama tipe dokumen. |
| Element | Nama tag. |
| EntityReference | Nama entitas yang dirujuk. |
| ProcessingInstruction | Target instruksi pemrosesan. |
| XmlDeclaration | String literal xml. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
