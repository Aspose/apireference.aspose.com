---
title: "méthode System::Xml::XmlDocument::Validate"
linktitle: "Valider"
second_title: "Aspose.Font pour C++"
description: "méthode System::Xml::XmlDocument::Validate. Valide le XmlDocument contre les schémas du langage de définition de schéma XML (XSD) contenus dans la liste XmlDocument::get_Schemas en C++."
type: docs
weight: 4300
url: /fr/cpp/system.xml/xmldocument/validate/
---
## XmlDocument::Validate(Schema::ValidationEventHandler) method


Valide le [XmlDocument](../) contre les schémas du langage de définition de schéma XML (XSD) contenus dans la liste [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | L'objet [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) qui reçoit les informations sur les avertissements et les erreurs de validation du schéma. |

## Voir aussi

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlDocument::Validate(Schema::ValidationEventHandler, const SharedPtr\<XmlNode\>\&) method


Valide l'objet [XmlNode](../../xmlnode/) spécifié contre les schémas du langage de définition de schéma XML (XSD) dans la liste [XmlDocument::get_Schemas](../get_schemas/).

```cpp
void System::Xml::XmlDocument::Validate(Schema::ValidationEventHandler validationEventHandler, const SharedPtr<XmlNode> &nodeToValidate)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| validationEventHandler | Schema::ValidationEventHandler | L'objet [Schema::ValidationEventHandler](../../../system.xml.schema/validationeventhandler/) qui reçoit les informations sur les avertissements et les erreurs de validation du schéma. |
| nodeToValidate | const SharedPtr\<XmlNode\>\& | L'objet [XmlNode](../../xmlnode/) créé à partir d'un [XmlDocument](../) pour valider. |

## Voir aussi

* Typedef [ValidationEventHandler](../../../system.xml.schema/validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
