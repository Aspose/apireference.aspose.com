---
title: "méthode System::Xml::XmlNode::get_Name"
linktitle: "get_Name"
second_title: "Aspose.Page pour C++"
description: "méthode System::Xml::XmlNode::get_Name. Retourne le nom qualifié du nœud, lorsqu'il est redéfini dans une classe dérivée en C++."
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



Le nom renvoyé dépend du [XmlNode::get_NodeType](../get_nodetype/) du nœud : |||
|-|-|
| Type | Nom |
| Attribute | Le nom qualifié de l'attribut. |
| CDATA | #cdata-section |
| Comment | #comment |
| Document | #document |
| DocumentFragment | #document-fragment |
| DocumentType | Le nom du type de document. |
| Element | Le nom qualifié de l'élément. |
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
