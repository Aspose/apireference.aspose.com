---
title: "System::Xml::XmlNode::get_ParentNode method"
linktitle: "get_ParentNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNode::get_ParentNode method。返回此节点的父节点（适用于可以有父节点的节点）（C++）。"
type: docs
weight: 2100
url: /zh/cpp/system.xml/xmlnode/get_parentnode/
---
## XmlNode::get_ParentNode method


返回此节点的父节点（适用于可以有父节点的节点）。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::get_ParentNode() final
```


### ReturnValue

当前节点的父节点 [XmlNode](../)。
## 备注



如果节点刚创建且尚未添加到树中，或已从树中移除，则其父节点为 **nullptr**。对于所有其他节点，返回值取决于节点的 [XmlNode::get_NodeType](../get_nodetype/)。以下表格描述了 **get_NodeType** 方法的可能返回值。 |||
|-|-|
| 节点类型 | ParentNode 的返回值 |
| Attribute, Document, DocumentFragment, Entity, Notation | 返回 **nullptr**；这些节点没有父节点。 |
| CDATA | 返回包含 CDATA 区段的元素或实体引用。 |
| Comment | 返回包含该注释的元素、实体引用、文档类型或文档。 |
| DocumentType | 返回文档节点。 |
| Element | 返回该元素的父节点。如果该元素是树中的根节点，则其父节点为文档节点。 |
| EntityReference | 返回包含该实体引用的元素、属性或实体引用。 |
| ProcessingInstruction | 返回包含处理指令的文档、元素、文档类型或实体引用。 |
| Text | 返回包含文本节点的父元素、属性或实体引用。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
