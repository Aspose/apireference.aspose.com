---
title: "System::Xml::XmlNamedNodeMap::Item-Methode"
linktitle: "Item"
second_title: "Aspose.Font für C++"
description: "System::Xml::XmlNamedNodeMap::Item-Methode. Ruft den Knoten am angegebenen Index im XmlNamedNodeMap in C++ ab."
type: docs
weight: 800
url: /de/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


Ruft den Knoten am angegebenen Index im [XmlNamedNodeMap](../) ab.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| index | int32_t | Die Indexposition des Knotens, der aus dem [XmlNamedNodeMap](../) abgerufen werden soll. Der Index ist nullbasiert; daher ist der Index des ersten Knotens 0 und der Index des letzten Knotens [XmlNamedNodeMap::get_Count](../get_count/) - 1. |

### ReturnValue

Der [XmlNode](../../xmlnode/) am angegebenen Index. Wenn **index** kleiner als 0 oder größer/gleich dem Wert von [XmlNamedNodeMap::get_Count](../get_count/) ist, wird **nullptr** zurückgegeben.

## Siehe auch

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
