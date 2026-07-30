---
title: "System::Xml::XmlAttributeCollection::SetNamedItem 方法"
linktitle: "SetNamedItem"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlAttributeCollection::SetNamedItem 方法。在 C++ 中使用 XmlNode::get_Name 的结果添加 XmlNode。"
type: docs
weight: 1000
url: /zh/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


使用其 [XmlNode::get_Name](../../xmlnode/get_name/) 结果添加一个 [XmlNode](../../xmlnode/)。

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 节点 | SharedPtr\<XmlNode\> | 要存储在此集合中的属性节点。该节点以后可通过节点名称访问。如果集合中已存在同名节点，则会被新节点替换；否则，节点将被追加到集合末尾。 |

### ReturnValue

如果 **node** 替换了同名的已有节点，则返回旧节点；否则，返回添加的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
