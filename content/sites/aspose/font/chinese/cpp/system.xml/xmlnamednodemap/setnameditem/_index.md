---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem 方法"
linktitle: "SetNamedItem"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem 方法。 在 C++ 中使用 XmlNode::get_Name 值添加 XmlNode。"
type: docs
weight: 1000
url: /zh/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


使用其 [XmlNode::get_Name](../../xmlnode/get_name/) 值添加一个 [XmlNode](../../xmlnode/)。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | 用于存储在 [XmlNamedNodeMap](../) 中的 [XmlNode](../../xmlnode/)。如果映射中已经存在具有相同名称的节点，则会被新节点替换。 |

### ReturnValue

如果 **node** 替换了具有相同名称的现有节点，则返回旧节点；否则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
