---
title: "System::Xml::XmlAttribute::PrependChild 메서드"
linktitle: "PrependChild"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlAttribute::PrependChild 메서드. 지정된 노드를 이 노드의 자식 노드 목록 앞에 추가합니다 (C++)."
type: docs
weight: 1600
url: /ko/cpp/system.xml/xmlattribute/prependchild/
---
## XmlAttribute::PrependChild method


지정된 노드를 이 노드의 자식 노드 목록 앞에 추가합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::PrependChild(SharedPtr<XmlNode> newChild) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | 추가할 [XmlNode](../../xmlnode/). 만약 이것이 [XmlDocumentFragment](../../xmldocumentfragment/)인 경우, 문서 조각의 전체 내용이 이 노드의 자식 목록으로 이동됩니다. |

### ReturnValue

추가된 [XmlNode](../../xmlnode/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
