---
title: "System::Xml::XmlNode::get_Attributes 方法"
linktitle: "get_Attributes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Xml::XmlNode::get_Attributes 方法。返回一个 XmlAttributeCollection，其中包含此节点在 C++ 中的属性。"
type: docs
weight: 500
url: /zh/cpp/system.xml/xmlnode/get_attributes/
---
## XmlNode::get_Attributes method


返回一个包含此节点属性的 [XmlAttributeCollection](../../xmlattributecollection/)。

```cpp
virtual SharedPtr<XmlAttributeCollection> System::Xml::XmlNode::get_Attributes() final
```


### ReturnValue

一个包含节点属性的 [XmlAttributeCollection](../../xmlattributecollection/)。如果节点的类型是 [XmlNodeType::Element](../../xmlnodetype/)，则返回该节点的属性。否则，此方法返回 **nullptr**。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlAttributeCollection](../../xmlattributecollection/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
