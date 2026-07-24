---
title: "System::Xml::Schema::XmlSchemaSet::Schemas méthode"
linktitle: "Schémas"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::Schema::XmlSchemaSet::Schemas. Retourne une collection de tous les schémas du langage de définition XML (XSD) dans le XmlSchemaSet en C++."
type: docs
weight: 1600
url: /fr/cpp/system.xml.schema/xmlschemaset/schemas/
---
## XmlSchemaSet::Schemas() method


Retourne une collection de tous les schémas du langage de définition [Schema](../../) XML (XSD) dans le [XmlSchemaSet](../).

```cpp
SharedPtr<Collections::Generic::IList<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas()
```


### ReturnValue

Un objet IList contenant tous les schémas qui ont été ajoutés au [XmlSchemaSet](../). Si aucun schéma n’a été ajouté au [XmlSchemaSet](../), une collection vide est renvoyée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IList](../../../system.collections.generic/ilist/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaSet::Schemas(String) method


Retourne une collection de tous les schémas du langage de définition [Schema](../../) XML (XSD) dans le [XmlSchemaSet](../) qui appartiennent à l’espace de noms indiqué.

```cpp
SharedPtr<Collections::Generic::List<SharedPtr<XmlSchema>>> System::Xml::Schema::XmlSchemaSet::Schemas(String targetNamespace)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| targetNamespace | String | La propriété **targetNamespace** du schéma. |

### ReturnValue

Un objet IList contenant tous les schémas qui ont été ajoutés au [XmlSchemaSet](../) et qui appartiennent à l’espace de noms indiqué. Si aucun schéma n’a été ajouté au [XmlSchemaSet](../), une collection vide est renvoyée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
