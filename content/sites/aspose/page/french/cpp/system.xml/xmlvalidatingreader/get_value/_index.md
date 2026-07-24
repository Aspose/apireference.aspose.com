---
title: "System::Xml::XmlValidatingReader::get_Value method"
linktitle: "get_Value"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlValidatingReader::get_Value method. Retourne la valeur texte du nœud actuel en C++."
type: docs
weight: 2900
url: /fr/cpp/system.xml/xmlvalidatingreader/get_value/
---
## XmlValidatingReader::get_Value method


Renvoie la valeur texte du nœud actuel.

```cpp
String System::Xml::XmlValidatingReader::get_Value() override
```


### ReturnValue

La valeur retournée dépend du XmlValidatingReader::NodeType du nœud.
## Remarques



Le tableau suivant répertorie les types de nœuds qui ont une valeur à retourner. Tous les autres types de nœuds renvoient [String::Empty](../../../system/string/empty/). |||
|-|-|
| Type de nœud | Valeur |
| Attribute | La valeur de l'attribut. |
| CDATA | Le contenu de la section CDATA. |
| Comment | Le contenu du commentaire. |
| DocumentType | Le sous-ensemble interne. |
| ProcessingInstruction | L'intégralité du contenu, à l'exclusion de la cible. |
| SignificantWhitespace | Les espaces blancs entre les balises dans un modèle de contenu mixte. |
| Text | Le contenu du nœud texte. |
| Espace blanc | Les espaces blancs entre les balises. |
| XmlDeclaration | Le contenu de la déclaration. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
