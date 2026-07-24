---
title: "System::Xml::XmlNode::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNode::CloneNode 方法。当在派生类中重写时，在 C++ 中创建节点的副本。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmlnode/clonenode/
---
## XmlNode::CloneNode method


当在派生类中重写时，创建该节点的副本。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::CloneNode(bool deep)=0
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| deep | bool | **true** 表示递归克隆指定节点下的子树；**false** 表示仅克隆节点本身。 |

### ReturnValue

克隆的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
