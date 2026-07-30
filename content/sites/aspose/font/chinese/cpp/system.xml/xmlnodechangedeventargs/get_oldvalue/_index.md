---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldValue 方法"
linktitle: "get_OldValue"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldValue 方法。返回节点在 C++ 中的原始值。"
type: docs
weight: 700
url: /zh/cpp/system.xml/xmlnodechangedeventargs/get_oldvalue/
---
## XmlNodeChangedEventArgs::get_OldValue method


返回节点的原始值。

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_OldValue()
```


### ReturnValue

节点的原始值。如果节点既不是属性也不是文本节点，或节点正被插入，则此方法返回 **nullptr**。如果在 **XmlDocument::NodeChanging** 事件中调用，**get_OldValue** 在更改成功时返回将被替换的节点的当前值。如果在 **XmlDocument::NodeChanged** 事件中调用，**get_OldValue** 返回更改前节点的值。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
