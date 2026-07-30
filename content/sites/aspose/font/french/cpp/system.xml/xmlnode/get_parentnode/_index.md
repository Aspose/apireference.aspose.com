---
title: "System::Xml::XmlNode::get_ParentNode méthode"
linktitle: "get_ParentNode"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNode::get_ParentNode méthode. Retourne le parent de ce nœud (pour les nœuds pouvant avoir des parents) en C++."
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



Si un nœud vient d'être créé et n'est pas encore ajouté à l'arbre, ou s'il a été retiré de l'arbre, le parent est **nullptr**. Pour tous les autres nœuds, la valeur renvoyée dépend du [XmlNode::get_NodeType](../get_nodetype/) du nœud. Le tableau suivant décrit les valeurs de retour possibles pour la **get_NodeType** méthode. |||
|-|-|
| NodeType | Valeur de retour de ParentNode |
| Attribut, Document, FragmentDeDocument, Entité, Notation | Renvoie nullptr; ces nœuds n'ont pas de parent. |
| CDATA | Renvoie l'élément ou la référence d'entité contenant la section CDATA. |
| Commentaire | Renvoie l'élément, la référence d'entité, le type de document ou le document contenant le commentaire. |
| Type de document | Renvoie le nœud document. |
| Élément | Renvoie le nœud parent de l'élément. Si l'élément est le nœud racine de l'arbre, le parent est le nœud document. |
| Référence d'entité | Renvoie l'élément, l'attribut ou la référence d'entité contenant la référence d'entité. |
| Instruction de traitement | Renvoie le document, l'élément, le type de document ou la référence d'entité contenant l'instruction de traitement. |
| Texte | Renvoie l'élément parent, l'attribut ou la référence d'entité contenant le nœud texte. |

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
