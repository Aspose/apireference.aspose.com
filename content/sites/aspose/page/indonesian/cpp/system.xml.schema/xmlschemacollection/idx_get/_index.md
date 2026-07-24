---
title: "System::Xml::Schema::XmlSchemaCollection::idx_get method"
linktitle: "idx_get"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaCollection::idx_get method. Mengembalikan XmlSchema yang terkait dengan URI namespace yang diberikan dalam C++."
type: docs
weight: 800
url: /id/cpp/system.xml.schema/xmlschemacollection/idx_get/
---
## XmlSchemaCollection::idx_get method


Mengembalikan [XmlSchema](../../xmlschema/) yang terkait dengan URI namespace yang diberikan.

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaCollection::idx_get(const String &ns)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ns | const String\& | URI namespace yang terkait dengan skema yang ingin Anda kembalikan. Ini biasanya adalah **targetNamespace** dari skema tersebut. |

### ReturnValue

[XmlSchema](../../xmlschema/) yang terkait dengan URI namespace; **nullptr** jika tidak ada skema yang dimuat yang terkait dengan namespace yang diberikan atau jika namespace tersebut terkait dengan skema XDR.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
