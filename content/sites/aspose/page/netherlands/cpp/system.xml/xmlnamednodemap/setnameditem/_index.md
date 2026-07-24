---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem methode"
linktitle: "SetNamedItem"
second_title: "Aspose.Page voor C++"
description: "System::Xml::XmlNamedItem methode. Voegt een XmlNode toe met behulp van zijn XmlNode::get_Name-waarde in C++."
type: docs
weight: 1000
url: /nl/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


Voegt een [XmlNode](../../xmlnode/) toe met behulp van zijn [XmlNode::get_Name](../../xmlnode/get_name/) waarde.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | Een [XmlNode](../../xmlnode/) om op te slaan in de [XmlNamedNodeMap](../). Als er al een knooppunt met die naam aanwezig is in de map, wordt het vervangen door het nieuwe. |

### ReturnValue

Als de **node** een bestaand knooppunt met dezelfde naam vervangt, wordt het oude knooppunt geretourneerd; anders wordt **nullptr** geretourneerd.

## Zie ook

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
