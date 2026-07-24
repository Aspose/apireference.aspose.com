---
title: "System::Xml::XmlNamedNodeMap::Item 메서드"
linktitle: "Item"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap::Item 메서드. C++에서 XmlNamedNodeMap의 지정된 인덱스에 있는 노드를 검색합니다."
type: docs
weight: 800
url: /ko/cpp/system.xml/xmlnamednodemap/item/
---
## XmlNamedNodeMap::Item method


[XmlNamedNodeMap](../)의 지정된 인덱스에 있는 노드를 검색합니다.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::Item(int32_t index)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| index | int32_t | 검색할 노드의 인덱스 위치는 [XmlNamedNodeMap](../)에서 가져옵니다. 인덱스는 0부터 시작하므로 첫 번째 노드의 인덱스는 0이고 마지막 노드의 인덱스는 [XmlNamedNodeMap::get_Count](../get_count/) - 1입니다. |

### ReturnValue

지정된 인덱스에 있는 [XmlNode](../../xmlnode/)입니다. **index**가 0보다 작거나 [XmlNamedNodeMap::get_Count](../get_count/) 값보다 크거나 같으면 **nullptr**가 반환됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
