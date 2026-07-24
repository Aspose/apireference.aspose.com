---
title: "System::Xml::Schema::XmlSchemaSet::Add metode"
linktitle: "Add"
second_title: "Aspose.Page untuk C++"
description: "System::Xml::Schema::XmlSchemaSet::Add metode. Menambahkan XmlSchema yang diberikan ke XmlSchemaSet dalam C++."
type: docs
weight: 200
url: /id/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


Menambahkan [XmlSchema](../../xmlschema/) yang diberikan ke [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Objek [XmlSchema](../../xmlschema/) untuk ditambahkan ke [XmlSchemaSet](../). |

### ReturnValue

Objek [XmlSchema](../../xmlschema/) jika skema valid. Jika skema tidak valid dan [ValidationEventHandler](../../validationeventhandler/) ditentukan, maka **nullptr** dikembalikan dan peristiwa validasi yang sesuai diangkat. Jika tidak, [XmlSchemaException](../../xmlschemaexception/) dilempar.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


Menambahkan semua skema XML [Schema](../../) definition language (XSD) dalam [XmlSchemaSet](../) yang diberikan ke [XmlSchemaSet](../).

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | Objek [XmlSchemaSet](../). |

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


Menambahkan skema XML [Schema](../../) definition language (XSD) yang terdapat dalam [XmlReader](../../../system.xml/xmlreader/) ke [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| targetNamespace | String | Nilai **targetNamespace** skema, atau **nullptr** untuk menggunakan **targetNamespace** yang ditentukan dalam skema. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | Objek [XmlReader](../../../system.xml/xmlreader/). |

### ReturnValue

Objek [XmlSchema](../../xmlschema/) jika skema valid. Jika skema tidak valid dan [ValidationEventHandler](../../validationeventhandler/) ditentukan, maka **nullptr** dikembalikan dan peristiwa validasi yang sesuai diangkat. Jika tidak, [XmlSchemaException](../../xmlschemaexception/) dilempar.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


Menambahkan skema XML [Schema](../../) definition language (XSD) pada URL yang ditentukan ke [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| targetNamespace | String | Nilai **targetNamespace** skema, atau **nullptr** untuk menggunakan **targetNamespace** yang ditentukan dalam skema. |
| schemaUri | const String\& | URL yang menentukan skema yang akan dimuat. |

### ReturnValue

Objek [XmlSchema](../../xmlschema/) jika skema valid. Jika skema tidak valid dan [ValidationEventHandler](../../validationeventhandler/) ditentukan, maka **nullptr** dikembalikan dan peristiwa validasi yang sesuai diangkat. Jika tidak, [XmlSchemaException](../../xmlschemaexception/) dilempar.

## Lihat Juga

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
