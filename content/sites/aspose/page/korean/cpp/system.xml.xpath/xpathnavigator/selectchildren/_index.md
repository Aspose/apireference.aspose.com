---
title: "System::Xml::XPath::XPathNavigator::SelectChildren 메서드"
linktitle: "SelectChildren"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XPath::XPathNavigator::SelectChildren 메서드. 지정된 로컬 이름과 네임스페이스 URI를 가진 현재 노드의 모든 자식 노드를 C++에서 선택합니다."
type: docs
weight: 7300
url: /ko/cpp/system.xml.xpath/xpathnavigator/selectchildren/
---
## XPathNavigator::SelectChildren(String, String) method


지정된 로컬 이름과 네임스페이스 URI를 가진 현재 노드의 모든 자식 노드를 선택합니다.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(String name, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 자식 노드의 로컬 이름입니다. |
| namespaceURI | String | 자식 노드의 네임스페이스 URI입니다. |

### ReturnValue

선택된 노드를 포함하는 [XPathNodeIterator](../../xpathnodeiterator/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
## XPathNavigator::SelectChildren(XPathNodeType) method


일치하는 [XPathNodeType](../../xpathnodetype/)을 가진 현재 노드의 모든 자식 노드를 선택합니다.

```cpp
virtual SharedPtr<XPathNodeIterator> System::Xml::XPath::XPathNavigator::SelectChildren(XPathNodeType type)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| type | XPathNodeType | 자식 노드의 [XPathNodeType](../../xpathnodetype/)입니다. |

### ReturnValue

선택된 노드를 포함하는 [XPathNodeIterator](../../xpathnodeiterator/)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XPathNodeIterator](../../xpathnodeiterator/)
* Enum [XPathNodeType](../../xpathnodetype/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
