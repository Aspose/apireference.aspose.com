---
title: "System::Xml::XmlTextReader::get_Value méthode"
linktitle: "get_Value"
second_title: "Aspose.Page pour C++"
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



Le tableau suivant répertorie les types de nœuds qui ont une valeur à retourner. Tous les autres types de nœuds renvoient [String::Empty](../../../system/string/empty/). |||
|-|-|
| Type de nœud | Valeur |
| Attribute | La valeur de l'attribut. |
| CDATA | Le contenu de la section CDATA. |
| Comment | Le contenu du commentaire. |
| DocumentType | Le sous-ensemble interne. |
| ProcessingInstruction | L'intégralité du contenu, à l'exclusion de la cible. |
| SignificantWhitespace | Les espaces blancs à l'intérieur d'une portée xml:space='preserve'. |
| Text | Le contenu du nœud texte. |
| Espace blanc | Les espaces blancs entre les balises. |
| XmlDeclaration | Le contenu de la déclaration. |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlTextReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
