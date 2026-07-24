---
title: "System::Xml::Schema::XmlSchemaCollection::Contains metode"
linktitle: "Contains"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaCollection::Contains metode. Mengembalikan nilai yang menunjukkan apakah targetNamespace dari XmlSchema yang ditentukan berada dalam koleksi dalam C++."
type: docs
weight: 300
url: /id/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


Mengembalikan nilai yang menunjukkan apakah **targetNamespace** dari [XmlSchema](../../xmlschema/) yang ditentukan berada dalam koleksi.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Objek [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


Mengembalikan nilai yang menunjukkan apakah ada skema dengan namespace yang ditentukan dalam koleksi.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ns | const String\& | URI namespace yang terkait dengan skema. Untuk XML Schema, ini biasanya akan menjadi target namespace. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## Lihat Juga

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
