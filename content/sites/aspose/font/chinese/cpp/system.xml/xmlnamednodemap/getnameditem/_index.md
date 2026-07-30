---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem 方法"
linktitle: "GetNamedItem"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem 方法。在 C++ 中，检索具有匹配的 XmlNode::get_LocalName 和 XmlNode::get_NamespaceURI 值的节点。"
type: docs
weight: 700
url: /zh/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


检索具有匹配的 [XmlNode::get_LocalName](../../xmlnode/get_localname/) 和 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 值的节点。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| localName | String | 要检索的节点的本地名称。 |
| namespaceURI | String | 要检索的节点的命名空间统一资源标识符（URI）。 |

### ReturnValue

如果未找到匹配的节点，则返回具有匹配本地名称和命名空间 URI 的 [XmlNode](../../xmlnode/) 或 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


检索由名称指定的 [XmlNode](../../xmlnode/)。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| name | String | 要检索的节点的限定名称。它会与匹配节点的 [XmlNode::get_Name](../../xmlnode/get_name/) 值进行匹配。 |

### ReturnValue

如果未找到匹配的节点，则返回具有指定名称的 [XmlNode](../../xmlnode/) 或 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
