---
title: "System::Xml::XmlEntityReference::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlEntityReference::CloneNode 方法。创建此节点的副本（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


创建此节点的副本。

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| deep | bool | **true** 表示递归克隆指定节点下的子树；**false** 表示仅克隆节点本身。对于 [XmlEntityReference](../) 节点，此方法始终返回一个没有子节点的实体引用节点。替换文本在节点插入父节点时设置。 |

### ReturnValue

克隆的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
