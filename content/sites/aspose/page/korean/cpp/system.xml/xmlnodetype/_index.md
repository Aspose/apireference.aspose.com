---
title: "System::Xml::XmlNodeType 열거형"
linktitle: "XmlNodeType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNodeType 열거형. C++에서 노드 유형을 지정합니다."
type: docs
weight: 6200
url: /ko/cpp/system.xml/xmlnodetype/
---
## XmlNodeType enum


노드 유형을 지정합니다.

```cpp
enum class XmlNodeType
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | 0 | [XmlReader](../xmlreader/)가 **Read** 메서드를 호출하지 않은 경우 반환됩니다. |
| Element | 1 | 요소 (예: **<item>**). |
| Attribute | 2 | 속성 (예: **id='123'**). |
| Text | 3 | 노드의 텍스트 내용입니다. [XmlNodeType::Text](./) 노드는 자식 노드를 가질 수 없습니다. 이는 [XmlNodeType::Attribute](./), [XmlNodeType::DocumentFragment](./), [XmlNodeType::Element](./), 및 [XmlNodeType::EntityReference](./) 노드의 자식 노드로 나타날 수 있습니다. |
| CDATA | 4 | CDATA 섹션 (예: **my escaped text**). |
| EntityReference | 5 | 엔터티에 대한 참조 (예: **&num;**). |
| Entity | 6 | 엔터티 선언 (예: **<!ENTITY...>**). |
| ProcessingInstruction | 7 | 처리 명령 (예: **<?pi test?>**). |
| Comment | 8 | 주석 (예: ****). |
| Document | 9 | 문서 트리의 루트로서 전체 XML 문서에 접근할 수 있게 해 주는 문서 객체입니다. |
| DocumentType | 10 | 다음 태그(예: **<!DOCTYPE...>**)로 표시되는 문서 유형 선언입니다. |
| DocumentFragment | 11 | 문서 조각입니다. |
| Notation | 12 | 문서 유형 선언에 있는 표기법(예: **<!NOTATION...>**)입니다. |
| Whitespace | 13 | 마크업 사이의 공백입니다. |
| SignificantWhitespace | 14 | 혼합 콘텐츠 모델에서 마크업 사이의 공백 또는 **xml:space=\"preserve\"** 범위 내의 공백입니다. |
| EndElement | 15 | 종료 요소 태그(예: ****)입니다. |
| EndEntity | 16 | [XmlReader](../xmlreader/)가 [XmlReader::ResolveEntity](../xmlreader/resolveentity/) 호출 결과로 엔터티 교체의 끝에 도달했을 때 반환됩니다. |
| XmlDeclaration | 17 | XML 선언(예: **<?xml version='1.0'?>**). [XmlNodeType::XmlDeclaration](./) 노드는 문서의 첫 번째 노드여야 합니다. 자식 노드를 가질 수 없습니다. 이는 [XmlNodeType::Document](./) 노드의 자식이며, 버전 및 인코딩 정보를 제공하는 속성을 가질 수 있습니다. |

## 또 보기

* Namespace [System::Xml](../)
* Library [Aspose.Page for C++](../../)
