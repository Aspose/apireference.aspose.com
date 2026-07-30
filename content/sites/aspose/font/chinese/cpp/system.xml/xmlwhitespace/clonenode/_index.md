---
title: "System::Xml::XmlWhitespace::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlWhitespace::CloneNode 方法。在 C++ 中创建此节点的副本。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlwhitespace/clonenode/
---
## XmlWhitespace::CloneNode method


创建此节点的副本。

```cpp
SharedPtr<XmlNode> System::Xml::XmlWhitespace::CloneNode(bool deep) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| deep | bool | **true** 递归克隆指定节点下的子树；**false** 只克隆节点本身。对于空白节点，克隆的节点始终包含数据值，而不受参数设置的影响。 |

### ReturnValue

克隆的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlWhitespace](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
