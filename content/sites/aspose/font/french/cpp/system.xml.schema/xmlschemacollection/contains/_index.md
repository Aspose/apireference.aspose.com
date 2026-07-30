---
title: "System::Xml::Schema::XmlSchemaCollection::Contains méthode"
linktitle: "Contains"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaCollection::Contains méthode. Retourne une valeur indiquant si le targetNamespace du XmlSchema spécifié se trouve dans la collection en C++."
type: docs
weight: 300
url: /fr/cpp/system.xml.schema/xmlschemacollection/contains/
---
## XmlSchemaCollection::Contains(const SharedPtr\<XmlSchema\>\&) method


Retourne une valeur indiquant si le **targetNamespace** du [XmlSchema](../../xmlschema/) spécifié est présent dans la collection.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const SharedPtr<XmlSchema> &schema)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | L'objet [XmlSchema](../../xmlschema/). |

### ReturnValue

**true** if there is a schema in the collection with the same **targetNamespace**; otherwise, **false**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaCollection::Contains(const String\&) method


Renvoie une valeur indiquant si un schéma avec l'espace de noms spécifié se trouve dans la collection.

```cpp
bool System::Xml::Schema::XmlSchemaCollection::Contains(const String &ns)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| ns | const String\& | L'URI d'espace de noms associé au schéma. Pour les schémas XML, il s'agit généralement de l'espace de noms cible. |

### ReturnValue

**true** if a schema with the specified namespace is in the collection; otherwise, **false**.

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlSchemaCollection](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
