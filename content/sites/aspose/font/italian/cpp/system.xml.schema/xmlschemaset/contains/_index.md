---
title: "System::Xml::Schema::XmlSchemaSet::Contains method"
linktitle: "Contains"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaSet::Contains method. Indica se l'oggetto XmlSchema della definizione del linguaggio XML Schema (XSD) specificato è presente nell'XmlSchemaSet in C++."
type: docs
weight: 400
url: /it/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


Indica se l'oggetto [XmlSchema](../../xmlschema/) della definizione del linguaggio XML [Schema](../../) (XSD) specificato è presente nel [XmlSchemaSet](../).

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
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Contains(String) method


Indica se uno schema XML [Schema](../../) della definizione del linguaggio (XSD) con lo spazio dei nomi di destinazione URI specificato è presente nel [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| targetNamespace | Stringa | La proprietà **targetNamespace** dello schema. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
