---
title: "System::Xml::Schema::XmlSchemaSet::Add methode"
linktitle: "Add"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaSet::Add methode. Voegt het opgegeven XmlSchema toe aan de XmlSchemaSet in C++."
type: docs
weight: 200
url: /nl/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


Voegt het opgegeven [XmlSchema](../../xmlschema/) toe aan de [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Het [XmlSchema](../../xmlschema/) object om toe te voegen aan de [XmlSchemaSet](../). |

### ReturnValue

Een [XmlSchema](../../xmlschema/) object als het schema geldig is. Als het schema niet geldig is en een [ValidationEventHandler](../../validationeventhandler/) is gespecificeerd, dan wordt **nullptr** geretourneerd en wordt het juiste validatie‑event opgehaald. Anders wordt een [XmlSchemaException](../../xmlschemaexception/) gegooid.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


Voegt alle XML [Schema](../../) definitietaal (XSD) schema's in de opgegeven [XmlSchemaSet](../) toe aan de [XmlSchemaSet](../).

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | Het [XmlSchemaSet](../) object. |

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


Voegt het XML [Schema](../../) definitietaal (XSD) schema dat zich bevindt in de [XmlReader](../../../system.xml/xmlreader/) toe aan de [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| targetNamespace | String | De **targetNamespace** waarde van het schema, of **nullptr** om de **targetNamespace** te gebruiken die in het schema is opgegeven. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | Het [XmlReader](../../../system.xml/xmlreader/) object. |

### ReturnValue

Een [XmlSchema](../../xmlschema/) object als het schema geldig is. Als het schema niet geldig is en een [ValidationEventHandler](../../validationeventhandler/) is gespecificeerd, dan wordt **nullptr** geretourneerd en wordt het juiste validatie‑event opgehaald. Anders wordt een [XmlSchemaException](../../xmlschemaexception/) gegooid.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


Voegt het XML [Schema](../../) definitietaal (XSD) schema op de opgegeven URL toe aan de [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| targetNamespace | String | De **targetNamespace** waarde van het schema, of **nullptr** om de **targetNamespace** te gebruiken die in het schema is opgegeven. |
| schemaUri | const String\& | De URL die het te laden schema specificeert. |

### ReturnValue

Een [XmlSchema](../../xmlschema/) object als het schema geldig is. Als het schema niet geldig is en een [ValidationEventHandler](../../validationeventhandler/) is gespecificeerd, dan wordt **nullptr** geretourneerd en wordt het juiste validatie‑event opgehaald. Anders wordt een [XmlSchemaException](../../xmlschemaexception/) gegooid.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
