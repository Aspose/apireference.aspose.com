---
title: "Metodo System::Xml::Schema::XmlSchemaSet::Contains"
linktitle: "Contains"
second_title: "Aspose.Page per C++"
description: "Metodo System::Xml::Schema::XmlSchemaSet::Contains. Indica se l'oggetto XmlSchema del linguaggio di definizione XML Schema (XSD) specificato è presente nell'XmlSchemaSet in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


Indica se l'oggetto [XmlSchema](../../xmlschema/) del linguaggio di definizione XML [Schema](../../) (XSD) specificato è presente nel [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | L'oggetto [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Contains(String) method


Indica se uno schema XML [Schema](../../) (XSD) con lo spazio dei nomi target specificato è presente nel [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetNamespace | String | La proprietà **targetNamespace** dello schema. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
