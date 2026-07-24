---
title: "System::Xml::Xsl::XsltContext::ResolveFunction 메서드"
linktitle: "ResolveFunction"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XsltContext::ResolveFunction 메서드. 파생 클래스에서 재정의될 경우, 함수 참조를 해결하고 해당 함수를 나타내는 IXsltContextFunction을 반환합니다. IXsltContextFunction은 C++에서 실행 시 함수의 반환 값을 얻는 데 사용됩니다."
type: docs
weight: 400
url: /ko/cpp/system.xml.xsl/xsltcontext/resolvefunction/
---
## XsltContext::ResolveFunction method


파생 클래스에서 재정의될 경우, 함수 참조를 해결하고 해당 함수를 나타내는 [IXsltContextFunction](../../ixsltcontextfunction/)을 반환합니다. [IXsltContextFunction](../../ixsltcontextfunction/)은 실행 시 함수의 반환 값을 얻는 데 사용됩니다.

```cpp
virtual SharedPtr<IXsltContextFunction> System::Xml::Xsl::XsltContext::ResolveFunction(String prefix, String name, ArrayPtr<System::Xml::XPath::XPathResultType> ArgTypes)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| prefix | String | [XPath](../../../system.xml.xpath/) 식에 나타나는 함수의 접두사. |
| name | String | 함수의 이름. |
| ArgTypes | ArrayPtr\<System::Xml::XPath::XPathResultType\> | 해결되는 함수의 인수 유형 배열입니다. 이를 통해 동일한 이름을 가진 메서드(예: 오버로드된 메서드) 중에서 선택할 수 있습니다. |

### ReturnValue

[IXsltContextFunction](../../ixsltcontextfunction/)은 함수를 나타냅니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextFunction](../../ixsltcontextfunction/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [XPathResultType](../../../system.xml.xpath/xpathresulttype/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
