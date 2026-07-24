---
title: "System::Xml::XmlElement::RemoveAttributeAt 方法"
linktitle: "RemoveAttributeAt"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlElement::RemoveAttributeAt 方法。删除元素中具有指定索引的属性节点。（如果被删除的属性有默认值，则会立即被替换）在 C++ 中。"
type: docs
weight: 2000
url: /zh/cpp/system.xml/xmlelement/removeattributeat/
---
## XmlElement::RemoveAttributeAt method


从元素中删除具有指定索引的属性节点。（如果被删除的属性具有默认值，它会立即被替换。）

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlElement::RemoveAttributeAt(int32_t i)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| i | int32_t | 要删除的节点的索引。第一个节点的索引为 0。 |

### ReturnValue

被删除的属性节点，若给定索引处没有节点则为 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
