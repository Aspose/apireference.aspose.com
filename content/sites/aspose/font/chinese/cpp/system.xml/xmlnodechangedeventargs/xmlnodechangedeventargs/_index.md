---
title: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs 构造函数"
linktitle: "XmlNodeChangedEventArgs"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs 构造函数。在 C++ 中初始化 XmlNodeChangedEventArgs 类的新实例。"
type: docs
weight: 100
url: /zh/cpp/system.xml/xmlnodechangedeventargs/xmlnodechangedeventargs/
---
## XmlNodeChangedEventArgs::XmlNodeChangedEventArgs constructor


初始化 [XmlNodeChangedEventArgs](../) 类的新实例。

```cpp
System::Xml::XmlNodeChangedEventArgs::XmlNodeChangedEventArgs(const SharedPtr<XmlNode> &node, const SharedPtr<XmlNode> &oldParent, const SharedPtr<XmlNode> &newParent, const String &oldValue, const String &newValue, XmlNodeChangedAction action)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| node | const SharedPtr\<XmlNode\>\& | 触发事件的 [XmlNode](../../xmlnode/)。 |
| oldParent | const SharedPtr\<XmlNode\>\& | 触发事件的 [XmlNode](../../xmlnode/) 的旧父节点 [XmlNode](../../xmlnode/)。 |
| newParent | const SharedPtr\<XmlNode\>\& | 触发事件的 [XmlNode](../../xmlnode/) 的新父节点 [XmlNode](../../xmlnode/)。 |
| oldValue | const String\& | 触发事件的 [XmlNode](../../xmlnode/) 的旧值。 |
| newValue | const String\& | 触发事件的 [XmlNode](../../xmlnode/) 的新值。 |
| action | XmlNodeChangedAction | 此 [XmlNodeChangedAction](../../xmlnodechangedaction/)。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Enum [XmlNodeChangedAction](../../xmlnodechangedaction/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
