---
title: "Metode System::Xml::Schema::XmlSchemaSet::Reprocess"
linktitle: "Proses Ulang"
second_title: "Aspose.Page untuk C++"
description: "Metode System::Xml::Schema::XmlSchemaSet::Reprocess. Memproses ulang skema definisi bahasa XML Schema (XSD) yang sudah ada dalam XmlSchemaSet di C++."
type: docs
weight: 1500
url: /id/cpp/system.xml.schema/xmlschemaset/reprocess/
---
## XmlSchemaSet::Reprocess method


Memproses ulang skema definisi bahasa XML [Schema](../../) (XSD) yang sudah ada dalam [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Reprocess(SharedPtr<XmlSchema> schema)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| skema | SharedPtr\<XmlSchema\> | Skema yang akan diproses ulang. |

### ReturnValue

Objek [XmlSchema](../../xmlschema/) jika skema tersebut valid. Jika skema tidak valid dan [ValidationEventHandler](../../validationeventhandler/) ditentukan, **nullptr** dikembalikan dan peristiwa validasi yang sesuai diangkat. Jika tidak, [XmlSchemaException](../../xmlschemaexception/) dilempar.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
