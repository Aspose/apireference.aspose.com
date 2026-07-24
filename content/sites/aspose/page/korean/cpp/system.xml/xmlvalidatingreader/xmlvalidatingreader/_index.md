---
title: "System::Xml::XmlValidatingReader::XmlValidatingReader 생성자"
linktitle: "XmlValidatingReader"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlValidatingReader::XmlValidatingReader 생성자. C++에서 지정된 값으로 XmlValidatingReader 클래스의 새 인스턴스를 초기화합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml/xmlvalidatingreader/xmlvalidatingreader/
---
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<IO::Stream\>\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


지정된 값으로 [XmlValidatingReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<IO::Stream> &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xmlFragment | const SharedPtr\<IO::Stream\>\& | 구문 분석할 XML 조각을 포함하는 스트림입니다. |
| fragType | XmlNodeType | XML 조각의 [XmlNodeType](../../xmlnodetype/)입니다. 이는 조각이 포함할 수 있는 내용을 결정합니다(아래 표 참고). |
| context | const SharedPtr\<XmlParserContext\>\& | [XmlParserContext](../../xmlparsercontext/)에서 XML 조각을 구문 분석합니다. 여기에는 사용할 [XmlNameTable](../../xmlnametable/), 인코딩, 네임스페이스 범위, 현재 **xml:lang**, 및 **xml:space** 범위가 포함됩니다. |
## 비고



다음 표는 **fragType**에 대한 유효한 값과 리더가 각 다른 노드 유형을 어떻게 구문 분석하는지 보여줍니다. |||
|-|-|
| XmlNodeType | 조각에 포함될 수 있는 내용 |
| Element | 유효한 모든 요소 내용(예: 요소, 주석, 처리 명령, CDATA, 텍스트 및 엔터티 참조의 모든 조합). |
| Attribute | 속성 값(따옴표 안의 부분). |
| Document | 전체 XML 문서의 내용; 이는 문서 수준 규칙을 적용합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const SharedPtr\<XmlReader\>\&) constructor


주어진 [XmlReader](../../xmlreader/)에서 반환된 내용을 검증하는 [XmlValidatingReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const SharedPtr<XmlReader> &reader)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| reader | const SharedPtr\<XmlReader\>\& | 검증 중에 읽을 [XmlReader](../../xmlreader/) . 현재 구현은 [XmlTextReader](../../xmltextreader/)만 지원합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlReader](../../xmlreader/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlValidatingReader::XmlValidatingReader(const String\&, XmlNodeType, const SharedPtr\<XmlParserContext\>\&) constructor


지정된 값으로 [XmlValidatingReader](../) 클래스의 새 인스턴스를 초기화합니다.

```cpp
System::Xml::XmlValidatingReader::XmlValidatingReader(const String &xmlFragment, XmlNodeType fragType, const SharedPtr<XmlParserContext> &context)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xmlFragment | const String\& | 구문 분석할 XML 조각을 포함하는 문자열입니다. |
| fragType | XmlNodeType | XML 조각의 [XmlNodeType](../../xmlnodetype/). 이는 조각 문자열이 포함할 수 있는 내용을 결정합니다(아래 표 참조). |
| context | const SharedPtr\<XmlParserContext\>\& | XML 조각을 구문 분석할 [XmlParserContext](../../xmlparsercontext/). 여기에는 사용할 [NameTable](../../nametable/), 인코딩, 네임스페이스 범위, 현재 **xml:lang**, 및 **xml:space** 범위가 포함됩니다. |
## 비고



다음 표는 **fragType**에 대한 유효한 값과 리더가 각 다른 노드 유형을 어떻게 구문 분석하는지 보여줍니다. |||
|-|-|
| XmlNodeType | 조각에 포함될 수 있는 내용 |
| Element | 유효한 모든 요소 내용(예: 요소, 주석, 처리 명령, CDATA, 텍스트 및 엔터티 참조의 모든 조합). |
| Attribute | 속성 값(따옴표 안의 부분). |
| Document | 전체 XML 문서의 내용; 이는 문서 수준 규칙을 적용합니다. |

## 또 보기

* Class [String](../../../system/string/)
* Enum [XmlNodeType](../../xmlnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlParserContext](../../xmlparsercontext/)
* Class [XmlValidatingReader](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
