---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent 方法"
linktitle: "get_OldParent"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent 方法。返回操作开始前 XmlNode::get_ParentNode 的值（C++）。"
type: docs
weight: 600
url: /zh/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


返回操作开始前 [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) 的值。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

操作开始前 **ParentNode** 的值。如果节点没有父节点，此方法返回 **nullptr**。对于属性节点，此方法返回 [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) 的值。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
