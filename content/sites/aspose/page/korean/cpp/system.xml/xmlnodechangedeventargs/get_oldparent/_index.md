---
title: "System::Xml::XmlNodeChangedEventArgs::get_OldParent 메서드"
linktitle: "get_OldParent"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeChangedEventArgs::get_OldParent 메서드. C++에서 작업이 시작되기 전 XmlNode::get_ParentNode의 값을 반환합니다."
type: docs
weight: 600
url: /ko/cpp/system.xml/xmlnodechangedeventargs/get_oldparent/
---
## XmlNodeChangedEventArgs::get_OldParent method


작업이 시작되기 전 [XmlNode::get_ParentNode](../../xmlnode/get_parentnode/)의 값을 반환합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNodeChangedEventArgs::get_OldParent()
```


### ReturnValue

작업이 시작되기 전 **ParentNode**의 값입니다. 노드에 부모가 없으면 이 메서드는 **nullptr**를 반환합니다. 속성 노드의 경우, 이 메서드는 [XmlAttribute::get_OwnerElement](../../xmlattribute/get_ownerelement/) 값을 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNodeChangedEventArgs](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
