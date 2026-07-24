---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewValue 方法"
linktitle: "get_NewValue"
second_title: "Aspose.Page 适用于 C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewValue 方法。返回节点的新的值（C++）。"
type: docs
weight: 400
url: /zh/cpp/system.xml/xmlnodechangedeventargs/get_newvalue/
---
## XmlNodeChangedEventArgs::get_NewValue method


返回节点的新值。

```cpp
String System::Xml::XmlNodeChangedEventArgs::get_NewValue()
```


### ReturnValue

节点的新值。如果节点既不是属性也不是文本节点，或节点正在被移除，则此方法返回 **nullptr**。如果在 **XmlDocument::NodeChanging** 事件中调用，**get_NewValue** 在更改成功时返回节点的值。如果在 **XmlDocument::NodeChanged** 事件中调用，**get_NewValue** 返回节点的当前值。

## 另见

* Class [String](../../../system/string/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
