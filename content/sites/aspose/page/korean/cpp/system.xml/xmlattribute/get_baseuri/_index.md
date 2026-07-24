---
title: "System::Xml::XmlAttribute::get_BaseURI 메서드"
linktitle: "get_BaseURI"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlAttribute::get_BaseURI 메서드. C++에서 노드의 기본 통합 자원 식별자(URI)를 반환합니다."
type: docs
weight: 300
url: /ko/cpp/system.xml/xmlattribute/get_baseuri/
---
## XmlAttribute::get_BaseURI method


노드의 기본 Uniform Resource Identifier(URI)를 반환합니다.

```cpp
String System::Xml::XmlAttribute::get_BaseURI() override
```


### ReturnValue

노드가 로드된 위치를 반환합니다. 기본 URI가 없는 경우에는 [String::Empty](../../../system/string/empty/)을 반환합니다. [Attribute](../../../system/attribute/) 노드는 소유 요소와 동일한 기본 URI를 가집니다. 속성 노드에 소유 요소가 없으면 get_BaseURI는 [String::Empty](../../../system/string/empty/)을 반환합니다.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlAttribute](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
