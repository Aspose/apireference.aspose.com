---
title: "System::Xml::XmlElement::GetElementsByTagName 메서드"
linktitle: "GetElementsByTagName"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlElement::GetElementsByTagName 메서드. 지정된 XmlElement::get_LocalName 및 XmlElement::get_NamespaceURI 값과 일치하는 모든 하위 요소의 목록을 포함하는 XmlNodeList를 C++에서 반환합니다."
type: docs
weight: 1500
url: /ko/cpp/system.xml/xmlelement/getelementsbytagname/
---
## XmlElement::GetElementsByTagName(String, String) method


지정된 [XmlElement::get_LocalName](../get_localname/) 및 [XmlElement::get_NamespaceURI](../get_namespaceuri/) 값과 일치하는 모든 하위 요소의 목록을 포함하는 [XmlNodeList](../../xmlnodelist/)를 반환합니다.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String localName, String namespaceURI)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localName | String | 일치시킬 로컬 이름입니다. 별표(*)는 모든 태그와 일치하는 특수 값입니다. |
| namespaceURI | String | 일치시킬 네임스페이스 URI. |

### ReturnValue

모든 일치하는 노드의 목록을 포함하는 [XmlNodeList](../../xmlnodelist/). 일치하는 노드가 없으면 목록은 비어 있습니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlElement::GetElementsByTagName(String) method


지정된 [XmlElement::get_Name](../get_name/)와 일치하는 모든 하위 요소의 목록을 포함하는 [XmlNodeList](../../xmlnodelist/)를 반환합니다.

```cpp
virtual SharedPtr<XmlNodeList> System::Xml::XmlElement::GetElementsByTagName(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 일치시킬 이름 태그입니다. 이는 한정된 이름이며, 일치하는 노드의 **get_Name** 값과 비교됩니다. 별표(*)는 모든 태그와 일치하는 특수 값입니다. |

### ReturnValue

모든 일치하는 노드의 목록을 포함하는 [XmlNodeList](../../xmlnodelist/). 일치하는 노드가 없으면 목록은 비어 있습니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlNodeList](../../xmlnodelist/)
* Class [String](../../../system/string/)
* Class [XmlElement](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
