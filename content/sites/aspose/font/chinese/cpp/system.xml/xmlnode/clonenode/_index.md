---
title: "System::Xml::XmlNode::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNode::CloneNode 方法。创建节点的副本，当在 C++ 派生类中被重写时。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmlnode/clonenode/
---
## XmlNode::CloneNode method


在派生类中重写时，创建该节点的副本。

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNode::CloneNode(bool deep)=0
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| deep | bool | **true** 表示递归克隆指定节点下的子树；**false** 表示仅克隆节点本身。 |

### ReturnValue

克隆的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
