---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem metodu"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem yöntemi. C++'ta eşleşen XmlNode::get_LocalName ve XmlNode::get_NamespaceURI değerlerine sahip bir düğümü kaldırır."
type: docs
weight: 900
url: /tr/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


Eşleşen [XmlNode::get_LocalName](../../xmlnode/get_localname/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) değerlerine sahip bir düğümü kaldırır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Kaldırılacak düğümün yerel adı. |
| namespaceURI | Dize | Kaldırılacak düğümün ad alanı URI'si. |

### ReturnValue

Kaldırılan [XmlNode](../../xmlnode/) veya eşleşen bir düğüm bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


[XmlNamedNodeMap](../) içindeki düğümü kaldırır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| name | String | Kaldırılacak düğümün nitelikli adı. Ad, eşleşen düğümün [XmlNode::get_Name](../../xmlnode/get_name/) değeriyle karşılaştırılır. |

### ReturnValue

Bu [XmlNamedNodeMap](../) içinden kaldırılan [XmlNode](../../xmlnode/) veya eşleşen bir düğüm bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
