---
title: "System::Xml::XmlNamedNodeMap::Item metodo"
linktitle: "Item"
second_title: "Aspose.Page per C++"
description: "System::Xml::XmlNamedNodeMap::Item metodo. Recupera il nodo all'indice specificato in XmlNamedNodeMap in C++."
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
| index | int32_t | La posizione dell'indice del nodo da recuperare da [XmlNamedNodeMap](../). L'indice parte da zero; pertanto, l'indice del primo nodo è 0 e l'indice dell'ultimo nodo è [XmlNamedNodeMap::get_Count](../get_count/) - 1. |

### ReturnValue

Il [XmlNode](../../xmlnode/) all'indice specificato. Se **index** è minore di 0 o maggiore o uguale al valore di [XmlNamedNodeMap::get_Count](../get_count/), viene restituito **nullptr**.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
