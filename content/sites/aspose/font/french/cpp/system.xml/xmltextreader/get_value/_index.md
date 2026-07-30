---
title: "System::Xml::XmlTextReader::get_Value méthode"
linktitle: "get_Value"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlTextReader::get_Value méthode. Retourne la valeur texte du nœud actuel en C++."
type: docs
weight: 2900
url: /fr/cpp/system.xml/xmltextreader/get_value/
---
## XmlTextReader::get_Value method


Renvoie la valeur texte du nœud actuel.

```cpp
String System::Xml::XmlTextReader::get_Value() override
```


### ReturnValue

La valeur retournée dépend de la valeur [XmlTextReader::get_NodeType](../get_nodetype/) du nœud.
## Remarques



Le tableau suivant répertorie les types de nœuds qui ont une valeur à renvoyer. Tous les autres types de nœuds renvoient [String::Empty](../../../system/string/empty/). |||
|-|-|
| Type de nœud | Valeur |
| Attribut | La valeur de l'attribut. |
| CDATA | Le contenu de la section CDATA. |
| Commentaire | Le contenu du commentaire. |
| Type de document | Le sous-ensemble interne. |
| Instruction de traitement | L'intégralité du contenu, à l'exception de la cible. |
| Espacement significatif | L'espace blanc à l'intérieur d'une portée xml:space='preserve'. |
| Texte | Le contenu du nœud texte. |
| Espacement | Les espaces blancs entre les balises. |
| XmlDeclaration | Le contenu de la déclaration. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
