---
title: "System::Xml::Schema::XmlSchemaSet::Contains method"
linktitle: "Contains"
second_title: "Aspose.Font für C++"
description: "System::Xml::Schema::XmlSchemaSet::Contains method. Gibt an, ob das angegebene XML Schema-Definitionssprache (XSD) XmlSchema-Objekt im XmlSchemaSet in C++ enthalten ist."
type: docs
weight: 400
url: /de/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


Gibt an, ob das angegebene XML [Schema](../../)-Definitionssprache (XSD) [XmlSchema](../../xmlschema/)-Objekt im [XmlSchemaSet](../) enthalten ist.

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Das [XmlSchema](../../xmlschema/)-Objekt. |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Contains(String) method


Gibt an, ob ein XML [Schema](../../)-Definitionssprache (XSD)-Schema mit dem angegebenen Ziel-Namespace-URI im [XmlSchemaSet](../) enthalten ist.

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| targetNamespace | String | Die **targetNamespace**-Eigenschaft des Schemas. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## Siehe auch

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
