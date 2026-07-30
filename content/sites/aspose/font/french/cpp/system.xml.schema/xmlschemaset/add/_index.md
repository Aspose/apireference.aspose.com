---
title: "Méthode System::Xml::Schema::XmlSchemaSet::Add"
linktitle: "Add"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Schema::XmlSchemaSet::Add. Ajoute le XmlSchema fourni au XmlSchemaSet en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml.schema/xmlschemaset/add/
---
## XmlSchemaSet::Add(const SharedPtr\<XmlSchema\>\&) method


Ajoute le [XmlSchema](../../xmlschema/) fourni au [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchema> &schema)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schema | const SharedPtr\<XmlSchema\>\& | L'objet [XmlSchema](../../xmlschema/) à ajouter au [XmlSchemaSet](../). |

### ReturnValue

Un objet [XmlSchema](../../xmlschema/) si le schéma est valide. Si le schéma n'est pas valide et qu'un [ValidationEventHandler](../../validationeventhandler/) est spécifié, alors **nullptr** est renvoyé et l'événement de validation approprié est déclenché. Sinon, une [XmlSchemaException](../../xmlschemaexception/) est levée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(const SharedPtr\<XmlSchemaSet\>\&) method


Ajoute tous les schémas du langage de définition XML [Schema](../../) (XSD) du [XmlSchemaSet](../) fourni au [XmlSchemaSet](../).

```cpp
void System::Xml::Schema::XmlSchemaSet::Add(const SharedPtr<XmlSchemaSet> &schemas)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schemas | const SharedPtr\<XmlSchemaSet\>\& | L'objet [XmlSchemaSet](../). |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchemaSet](../)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(String, const SharedPtr\<XmlReader\>\&) method


Ajoute le schéma du langage de définition XML [Schema](../../) (XSD) contenu dans le [XmlReader](../../../system.xml/xmlreader/) au [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const SharedPtr<XmlReader> &schemaDocument)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| targetNamespace | String | La valeur du **targetNamespace** du schéma, ou **nullptr** pour utiliser le **targetNamespace** spécifié dans le schéma. |
| schemaDocument | const SharedPtr\<XmlReader\>\& | L'objet [XmlReader](../../../system.xml/xmlreader/). |

### ReturnValue

Un objet [XmlSchema](../../xmlschema/) si le schéma est valide. Si le schéma n'est pas valide et qu'un [ValidationEventHandler](../../validationeventhandler/) est spécifié, alors **nullptr** est renvoyé et l'événement de validation approprié est déclenché. Sinon, une [XmlSchemaException](../../xmlschemaexception/) est levée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlReader](../../../system.xml/xmlreader/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaSet::Add(String, const String\&) method


Ajoute le schéma du langage de définition XML [Schema](../../) (XSD) à l'URL spécifiée au [XmlSchemaSet](../).

```cpp
SharedPtr<XmlSchema> System::Xml::Schema::XmlSchemaSet::Add(String targetNamespace, const String &schemaUri)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| targetNamespace | String | La valeur du **targetNamespace** du schéma, ou **nullptr** pour utiliser le **targetNamespace** spécifié dans le schéma. |
| schemaUri | const String\& | L'URL qui spécifie le schéma à charger. |

### ReturnValue

Un objet [XmlSchema](../../xmlschema/) si le schéma est valide. Si le schéma n'est pas valide et qu'un [ValidationEventHandler](../../validationeventhandler/) est spécifié, alors **nullptr** est renvoyé et l'événement de validation approprié est déclenché. Sinon, une [XmlSchemaException](../../xmlschemaexception/) est levée.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlSchema](../../xmlschema/)
* Class [String](../../../system/string/)
* Class [XmlSchemaSet](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
