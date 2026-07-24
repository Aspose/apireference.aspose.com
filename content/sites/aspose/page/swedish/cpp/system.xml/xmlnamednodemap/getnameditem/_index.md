---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem method"
linktitle: "GetNamedItem"
second_title: "Aspose.Page för C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem method. Hämtar en nod med matchande XmlNode::get_LocalName och XmlNode::get_NamespaceURI värden i C++."
type: docs
weight: 700
url: /sv/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


Hämtar en nod med matchande [XmlNode::get_LocalName](../../xmlnode/get_localname/) och [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) värden.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| localName | String | Det lokala namnet på noden som ska hämtas. |
| namespaceURI | String | Namnrymdens Uniform Resource Identifier (URI) för noden som ska hämtas. |

### ReturnValue

En [XmlNode](../../xmlnode/) med matchande lokalt namn och namnrymds‑URI eller **nullptr** om ingen matchande nod hittades.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


Hämtar en [XmlNode](../../xmlnode/) som specificeras av namn.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| name | String | Det kvalificerade namnet på noden som ska hämtas. Det matchas mot värdet från [XmlNode::get_Name](../../xmlnode/get_name/) för den matchande noden. |

### ReturnValue

En [XmlNode](../../xmlnode/) med det angivna namnet eller **nullptr** om ingen matchande nod hittas.

## Se även

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
