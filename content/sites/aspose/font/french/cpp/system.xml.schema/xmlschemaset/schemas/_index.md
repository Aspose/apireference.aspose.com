---
title: "Méthode System::Xml::Schema::XmlSchemaSet::Schemas"
linktitle: "Schémas"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Schema::XmlSchemaSet::Schemas. Retourne une collection de tous les schémas de langage de définition XML Schema (XSD) du XmlSchemaSet en C++."
type: docs
weight: 1600
url: /fr/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Retourne une collection de tous les schémas de langage de définition XML [Schema](../../) (XSD) du [XmlSchemaSet](../).

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

Un objet IList contenant tous les schémas qui ont été ajoutés au [XmlSchemaSet](../). Si aucun schéma n'a été ajouté au [XmlSchemaSet](../), une collection vide est renvoyée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Retourne une collection de tous les schémas de langage de définition XML [Schema](../../) (XSD) du [XmlSchemaSet](../) qui appartiennent à l'espace de noms donné.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| targetNamespace | String | La propriété **targetNamespace** du schéma. |

### ReturnValue

Un objet IList contenant tous les schémas qui ont été ajoutés au [XmlSchemaSet](../) et qui appartiennent à l'espace de noms donné. Si aucun schéma n'a été ajouté au [XmlSchemaSet](../), une collection vide est renvoyée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
