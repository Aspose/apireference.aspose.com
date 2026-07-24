---
title: "Metode System::Xml::XmlTextWriter::WriteDocType"
linktitle: "WriteDocType"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::XmlTextWriter::WriteDocType. Menulis deklarasi DOCTYPE dengan nama yang ditentukan dan atribut opsional dalam C++."
type: docs
weight: 2500
url: /id/cpp/system.xml/xmltextwriter/writedoctype/
---
## XmlTextWriter::WriteDocType method


Menulis deklarasi DOCTYPE dengan nama yang ditentukan dan atribut opsional.

```cpp
void System::Xml::XmlTextWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset) override
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | const String\& | Nama DOCTYPE. Ini harus tidak kosong. |
| pubid | const String\& | Jika tidak null, juga menulis PUBLIC \"pubid\" \"sysid\" dimana **pubid** dan **sysid** diganti dengan nilai argumen yang diberikan. |
| sysid | const String\& | Jika **pubid** null dan **sysid** tidak null, menulis SYSTEM \"sysid\" dimana **sysid** diganti dengan nilai argumen ini. |
| subset | const String\& | Jika tidak null, menulis [subset] dimana subset diganti dengan nilai argumen ini. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlTextWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
