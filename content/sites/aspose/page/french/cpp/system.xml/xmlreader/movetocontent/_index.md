---
title: "System::Xml::XmlReader::MoveToContent méthode"
linktitle: "MoveToContent"
second_title: "Aspose.Page pour C++"
description: "System::Xml::XmlReader::MoveToContent méthode. Vérifie si le nœud actuel est un nœud de contenu (texte non blanc, CDATA, Élément, EndElement, EntityReference ou EndEntity). Si le nœud n'est pas un nœud de contenu, le lecteur saute au nœud de contenu suivant ou à la fin du fichier. Il ignore les nœuds des types suivants : ProcessingInstruction, DocumentType, Comment, Whitespace ou SignificantWhitespace en C++."
type: docs
weight: 3300
url: /fr/cpp/system.xml/xmlreader/movetocontent/
---
## XmlReader::MoveToContent method


Vérifie si le nœud actuel est un nœud de contenu (texte non blanc, **CDATA**, **Element**, **EndElement**, **EntityReference**, ou **EndEntity**). Si le nœud n'est pas un nœud de contenu, le lecteur saute au nœud de contenu suivant ou à la fin du fichier. Il ignore les nœuds du type suivant : **ProcessingInstruction**, **DocumentType**, **Comment**, **Whitespace**, ou **SignificantWhitespace**.

```cpp
virtual XmlNodeType System::Xml::XmlReader::MoveToContent()
```


### ReturnValue

La valeur [XmlReader::get_NodeType](../get_nodetype/) du nœud actuel trouvé par la méthode ou [XmlNodeType::None](../../xmlnodetype/) si le lecteur a atteint la fin du flux d'entrée.

## Voir aussi

* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
