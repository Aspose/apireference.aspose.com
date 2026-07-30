---
title: "Méthode System::Xml::Schema::XmlSchemaSet::RemoveRecursive"
linktitle: "RemoveRecursive"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Schema::XmlSchemaSet::RemoveRecursive. Supprime le schéma du langage de définition XML Schema (XSD) spécifié ainsi que tous les schémas qu'il importe du XmlSchemaSet en C++."
type: docs
weight: 1400
url: /fr/cpp/system.xml.schema/xmlschemaset/removerecursive/
---
## XmlSchemaSet::RemoveRecursive method


Supprime le schéma du langage de définition XML [Schema](../../) (XSD) spécifié ainsi que tous les schémas qu'il importe du [XmlSchemaSet](../).

```cpp
bool System::Xml::Schema::XmlSchemaSet::RemoveRecursive(const SharedPtr<XmlSchema> &schemaToRemove)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schemaToRemove | const SharedPtr\<XmlSchema\>\& | L'objet [XmlSchema](../../xmlschema/) à supprimer du [XmlSchemaSet](../). |

### ReturnValue

**true** if the [XmlSchema](../../xmlschema/) object and all its imports were successfully removed; otherwise, **false**.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
