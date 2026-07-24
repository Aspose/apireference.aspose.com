---
title: "System::Xml::XmlNotation::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNotation::CloneNode 方法。创建此节点的副本。Notation 节点不能被克隆。在 C++ 中，对 XmlNotation 对象调用此方法会抛出异常。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlnotation/clonenode/
---
## XmlNotation::CloneNode method


创建此节点的副本。Notation 节点不能被克隆。对 [XmlNotation](../) 对象调用此方法会抛出异常。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNotation::CloneNode(bool deep) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| deep | bool | **true** 表示递归克隆指定节点下的子树；**false** 表示仅克隆节点本身。 |

### ReturnValue

从调用该方法的节点获取的 [XmlNode](../../xmlnode/) 副本。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNotation](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
