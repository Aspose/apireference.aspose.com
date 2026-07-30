---
title: "System::Xml::XmlEntityReference::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlEntityReference::CloneNode 方法。 在 C++ 中创建此节点的副本。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlentityreference/clonenode/
---
## XmlEntityReference::CloneNode method


创建此节点的副本。

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntityReference::CloneNode(bool deep) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| deep | bool | **true** 递归克隆指定节点下的子树；**false** 仅克隆节点本身。对于 [XmlEntityReference](../) 节点，此方法始终返回没有子节点的实体引用节点。当节点插入父节点时设置替换文本。 |

### ReturnValue

克隆的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntityReference](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
