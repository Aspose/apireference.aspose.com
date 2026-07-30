---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem 方法"
linktitle: "RemoveNamedItem"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem 方法。 在 C++ 中删除具有匹配的 XmlNode::get_LocalName 和 XmlNode::get_NamespaceURI 值的节点。"
type: docs
weight: 900
url: /zh/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


删除具有匹配的 [XmlNode::get_LocalName](../../xmlnode/get_localname/) 和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 值的节点。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 要删除的节点的本地名称。 |
| namespaceURI | String | 要删除的节点的命名空间 URI。 |

### ReturnValue

已删除的 [XmlNode](../../xmlnode/)；如果未找到匹配的节点，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


从 [XmlNamedNodeMap](../) 中删除节点。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| name | String | 要删除的节点的限定名称。该名称与匹配节点的 [XmlNode::get_Name](../../xmlnode/get_name/) 值进行匹配。 |

### ReturnValue

从此 [XmlNamedNodeMap](../) 中删除的 [XmlNode](../../xmlnode/)；如果未找到匹配的节点，则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
