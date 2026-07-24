---
title: "System::Xml::XPath::XPathNodeType enum"
linktitle: "XPathNodeType"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNodeType enum. C++에서 XPathNavigator 클래스가 반환할 수 있는 XPath 노드 유형을 정의합니다."
type: docs
weight: 1100
url: /ko/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


[XPath](../) 노드 유형을 정의하며, 이는 [XPathNavigator](../xpathnavigator/) 클래스에서 반환될 수 있습니다.

```cpp
enum class XPathNodeType
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| 루트 | 0 | XML 문서 또는 노드 트리의 루트 노드입니다. |
| Element | 1 | 예를 들어 **<element>**와 같은 요소입니다. |
| Attribute | 2 | 예를 들어 **id='123'**와 같은 속성입니다. |
| 네임스페이스 | 3 | 예를 들어 **xmlns=\"namespace\"**와 같은 네임스페이스입니다. |
| Text | 4 | 노드의 텍스트 내용입니다. 문서 [Object](../../system/object/) 모델(DOM) [Text](../../system.text/) 및 CDATA 노드 유형과 동일합니다. 최소 한 문자 이상을 포함합니다. |
| SignificantWhitespace | 5 | **xml:space**가 **preserve**로 설정된 공백 문자들을 포함하는 노드입니다. |
| Whitespace | 6 | 유의미한 공백이 없고 오직 공백 문자만 포함하는 노드입니다. 공백 문자는 **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**입니다. |
| ProcessingInstruction | 7 | 예를 들어 **<?pi test?>**와 같은 처리 지시문입니다. 이는 XML 선언을 포함하지 않으며, XML 선언은 [XPathNavigator](../xpathnavigator/) 클래스에 표시되지 않습니다. |
| Comment | 8 | 예를 들어 ****와 같은 주석입니다. |
| All | 9 | 다음 중 하나의 [XPathNodeType](./) 노드 유형입니다. |

## 또 보기

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
