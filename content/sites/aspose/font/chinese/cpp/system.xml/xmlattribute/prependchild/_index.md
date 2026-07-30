---
title: "System::Xml::XmlAttribute::PrependChild 方法"
linktitle: "PrependChild"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlAttribute::PrependChild 方法。将指定的节点添加到此节点的子节点列表的开头（C++）。"
type: docs
weight: 1600
url: /zh/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


将指定的节点添加到此节点的子节点列表的开头。

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | 要添加的 [XmlNode](../../xmlnode/)。如果它是 [XmlDocumentFragment](../../xmldocumentfragment/)，则文档片段的全部内容将移动到此节点的子节点列表中。 |

### ReturnValue

已添加的 [XmlNode](../../xmlnode/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
