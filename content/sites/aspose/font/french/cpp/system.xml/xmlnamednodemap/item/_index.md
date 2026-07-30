---
title: "System::Xml::XmlNamedNodeMap::Item méthode"
linktitle: "Élément"
second_title: "Aspose.Font pour C++"
description: "System::Xml::XmlNamedNodeMap::Item méthode. Récupère le nœud à l'index spécifié dans le XmlNamedNodeMap en C++."
type: docs
weight: 800
url: /fr/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


Récupère le nœud à l'index spécifié dans le [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| index | int32_t | La position d'index du nœud à récupérer depuis le [XmlNamedNodeMap](../). L'index commence à zéro ; ainsi, l'index du premier nœud est 0 et celui du dernier nœud est [XmlNamedNodeMap::get_Count](../get_count/) - 1. |

### ReturnValue

Le [XmlNode](../../xmlnode/) à l'index spécifié. Si **index** est inférieur à 0 ou supérieur ou égal à la valeur de [XmlNamedNodeMap::get_Count](../get_count/), **nullptr** est renvoyé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
