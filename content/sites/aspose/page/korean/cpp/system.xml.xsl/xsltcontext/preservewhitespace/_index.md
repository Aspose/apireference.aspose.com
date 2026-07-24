---
title: "System::Xml::Xsl::XsltContext::PreserveWhitespace 메서드"
linktitle: "PreserveWhitespace"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XsltContext::PreserveWhitespace 메서드. 파생 클래스에서 재정의될 경우, 주어진 컨텍스트에 대해 공백 노드를 보존할지 제거할지를 평가합니다(C++)."
type: docs
weight: 300
url: /ko/cpp/system.xml.xsl/xsltcontext/preservewhitespace/
---
## XsltContext::PreserveWhitespace method


파생 클래스에서 재정의될 때, 주어진 컨텍스트에 대해 공백 노드를 보존할지 제거할지 평가합니다.

```cpp
virtual bool System::Xml::Xsl::XsltContext::PreserveWhitespace(SharedPtr<System::Xml::XPath::XPathNavigator> node)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 노드 | SharedPtr\<System::Xml::XPath::XPathNavigator\> | 현재 컨텍스트에서 보존하거나 제거할 공백 노드. |

### ReturnValue

**true** if the white space is to be preserved; **false** if the white space is to be stripped.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../../../system.xml.xpath/xpathnavigator/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
