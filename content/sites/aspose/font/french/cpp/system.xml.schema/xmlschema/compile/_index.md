---
title: "Méthode System::Xml::Schema::XmlSchema::Compile"
linktitle: "Compile"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::Schema::XmlSchema::Compile. Compile le modèle XML SchemaObject (SOM) en informations de schéma pour la validation. Utilisé pour vérifier la structure syntaxique et sémantique du SOM construit programmaticalement. La vérification de validation sémantique est effectuée lors de la compilation en C++."
type: docs
weight: 200
url: /fr/cpp/system.xml.schema/xmlschema/compile/
---
## XmlSchema::Compile(ValidationEventHandler) method


Compile le modèle XML [Schema](../../)[Object](../../../system/object/) (SOM) en informations de schéma pour la validation. Utilisé pour vérifier la structure syntaxique et sémantique du SOM construit programmaticalement. La vérification de validation sémantique est effectuée lors de la compilation.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Le gestionnaire d'événements de validation qui reçoit des informations sur les erreurs de validation du XML [Schema](../../). |

## Voir aussi

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchema::Compile(ValidationEventHandler, const SharedPtr\<XmlResolver\>\&) method


Compile le modèle XML [Schema](../../)[Object](../../../system/object/) (SOM) en informations de schéma pour la validation. Utilisé pour vérifier la structure syntaxique et sémantique du SOM construit programmaticalement. La vérification de validation sémantique est effectuée lors de la compilation.

```cpp
void System::Xml::Schema::XmlSchema::Compile(ValidationEventHandler validationEventHandler, const SharedPtr<XmlResolver> &resolver)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| validationEventHandler | ValidationEventHandler | Le gestionnaire d'événements de validation qui reçoit des informations sur les erreurs de validation du XML [Schema](../../). |
| resolver | const SharedPtr\<XmlResolver\>\& | Le [XmlResolver](../../../system.xml/xmlresolver/) utilisé pour résoudre les espaces de noms référencés dans les éléments **include** et **import**. |

## Voir aussi

* Typedef [ValidationEventHandler](../../validationeventhandler/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlResolver](../../../system.xml/xmlresolver/)
* Class [XmlSchema](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
