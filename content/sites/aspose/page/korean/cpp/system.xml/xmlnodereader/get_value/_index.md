---
title: "System::Xml::XmlNodeReader::get_Value 메서드"
linktitle: "get_Value"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeReader::get_Value 메서드. 현재 노드의 텍스트 값을 C++에서 반환합니다."
type: docs
weight: 2100
url: /ko/cpp/system.xml/xmlnodereader/get_value/
---
## XmlNodeReader::get_Value method


현재 노드의 텍스트 값을 반환합니다.

```cpp
String System::Xml::XmlNodeReader::get_Value() override
```


### ReturnValue

반환된 값은 노드의 [XmlNodeReader::get_NodeType](../get_nodetype/)에 따라 달라집니다.
## 비고



다음 표는 반환할 값이 있는 노드 유형을 나열합니다. 다른 모든 노드 유형은 [String::Empty](../../../system/string/empty/)를 반환합니다. |||
|-|-|
| 노드 유형 | 값 |
| Attribute | 속성의 값. |
| CDATA | CDATA 섹션의 내용. |
| Comment | 주석의 내용. |
| DocumentType | 내부 하위 집합. |
| ProcessingInstruction | 대상을 제외한 전체 내용. |
| SignificantWhitespace | 혼합 콘텐츠 모델에서 마크업 사이의 공백. |
| Text | 텍스트 노드의 내용. |
| Whitespace | 마크업 사이의 공백. |
| XmlDeclaration | 선언의 내용. |

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlNodeReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
