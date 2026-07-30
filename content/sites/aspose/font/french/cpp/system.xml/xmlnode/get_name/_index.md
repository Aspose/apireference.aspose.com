---
title: "Méthode System::Xml::XmlNode::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlNode::get_Name. Retourne le nom qualifié du nœud, lorsqu'il est remplacé dans une classe dérivée en C++."
type: docs
weight: 1500
url: /fr/cpp/system.xml/xmlnode/get_name/
---
## XmlNode::get_Name method


Renvoie le nom qualifié du nœud, lorsqu'il est remplacé dans une classe dérivée.

```cpp
virtual String System::Xml::XmlNode::get_Name()=0
```


### ReturnValue

Le nom qualifié du nœud.
## Remarques



Le nom retourné dépend du [XmlNode::get_NodeType](../get_nodetype/) du nœud : |||
|-|-|
| Type | Nom |
| Attribut | Le nom qualifié de l'attribut. |
| CDATA | #section-cdata |
| Commentaire | #commentaire |
| Document | #document |
| Fragment de document | #fragment-document |
| Type de document | Le nom du type de document. |
| Élément | Le nom qualifié de l'élément. |
| Entité | Le nom de l'entité. |
| Référence d'entité | Le nom de l'entité référencée. |
| Notation | Le nom de la notation. |
| Instruction de traitement | La cible de l'instruction de traitement. |
| Texte | #texte |
| Espacement | #espace-blanc |
| Espacement significatif | #espace-blanc-significatif |
| XmlDeclaration | #déclaration-xml |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
