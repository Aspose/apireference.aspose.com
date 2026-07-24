---
title: "System::Xml::Xsl::IXsltContextVariable::Evaluate 메서드"
linktitle: "Evaluate"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::IXsltContextVariable::Evaluate 메서드. 런타임에 변수를 평가하고 변수의 값을 나타내는 객체를 반환합니다. (C++에서)"
type: docs
weight: 100
url: /ko/cpp/system.xml.xsl/ixsltcontextvariable/evaluate/
---
## IXsltContextVariable::Evaluate method


런타임에 변수를 평가하고 변수의 값을 나타내는 객체를 반환합니다.

```cpp
virtual SharedPtr<Object> System::Xml::Xsl::IXsltContextVariable::Evaluate(SharedPtr<XsltContext> xsltContext)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xsltContext | SharedPtr\<XsltContext\> | [XsltContext](../../xsltcontext/)은 변수의 실행 컨텍스트를 나타냅니다. |

### ReturnValue

[Object](../../../system/object/)는 변수의 값을 나타냅니다. 가능한 반환 유형에는 숫자, 문자열, [Boolean](../../../system/boolean/), 문서 조각 또는 노드 집합이 포함됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XsltContext](../../xsltcontext/)
* Class [IXsltContextVariable](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
