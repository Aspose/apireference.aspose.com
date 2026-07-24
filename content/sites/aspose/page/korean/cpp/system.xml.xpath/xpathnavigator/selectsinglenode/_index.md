---
title: "System::Xml::XPath::XPathNavigator::SelectSingleNode 메서드"
linktitle: "SelectSingleNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::SelectSingleNode 메서드. 지정된 XPathExpression 객체를 사용하여 XPathNavigator에서 단일 노드를 선택합니다 (C++)."
type: docs
weight: 7500
url: /ko/cpp/system.xml.xpath/xpathnavigator/selectsinglenode/
---
## XPathNavigator::SelectSingleNode(SharedPtr\<XPathExpression\>) method


지정된 [XPathExpression](../../xpathexpression/) 객체를 사용하여 [XPathNavigator](../)에서 단일 노드를 선택합니다.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(SharedPtr<XPathExpression> expression)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| expression | SharedPtr\<XPathExpression\> | 컴파일된 [XPath](../../) 쿼리를 포함하는 [XPathExpression](../../xpathexpression/) 객체. |

### ReturnValue

지정된 [XPath](../../) 쿼리에 대해 첫 번째 일치 노드를 포함하는 [XPathNavigator](../) 객체; 일치하는 결과가 없으면 **nullptr**를 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathExpression](../../xpathexpression/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String) method


지정된 [XPath](../../) 쿼리를 사용하여 [XPathNavigator](../)에서 단일 노드를 선택합니다.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 식을 나타내는 [String](../../../system/string/)입니다. |

### ReturnValue

지정된 [XPath](../../) 쿼리에 대해 첫 번째 일치 노드를 포함하는 [XPathNavigator](../) 객체; 일치하는 결과가 없으면 **nullptr**를 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectSingleNode(String, SharedPtr\<IXmlNamespaceResolver\>) method


지정된 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체를 사용하여 네임스페이스 접두사를 해결하면서, 지정된 [XPath](../../) 쿼리를 사용해 [XPathNavigator](../) 객체에서 단일 노드를 선택합니다.

```cpp
virtual SharedPtr<XPathNavigator> System::Xml::XPath::XPathNavigator::SelectSingleNode(String xpath, SharedPtr<IXmlNamespaceResolver> resolver)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | String | [XPath](../../) 식을 나타내는 [String](../../../system/string/)입니다. |
| resolver | SharedPtr\<IXmlNamespaceResolver\> | [XPath](../../) 쿼리에서 네임스페이스 접두사를 해결하는 데 사용되는 [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) 객체. |

### ReturnValue

지정된 [XPath](../../) 쿼리에 대해 첫 번째 일치 노드를 포함하는 [XPathNavigator](../) 객체; 일치하는 결과가 없으면 **nullptr**를 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [String](../../../system/string/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
