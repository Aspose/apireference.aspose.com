---
title: "System::Xml::XmlAttribute::InsertAfter 方法"
linktitle: "InsertAfter"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlAttribute::InsertAfter 方法。在 C++ 中，将指定节点立即插入到指定参考节点之后。"
type: docs
weight: 1400
url: /zh/cpp/system.xml/xmlattribute/insertafter/
---
## XmlAttribute::InsertAfter method


在指定的参考节点之后立即插入指定的节点。

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertAfter(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | 要插入的 [XmlNode](../../xmlnode/)。 |
| refChild | SharedPtr\<XmlNode\> | 作为参考节点的 [XmlNode](../../xmlnode/)。**newChild** 放置在 **refChild** 之后。 |

### ReturnValue

已插入的 [XmlNode](../../xmlnode/)。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
