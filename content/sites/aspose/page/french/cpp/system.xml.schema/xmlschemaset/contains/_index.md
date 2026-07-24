---
title: "Méthode System::Xml::Schema::XmlSchemaSet::Contains"
linktitle: "Contains"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::Schema::XmlSchemaSet::Contains. Indique si l’objet XmlSchema du langage de définition XML (XSD) spécifié se trouve dans le XmlSchemaSet en C++."
type: docs
weight: 400
url: /fr/cpp/system.xml.schema/xmlschemaset/contains/
---
## XmlSchemaSet::Contains(const SharedPtr\<XmlSchema\>\&) method


Indique si l’objet [XmlSchema](../../xmlschema/) du langage de définition [Schema](../../) XML (XSD) spécifié se trouve dans le [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::Contains(const SharedPtr<XmlSchema> &schema)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | Objet [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object is in the [XmlSchemaSet](../); otherwise, **false**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Contains(String) method


Indique si un schéma [Schema](../../) du langage de définition XML (XSD) avec l’URI d’espace de noms cible spécifié se trouve dans le [XmlSchemaSet](../).

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
* Library [Aspose.Page for C++](../../../)
