---
title: "System::Xml::Xsl::IXsltContextFunction::Invoke 메서드"
linktitle: "Invoke"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::IXsltContextFunction::Invoke 메서드. 주어진 컨텍스트와 인수를 사용하여 C++에서 함수를 호출하는 방법을 제공합니다."
type: docs
weight: 500
url: /ko/cpp/system.xml.xsl/ixsltcontextfunction/invoke/
---
## IXsltContextFunction::Invoke method


주어진 컨텍스트에서 주어진 인수를 사용하여 함수를 호출하는 메서드를 제공합니다.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextFunction::Invoke(SharedPtr<XsltContext> xsltContext, ArrayPtr<SharedPtr<Object>> args, SharedPtr<System::Xml::XPath::XPathNavigator> docContext)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | 함수 호출을 위한 XSLT 컨텍스트. |
| args | ArrayPtr\<SharedPtr\<Object\>\> | 함수 호출의 인수들. 각 인수는 배열의 요소입니다. |
| docContext | SharedPtr\<System::Xml::XPath::XPathNavigator\> | 함수 호출을 위한 컨텍스트 노드. |

### ReturnValue

함수의 반환 값을 나타내는 [Object](../../../system/object/).

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [IXsltContextFunction](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
