---
title: "System::Xml::XmlDocument::GetElementsByTagName 메서드"
linktitle: "GetElementsByTagName"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDocument::GetElementsByTagName 메서드. C++에서 지정된 XmlDocument::get_LocalName 및 XmlNode::get_NamespaceURI와 일치하는 모든 하위 요소 목록을 포함하는 XmlNodeList를 반환합니다."
type: docs
weight: 3200
url: /ko/cpp/system.xml/xmldocument/getelementsbytagname/
---
## XmlDocument::GetElementsByTagName(String, String) method


지정된 [XmlDocument::get_LocalName](../get_localname/) 및 [XmlNode::get_NamespaceURI](../../xmlnode/get_namespaceuri/)와 일치하는 모든 하위 요소 목록을 포함하는 [XmlNodeList](../../xmlnodelist/)를 반환합니다.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 일치시킬 LocalName. 특수값 **\"*\"**은 모든 태그와 일치합니다. |
| namespaceURI | String | 일치시킬 NamespaceURI. |

### ReturnValue

모든 일치하는 노드 목록을 포함하는 [XmlNodeList](../../xmlnodelist/). 지정된 **localName** 및 **namespaceURI**와 일치하는 노드가 없으면 반환된 컬렉션은 비어 있습니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlDocument::GetElementsByTagName(String) method


지정된 이름과 일치하는 모든 하위 요소 목록을 포함하는 [XmlNodeList](../../xmlnodelist/)를 반환합니다.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlDocument::GetElementsByTagName(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 일치시킬 정규화된 이름. 일치하는 노드의 **get_Name** 값과 비교됩니다. 특수값 **\"*\"**은 모든 태그와 일치합니다. |

### ReturnValue

모든 일치하는 노드 목록을 포함하는 [XmlNodeList](../../xmlnodelist/). **name**과 일치하는 노드가 없으면 반환된 컬렉션은 비어 있습니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlDocument](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
