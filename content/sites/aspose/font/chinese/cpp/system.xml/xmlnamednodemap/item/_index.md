---
title: "System::Xml::XmlNamedNodeMap::Item method"
linktitle: "Item"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNamedNodeMap::Item method。检索 C++ 中 XmlNamedNodeMap 中指定索引处的节点。"
type: docs
weight: 800
url: /zh/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


检索 [XmlNamedNodeMap](../) 中指定索引处的节点。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| index | int32_t | 要从 [XmlNamedNodeMap](../) 检索的节点的索引位置。索引从零开始；因此，第一个节点的索引为 0，最后一个节点的索引为 [XmlNamedNodeMap::get_Count](../get_count/) - 1。 |

### ReturnValue

指定索引处的 [XmlNode](../../xmlnode/)。如果 **index** 小于 0 或大于等于 [XmlNamedNodeMap::get_Count](../get_count/) 的值，则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
