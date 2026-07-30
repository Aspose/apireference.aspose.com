---
title: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement méthode"
linktitle: "ValidateEndElement"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSchemaValidator::ValidateEndElement méthode. Vérifie si le contenu texte de l'élément est valide selon son type de données pour les éléments à contenu simple, et vérifie si le contenu de l'élément actuel est complet pour les éléments à contenu complexe en C++."
type: docs
weight: 1800
url: /fr/cpp/system.xml.schema/xmlschemavalidator/validateendelement/
---
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&) method


Vérifie si le contenu texte de l'élément est valide selon son type de données pour les éléments à contenu simple, et vérifie si le contenu de l'élément actuel est complet pour les éléments à contenu complexe.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un objet [XmlSchemaInfo](../../xmlschemainfo/) dont les propriétés sont définies après une validation réussie de l'élément. Ce paramètre peut être **nullptr**. |

### ReturnValue

La valeur texte analysée et typée de l'élément si celui-ci possède un contenu simple.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateEndElement(const SharedPtr\<XmlSchemaInfo\>\&, const SharedPtr\<Object\>\&) method


Vérifie si le contenu texte de l'élément spécifié est valide selon son type de données.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlSchemaValidator::ValidateEndElement(const SharedPtr<XmlSchemaInfo> &schemaInfo, const SharedPtr<Object> &typedValue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| schemaInfo | const SharedPtr\<XmlSchemaInfo\>\& | Un objet [XmlSchemaInfo](../../xmlschemainfo/) dont les propriétés sont définies après une validation réussie du contenu texte de l'élément. Ce paramètre peut être **nullptr**. |
| typedValue | const SharedPtr\<Object\>\& | Le contenu texte typé de l'élément. |

### ReturnValue

Le contenu simple analysé et typé de l'élément.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaInfo](../../xmlschemainfo/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
