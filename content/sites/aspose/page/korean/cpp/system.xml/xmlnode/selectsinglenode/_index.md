---
title: "System::Xml::XmlNode::SelectSingleNode 메서드"
linktitle: "SelectSingleNode"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNode::SelectSingleNode 메서드. C++에서 XPath 식과 일치하는 첫 번째 XmlNode를 선택합니다."
type: docs
weight: 3900
url: /ko/cpp/system.xml/xmlnode/selectsinglenode/
---
## XmlNode::SelectSingleNode(const String\&) method


첫 번째 [XmlNode](../)이 [XPath](../../../system.xml.xpath/) 식과 일치하도록 선택합니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | const String\& | 그 [XPath](../../../system.xml.xpath/) 식. |

### ReturnValue

일치하는 노드가 없을 경우 **nullptr**를 반환하는, [XPath](../../../system.xml.xpath/) 쿼리와 일치하는 첫 번째 [XmlNode](../)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::SelectSingleNode(const String\&, const SharedPtr\<XmlNamespaceManager\>\&) method


첫 번째 [XmlNode](../)이 [XPath](../../../system.xml.xpath/) 식과 일치하도록 선택합니다. [XPath](../../../system.xml.xpath/) 식에서 발견된 모든 접두사는 제공된 [XmlNamespaceManager](../../xmlnamespacemanager/)를 사용하여 해결됩니다.

```cpp
SharedPtr<XmlNode> System::Xml::XmlNode::SelectSingleNode(const String &xpath, const SharedPtr<XmlNamespaceManager> &nsmgr)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| xpath | const String\& | 그 [XPath](../../../system.xml.xpath/) 식. |
| nsmgr | const SharedPtr\<XmlNamespaceManager\>\& | [XPath](../../../system.xml.xpath/) 식에서 접두사의 네임스페이스를 해결하는 데 사용할 [XmlNamespaceManager](../../xmlnamespacemanager/)입니다. |

### ReturnValue

일치하는 노드가 없을 경우 **nullptr**를 반환하는, [XPath](../../../system.xml.xpath/) 쿼리와 일치하는 첫 번째 [XmlNode](../)입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../)
* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../../xmlnamespacemanager/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
