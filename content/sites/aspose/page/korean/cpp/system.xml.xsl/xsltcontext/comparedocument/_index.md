---
title: "System::Xml::Xsl::XsltContext::CompareDocument 메서드"
linktitle: "CompareDocument"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::XsltContext::CompareDocument 메서드. 파생 클래스에서 재정의될 경우, XSLT 프로세서(즉, XslTransform 클래스)에 의해 문서가 로드된 순서를 기준으로 두 문서의 기본 통합 자원 식별자(URIs)를 비교합니다(C++)."
type: docs
weight: 100
url: /ko/cpp/system.xml.xsl/xsltcontext/comparedocument/
---
## XsltContext::CompareDocument method


파생 클래스에서 재정의될 경우, XSLT 프로세서(즉, [XslTransform](../../xsltransform/) 클래스)에 의해 문서가 로드된 순서를 기준으로 두 문서의 기본 통합 자원 식별자(URIs)를 비교합니다.

```cpp
virtual int32_t System::Xml::Xsl::XsltContext::CompareDocument(String baseUri, String nextbaseUri)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| baseUri | String | 비교할 첫 번째 문서의 기본 URI. |
| nextbaseUri | String | 비교할 두 번째 문서의 기본 URI. |

### ReturnValue

두 기본 URI의 상대 순서를 설명하는 정수 값: **baseUri**가 **nextbaseUri**보다 먼저 나타나면 -1, 두 기본 URI가 동일하면 0, **baseUri**가 **nextbaseUri**보다 나중에 나타나면 1.

## 또 보기

* Class [String](../../../system/string/)
* Class [XsltContext](../)
* Namespace [System::Xml::Xsl](../../)
* Library [Aspose.Page for C++](../../../)
