---
title: "System::Xml::XmlAttributeCollection::SetNamedItem méthode"
linktitle: "SetNamedItem"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem méthode. Ajoute un XmlNode en utilisant le résultat de XmlNode::get_Name en C++."
type: docs
weight: 1000
url: /fr/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


Ajoute un [XmlNode](../../xmlnode/) en utilisant le résultat de [XmlNode::get_Name](../../xmlnode/get_name/).

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| Paramètre | Type | Description |
| --- | --- | --- |
| nœud | SharedPtr\\<XmlNode\\> | Un nœud d'attribut à stocker dans cette collection. Le nœud sera ensuite accessible en utilisant le nom du nœud. Si un nœud portant ce nom est déjà présent dans la collection, il est remplacé par le nouveau ; sinon, le nœud est ajouté à la fin de la collection. |

### ReturnValue

Si le **node** remplace un nœud existant portant le même nom, l'ancien nœud est renvoyé ; sinon, le nœud ajouté est renvoyé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
