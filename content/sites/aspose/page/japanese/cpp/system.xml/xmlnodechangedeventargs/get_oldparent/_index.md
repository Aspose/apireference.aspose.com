---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent メソッド"
linktitle: "get_OldParent"
second_title: "C++ 用 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent メソッド。C++ で操作が開始される前の XmlNode::get_ParentNode の値を返します。"
type: docs
weight: 600
url: /ja/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


操作が開始される前の [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/) の値を返します。

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

操作が開始される前の **ParentNode** の値。このメソッドはノードに親がない場合 **nullptr** を返します。属性ノードの場合、このメソッドは [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) の値を返します。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
