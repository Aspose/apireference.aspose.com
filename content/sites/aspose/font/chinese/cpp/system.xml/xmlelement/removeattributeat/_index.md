---
title: "System::Xml::XmlElement::RemoveAttributeAt 方法"
linktitle: "RemoveAttributeAt"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlElement::RemoveAttributeAt 方法。删除元素中具有指定索引的属性节点。（如果被删除的属性具有默认值，则会立即替换）在 C++ 中。"
type: docs
weight: 2000
url: /zh/cpp/system.xml/xmlelement/removeattributeat/
---
## XmlElement::RemoveAttributeAt method


从元素中移除具有指定索引的属性节点。（如果被移除的属性有默认值，则会立即替换）。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlElement::RemoveAttributeAt(int32_t i)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| i | int32_t | 要删除的节点索引。第一个节点的索引为 0。 |

### ReturnValue

被删除的属性节点；如果给定索引处没有节点，则返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
