---
title: "System::Xml::XPath::XPathNavigator::Evaluate 메서드"
linktitle: "Evaluate"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::Evaluate 메서드. C++에서 XPathExpression을 평가하고 타입이 지정된 결과를 반환합니다."
type: docs
weight: 1200
url: /ko/cpp/system.xml.xpath/xpathnavigator/evaluate/
---
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>) method


[XPathExpression](../../xpathexpression/)을 평가하고 타입이 지정된 결과를 반환합니다.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 평가할 수 있는 [XPathExpression](../../xpathexpression/)입니다. |

### ReturnValue

식의 결과 ([Boolean](../../../system/boolean/), 숫자, 문자열 또는 노드 집합). 이는 각각 [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), 또는 [XPathNodeIterator](../../xpathnodeiterator/) 객체에 매핑됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(SharedPtr\<XPathExpression\>, SharedPtr\<XPathNodeIterator\>) method


제공된 컨텍스트를 사용하여 [XPathExpression](../../xpathexpression/)을 평가하고, 형식이 지정된 결과를 반환합니다.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(SharedPtr<XPathExpression> expr, SharedPtr<XPathNodeIterator> context)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| expr | SharedPtr\<XPathExpression\> | 평가할 수 있는 [XPathExpression](../../xpathexpression/)입니다. |
| context | SharedPtr\<XPathNodeIterator\> | 평가가 수행될 선택된 노드 집합을 가리키는 [XPathNodeIterator](../../xpathnodeiterator/)입니다. |

### ReturnValue

식의 결과 ([Boolean](../../../system/boolean/), 숫자, 문자열 또는 노드 집합). 이는 각각 [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), 또는 [XPathNodeIterator](../../xpathnodeiterator/) 객체에 매핑됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String) method


지정된 [XPath](../../) 식을 평가하고 형식이 지정된 결과를 반환합니다.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | String | 평가할 수 있는 [XPath](../../) 식을 나타내는 문자열입니다. |

### ReturnValue

식의 결과 ([Boolean](../../../system/boolean/), 숫자, 문자열 또는 노드 집합). 이는 각각 [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), 또는 [XPathNodeIterator](../../xpathnodeiterator/) 객체에 매핑됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::Evaluate(String, SharedPtr\<IXmlNamespaceResolver\>) method


지정된 [XPath](../../) 식을 평가하고, [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체를 사용하여 [XPath](../../) 식의 네임스페이스 접두사를 해결한 후 형식이 지정된 결과를 반환합니다.

```cpp
virtual SharedPtr<Object> System::Xml::XPath::XPathNavigator::Evaluate(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | String | 평가할 수 있는 [XPath](../../) 식을 나타내는 문자열입니다. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | [XPath](../../) 식에서 네임스페이스 접두사를 해결하는 데 사용되는 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체입니다. |

### ReturnValue

식의 결과 ([Boolean](../../../system/boolean/), 숫자, 문자열 또는 노드 집합). 이는 각각 [Boolean](../../../system/boolean/), [Double](../../../system/double/), [String](../../../system/string/), 또는 [XPathNodeIterator](../../xpathnodeiterator/) 객체에 매핑됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
