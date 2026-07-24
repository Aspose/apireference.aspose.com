---
title: "System::Xml::XmlNodeReader::ReadAttributeValue 메서드"
linktitle: "ReadAttributeValue"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeReader::ReadAttributeValue 메서드. C++에서 속성 값을 하나 이상의 Text, EntityReference 또는 EndEntity 노드로 구문 분석합니다."
type: docs
weight: 3100
url: /ko/cpp/system.xml/xmlnodereader/readattributevalue/
---
## XmlNodeReader::ReadAttributeValue method


속성 값을 하나 이상의 **[Text](../../../system.text/)**, **EntityReference**, 또는 **EndEntity** 노드로 구문 분석합니다.

```cpp
bool System::Xml::XmlNodeReader::ReadAttributeValue() override
```


### ReturnValue

**true** if there are nodes to return. **false** if the reader is not positioned on an attribute node when the initial call is made or if all the attribute values have been read. An empty attribute, such as, **misc=""**, returns **true** with a single node with a value of [String::Empty](../../../system/string/empty/).

## 또 보기

* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
