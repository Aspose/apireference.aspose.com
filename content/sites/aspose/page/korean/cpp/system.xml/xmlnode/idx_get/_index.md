---
title: "System::Xml::XmlNode::idx_get 메서드"
linktitle: "idx_get"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlNode::idx_get 메서드. C++에서 지정된 XmlNode::get_LocalName 및 XmlNode::get_NamespaceURI 값과 일치하는 첫 번째 자식 요소를 반환합니다."
type: docs
weight: 3000
url: /ko/cpp/system.xml/xmlnode/idx_get/
---
## XmlNode::idx_get(String, String) method


지정된 [XmlNode::get_LocalName](../get_localname/) 및 [XmlNode::get_NamespaceURI](../get_namespaceuri/) 값과 일치하는 첫 번째 자식 요소를 반환합니다.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String localname, String ns)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| localname | String | 요소의 로컬 이름입니다. |
| ns | String | 요소의 네임스페이스 URI. |

### ReturnValue

일치하는 **localname** 및 **ns**를 가진 첫 번째 [XmlElement](../../xmlelement/)입니다. 일치하는 것이 없으면 **nullptr**를 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlNode::idx_get(String) method


지정된 [XmlNode::get_Name](../get_name/)과 일치하는 첫 번째 자식 요소를 반환합니다.

```cpp
virtual SharedPtr<XmlElement> System::Xml::XmlNode::idx_get(String name)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| name | String | 검색할 요소의 정규화된 이름. |

### ReturnValue

지정된 이름과 일치하는 첫 번째 [XmlElement](../../xmlelement/)입니다. 일치하는 것이 없으면 **nullptr**를 반환합니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmlElement](../../xmlelement/)
* Class [String](../../../system/string/)
* Class [XmlNode](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
