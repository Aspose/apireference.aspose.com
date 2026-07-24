---
title: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method"
linktitle: "RemoveNamedItem"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap::RemoveNamedItem method. C++에서 일치하는 XmlNode::get_LocalName 및 XmlNode::get_NamespaceURI 값을 가진 노드를 제거합니다."
type: docs
weight: 900
url: /ko/cpp/system.xml/xmlnamednodemap/removenameditem/
---
## XmlNamedNodeMap::RemoveNamedItem(String, String) method


일치하는 [XmlNode::get_LocalName](../../xmlnode/get_localname/) 및 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 값을 가진 노드를 제거합니다.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 제거할 노드의 로컬 이름. |
| namespaceURI | String | 제거할 노드의 네임스페이스 URI. |

### ReturnValue

제거된 [XmlNode](../../xmlnode/)이며, 일치하는 노드를 찾지 못한 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::RemoveNamedItem(String) method


노드를 [XmlNamedNodeMap](../)에서 제거합니다.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::RemoveNamedItem(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 제거할 노드의 정규화된 이름. 이름은 일치하는 노드의 [XmlNode::get_Name](../../xmlnode/get_name/) 값과 비교됩니다. |

### ReturnValue

이 [XmlNamedNodeMap](../)에서 제거된 [XmlNode](../../xmlnode/)이며, 일치하는 노드를 찾지 못한 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
