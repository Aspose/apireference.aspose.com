---
title: "System::Xml::Schema::XmlSchemaCollection::Contains Methode"
linktitle: "Contains"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaCollection::Contains Methode. Gibt einen Wert zurück, der angibt, ob das targetNamespace des angegebenen XmlSchema in der Sammlung in C++ enthalten ist."
type: docs
weight: 300
url: /de/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


Gibt einen Wert zurück, der angibt, ob das **targetNamespace** des angegebenen [XmlSchema](../../xmlschema/) in der Sammlung enthalten ist.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Das [XmlSchema](../../xmlschema/)-Objekt. |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


Gibt einen Wert zurück, der angibt, ob ein Schema mit dem angegebenen Namespace in der Sammlung enthalten ist.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| ns | const String\& | Der Namespace-URI, der dem Schema zugeordnet ist. Für XML Schemas ist dies typischerweise das Ziel-Namespace. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
