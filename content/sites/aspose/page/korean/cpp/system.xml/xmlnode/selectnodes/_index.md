---
title: "System::Xml::XmlNode::SelectNodes method"
linktitle: "SelectNodes"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNode::SelectNodes 메서드. C++에서 XPath 식과 일치하는 노드 목록을 선택합니다."
type: docs
weight: 3800
url: /ko/cpp/system.xml/xmlnode/selectnodes/
---
## XmlNode::SelectNodes(const String\&) method


[XPath](../../../system.xml.xpath/) 식과 일치하는 노드 목록을 선택합니다.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | const String\& | 그 [XPath](../../../system.xml.xpath/) 식. |

### ReturnValue

[XmlNodeList](../../xmlnodelist/)은 [XPath](../../../system.xml.xpath/) 쿼리와 일치하는 노드 컬렉션을 포함합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectNodes(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


[XPath](../../../system.xml.xpath/) 식과 일치하는 노드 목록을 선택합니다. [XPath](../../../system.xml.xpath/) 식에서 발견된 모든 접두사는 제공된 [XmlNamespaceManager](../../xmlnamespacemanager/)를 사용하여 해결됩니다.

```cpp
SharedPtr<XmlNodeList> System::Xml::XmlNode::SelectNodes(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | const String\& | 그 [XPath](../../../system.xml.xpath/) 식. |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XPath](../../../system.xml.xpath/) 식에서 접두사의 네임스페이스를 해결하는 데 사용할 [XmlNamespaceManager](../../xmlnamespacemanager/)입니다. |

### ReturnValue

[XmlNodeList](../../xmlnodelist/)은 [XPath](../../../system.xml.xpath/) 쿼리와 일치하는 노드 컬렉션을 포함합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
