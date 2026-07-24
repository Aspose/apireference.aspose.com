---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. Tar bort en nod med matchande XmlNode::get_LocalName och XmlNode::get_NamespaceURI värden i C++."
type: docs
weight: 900
url: /sv/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Tar bort en nod med matchande [XmlNode::get_LocalName](../../xmlnode/get_localname/) och [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) värden.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på noden som ska tas bort. |
| namespaceURI | String | Namnrymdens URI för noden som ska tas bort. |

### ReturnValue

Den [XmlNode](../../xmlnode/) som togs bort eller **nullptr** om ingen matchande nod hittades.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


Tar bort noden från [XmlNamedNodeMap](../).

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| name | String | Det kvalificerade namnet på noden som ska tas bort. Namnet matchas mot värdet från [XmlNode::get_Name](../../xmlnode/get_name/) för den matchande noden. |

### ReturnValue

Den [XmlNode](../../xmlnode/) som togs bort från detta [XmlNamedNodeMap](../) eller **nullptr** om ingen matchande nod hittades.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
