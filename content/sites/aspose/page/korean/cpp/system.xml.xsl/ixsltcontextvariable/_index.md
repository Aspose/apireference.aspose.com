---
title: "System::Xml::Xsl::IXsltContextVariable 클래스"
linktitle: "IXsltContextVariable"
second_title: "C++용 Aspose.Page"
description: "System::Xml::Xsl::IXsltContextVariable 클래스. C++ 런타임 실행 중 스타일 시트에 정의된 특정 변수에 대한 인터페이스를 제공합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml.xsl/ixsltcontextvariable/
---
## IXsltContextVariable class


런타임 실행 중에 스타일시트에 정의된 특정 변수에 대한 인터페이스를 제공합니다.

```cpp
class IXsltContextVariable : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Evaluate](./evaluate/)(SharedPtr\<XsltContext\>) | 런타임에 변수를 평가하고 변수의 값을 나타내는 객체를 반환합니다. |
| virtual [get_IsLocal](./get_islocal/)() | 변수가 로컬인지 여부를 나타내는 값을 반환합니다. |
| virtual [get_IsParam](./get_isparam/)() | 변수가 Extensible Stylesheet Language Transformations (XSLT) 매개변수인지 여부를 나타내는 값을 반환합니다. 이는 스타일시트 또는 템플릿에 대한 매개변수가 될 수 있습니다. |
| virtual [get_VariableType](./get_variabletype/)() | 변수의 XML Path Language ([XPath](../../system.xml.xpath/)) 유형을 나타내는 XPathResultType을 반환합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
