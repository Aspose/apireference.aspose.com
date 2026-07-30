---
title: "System::Xml::XmlElement::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlElement::CloneNode 方法。创建此节点的副本（在 C++ 中）。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlelement/clonenode/
---
## XmlElement::CloneNode method


创建此节点的副本。

```cpp
SharedPtr<XmlNode> System::Xml::XmlElement::CloneNode(bool deep) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| deep | bool | **true** 递归克隆指定节点下的子树；**false** 只克隆节点本身（以及如果节点是 [XmlElement](../) 时的属性）。 |

### ReturnValue

克隆的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
