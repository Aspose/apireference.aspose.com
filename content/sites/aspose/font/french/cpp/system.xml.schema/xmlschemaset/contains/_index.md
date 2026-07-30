---
title: "System::Xml::Schema::XmlSchemaSet::Contains method"
linktitle: "Contains"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaSet::Contains method. Indique si l'objet XmlSchema de définition de langage XML Schema (XSD) spécifié se trouve dans le XmlSchemaSet en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


Indique si l'objet [XmlSchema](../../xmlschema/) de définition de langage XML [Schema](../../) (XSD) spécifié se trouve dans le [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | L'objet [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Contains(String) method


Indique si un schéma XML [Schema](../../) de langage de définition (XSD) avec l'URI d'espace de noms cible spécifié se trouve dans le [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(String targetNamespace)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| targetNamespace | String | La propriété **targetNamespace** du schéma. |

### ReturnValue

**true** if a schema with the specified target namespace URI is in the [XmlSchemaSet](../); otherwise, **false**.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
