---
title: "System::Xml::XmlNamedNodeMap::SetNamedItem 메서드"
linktitle: "SetNamedItem"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap::SetNamedItem 메서드. C++에서 XmlNode::get_Name 값을 사용하여 XmlNode를 추가합니다."
type: docs
weight: 1000
url: /ko/cpp/system.xml/xmlnamednodemap/setnameditem/
---
## XmlNamedNodeMap::SetNamedItem method


[XmlNode](../../xmlnode/)을 해당 [XmlNode::get_Name](../../xmlnode/get_name/) 값으로 추가합니다.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::SetNamedItem(SharedPtr<XmlNode> node)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| node | SharedPtr\<XmlNode\> | [XmlNamedNodeMap](../)에 저장할 [XmlNode](../../xmlnode/)입니다. 해당 이름을 가진 노드가 이미 맵에 존재하면 새 노드로 교체됩니다. |

### ReturnValue

같은 이름을 가진 기존 노드를 **node**가 교체하는 경우, 이전 노드가 반환됩니다; 그렇지 않으면 **nullptr**가 반환됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
