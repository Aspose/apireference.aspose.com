---
title: "System::Xml::Xsl::XsltContext::ResolveVariable 메서드"
linktitle: "ResolveVariable"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XsltContext::ResolveVariable 메서드. 파생 클래스에서 재정의될 경우, 변수 참조를 해결하고 해당 변수를 나타내는 IXsltContextVariable을 반환합니다(C++)."
type: docs
weight: 500
url: /ko/cpp/system.xml.xsl/xsltcontext/resolvevariable/
---
## XsltContext::ResolveVariable method


파생 클래스에서 재정의될 경우, 변수 참조를 해결하고 변수를 나타내는 [IXsltContextVariable](../../ixsltcontextvariable/)을 반환합니다.

```cpp
virtual SharedPtr<IXsltContextVariable> System::Xml::Xsl::XsltContext::ResolveVariable(String prefix, String name)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| prefix | String | 변수가 [XPath](../../../system.xml.xpath/) 식에서 나타나는 접두사. |
| name | String | 변수의 이름. |

### ReturnValue

런타임에 변수를 나타내는 [IXsltContextVariable](../../ixsltcontextvariable/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IXsltContextVariable](../../ixsltcontextvariable/)
* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
