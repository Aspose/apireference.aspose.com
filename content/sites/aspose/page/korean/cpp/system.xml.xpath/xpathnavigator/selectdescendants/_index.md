---
title: "System::Xml::XPath::XPathNavigator::SelectDescendants 메서드"
linktitle: "SelectDescendants"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::SelectDescendants 메서드. 현재 노드의 로컬 이름과 네임스페이스 URI를 C++에서 지정하여 모든 하위 노드를 선택합니다."
type: docs
weight: 7400
url: /ko/cpp/system.xml.xpath/xpathnavigator/selectdescendants/
---
## XPathNavigator::SelectDescendants(String, String, bool) method


지정된 로컬 이름과 네임스페이스 URI를 가진 현재 노드의 모든 하위 노드를 선택합니다.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(String name, String namespaceURI, bool matchSelf)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 하위 노드들의 로컬 이름. |
| namespaceURI | String | 하위 노드들의 네임스페이스 URI. |
| matchSelf | bool | **true**는 선택에 컨텍스트 노드를 포함하도록; 그렇지 않으면 **false**. |

### ReturnValue

선택된 노드를 포함하는 [XPathNodeIterator](../../xpathnodeiterator/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectDescendants(XPathNodeType, bool) method


현재 노드와 일치하는 [XPathNodeType](../../xpathnodetype/)을 가진 모든 하위 노드를 선택합니다.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectDescendants(XPathNodeType type, bool matchSelf)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | XPathNodeType | 하위 노드들의 [XPathNodeType](../../xpathnodetype/). |
| matchSelf | bool | **true**는 선택에 컨텍스트 노드를 포함하도록; 그렇지 않으면 **false**. |

### ReturnValue

선택된 노드를 포함하는 [XPathNodeIterator](../../xpathnodeiterator/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
