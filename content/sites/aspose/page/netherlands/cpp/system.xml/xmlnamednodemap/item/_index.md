---
title: "System::Xml::XmlNamedNodeMap::Item methode"
linktitle: "Item"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNamedNodeMap::Item methode. Haalt het knooppunt op op de opgegeven index in de XmlNamedNodeMap in C++."
type: docs
weight: 800
url: /nl/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


Haalt het knooppunt op op de opgegeven index in de [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| index | int32_t | De indexpositie van het knooppunt dat moet worden opgehaald uit de [XmlNamedNodeMap](../). De index is nulgebaseerd; daarom is de index van het eerste knooppunt 0 en de index van het laatste knooppunt [XmlNamedNodeMap::get_Count](../get_count/) - 1. |

### ReturnValue

Het [XmlNode](../../xmlnode/) op de opgegeven index. Als **index** kleiner is dan 0 of groter dan of gelijk aan de waarde van [XmlNamedNodeMap::get_Count](../get_count/), wordt **nullptr** geretourneerd.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
