---
title: "System::Xml::XmlReader::ReadAttributeValue 메서드"
linktitle: "ReadAttributeValue"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::ReadAttributeValue 메서드. 파생 클래스에서 재정의될 경우, C++에서 속성 값을 하나 이상의 Text, EntityReference 또는 EndEntity 노드로 구문 분석합니다."
type: docs
weight: 3800
url: /ko/cpp/system.xml/xmlreader/readattributevalue/
---
## XmlReader::ReadAttributeValue method


파생 클래스에서 재정의될 경우, 속성 값을 하나 이상의 **[Text](../../../system.text/)**, **EntityReference**, 또는 **EndEntity** 노드로 구문 분석합니다.

```cpp
virtual bool System::Xml::XmlReader::ReadAttributeValue()=0
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## 또 보기

* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
