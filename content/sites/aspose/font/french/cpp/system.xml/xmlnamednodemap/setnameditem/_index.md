---
title: "Méthode System::Xml::XmlNamedNodeMap::SetNamedItem"
linktitle: "SetNamedItem"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Xml::XmlNamedNodeMap::SetNamedItem. Ajoute un XmlNode en utilisant sa valeur XmlNode::get_Name en C++."
type: docs
weight: 1000
url: /fr/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


Ajoute un [XmlNode](../../xmlnode/) en utilisant sa valeur [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Un [XmlNode](../../xmlnode/) à stocker dans le [XmlNamedNodeMap](../). Si un nœud portant ce nom est déjà présent dans la map, il est remplacé par le nouveau. |

### ReturnValue

Si le **node** remplace un nœud existant portant le même nom, l'ancien nœud est renvoyé ; sinon, **nullptr** est renvoyé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
