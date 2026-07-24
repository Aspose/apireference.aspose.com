---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs 构造函数。初始化 XmlNodeChangedEventArgs 类的一个新实例（C++）。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


初始化 [XmlNodeChangedEventArgs](../) 类的一个新实例。

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | 生成事件的 [XmlNode](../../xmlnode/)。 |
| oldParent | const SharedPtr\<XmlNode\>\& | 生成事件的 [XmlNode](../../xmlnode/) 的旧父级 [XmlNode](../../xmlnode/)。 |
| newParent | const SharedPtr\<XmlNode\>\& | 生成事件的 [XmlNode](../../xmlnode/) 的新父级 [XmlNode](../../xmlnode/)。 |
| oldValue | const String\& | 生成事件的 [XmlNode](../../xmlnode/) 的旧值。 |
| newValue | const String\& | 生成事件的 [XmlNode](../../xmlnode/) 的新值。 |
| action | XmlNodeChangedAction | 此 [XmlNodeChangedAction](../../xmlnodechangedaction/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
