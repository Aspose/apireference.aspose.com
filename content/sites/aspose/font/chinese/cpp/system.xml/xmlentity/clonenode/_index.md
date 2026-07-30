---
title: "System::Xml::XmlEntity::CloneNode 方法"
linktitle: "CloneNode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlEntity::CloneNode 方法。创建此节点的副本。实体节点不能被克隆。在 C++ 中对 XmlEntity 对象调用此方法会抛出异常。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlentity/clonenode/
---
## XmlEntity::CloneNode method


创建此节点的副本。实体节点不能被克隆。对 [XmlEntity](../) 对象调用此方法会抛出异常。

```cpp
SharedPtr<XmlNode> System::Xml::XmlEntity::CloneNode(bool deep) override
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| deep | bool | **true** 表示递归克隆指定节点下的子树；**false** 表示仅克隆节点本身。 |

### ReturnValue

从调用该方法的 [XmlNode](../../xmlnode/) 的副本。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlEntity](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
