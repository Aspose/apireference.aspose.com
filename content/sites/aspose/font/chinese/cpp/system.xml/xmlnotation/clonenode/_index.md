---
title: "System::Xml::XmlNotation::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNotation::CloneNode 方法。创建此节点的副本。Notation 节点不能被克隆。在 XmlNotation 对象上调用此方法会抛出异常（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


创建此节点的副本。Notation 节点不能被克隆。在 [XmlNotation](../) 对象上调用此方法会抛出异常。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| deep | bool | **true** 表示递归克隆指定节点下的子树；**false** 表示仅克隆节点本身。 |

### ReturnValue

一个来自调用该方法的节点的 [XmlNode](../../xmlnode/) 副本。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
