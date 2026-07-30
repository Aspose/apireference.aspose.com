---
title: "System::Xml::Schema::XmlSchemaCollection::Contains metodo"
linktitle: "Contains"
second_title: "Aspose.Font per C++"
description: "System::Xml::Schema::XmlSchemaCollection::Contains metodo. Restituisce un valore che indica se il targetNamespace dello XmlSchema specificato è presente nella collezione in C++."
type: docs
weight: 300
url: /it/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


Restituisce un valore che indica se il **targetNamespace** del [XmlSchema](../../xmlschema/) specificato è presente nella collezione.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | L'oggetto [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


Restituisce un valore che indica se uno schema con il namespace specificato è nella collezione.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| ns | const String\& | L'URI dello spazio dei nomi associato allo schema. Per gli XML Schema, tipicamente sarà lo spazio dei nomi target. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## Vedi anche

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
