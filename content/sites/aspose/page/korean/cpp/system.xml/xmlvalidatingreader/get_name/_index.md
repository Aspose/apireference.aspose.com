---
title: "System::Xml::XmlValidatingReader::get_Name 메서드"
linktitle: "get_Name"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlValidatingReader::get_Name 메서드. 현재 노드의 정규화된 이름을 반환합니다 C++에서."
type: docs
weight: 1700
url: /ko/cpp/system.xml/xmlvalidatingreader/get_name/
---
## XmlValidatingReader::get_Name method


현재 노드의 정규화된 이름을 반환합니다.

```cpp
String System::Xml::XmlValidatingReader::get_Name() override
```


### ReturnValue

현재 노드의 정규화된 이름입니다. 예를 들어, **Name**은 요소 **<bk:book>**에 대해 **bk:book**입니다.
## 비고



반환된 이름은 노드의 XmlValidatingReader::NodeType에 따라 달라집니다. 다음 노드 유형은 나열된 값을 반환합니다. 다른 모든 노드 유형은 빈 문자열을 반환합니다. |||
|-|-|
| 노드 유형 | 이름 |
| Attribute | 속성의 이름입니다. |
| DocumentType | 문서 유형 이름입니다. |
| Element | 태그 이름입니다. |
| EntityReference | 참조된 엔터티의 이름입니다. |
| ProcessingInstruction | 처리 지시문의 대상입니다. |
| XmlDeclaration | 리터럴 문자열 xml입니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
