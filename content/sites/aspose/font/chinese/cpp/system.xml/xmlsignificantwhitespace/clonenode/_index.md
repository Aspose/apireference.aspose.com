---
title: "System::Xml::XmlSignificantWhitespace::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlSignificantWhitespace::CloneNode 方法。在 C++ 中创建此节点的副本。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlsignificantwhitespace/clonenode/
---
## XmlSignificantWhitespace::CloneNode method


创建此节点的副本。

```cpp
SharedPtr<XmlNode> System::Xml::XmlSignificantWhitespace::CloneNode(bool deep) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| deep | bool | **true** 表示递归克隆指定节点下的子树；**false** 表示仅克隆节点本身。对于显著空白节点，无论参数设置如何，克隆的节点始终包含数据值。 |

### ReturnValue

克隆的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlSignificantWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
