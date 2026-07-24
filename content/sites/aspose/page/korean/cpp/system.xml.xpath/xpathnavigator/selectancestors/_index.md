---
title: "System::Xml::XPath::XPathNavigator::SelectAncestors 메서드"
linktitle: "SelectAncestors"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::SelectAncestors 메서드. C++에서 지정된 로컬 이름과 네임스페이스 URI를 가진 현재 노드의 모든 조상 노드를 선택합니다."
type: docs
weight: 7200
url: /ko/cpp/system.xml.xpath/xpathnavigator/selectancestors/
---
## XPathNavigator::SelectAncestors(String, String, bool) method


지정된 로컬 이름과 네임스페이스 URI를 가진 현재 노드의 모든 조상 노드를 선택합니다.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(String name, String namespaceURI, bool matchSelf)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 조상 노드들의 로컬 이름입니다. |
| namespaceURI | String | 조상 노드들의 네임스페이스 URI입니다. |
| matchSelf | bool | 선택에 컨텍스트 노드를 포함하려면 **true**; 그렇지 않으면 **false**. |

### ReturnValue

선택된 노드를 포함하는 [XPathNodeIterator](../../xpathnodeiterator/). 반환된 노드는 문서 역순으로 정렬됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectAncestors(XPathNodeType, bool) method


현재 노드와 일치하는 [XPathNodeType](../../xpathnodetype/)을 가진 모든 조상 노드를 선택합니다.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectAncestors(XPathNodeType type, bool matchSelf)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | XPathNodeType | 조상 노드의 [XPathNodeType](../../xpathnodetype/). |
| matchSelf | bool | 선택에 컨텍스트 노드를 포함하려면 **true**; 그렇지 않으면 **false**. |

### ReturnValue

선택된 노드를 포함하는 [XPathNodeIterator](../../xpathnodeiterator/). 반환된 노드는 문서 역순으로 정렬됩니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
