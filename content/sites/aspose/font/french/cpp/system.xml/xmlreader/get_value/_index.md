---
title: "méthode System::Xml::XmlReader::get_Value"
linktitle: "get_Value"
second_title: "Aspose.Font pour C++"
description: "méthode System::Xml::XmlReader::get_Value. Lorsqu'elle est remplacée dans une classe dérivée, obtient la valeur texte du nœud actuel en C++."
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

La valeur retournée dépend de la valeur [XmlReader::get_NodeType](../get_nodetype/) du nœud.
## Remarques



Le tableau suivant répertorie les types de nœuds qui ont une valeur à renvoyer. Tous les autres types de nœuds renvoient [String::Empty](../../../system/string/empty/). |||
|-|-|
| Type de nœud | Valeur |
| Attribut | La valeur de l'attribut. |
| CDATA | Le contenu de la section CDATA. |
| Commentaire | Le contenu du commentaire. |
| Type de document | Le sous-ensemble interne. |
| Instruction de traitement | L'intégralité du contenu, à l'exception de la cible. |
| Espacement significatif | Les espaces blancs entre les balises dans un modèle de contenu mixte. |
| Texte | Le contenu du nœud texte. |
| Espacement | Les espaces blancs entre les balises. |
| XmlDeclaration | Le contenu de la déclaration. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
