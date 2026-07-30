---
title: "System::Xml::XmlAttribute::PrependChild méthode"
linktitle: "PrependChild"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlAttribute::PrependChild méthode. Ajoute le nœud spécifié au début de la liste des nœuds enfants de ce nœud en C++."
type: docs
weight: 1600
url: /fr/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


Ajoute le nœud spécifié au début de la liste des nœuds enfants de ce nœud.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | Le [XmlNode](../../xmlnode/) à ajouter. S'il s'agit d'un [XmlDocumentFragment](../../xmldocumentfragment/), le contenu complet du fragment de document est déplacé dans la liste des enfants de ce nœud. |

### ReturnValue

Le [XmlNode](../../xmlnode/) ajouté.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
