---
title: "System::Xml::Xsl::IXsltContextFunction class"
linktitle: "IXsltContextFunction"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::IXsltContextFunction class. C++에서 런타임 실행 중 Extensible Stylesheet Language for Transformations (XSLT) 스타일시트에 정의된 특정 함수에 대한 인터페이스를 제공합니다."
type: docs
weight: 100
url: /ko/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


런타임 실행 중에 변환용 확장 스타일시트 언어 (XSLT) 스타일시트에 정의된 특정 함수에 대한 인터페이스를 제공합니다.

```cpp
class IXsltContextFunction : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | 함수의 인수 목록에 대해 제공된 XML Path Language ([XPath](../../system.xml.xpath/)) 유형을 반환합니다. 이 정보는 함수의 시그니처를 파악하는 데 사용될 수 있으며, 이를 통해 오버로드된 함수를 구분할 수 있습니다. |
| virtual [get_Maxargs](./get_maxargs/)() | 함수에 허용되는 최대 인수 개수를 반환합니다. 이를 통해 사용자는 오버로드된 함수를 구분할 수 있습니다. |
| virtual [get_Minargs](./get_minargs/)() | 함수에 허용되는 최소 인수 개수를 반환합니다. 이를 통해 사용자는 오버로드된 함수를 구분할 수 있습니다. |
| virtual [get_ReturnType](./get_returntype/)() | 함수가 반환하는 [XPath](../../system.xml.xpath/) 유형을 나타내는 XPathResultType을 반환합니다. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | 주어진 컨텍스트에서 주어진 인수를 사용하여 함수를 호출하는 메서드를 제공합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
