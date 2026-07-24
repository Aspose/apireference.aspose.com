---
title: "System::Xml::XPath::XPathNavigator::Select 메서드"
linktitle: "선택"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::Select 메서드. 지정된 XPathExpression을 사용하여 C++에서 노드 집합을 선택합니다."
type: docs
weight: 7100
url: /ko/cpp/system.xml.xpath/xpathnavigator/select/
---
## XPathNavigator::Select(SharedPtr\<XPathExpression\>) method


지정된 [XPathExpression](../../xpathexpression/)을 사용하여 노드 집합을 선택합니다.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(SharedPtr<XPathExpression> expr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 컴파일된 [XPath](../../) 쿼리를 포함하는 [XPathExpression](../../xpathexpression/) 객체. |

### ReturnValue

선택된 노드 집합을 가리키는 [XPathNodeIterator](../../xpathnodeiterator/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String) method


지정된 [XPath](../../) 식을 사용하여 노드 집합을 선택합니다.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 식을 나타내는 [String](../../../system/string/)입니다. |

### ReturnValue

선택된 노드 집합을 가리키는 [XPathNodeIterator](../../xpathnodeiterator/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Select(String, SharedPtr\<IXmlNamespaceResolver\>) method


지정된 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체를 사용하여 네임스페이스 접두사를 해석하고, 지정된 [XPath](../../) 식을 사용하여 노드 집합을 선택합니다.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::Select(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 식을 나타내는 [String](../../../system/string/)입니다. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | 네임스페이스 접두사를 해결하는 데 사용되는 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체. |

### ReturnValue

선택된 노드 집합을 가리키는 [XPathNodeIterator](../../xpathnodeiterator/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
