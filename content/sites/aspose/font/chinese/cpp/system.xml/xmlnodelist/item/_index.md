---
title: "System::Xml::XmlNodeList::Item 方法"
linktitle: "Item"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeList::Item 方法。检索在 C++ 中给定索引处的节点。"
type: docs
weight: 400
url: /zh/cpp/system.xml/xmlnodelist/item/
---
## XmlNodeList::Item method


检索给定索引处的节点。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNodeList::Item(int32_t index)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 节点列表的零基索引。 |

### ReturnValue

集合中具有指定索引的 [XmlNode](../../xmlnode/)。如果 **index** 大于或等于列表中节点的数量，则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeList](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
