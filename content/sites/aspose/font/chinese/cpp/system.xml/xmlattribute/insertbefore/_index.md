---
title: "System::Xml::XmlAttribute::InsertBefore 方法"
linktitle: "InsertBefore"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlAttribute::InsertBefore 方法。在 C++ 中将指定节点立即插入到指定参考节点之前。"
type: docs
weight: 1500
url: /zh/cpp/system.xml/xmlattribute/insertbefore/
---
## XmlAttribute::InsertBefore method


在指定的参考节点之前立即插入指定的节点。

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertBefore(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | 要插入的 [XmlNode](../../xmlnode/)。 |
| refChild | SharedPtr\<XmlNode\> | 作为参考节点的 [XmlNode](../../xmlnode/)。**newChild** 被放置在此节点之前。 |

### ReturnValue

已插入的 [XmlNode](../../xmlnode/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
