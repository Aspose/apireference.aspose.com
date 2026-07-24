---
title: "System::Xml::XmlReader::get_LocalName 메서드"
linktitle: "get_LocalName"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlReader::get_LocalName 메서드. 파생 클래스에서 재정의될 때, C++에서 현재 노드의 로컬 이름을 가져옵니다."
type: docs
weight: 1400
url: /ko/cpp/system.xml/xmlreader/get_localname/
---
## XmlReader::get_LocalName method


파생 클래스에서 재정의될 경우, 현재 노드의 로컬 이름을 가져옵니다.

```cpp
virtual String System::Xml::XmlReader::get_LocalName()=0
```


### ReturnValue

접두사가 제거된 현재 노드의 이름입니다. 예를 들어, **LocalName**은 요소 **<bk:book>**에 대해 **book**입니다. 이름이 없는 노드 유형(예: **[Text](../../../system.text/)**, **Comment** 등)에서는 이 메서드가 [String::Empty](../../../system/string/empty/)을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
