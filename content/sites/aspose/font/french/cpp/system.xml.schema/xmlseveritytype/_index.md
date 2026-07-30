---
title: "System::Xml::Schema::XmlSeverityType enum"
linktitle: "XmlSeverityType"
second_title: "Aspose.Font pour C++"
description: "System::Xml::Schema::XmlSeverityType enum. Représente la gravité de l'événement de validation en C++."
type: docs
weight: 8100
url: /fr/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


Représente la gravité de l'événement de validation.

```cpp
enum class XmlSeverityType
```

### Valeurs

| Nom | Valeur | Description |
| --- | --- | --- |
| Error | 0 | Indique qu'une erreur de validation s'est produite lors de la validation du document d'instance. Cela s'applique aux définitions de type de document (DTDs) et aux schémas de langage de définition XML [Schema](../) (XSD). Les contraintes de validité du Consortium World Wide [Web](../../system.web/) (W3C) sont considérées comme des erreurs. Si aucun gestionnaire d'événement de validation n'a été créé, les erreurs lèvent une exception. |
| Warning | 1 | Indique qu'un événement de validation s'est produit qui n'est pas une erreur. Un avertissement est généralement émis lorsqu'il n'existe pas de DTD, ou de XML [Schema](../) pour valider un élément ou un attribut particulier. Contrairement aux erreurs, les avertissements ne lèvent pas d'exception s'il n'y a pas de gestionnaire d'événement de validation. |

## Voir aussi

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
