---
title: "System::Xml::XmlNode::get_LocalName méthode"
linktitle: "get_LocalName"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNode::get_LocalName méthode. Retourne le nom local du nœud, lorsqu'il est remplacé dans une classe dérivée en C++."
type: docs
weight: 1400
url: /fr/cpp/system.xml/xmlnode/get_localname/
---
## XmlNode::get_LocalName method


Renvoie le nom local du nœud, lorsqu'il est remplacé dans une classe dérivée.

```cpp
virtual String System::Xml::XmlNode::get_LocalName()=0
```


### ReturnValue

Le nom du nœud sans le préfixe. Par exemple, **LocalName** est **book** pour l'élément **<bk:book>**.
## Remarques



Le nom retourné dépend du [XmlNode::get_NodeType](../get_nodetype/) du nœud : |||
|-|-|
| Type | Nom |
| Attribut | Le nom local de l'attribut. |
| CDATA | #section-cdata |
| Commentaire | #commentaire |
| Document | #document |
| Fragment de document | #fragment-document |
| Type de document | Le nom du type de document. |
| Élément | Le nom local de l’élément. |
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
