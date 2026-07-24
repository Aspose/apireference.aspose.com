---
title: "System::Xml::XPath::XPathExpression::Compile 메서드"
linktitle: "컴파일"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathExpression::Compile 메서드. 지정된 XPath 식을 컴파일하고 C++에서 해당 XPath 식을 나타내는 XPathExpression 객체를 반환합니다."
type: docs
weight: 600
url: /ko/cpp/system.xml.xpath/xpathexpression/compile/
---
## XPathExpression::Compile(const String\&) method


지정된 [XPath](../../) 식을 컴파일하고 해당 [XPath](../../) 식을 나타내는 [XPathExpression](../) 객체를 반환합니다.

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | const String\& | [XPath](../../) 식. |

### ReturnValue

하나의 [XPathExpression](../) 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathExpression::Compile(const String\&, const SharedPtr\<IXmlNamespaceResolver\>\&) method


지정된 [XPath](../../) 식을 컴파일하고, 네임스페이스 해석을 위해 지정된 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체를 사용하며, 해당 [XPath](../../) 식을 나타내는 [XPathExpression](../) 객체를 반환합니다.

```cpp
static SharedPtr<XPathExpression> System::Xml::XPath::XPathExpression::Compile(const String &xpath, const SharedPtr<IXmlNamespaceResolver> &nsResolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | const String\& | [XPath](../../) 식. |
| nsResolver | const SharedPtr\<IXmlNamespaceResolver\>\& | 네임스페이스 해석을 위해 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 인터페이스를 구현하는 객체입니다. |

### ReturnValue

하나의 [XPathExpression](../) 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathExpression](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
