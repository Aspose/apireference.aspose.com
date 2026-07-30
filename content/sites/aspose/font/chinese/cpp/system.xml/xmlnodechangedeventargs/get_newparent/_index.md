---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent 方法"
linktitle: "get_NewParent"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent 方法。返回操作完成后 XmlNode::get_ParentNode 的值（C++）。"
type: docs
weight: 300
url: /zh/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


返回操作完成后 [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) 的值。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

操作完成后 **ParentNode** 的值。如果节点被移除，此方法返回 **nullptr**。对于属性节点，此方法返回 [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) 的值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
