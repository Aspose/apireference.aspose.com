---
title: "Méthode System::Xml::XmlReader::get_Value"
linktitle: "get_Value"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlReader::get_Value. Lorsqu'elle est remplacée dans une classe dérivée, elle récupère la valeur texte du nœud actuel en C++."
type: docs
weight: 2400
url: /fr/cpp/system.xml/xmlreader/get_value/
---
## XmlReader::get_Value method


Lorsqu'il est remplacé dans une classe dérivée, obtient la valeur texte du nœud actuel.

```cpp
virtual String System::Xml::XmlReader::get_Value()=0
```


### ReturnValue

La valeur renvoyée dépend de la valeur [XmlReader::get_NodeType](../get_nodetype/) du nœud.
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
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
