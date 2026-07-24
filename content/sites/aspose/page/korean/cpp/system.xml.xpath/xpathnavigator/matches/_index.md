---
title: "System::Xml::XPath::XPathNavigator::Matches method"
linktitle: "Matches"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::Matches method. 현재 노드가 지정된 XPathExpression과 일치하는지 C++에서 확인합니다."
type: docs
weight: 4900
url: /ko/cpp/system.xml.xpath/xpathnavigator/matches/
---
## XPathNavigator::Matches(SharedPtr\<XPathExpression\>) method


현재 노드가 지정된 [XPathExpression](../../xpathexpression/)과 일치하는지 결정합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::Matches(SharedPtr<XPathExpression> expr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 컴파일된 [XPath](../../) 식을 포함하는 [XPathExpression](../../xpathexpression/) 객체입니다. |

### ReturnValue

**true** if the current node matches the [XPathExpression](../../xpathexpression/); otherwise, **false**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Matches(String) method


현재 노드가 지정된 [XPath](../../) 식과 일치하는지 결정합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::Matches(String xpath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 식입니다. |

### ReturnValue

**true** if the current node matches the specified [XPath](../../) expression; otherwise, **false**.

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
