---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem method"
linktitle: "GetNamedItem"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem method. C++'da eşleşen XmlNode::get_LocalName ve XmlNode::get_NamespaceURI değerlerine sahip bir düğüm alır."
type: docs
weight: 700
url: /tr/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


Eşleşen [XmlNode::get_LocalName](../../xmlnode/get_localname/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) değerlerine sahip bir düğüm alır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| localName | String | Alınacak düğümün yerel adı. |
| namespaceURI | String | Alınacak düğümün ad alanı Evrensel Kaynak Tanımlayıcısı (URI). |

### ReturnValue

Eşleşen yerel ad ve ad alanı URI'sine sahip bir [XmlNode](../../xmlnode/) veya eşleşen düğüm bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


İsimle belirtilen bir [XmlNode](../../xmlnode/) alır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| name | String | Alınacak düğümün nitelikli adı. Eşleşen düğümün [XmlNode::get_Name](../../xmlnode/get_name/) değeriyle karşılaştırılır. |

### ReturnValue

Belirtilen ada sahip bir [XmlNode](../../xmlnode/) veya eşleşen düğüm bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
