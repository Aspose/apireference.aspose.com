---
title: "System::Xml::XPath::XPathNavigator::MoveToFollowing 메서드"
linktitle: "MoveToFollowing"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::MoveToFollowing 메서드. 문서 순서에서 지정된 로컬 이름과 네임스페이스 URI를 가진 요소로 XPathNavigator를 이동합니다 (C++)."
type: docs
weight: 5700
url: /ko/cpp/system.xml.xpath/xpathnavigator/movetofollowing/
---
## XPathNavigator::MoveToFollowing(String, String) method


문서 순서에서 지정된 로컬 이름과 네임스페이스 URI를 가진 요소로 [XPathNavigator](../)를 이동합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 요소의 로컬 이름입니다. |
| namespaceURI | String | 요소의 네임스페이스 URI. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 또 보기

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(String, String, SharedPtr\<XPathNavigator\>) method


문서 순서에서 지정된 로컬 이름과 네임스페이스 URI를 가진 요소로, 지정된 경계까지 [XPathNavigator](../)를 이동합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(String localName, String namespaceURI, SharedPtr<XPathNavigator> end)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 요소의 로컬 이름입니다. |
| namespaceURI | String | 요소의 네임스페이스 URI. |
| end | SharedPtr\<XPathNavigator\> | 다음 요소를 검색하는 동안 현재 [XPathNavigator](../)가 넘어가지 않을 요소 경계에 위치한 [XPathNavigator](../) 객체. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType) method


문서 순서에서 지정된 [XPathNodeType](../../xpathnodetype/)의 다음 요소로 [XPathNavigator](../)를 이동합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | XPathNodeType | 요소의 [XPathNodeType](../../xpathnodetype/). [XPathNodeType](../../xpathnodetype/)은 [XPathNodeType::Attribute](../../xpathnodetype/) 또는 [XPathNodeType::Namespace](../../xpathnodetype/)일 수 없습니다. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 또 보기

* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::MoveToFollowing(XPathNodeType, SharedPtr\<XPathNavigator\>) method


[XPathNavigator](../)를 지정된 [XPathNodeType](../../xpathnodetype/)의 다음 요소로, 지정된 경계까지, 문서 순서대로 이동합니다.

```cpp
virtual bool System::Xml::XPath::XPathNavigator::MoveToFollowing(XPathNodeType type, SharedPtr<XPathNavigator> end)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | XPathNodeType | 요소의 [XPathNodeType](../../xpathnodetype/). [XPathNodeType](../../xpathnodetype/)은 [XPathNodeType::Attribute](../../xpathnodetype/) 또는 [XPathNodeType::Namespace](../../xpathnodetype/)일 수 없습니다. |
| end | SharedPtr\<XPathNavigator\> | 다음 요소를 검색하는 동안 현재 [XPathNavigator](../)가 넘어가지 않을 요소 경계에 위치한 [XPathNavigator](../) 객체. |

### ReturnValue

**true** if the [XPathNavigator](../) moved successfully; otherwise, **false**.

## 또 보기

* Enum [XPathNodeType](../../xpathnodetype/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNavigator](../)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
