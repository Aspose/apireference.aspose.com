---
title: "System::Xml::XmlWhitespace::CloneNode method"
linktitle: "CloneNode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlWhitespace::CloneNode 方法。创建此节点在 C++ 中的副本。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlwhitespace/clonenode/
---
## XmlWhitespace::CloneNode method


创建此节点的副本。

```cpp
SharedPtr<XmlNode> System::Xml::XmlWhitespace::CloneNode(bool deep) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| deep | bool | **true** 表示递归克隆指定节点下的子树；**false** 表示仅克隆节点本身。对于空白节点，无论参数设置如何，克隆的节点始终包含数据值。 |

### ReturnValue

克隆的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
