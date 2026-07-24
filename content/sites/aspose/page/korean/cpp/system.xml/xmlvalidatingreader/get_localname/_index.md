---
title: "System::Xml::XmlValidatingReader::get_LocalName 메서드"
linktitle: "get_LocalName"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlValidatingReader::get_LocalName 메서드. 현재 노드의 로컬 이름을 반환합니다 C++에서."
type: docs
weight: 1600
url: /ko/cpp/system.xml/xmlvalidatingreader/get_localname/
---
## XmlValidatingReader::get_LocalName method


현재 노드의 로컬 이름을 반환합니다.

```cpp
String System::Xml::XmlValidatingReader::get_LocalName() override
```


### ReturnValue

접두사가 제거된 현재 노드의 이름입니다. 예를 들어, **LocalName**은 요소 **<bk:book>**에 대해 **book**입니다. 이름이 없는 노드 유형(예: **[Text](../../../system.text/)**, **Comment** 등)에서는 이 메서드가 [String::Empty](../../../system/string/empty/)을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
