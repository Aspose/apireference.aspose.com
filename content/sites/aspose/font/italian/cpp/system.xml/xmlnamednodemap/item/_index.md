---
title: "System::Xml::XmlNamedNodeMap::Item method"
linktitle: "Item"
second_title: "Aspose.Font per C++"
description: "System::Xml::XmlNamedNodeMap::Item method. Recupera il nodo all'indice specificato nella XmlNamedNodeMap in C++."
type: docs
weight: 800
url: /it/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


Recupera il nodo all'indice specificato nella [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| index | int32_t | La posizione dell'indice del nodo da recuperare dalla [XmlNamedNodeMap](../). L'indice è basato su zero; pertanto, l'indice del primo nodo è 0 e l'indice dell'ultimo nodo è [XmlNamedNodeMap::get_Count](../get_count/) - 1. |

### ReturnValue

Il [XmlNode](../../xmlnode/) all'indice specificato. Se **index** è minore di 0 o maggiore o uguale al valore di [XmlNamedNodeMap::get_Count](../get_count/), viene restituito **nullptr**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
