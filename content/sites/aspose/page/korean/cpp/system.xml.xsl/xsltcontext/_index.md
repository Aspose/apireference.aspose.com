---
title: "System::Xml::Xsl::XsltContext class"
linktitle: "XsltContext"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XsltContext class. Extensible Stylesheet Language for Transformations (XSLT) 프로세서의 현재 실행 컨텍스트를 캡슐화하여 C++에서 XML Path Language (XPath)이 XPath 식 내에서 함수, 매개변수 및 네임스페이스를 해결할 수 있도록 합니다."
type: docs
weight: 500
url: /ko/cpp/system.xml.xsl/xsltcontext/
---
## XsltContext class


Extensible Stylesheet Language for Transformations (XSLT) 프로세서의 현재 실행 컨텍스트를 캡슐화하여 XML Path Language ([XPath](../../system.xml.xpath/))이 [XPath](../../system.xml.xpath/) 식 내에서 함수, 매개변수 및 네임스페이스를 해결할 수 있도록 합니다.

```cpp
class XsltContext : public System::Xml::XmlNamespaceManager
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [CompareDocument](./comparedocument/)(String, String) | 파생 클래스에서 재정의될 때, XSLT 프로세서에 의해 문서가 로드된 순서(즉, [XslTransform](../xsltransform/) 클래스)를 기준으로 두 문서의 기본 Uniform Resource Identifiers (URIs)를 비교합니다. |
| virtual [get_Whitespace](./get_whitespace/)() | 파생 클래스에서 재정의될 때, 출력에 공백 노드를 포함할지 여부를 나타내는 값을 가져옵니다. |
| virtual [PreserveWhitespace](./preservewhitespace/)(SharedPtr\<System::Xml::XPath::XPathNavigator\>) | 파생 클래스에서 재정의될 때, 주어진 컨텍스트에 대해 공백 노드를 보존할지 제거할지 평가합니다. |
| virtual [ResolveFunction](./resolvefunction/)(String, String, ArrayPtr\<System::Xml::XPath::XPathResultType\>) | 파생 클래스에서 재정의될 때, 함수 참조를 해결하고 해당 함수를 나타내는 [IXsltContextFunction](../ixsltcontextfunction/)을 반환합니다. [IXsltContextFunction](../ixsltcontextfunction/)은 실행 시 함수의 반환 값을 얻는 데 사용됩니다. |
| virtual [ResolveVariable](./resolvevariable/)(String, String) | 파생 클래스에서 재정의될 때, 변수 참조를 해결하고 해당 변수를 나타내는 [IXsltContextVariable](../ixsltcontextvariable/)을 반환합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [Ptr](./ptr/) | 이 클래스 인스턴스에 대한 공유 포인터 별칭입니다. |
## 또 보기

* Class [XmlNamespaceManager](../../system.xml/xmlnamespacemanager/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
