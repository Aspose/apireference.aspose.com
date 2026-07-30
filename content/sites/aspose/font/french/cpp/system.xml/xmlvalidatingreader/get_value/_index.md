---
title: "System::Xml::XmlValidatingReader::get_Value méthode"
linktitle: "get_Value"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlValidatingReader::get_Value méthode. Retourne la valeur texte du nœud actuel en C++."
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
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
