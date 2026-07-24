---
title: "Méthode System::Xml::XmlNode::get_ParentNode"
linktitle: "get_ParentNode"
second_title: "Aspose.Page pour C++"
description: "Méthode System::Xml::XmlNode::get_ParentNode. Retourne le parent de ce nœud (pour les nœuds pouvant avoir des parents) en C++."
type: docs
weight: 2100
url: /fr/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


Renvoie le parent de ce nœud (pour les nœuds pouvant avoir des parents).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

Le [XmlNode](../) qui est le parent du nœud actuel.
## Remarques



Si un nœud vient d'être créé et n'est pas encore ajouté à l'arbre, ou s'il a été retiré de l'arbre, le parent est **nullptr**. Pour tous les autres nœuds, la valeur renvoyée dépend de [XmlNode::get_NodeType](../get_nodetype/) du nœud. Le tableau suivant décrit les valeurs de retour possibles pour la méthode **get_NodeType**. |||
|-|-|
| NodeType | Valeur de retour de ParentNode |
| Attribute, Document, DocumentFragment, Entity, Notation | Renvoie **nullptr** ; ces nœuds n'ont pas de parent. |
| CDATA | Renvoie l'élément ou la référence d'entité contenant la section CDATA. |
| Comment | Renvoie l'élément, la référence d'entité, le type de document ou le document contenant le commentaire. |
| DocumentType | Renvoie le nœud document. |
| Element | Renvoie le nœud parent de l'élément. Si l'élément est le nœud racine de l'arbre, le parent est le nœud document. |
| EntityReference | Renvoie l'élément, l'attribut ou la référence d'entité contenant la référence d'entité. |
| ProcessingInstruction | Renvoie le document, l'élément, le type de document ou la référence d'entité contenant l'instruction de traitement. |
| Text | Renvoie l'élément parent, l'attribut ou la référence d'entité contenant le nœud texte. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
