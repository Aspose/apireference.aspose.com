---
title: "System::Xml::XmlNamedNodeMap::GetNamedItem method"
linktitle: "GetNamedItem"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNamedNodeMap::GetNamedItem method. C++에서 일치하는 XmlNode::get_LocalName 및 XmlNode::get_NamespaceURI 값을 가진 노드를 검색합니다."
type: docs
weight: 700
url: /ko/cpp/system.xml/xmlnamednodemap/getnameditem/
---
## XmlNamedNodeMap::GetNamedItem(String, String) method


일치하는 [XmlNode::get_LocalName](../../xmlnode/get_localname/) 및 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/) 값을 가진 노드를 검색합니다.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 검색할 노드의 로컬 이름. |
| namespaceURI | String | 검색할 노드의 네임스페이스 Uniform Resource Identifier (URI). |

### ReturnValue

일치하는 로컬 이름과 네임스페이스 URI를 가진 [XmlNode](../../xmlnode/)이며, 일치하는 노드를 찾지 못한 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNamedNodeMap::GetNamedItem(String) method


이름으로 지정된 [XmlNode](../../xmlnode/)를 검색합니다.

```cpp
virtual SharedPtr<XmlNode> System::Xml::XmlNamedNodeMap::GetNamedItem(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 검색할 노드의 정규화된 이름. 일치하는 노드의 [XmlNode::get_Name](../../xmlnode/get_name/) 값과 비교됩니다. |

### ReturnValue

지정된 이름을 가진 [XmlNode](../../xmlnode/)이며, 일치하는 노드를 찾지 못한 경우 **nullptr**입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNode](../../xmlnode/)
* Class [String](../../../system/string/)
* Class [XmlNamedNodeMap](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
