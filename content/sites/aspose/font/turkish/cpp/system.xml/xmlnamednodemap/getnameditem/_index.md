---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem metodu"
linktitle: "GetNamedItem"
second_title: "Aspose.Font için C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem metodu. C++'da eşleşen XmlNode::get_LocalName ve XmlNode::get_NamespaceURI değerlerine sahip bir düğümü alır."
type: docs
weight: 700
url: /tr/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


Eşleşen [XmlNode::get_LocalName](../../xmlnode/get_localname/) ve [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) değerlerine sahip bir düğüm alır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| localName | Dize | Alınacak düğümün yerel adı. |
| namespaceURI | Dize | Alınacak düğümün ad alanı Evrensel Kaynak Tanımlayıcısı (URI). |

### ReturnValue

Eşleşen yerel adı ve ad alanı URI'si olan bir [XmlNode](../../xmlnode/) veya eşleşen bir düğüm bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


İsimle belirtilen bir [XmlNode](../../xmlnode/) alır.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| name | String | Alınacak düğümün nitelikli adı. Bu, eşleşen düğümün [XmlNode::get_Name](../../xmlnode/get_name/) değeriyle karşılaştırılır. |

### ReturnValue

Belirtilen ada sahip bir [XmlNode](../../xmlnode/) veya eşleşen bir düğüm bulunamazsa **nullptr**.

## Ayrıca Bakınız

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
