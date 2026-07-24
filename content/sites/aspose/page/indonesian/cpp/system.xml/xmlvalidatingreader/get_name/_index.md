---
title: "System::Xml::XmlValidatingReader::get_Name metode"
linktitle: "get_Name"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlValidatingReader::get_Name metode. Mengembalikan nama yang memenuhi syarat dari node saat ini dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


Mengembalikan nama yang memenuhi syarat dari node saat ini.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

Nama yang memenuhi syarat dari node saat ini. Misalnya, **Name** adalah **bk:book** untuk elemen **<bk:book>**.
## Catatan



Nama yang dikembalikan bergantung pada XmlValidatingReader::NodeType dari node. Tipe node berikut mengembalikan nilai yang tercantum. Semua tipe node lainnya mengembalikan string kosong. |||
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
