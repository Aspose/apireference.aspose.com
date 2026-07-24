---
title: "System::Xml::XmlNode::get_LocalName méthode"
linktitle: "get_LocalName"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlNode::get_LocalName méthode. Retourne le nom local du nœud, lorsqu'il est redéfini dans une classe dérivée en C++."
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



Le nom renvoyé dépend du [XmlNode::get_NodeType](../get_nodetype/) du nœud : |||
|-|-|
| Type | Nom |
| Attribute | Le nom local de l'attribut. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Le nom du type de document. |
| Element | Le nom local de l'élément. |
| Entity | Le nom de l'entité. |
| EntityReference | Le nom de l'entité référencée. |
| Notation | Le nom de la notation. |
| ProcessingInstruction | La cible de l'instruction de traitement. |
| Text | #text |
| Espace blanc | #whitespace |
| SignificantWhitespace | #significant-whitespace |
| XmlDeclaration | #xml-declaration |

## Voir aussi

* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
