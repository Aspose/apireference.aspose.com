---
title: "System::Xml::XmlNodeChangedEventArgs::get_NewParent 메서드"
linktitle: "get_NewParent"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs::get_NewParent 메서드. C++에서 작업이 완료된 후 XmlNode::get_ParentNode의 값을 반환합니다."
type: docs
weight: 300
url: /ko/cpp/system.xml/xmlnodechangedeventargs/get_newparent/
---
## XmlNodeChangedEventArgs::get_NewParent method


작업이 완료된 후 [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/)의 값을 반환합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_NewParent()
```


### ReturnValue

작업이 완료된 후 **ParentNode**의 값입니다. 이 메서드는 노드가 제거되는 경우 **nullptr**를 반환합니다. 속성 노드의 경우, 이 메서드는 [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) 값을 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
