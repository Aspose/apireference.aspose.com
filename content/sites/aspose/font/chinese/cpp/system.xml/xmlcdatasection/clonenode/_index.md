---
title: "System::Xml::XmlCDataSection::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlCDataSection::CloneNode 方法。创建此节点的副本（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlcdatasection/clonenode/
---
## XmlCDataSection::CloneNode method


创建此节点的副本。

```cpp
SharedPtr<XmlNode> System::Xml::XmlCDataSection::CloneNode(bool deep) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| deep | bool | **true** 表示递归克隆指定节点下的子树；**false** 表示仅克隆节点本身。由于 CDATA 节点没有子节点，无论参数设置如何，克隆的节点始终会包含数据内容。 |

### ReturnValue

克隆的节点。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlCDataSection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
