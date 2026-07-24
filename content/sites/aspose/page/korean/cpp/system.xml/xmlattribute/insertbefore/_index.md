---
title: "System::Xml::XmlAttribute::InsertBefore 메서드"
linktitle: "InsertBefore"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlAttribute::InsertBefore 메서드. C++에서 지정된 참조 노드 바로 앞에 지정된 노드를 삽입합니다."
type: docs
weight: 1500
url: /ko/cpp/system.xml/xmlattribute/insertbefore/
---
## XmlAttribute::InsertBefore method


지정된 참조 노드 바로 앞에 지정된 노드를 삽입합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlAttribute::InsertBefore(SharedPtr<XmlNode> newChild, SharedPtr<XmlNode> refChild) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| newChild | SharedPtr\<XmlNode\> | 삽입할 [XmlNode](../../xmlnode/)입니다. |
| refChild | SharedPtr\<XmlNode\> | 참조 노드인 [XmlNode](../../xmlnode/)입니다. **newChild**는 이 노드 앞에 배치됩니다. |

### ReturnValue

삽입된 [XmlNode](../../xmlnode/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
