---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. C++'da eşleşen XmlNode::get_LocalName ve XmlNode::get_NamespaceURI değerlerine sahip bir düğümü kaldırır."
type: docs
weight: 900
url: /tr/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Eşleşen [XmlNode::get_LocalName](../../xmlnode/get_localname/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) değerlerine sahip bir düğümü kaldırır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Kaldırılacak düğümün yerel adı. |
| namespaceURI | String | Kaldırılacak düğümün ad alanı URI'si. |

### ReturnValue

Kaldırılan [XmlNode](../../xmlnode/) veya eşleşen düğüm bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


Düğümü [XmlNamedNodeMap](../) içinden kaldırır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| name | String | Kaldırılacak düğümün nitelikli adı. Ad, eşleşen düğümün [XmlNode::get_Name](../../xmlnode/get_name/) değeriyle karşılaştırılır. |

### ReturnValue

Bu [XmlNamedNodeMap](../) içinden kaldırılan [XmlNode](../../xmlnode/) veya eşleşen düğüm bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
