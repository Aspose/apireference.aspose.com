---
title: "System::Xml::XmlWriter::WriteDocType method"
linktitle: "WriteDocType"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::XmlWriter::WriteDocType method. Ketika dioverride dalam kelas turunan, menulis deklarasi DOCTYPE dengan nama yang ditentukan dan atribut opsional dalam C++."
type: docs
weight: 1700
url: /id/cpp/system.xml/xmlwriter/writedoctype/
---
## XmlWriter::WriteDocType method


Ketika dioverride dalam kelas turunan, menulis deklarasi DOCTYPE dengan nama yang ditentukan dan atribut opsional.

```cpp
virtual void System::Xml::XmlWriter::WriteDocType(const String &name, const String &pubid, const String &sysid, const String &subset)=0
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| name | const String\& | Nama DOCTYPE. Ini harus tidak kosong. |
| pubid | const String\& | Jika tidak null, juga menulis PUBLIC \"pubid\" \"sysid\" dimana **pubid** dan **sysid** diganti dengan nilai argumen yang diberikan. |
| sysid | const String\& | Jika **pubid** adalah **nullptr** dan **sysid** tidak null, maka menulis SYSTEM \"sysid\" di mana **sysid** diganti dengan nilai argumen ini. |
| subset | const String\& | Jika tidak null, menulis [subset] dimana subset diganti dengan nilai argumen ini. |

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
