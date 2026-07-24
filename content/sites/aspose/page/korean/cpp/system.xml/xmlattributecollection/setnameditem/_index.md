---
title: "System::Xml::XmlAttributeCollection::SetNamedItem 메서드"
linktitle: "SetNamedItem"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlAttributeCollection::SetNamedItem 메서드. C++에서 XmlNode::get_Name 결과를 사용하여 XmlNode를 추가합니다."
type: docs
weight: 1000
url: /ko/cpp/system.xml/xmlattributecollection/setnameditem/
---
## XmlAttributeCollection::SetNamedItem method


[XmlNode](../../xmlnode/)를 해당 [XmlNode::get_Name](../../xmlnode/get_name/) 결과를 사용하여 추가합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttributeCollection::SetNamedItem(SharedPtr<XmlNode> node) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 노드 | SharedPtr\<XmlNode\> | 이 컬렉션에 저장할 속성 노드입니다. 이후에는 노드 이름을 사용하여 노드에 접근할 수 있습니다. 동일한 이름의 노드가 이미 컬렉션에 존재하면 새 노드로 교체되고, 그렇지 않으면 컬렉션 끝에 추가됩니다. |

### ReturnValue

만약 **node**가 동일한 이름의 기존 노드를 교체하면, 이전 노드가 반환되고; 그렇지 않으면 추가된 노드가 반환됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttributeCollection](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
