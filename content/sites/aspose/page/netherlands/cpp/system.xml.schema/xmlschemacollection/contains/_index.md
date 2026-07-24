---
title: "System::Xml::Schema::XmlSchemaCollection::Contains methode"
linktitle: "Contains"
second_title: "Aspose.Page voor C++"
description: "System::Xml::Schema::XmlSchemaCollection::Contains methode. Retourneert een waarde die aangeeft of de targetNamespace van het opgegeven XmlSchema zich in de collectie bevindt in C++."
type: docs
weight: 300
url: /nl/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


Retourneert een waarde die aangeeft of de **targetNamespace** van het opgegeven [XmlSchema](../../xmlschema/) zich in de collectie bevindt.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Het [XmlSchema](../../xmlschema/) object. |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


Geeft een waarde terug die aangeeft of een schema met de opgegeven namespace zich in de collectie bevindt.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| ns | const String\& | De namespace-URI die aan het schema is gekoppeld. Voor XML-schema's zal dit doorgaans de target-namespace zijn. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## Zie ook

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
