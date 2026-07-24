---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem 方法"
linktitle: "SetNamedItem"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem 方法。使用 XmlNode::get_Name 的值在 C++ 中添加一个 XmlNode。"
type: docs
weight: 1000
url: /zh/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


使用其 [XmlNode::get_Name](../../xmlnode/get_name/) 值添加一个 [XmlNode](../../xmlnode/)。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | 一个用于存储在 [XmlNamedNodeMap](../) 中的 [XmlNode](../../xmlnode/)。如果映射中已经存在同名节点，则会被新节点替换。 |

### ReturnValue

如果 **node** 替换了同名的已有节点，则返回旧节点；否则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
